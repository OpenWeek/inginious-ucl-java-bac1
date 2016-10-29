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
import java.io.*;

public class Cut {

	private static String str = "Le code semble comporter des erreurs : ";

	@Test
	public void testCut(){
    	try{
    		CutStu.cut("Hello, world! It's a nice day to make some Java programming!",' ',"test1.txt");
    		BufferedReader bf1 = new BufferedReader(new FileReader("student/ans.txt"));
    		BufferedReader bf2 = new BufferedReader(new FileReader("test1.txt"));
		String s1;
		String s2;
		for(s1 = bf1.readLine(),s2 = bf2.readLine(); s1 != null && s2 != null;s1 = bf1.readLine(), s2 = bf2.readLine())
			assertTrue("Erreur. String attendu : "+s1+" . String donné : "+s2+" .",s1.compareTo(s2)==0);
		if(s1 != s2)
			assertTrue("Erreur. Vous avez afficher trop/pas asser de lignes!",false);
		bf1.close();
		bf2.close();
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
        public void testCut2(){
    	try{
    		CutStu.cut("hello",'.',"test2.txt");
    		BufferedReader bf1 = new BufferedReader(new FileReader("student/ans2.txt"));
    		BufferedReader bf2 = new BufferedReader(new FileReader("test2.txt"));
		String s1;
		String s2;
		for(s1 = bf1.readLine(),s2 = bf2.readLine(); s1 != null && s2 != null;s1 = bf1.readLine(), s2 = bf2.readLine())
			assertTrue("Erreur. String attendu : "+s1+" . String donné : "+s2+" .",s1.compareTo(s2)==0);
            bf1.close();
            bf2.close();
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

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Cut.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
