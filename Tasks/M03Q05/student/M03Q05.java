/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre
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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M03Q05 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testM03Q05(){
		try{
          
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le int : 1",false,M03Q05Stu.isM03Q05(1));
            assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le int : 2",true,M03Q05Stu.isM03Q05(2));
            assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le int : 3",false,M03Q05Stu.isM03Q05(3));
            assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le int : 0",true,M03Q05Stu.isM03Q05(0));
            
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
    
    @Test
	public void testM03Q052(){
        BufferedReader reader = null;

		try {
    		reader = new BufferedReader(new FileReader("student/M03Q05Stu.java"));

    		String line;
           for(int i=0; i<24;i++){
               line=reader.readLine();
           }
    		while ((line=reader.readLine())!=null){
				for(int i=0;i<line.length();i++){
               	 assertNotEquals("Votre fonction contient un'%'",'%',line.charAt(i));
            }
			}
    

		} catch (IOException e) {
    		e.printStackTrace();
		} finally {
    		try {
     		   reader.close();
    		} catch (IOException e) {
      		  e.printStackTrace();
   			 }
		}
    }
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M03Q05.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
