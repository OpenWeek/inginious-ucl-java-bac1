/**
 *  Copyright (c) 2016 Gellens Arnaud, Gonzalez Alvarez Pablo
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
import java.util.Arrays;

public class M5BiFi {
	
    /**
     * Question 1
     * Fonction de référence pour comparer avec les résultats de la 
     * fonction de l'étudiant.
     */
    private void shiftRightOne(int[] tab) {
    	int newFirst = tab[tab.length - 1];
        for (int i = tab.length - 1 ; i > 0; i--) {
        	tab[i] = tab[i - 1];
        }
        tab[0] = newFirst;
    }
    
    /**
     * Question 2
     * Fonction de référence pour comparer avec les résultats de la 
     * fonction de l'étudiant.
     */
    private void shiftRight(int[] tab, int n) {
    	for (int i = 0; i < n; i++)
    		shiftRightOne(tab);
    }
    
	@Test
	public void testQ1(){
    	String str = "Question 1 : \n Le code semble comporter des erreurs : ";
	try{
        	int n = 5; // longueur du tableau 
            int shift = 3; // longueur du décalage
        	int[] tab = new int[n];
            for (int i = 0; i < n ; i++) { // tab change à chaque soumission
            	tab[i] = (int) (Math.random() * 10);
            }
            int[] stuShiftRightOne = Arrays.copyOf(tab, tab.length);
            int[] shiftRightOne = Arrays.copyOf(tab, tab.length);
            
            try{
            	M5BiFiStu.shiftRightOne(stuShiftRightOne);
            }catch (AssertionError e) {
		fail("Question 1:\nVous n'utilisez pas correctement assert.");			
	    }
            shiftRightOne(shiftRightOne);
                       
		assertTrue("Question 1 : \n Votre fonction shiftRight ne fournit pas les bons résultats,\n votre fonction retourne " + Arrays.toString(stuShiftRightOne) + " avec ce tableau " + Arrays.toString(tab) + ".", Arrays.equals(stuShiftRightOne, shiftRightOne));
            boolean err=false;
            try { 
            	M5BiFiStu.shiftRightOne(null);
            	err=true;
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancé
            } catch (NullPointerException e) {
            	err=true;
            }
            if (err){
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.");
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
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
        	}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    @Test
	public void testQ2(){
    	String str = "Question 2 : \n Le code semble comporter des erreurs : ";
		try{
        	int n = 5; // longueur du tableau 
            int shift = 3; // longueur du décalage
        	int[] tab = new int[n];
            for (int i = 0; i < n ; i++) { // tab change à chaque soumission
            	tab[i] = (int) (Math.random() * 10);
            }
            int[] stuShiftRight = Arrays.copyOf(tab, tab.length);
            int[] shiftRight = Arrays.copyOf(tab, tab.length);
            
            try{
            	M5BiFiStu.shiftRight(stuShiftRight, shift);
            }catch (AssertionError e) {
		fail("Question 2 :\nVous n'utilisez pas correctement assert.");	
 	    }
            shiftRight(shiftRight, shift);
            
            assertTrue("Question 2 :\n Votre fonction shiftRight ne fournit pas les bons résultats,\n votre fonction retourne " + Arrays.toString(stuShiftRight) + " avec ce tableau " + Arrays.toString(tab) + ".", Arrays.equals(stuShiftRight, shiftRight));
            boolean err=false;
            try {
            	M5BiFiStu.shiftRight(null, shift);
                err=true;
                
            } catch (AssertionError e) {
            // Pour vérifier qu'une Assertion a bien été lancé
            } catch (NullPointerException e) {
            	err=true;
            }
            if(err){
            	fail("Question 2 : \n Vous devez utiliser de la programmation défensive.");
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
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
        	}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M5BiFi.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
