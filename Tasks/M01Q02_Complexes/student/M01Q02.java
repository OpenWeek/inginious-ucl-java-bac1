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

public class M01Q02 {

	private static String str = "Le code semble comporter des erreurs : ";

	@Test
	public void testPos(){
		try{
			String str=new String("Avec des coefficients nuls, ");
			int[] stu = M01Q02Stu.multiplicationComplexe(0,0,0,0);
			assertEquals(str+"vous avez mal calculé votre partie réelle a! ",0,stu[0]);
			assertEquals(str+"vous avez mal calculé votre partie imaginaire b! ",0,stu[1]);
			assertEquals(str+"imaginairePur n'est pas correct!",true,M01Q02Stu.imaginairePur);
			assertEquals(str+"reelPur n'est pas correct!",true,M01Q02Stu.reelPur);
			M01Q02Stu.imaginairePur=false; M01Q02Stu.reelPur=false;

            str="Pour un produit reel pur, ";
			stu = M01Q02Stu.multiplicationComplexe(1,2,3,-6);
			assertEquals(str+"Vous avez mal calculé votre partie réelle a! ",15,stu[0]);
			assertEquals(str+"Vous avez mal calculé votre partie imaginaire b! ",0,stu[1]);
			assertEquals(str+"imaginairePur n'est pas correct!",false,M01Q02Stu.imaginairePur);
			assertEquals(str+"reelPur n'est pas correct!",true,M01Q02Stu.reelPur);
			M01Q02Stu.imaginairePur=false; M01Q02Stu.reelPur=false;

			str="Pour un produit imaginaire pur, ";
			stu = M01Q02Stu.multiplicationComplexe(2,1,6,12);
			assertEquals(str+"Vous avez mal calculé votre partie réelle a! ",0,stu[0]);
			assertEquals(str+"Vous avez mal calculé votre partie imaginaire b! ",30,stu[1]);
			assertEquals(str+"imaginairePur n'est pas correct!",true,M01Q02Stu.imaginairePur);
			assertEquals(str+"reelPur n'est pas correct!",false,M01Q02Stu.reelPur);
			M01Q02Stu.imaginairePur=false; M01Q02Stu.reelPur=false;

			str="Pour un produit complexe standard, ";
			stu = M01Q02Stu.multiplicationComplexe(1,2,3,4);
			assertEquals(str+"Vous avez mal calculé votre partie réelle a! ",-5,stu[0]);
			assertEquals(str+"Vous avez mal calculé votre partie imaginaire b! ",10,stu[1]);
			assertEquals(str+"imaginairePur n'est pas correct!",false,M01Q02Stu.imaginairePur);
			assertEquals(str+"reelPur n'est pas correct!",false,M01Q02Stu.reelPur);
			M01Q02Stu.imaginairePur=false; M01Q02Stu.reelPur=false;
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
		Result result = JUnitCore.runClasses(M01Q02.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}