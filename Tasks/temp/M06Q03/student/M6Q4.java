//   Copyright (c) 2016 Doriane Olewicki, Marie-Marie van der Beek
//   This program is free software: you can redistribute it and/or modify
//   it under the terms of the GNU Affero General Public License as published by
//   the Free Software Foundation, either version 3 of the License, or
//   (at your option) any later version.
//
//   This program is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU Affero General Public License for more details.
//
//   You should have received a copy of the GNU Affero General Public License
//   along with this program.  If not, see <http://www.gnu.org/licenses/>.

package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class M6Q4 {
	
	private static String str = "Le code semble comporter des erreurs : ";

    @Test
	public void test1(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            M6Q4Stu b = new M6Q4Stu(prof1, code1, credit1);
            
            assertTrue("Les objets devraient être identiques ", a.equals(b));
            
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
	public void test2(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            
            String prof2 = "pr" + (int)(Math.random() * 10 / 1);
    		String code2 = "co" + (int)(Math.random() * 10 / 1);
   		    int credit2 = (int)(Math.random() * 10 / 1) + 10;
            M6Q4Stu b = new M6Q4Stu(prof2, code2, credit2);
           
            assertFalse("Les objets devraient ne pas être identiques (avec des objet complètement différents) ", a.equals(b));
            
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
	public void test3(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
           String prof2 = "pr" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            M6Q4Stu b = new M6Q4Stu(prof2, code1, credit1);
           
            assertFalse("Les objets devraient ne pas être identiques (avec seul le nom du prof qui diffère) ", a.equals(b));
            
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
	public void test4(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
            String code2 = "co" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            M6Q4Stu b = new M6Q4Stu(prof1, code2, credit1);
           
            assertFalse("Les objets devraient ne pas être identiques (avec seul le code qui diffère) ", a.equals(b));
            
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
	public void test5(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            int credit2 = (int)(Math.random() * 10 / 1) + 10;
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            M6Q4Stu b = new M6Q4Stu(prof1, code1, credit2);
            
            assertFalse("Les objets devraient ne pas être identiques (avec seul le nombre de crédit qui diffère) ", a.equals(b));
            
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
	public void test6(){
		try{
           String prof1 = "prof" + (int)(Math.random() * 10 / 1);
    		String code1 = "code" + (int)(Math.random() * 10 / 1);
   		    int credit1 = (int)(Math.random() * 10 / 1);
            int credit2 = (int)(Math.random() * 10 / 1) + 10;
            M6Q4Stu a = new M6Q4Stu(prof1, code1, credit1);
            M6Q4Stu b = null;
            
            assertFalse("Les objets devraient ne pas être identiques (avec un objet NULL) ", a.equals(b));
            
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
		Result result = JUnitCore.runClasses(M6Q4.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}



