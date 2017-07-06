/*   Copyright (c) 2015, 2016 Massart Aurélie
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
	
    
	@Test
	public void testPop1(){
    	String str = "Question 1 :\n Le code semble comporter des erreurs : ";
		try{
        	Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            n1.next = n2;
            n2.next = n3;
            n2.previous = n1;
            n3.previous = n2;
            M11Q14Stu obj = new M11Q14Stu();
            M11Q14Stu.Stack st = obj.new Stack(n1);
			int res = st.pop();
			assertEquals(str + "la valeur retournée par pop devrait être 1 mais est de "+res, 1, res);
            res = st.pop();
			assertEquals(str + "la valeur retournée par pop devrait être 2 mais est de "+res, 2, res);
            res = st.pop();
			assertEquals(str + "la valeur retournée par pop devrait être 3 mais est de "+res, 3, res);
            
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
	public void testPop2(){
    	String str = "Question 1 :\n Le code semble comporter des erreurs : ";
		try{
        	Node n1 = new Node(5);
            M11Q14Stu obj = new M11Q14Stu();
            M11Q14Stu.Stack st = obj.new Stack(n1);
			int res = st.pop();
			assertEquals(str + "la valeur retournée par pop devrait être 5 mais est de "+res, 5, res);
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
	public void testPush1(){
    	String str = "Question 1 :\n Le code semble comporter des erreurs : ";
		try{
            M11Q14Stu obj = new M11Q14Stu();
            M11Q14Stu.Stack st = obj.new Stack();
            st.push(1);
            st.push(1);
            int res = st.popCorr();
			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile", 1, res);
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile", 1, res);           
           
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
	public void testPush2(){
    	String str = "Question 1 :\n Le code semble comporter des erreurs : ";
		try{
            M11Q14Stu obj = new M11Q14Stu();
            M11Q14Stu.Stack st = obj.new Stack();
            st.push(1);
            st.push(2);
            int res = st.popCorr();
			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile\n", 2, res);
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile\n", 1, res);           
           
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
	public void testPush3(){
    	String str = "Question 1 :\n Le code semble comporter des erreurs : ";
		try{
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            n1.next = n2;
            n2.next = n3;
            n2.previous = n1;
            n3.previous = n2;
            M11Q14Stu obj = new M11Q14Stu();
            M11Q14Stu.Stack st = obj.new Stack(n1);
            st.push(4);
            st.push(5);
            int res = st.popCorr();
			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile, vérifiez que push marche également quand on ajoute des éléments sur une pile non vide initialment \n", 5, res);
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile, vérifiez que push marche également quand on ajoute des éléments sur une pile non vide initialment \n", 4, res);  
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile, vérifiez que push marche également quand on ajoute des éléments sur une pile non vide initialment \n", 1, res);  
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile, vérifiez que push marche également quand on ajoute des éléments sur une pile non vide initialment \n", 2, res);  
            res = st.popCorr();
 			assertEquals(str + "push n'a pas correctement mis l'élément sur la pile, vérifiez que push marche également quand on ajoute des éléments sur une pile non vide initialment \n", 3, res);  
           
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
