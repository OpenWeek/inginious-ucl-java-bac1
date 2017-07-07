/*   Copyright (c) 2017 Mawait Maxime
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class M11Q08 {
	
	private static String str = "Le code semble comporter des erreurs : ";
    
	@Test
	public void test(){
		try{
        	Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            n2.next = n3;
            n3.previous = n2;
            n4.previous = n3;
            n3.next = n4;
			int res = M11Q08Stu.minimum(n2);
			assertEquals(str + "la valeur du minimum n'est pas correcte", 2, res);
            assertEquals(str + "la liste a été modifiée ", n2.value, 2);
            assertEquals(str + "la liste a été modifiée ", n3.value, 3);
            assertNull(str + "la liste a été modifiée ", n2.previous);
            assertEquals(str + "la liste a été modifiée ", n2.next.value, 3);
            assertEquals(str + "la liste a été modifiée ", n3.next.value, 4);
            assertEquals(str + "la liste a été modifiée ", n3.previous.value, 2);
            assertEquals(str + "la liste a été modifiée ", n4.previous.value, 3);
            assertNull(str + "la liste a été modifiée ", n4.next);
            
            //Pour empecher d'hardcode la reponse
            n1.next = n2;
            n2.previous = n1;
            res = M11Q08Stu.minimum(n1);
			assertEquals(str + "la valeur du minimum n'est pas correcte", 1, res);
            assertEquals(str + "la liste a été modifiée ", n1.value, 1);
            assertEquals(str + "la liste a été modifiée ", n2.value, 2);
            assertEquals(str + "la liste a été modifiée ", n3.value, 3);
            assertNull(str + "la liste a été modifiée ", n1.previous);
            assertEquals(str + "la liste a été modifiée ", n1.next.value, 2);
            assertEquals(str + "la liste a été modifiée ", n2.next.value, 3);
            assertEquals(str + "la liste a été modifiée ", n2.previous.value, 1);
            assertEquals(str + "la liste a été modifiée ", n3.next.value, 4);
            assertEquals(str + "la liste a été modifiée ", n3.previous.value, 2);
            assertEquals(str + "la liste a été modifiée ", n4.previous.value, 3);
            assertNull(str + "la liste a été modifiée ", n4.next);
            
            boolean err = false;
            try{
                res = M11Q08Stu.minimum(null);
                err = true;
            } catch(AssertionError e){
                //Vérifie le lancement de l'assertion
            } catch(NullPointerException e){
                err = true;
            }
            if (err) {
                fail(str + "Vous devez utiliser la programmation défensive");
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
		Result result = JUnitCore.runClasses(M11Q08.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
    
}
   