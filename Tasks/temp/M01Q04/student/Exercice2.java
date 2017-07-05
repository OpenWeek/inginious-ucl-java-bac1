/**
 *  Copyright (c)  2016 Ody Lucas, Rousseaux Tom
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class Exercice2 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
		try{
        	int a = 0, b = 0, c = 0;
       		int[] i = Exercice2Stu.prodAlgeb(a,b,c);
            int[] sol = {1, -(a+b+c), (a*b+a*c+b*c),-a*b*c};
            assertEquals("Avez-vous pensé au cas nul ? Votre coefficient xCube est erroné ",sol[0],i[0]);
            assertEquals("Avez-vous pensé au cas nul ? Votre coefficient xCarré est erroné",sol[1],i[1]);
            assertEquals("Avez-vous pensé au cas nul ? Votre coefficient x est erroné ",sol[2],i[2]);
            assertEquals("Avez-vous pensé au cas nul ? Votre coefficient tI est erroné ",sol[3],i[3]);

            for(short j = 0; j < 3; j++)
            {
            	a = (int)(Math.random()*10+2);
                b = (int)(Math.random()*10+2);
                c = (int)(Math.random()*10+2);
			    i = Exercice2Stu.prodAlgeb(a,b,c);
                sol[1] = -(a+b+c);
                sol[2] = (a*b+a*c+b*c);
                sol[3] = -a*b*c;
            	assertEquals("Votre coefficient xCube est erroné ",sol[0],i[0]);
                assertEquals("Votre coefficient xCarré est erroné",sol[1],i[1]);
                assertEquals("Votre coefficient x est erroné ",sol[2],i[2]);
                assertEquals("Votre coefficient tI est erroné ",sol[3],i[3]);
            }

		}catch (ArithmeticException e){
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str + "Attention, certaines variables ont été mal castées	!");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(NullPointerException e){
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	

	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Exercice2.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}