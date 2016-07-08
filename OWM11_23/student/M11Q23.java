/*   Copyright (c) 2016 KÜHN Alexandre
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

public class M11Q23 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test1(){
		try{

			M11Q23Stu mStu = new M11Q23Stu();

			/* sl */
			/* sl: 10 -> 20 -> 20 -> 30 */
			M11Q23Stu.SList sl = mStu.new SList();

			M11Q23Stu.SNode sln1 = mStu.new SNode(10);
			M11Q23Stu.SNode sln2 = mStu.new SNode(20);
			M11Q23Stu.SNode sln3 = mStu.new SNode(20);
			M11Q23Stu.SNode sln4 = mStu.new SNode(30);
			
			sl.first = sln1;
			sln1.next = sln2;
			sln2.next = sln3;
			sln3.next = sln4;

			sl.removeDuplicates();

			String res = sl.toString();

			String expected = "10 -> 20 -> 30";

			if (!expected.equals(res)) {
				fail(str + "removeDuplicates de sl:10 -> 20 -> 20 -> 30 devrait donner sl:"+expected+", mais removeDuplicates fournit sl:"+res+".");
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

	@Test
	public void test2(){
		try{

			M11Q23Stu mStu = new M11Q23Stu();

			/* sl */
			/* sl: 10 -> 20 -> 20 -> 30 -> 30 */
			M11Q23Stu.SList sl = mStu.new SList();

			M11Q23Stu.SNode sln1 = mStu.new SNode(10);
			M11Q23Stu.SNode sln2 = mStu.new SNode(20);
			M11Q23Stu.SNode sln3 = mStu.new SNode(20);
			M11Q23Stu.SNode sln4 = mStu.new SNode(30);
			M11Q23Stu.SNode sln5 = mStu.new SNode(30);
			
			sl.first = sln1;
			sln1.next = sln2;
			sln2.next = sln3;
			sln3.next = sln4;
			sln4.next = sln5;

			sl.removeDuplicates();

			String res = sl.toString();

			String expected = "10 -> 20 -> 30";

			if (!expected.equals(res)) {
				fail(str + "removeDuplicates de sl:10 -> 20 -> 20 -> 30 -> 30 devrait donner sl:"+expected+", mais removeDuplicates fournit sl:"+res+".");
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

	@Test
	public void test3(){
		try{

			M11Q23Stu mStu = new M11Q23Stu();

			/* sl */
			/* sl: 10 */
			M11Q23Stu.SList sl = mStu.new SList();

			M11Q23Stu.SNode sln1 = mStu.new SNode(10);
			
			sl.first = sln1;
			
			sl.removeDuplicates();

			String res = sl.toString();

			String expected = "10";

			if (!expected.equals(res)) {
				fail(str + "removeDuplicates de sl:10 devrait donner sl:"+expected+", mais removeDuplicates fournit sl:"+res+".");
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

	@Test
	public void test4(){
		try{

			M11Q23Stu mStu = new M11Q23Stu();

			/* sl */
			/* sl: empty List */
			M11Q23Stu.SList sl = mStu.new SList();
			
			sl.removeDuplicates();

			String res = sl.toString();

			String expected = "empty SList";

			if (!expected.equals(res)) {
				fail(str + "removeDuplicates de sl: empty SList devrait donner sl:"+expected+", mais removeDuplicates fournit sl:"+res+".");
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
		Result result = JUnitCore.runClasses(M11Q23.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
