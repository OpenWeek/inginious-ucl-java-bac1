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

public class M11Q14 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test(){
		try{
            M11Q14Stu.SList sl1 = new M11Q14Stu.SList();
            M11Q14Stu.SList sl2 = new M11Q14Stu.SList();
            SNode n11 = new SNode(0);
            SNode n12 = new SNode(2);
            SNode n13 = new SNode(3);
            SNode n14 = new SNode(4);
            SNode n21 = new SNode(1);
            SNode n22 = new SNode(4);
            SNode n23 = new SNode(5);
            SNode n24 = new SNode(6);
            
            n11.next = n12; n12.next = n13; n13.next = n14;
            sl1.first = n11;
            
            n21.next = n22; n22.next = n23; n23.next = n24;
            sl2.first = n21;
            
            M11Q14Stu.SList sl = M11Q14Stu.SList.sortedMerge(sl1, sl2);
            
            SNode runner = sl.first;
            
            assertEquals(str + "La valeur du premier noeud n'est pas correcte", runner.value, 0);
            
            runner = runner.next;
            assertEquals(str + "La valeur du deuxième noeud n'est pas correcte", runner.value, 1);
            
            runner = runner.next;
            assertEquals(str + "La valeur du troisième noeud n'est pas correcte", runner.value, 2);
            
            runner = runner.next;
            assertEquals(str + "La valeur du quatrième noeud n'est pas correcte", runner.value, 3);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 5ème noeud n'est pas correcte", runner.value, 4);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 6ème noeud n'est pas correcte", runner.value, 5);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 7ème noeud n'est pas correcte", runner.value, 6);
            
            n11 = new SNode(1);
            n12 = new SNode(3);
            n13 = new SNode(4);
            n14 = new SNode(5);
            n21 = new SNode(2);
            n22 = new SNode(5);
            n23 = new SNode(6);
            n24 = new SNode(7);
            
            n11.next = n12; n12.next = n13; n13.next = n14;
            sl1.first = n11;
            
            n21.next = n22; n22.next = n23; n23.next = n24;
            sl2.first = n21;
            
            sl = M11Q14Stu.SList.sortedMerge(sl1, sl2);
            
            runner = sl.first;
            
            assertEquals(str + "La valeur du premier noeud n'est pas correcte", runner.value, 1);
            
            runner = runner.next;
            assertEquals(str + "La valeur du deuxième noeud n'est pas correcte", runner.value, 2);
            
            runner = runner.next;
            assertEquals(str + "La valeur du troisième noeud n'est pas correcte", runner.value, 3);
            
            runner = runner.next;
            assertEquals(str + "La valeur du quatrième noeud n'est pas correcte", runner.value, 4);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 5ème noeud n'est pas correcte", runner.value, 5);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 6ème noeud n'est pas correcte", runner.value, 6);
            
            runner = runner.next;
            assertEquals(str + "La valeur du 7ème noeud n'est pas correcte", runner.value, 7);
            
            boolean err = false;
            try {
                sl = M11Q14Stu.SList.sortedMerge(null, null);
                err = true;
            } catch (AssertionError e){
                //Assertion réussie
            } catch (NullPointerException e){
                err = true;
            }
            if (err){
                fail(str + "Vous devez utiliser la programmation défensive");
            }
            
            err = false;
            try {
                sl = M11Q14Stu.SList.sortedMerge(null, sl2);
                err = true;
            } catch (AssertionError e){
                //Assertion réussie
            } catch (NullPointerException e){
                err = true;
            }
            if (err){
                fail(str + "Vous devez utiliser la programmation défensive");
            }
            
            err = false;
            try {
                sl = M11Q14Stu.SList.sortedMerge(sl1, null);
                err = true;
            } catch (AssertionError e){
                //Assertion réussie
            } catch (NullPointerException e){
                err = true;
            }
            if (err){
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
		Result result = JUnitCore.runClasses(M11Q14.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
