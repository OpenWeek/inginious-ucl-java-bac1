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

public class Fact {
	
	private static String str = "Le code semble comporter des erreurs : ";
    private static String str1 = "Question 1 :\n";
    private static String str2 = "Question 2 :\n";
	
	@Test
	public void testFact(){
		try{
        	assertEquals(str1 + "Verifiez les pre !",-1,FactStu.fact(-10));
            assertEquals(str1 + "Fact(0) ne donne pas le resultat attendu :",1,FactStu.fact(0));
            assertEquals(str1 + "Fact(1) ne donne pas le resultat attendu :",1,FactStu.fact(1));
            assertEquals(str1 + "Fact(4) ne donne pas le resultat attendu :",24,FactStu.fact(4));
		}catch (ArithmeticException e){
			fail(str1 + str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str1 + str + "Attention, certaines variables ont été mal castées	!");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str1 + str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str1 + str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(NullPointerException e){
			fail(str1 + str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str1 + str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExp(){
		try{
        assertEquals(str2 + "Verifiez les pre !",-1.0,FactStu.exp(-10),0.0);
        	assertEquals(str2 + "exp(0) ne donne pas le resultat attendu :",1.0,FactStu.exp(0),0.0);
            assertEquals(str2 + "exp(1) ne donne pas le resultat attendu :",2.72,FactStu.exp(1),0.02);
            assertEquals(str2 + "exp(4) ne donne pas le resultat attendu :",54.59,FactStu.exp(4),0.5);
		}catch (ArithmeticException e){
			fail(str2 + str + "il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str2 + str + "Attention, certaines variables ont été mal castées	!");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str2 + str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str2 + str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(NullPointerException e){
			fail(str2 + str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str2 + str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Fact.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
