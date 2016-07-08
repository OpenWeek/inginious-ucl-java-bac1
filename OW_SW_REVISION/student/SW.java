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

public class SW {

	private static String str = "Le code semble comporter des erreurs : ";

	@Test
	public void testSW(){
		try{
      Professeur p = new Professeur("Pecheur",35,false,true);
      Professeur p1 = new Professeur("Jeannette",54,true,true);
      Professeur p = new Professeur("Elise",42,true,false);
      Professeur p2 = new Professeur("Pecheur",35,false,true);
      Etudiant e = new Etudiant("Antoine",22,true,false);
      Etudiant e1 = new Etudiant("Manon",18,true,true);
      Etudiant e2 = new Etudiant("Adrien",21,true,true);
      Etudiant e3 = new Etudiant("Bastien",20,false,true);
      Tuteur t = new Tuteur("Charles",24,true,true);
      Tuteur t = new Tuteur("Charles",24,true,true);
      Tuteur t = new Tuteur("Charles",24,true,true);
      Tuteur t = new Tuteur("Charles",24,true,true);
      Assistant a = new Assistant("Jean",28,false,false);

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
		Result result = JUnitCore.runClasses(SW.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
