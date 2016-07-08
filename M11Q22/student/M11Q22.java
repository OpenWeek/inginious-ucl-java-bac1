package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class M11Q22 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test1(){
		try{

			M11Q22Stu mStu = new M11Q22Stu();

			/* l */
			/* l: 10 -> 20 -> 30 -> 40 -> 50 */
			M11Q22Stu.List l = mStu.new List();

			M11Q22Stu.Node ln1 = mStu.new Node(10);
			M11Q22Stu.Node ln2 = mStu.new Node(20);
			M11Q22Stu.Node ln3 = mStu.new Node(30);
			M11Q22Stu.Node ln4 = mStu.new Node(40);
			M11Q22Stu.Node ln5 = mStu.new Node(50);
			
			l.first = ln1;
			ln1.next = ln2;
			ln2.next = ln3;
			ln3.next = ln4;
			ln4.next = ln5;

			l.reverse();

			String res = l.toString();

			String expected = "50 -> 40 -> 30 -> 20 -> 10";

			if (!expected.equals(res)) {
				fail(str + "reverse de l: 10 -> 20 -> 30 -> 40 -> 50 devrait donner l:"+expected+", mais reverse fournit l:"+res+".");
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

			M11Q22Stu mStu = new M11Q22Stu();

			/* l */
			/* l: 10 */
			M11Q22Stu.List l = mStu.new List();

			M11Q22Stu.Node ln1 = mStu.new Node(10);
			
			l.first = ln1;
			
			l.reverse();

			String res = l.toString();

			String expected = "10";

			if (!expected.equals(res)) {
				fail(str + "reverse de l: 10 devrait donner l:"+expected+", mais reverse fournit l:"+res+".");
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

			M11Q22Stu mStu = new M11Q22Stu();

			/* sl */
			/* sl: empty List */
			M11Q22Stu.List l = mStu.new List();
			
			l.reverse();

			String res = l.toString();

			String expected = "empty List";

			if (!expected.equals(res)) {
				fail(str + "reverse de l: empty List devrait donner l:"+expected+", mais reverse fournit l:"+res+".");
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
		Result result = JUnitCore.runClasses(M11Q22.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
