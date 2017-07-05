/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran, Maxime Mawait
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
	
	@Test
	public void testFact(){
		try{
        	assertEquals("Question 1 :\nVerifiez les pre !",-1,FactStu.fact(-10));
            assertEquals("Question 1 :\nFact(0) ne donne pas le resultat attendu :",1,FactStu.fact(0));
            assertEquals("Question 1 :\nFact(1) ne donne pas le resultat attendu :",1,FactStu.fact(1));
            assertEquals("Question 1 :\nFact(4) ne donne pas le resultat attendu :",24,FactStu.fact(4));
            assertEquals("Question 2 :\nVerifiez les pre !",-1.0,FactStu.expon(-10),0.5);
            assertEquals("Question 2 :\nExp(0) ne donne pas le résultat attendu:",1.0,FactStu.expon(0),0.01);
            assertEquals("Question 2 :\nExp(1) ne donne pas le résultat attendu:",2.718281829585647,FactStu.expon(1),0.5);
            assertEquals("Question 2 :\nExp(2) ne donne pas le résultat attendu:", 7.389071617436451,FactStu.expon(2),0.5);
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
