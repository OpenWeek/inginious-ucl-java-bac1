/*   Copyright (c) 2016 KÜHN Alexandre, 2017 Mawait Maxime
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

public class M11Q15 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test(){
		try{
            M11Q15Stu.List l = new M11Q15Stu.List();
            Node n1 = new Node(0);
            Node n2 = new Node(1);
            Node n3 = new Node(2);
            Node n4 = new Node(3);
            n4.next = n3; n3.next = n2; n2.next = n1;
            l.first = n4;
            l.reverse();
            
            Node current = l.first;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 0, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 1, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 2, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 3, current.value);
            
            n1 = new Node(1);
            n2 = new Node(2);
            n3 = new Node(3);
            n4 = new Node(4);
            n4.next = n3; n3.next = n2; n2.next = n1;
            l.first = n4;
            l.reverse();
            
            current = l.first;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 1, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 2, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 3, current.value);
            current = current.next;
            assertEquals(str + "La valeur du noeud n'est pas correcte.", 4, current.value);
            

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
			//fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M11Q15.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
