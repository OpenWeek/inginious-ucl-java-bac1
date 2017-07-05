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

public class M11Q21 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test1(){
		try{

			M11Q21Stu mStu = new M11Q21Stu();

			/* first list sl1 */
			/* sl1: 10 -> 30 -> 50 */
			M11Q21Stu.SList sl1 = mStu.new SList();

			M11Q21Stu.SNode sl1n1 = mStu.new SNode(10);
			M11Q21Stu.SNode sl1n2 = mStu.new SNode(30);
			M11Q21Stu.SNode sl1n3 = mStu.new SNode(50);
			
			sl1.first = sl1n1;
			sl1n1.next = sl1n2;
			sl1n2.next = sl1n3;

			/* second list sl2 */
			/* sl1: 20 -> 40 */
			M11Q21Stu.SList sl2 = mStu.new SList();

			M11Q21Stu.SNode sl2n1 = mStu.new SNode(20);
			M11Q21Stu.SNode sl2n2 = mStu.new SNode(40);
			
			sl2.first = sl2n1;
			sl2n1.next = sl2n2;

			M11Q21Stu.SList sl3 = sl1.sortedMerge(sl1, sl2);

			String res = sl3.toString();

			String expected = "10 -> 20 -> 30 -> 40 -> 50";

			if (!expected.equals(res)) {
				fail(str + "mergeSort de sl1:"+sl1.toString()+" et de sl2:"+sl2.toString()+" devrait être sl:"+expected+", mais mergeSort renvoit sl:"+res+".");
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

			M11Q21Stu mStu = new M11Q21Stu();

			/* first list sl1 */
			/* sl1: 10 -> 30 -> 50 */
			M11Q21Stu.SList sl1 = mStu.new SList();

			M11Q21Stu.SNode sl1n1 = mStu.new SNode(10);
			M11Q21Stu.SNode sl1n2 = mStu.new SNode(30);
			M11Q21Stu.SNode sl1n3 = mStu.new SNode(50);
			
			sl1.first = sl1n1;
			sl1n1.next = sl1n2;
			sl1n2.next = sl1n3;

			/* second list sl2 */
			/* sl1: null */
			M11Q21Stu.SList sl2 = mStu.new SList();

			M11Q21Stu.SList sl3 = sl1.sortedMerge(sl1, sl2);

			String res = sl3.toString();

			String expected = "10 -> 30 -> 50";

			if (!expected.equals(res)) {
				fail(str + "mergeSort de sl1:"+sl1.toString()+" et de sl2:"+sl2.toString()+" devrait être sl:"+expected+", mais mergeSort renvoit sl:"+res+".");
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

			M11Q21Stu mStu = new M11Q21Stu();

			/* first list sl1 */
			/* sl1: null */
			M11Q21Stu.SList sl1 = mStu.new SList();

			/* second list sl2 */
			/* sl1: 20 -> 40 */
			M11Q21Stu.SList sl2 = mStu.new SList();

			M11Q21Stu.SNode sl2n1 = mStu.new SNode(20);
			M11Q21Stu.SNode sl2n2 = mStu.new SNode(40);
			
			sl2.first = sl2n1;
			sl2n1.next = sl2n2;

			M11Q21Stu.SList sl3 = sl1.sortedMerge(sl1, sl2);

			String res = sl3.toString();

			String expected = "20 -> 40";

			if (!expected.equals(res)) {
				fail(str + "mergeSort de sl1:"+sl1.toString()+" et de sl2:"+sl2.toString()+" devrait être sl:"+expected+", mais mergeSort renvoit sl:"+res+".");
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

			M11Q21Stu mStu = new M11Q21Stu();

			/* first list sl1 */
			/* sl1: null */
			M11Q21Stu.SList sl1 = mStu.new SList();

			/* second list sl2 */
			/* sl1: null */
			M11Q21Stu.SList sl2 = mStu.new SList();

			M11Q21Stu.SList sl3 = sl1.sortedMerge(sl1, sl2);

			String res = sl3.toString();

			String expected = "empty SList";

			if (!expected.equals(res)) {
				fail(str + "mergeSort de sl1:"+sl1.toString()+" et de sl2:"+sl2.toString()+" devrait être sl:"+expected+", mais mergeSort renvoit sl:"+res+".");
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
		Result result = JUnitCore.runClasses(M11Q21.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
