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
    		CutStu.cut("je.suis.belge.",'.');
    		BufferedReader bf1 = new BufferedReader(new FileReader("student/ans.txt"));
    		BufferedReader bf2 = new BufferedReader(new FileReader("answer.txt"));
            String s1=bf1.readLine();
            String s2=bf2.readLine();
            while (s1!=null && s2!=null){
                assertTrue("expected : " + s1 +", found : "+s2,s1.equals(s2));
            	s1=bf1.readLine();
                s2=bf2.readLine();
            }
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
        
        public void testCut2(){
    	try{
    		CutStu.cut("hello",'.');
    		BufferedReader bf3 = new BufferedReader(new FileReader("student/ans.txt"));
    		BufferedReader bf4 = new BufferedReader(new FileReader("answer2.txt"));
            String s3=bf3.readLine();
            String s4=bf4.readLine();
            while (s3!=null && s4!=null){
                assertTrue("expected : " + s3 +", found : "+s4,s3.equals(s4));
            	s3=bf3.readLine();
                s4=bf4.readLine();
            }
            bf3.close();
            bf4.close();
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
