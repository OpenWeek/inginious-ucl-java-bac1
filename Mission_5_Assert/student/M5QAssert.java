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

public class M5QAssert {

    
	@Test
	public void testQ1(){
    	String str = "Question 1 : \n Le code semble comporter des erreurs : ";
		try{
        	int i = (int)(Math.random()*20);
            // essay avec une valeur valide
            try{
            	M5QAssertStu.question1(i);
            }catch (AssertionError e) {
            	fail("Question 1 :\n La condition de l'assert n'est pas bonne pour n="+i+".");
            }
           	
            // essay avec une valeur non valide
            boolean err = false; // nécessaire car il n'est pas possible de lancer directement dans le block try la méthode fail
            try{
            	M5QAssertStu.question1(-i-1);
                err=true; 
            }catch (AssertionError e) {
            	// c'est bien si un assertion à bien été lancé
            }
            
            if (err)
            	fail("Question 1 :\n La condition de l'assert n'est pas bonne pour n="+-i+".");
                
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
        	
            int i = 1+(int)(Math.random()*4);
            int j = 1+(int)(Math.random()*4);
            int k = 1+(int)(Math.random()*4);
            
            ///////////////
            // essay avec une valeur valide
            int tabM[][] = new int[i][j];
            int tabL[][] = new int[j][k];
            
            try{
            	M5QAssertStu.question2(tabM, tabL);
            }catch (AssertionError e) {
            	fail("Question 2 :\n La condition de l'assert n'est pas bonne pour la multiplication d'une matrice ["+i+"x"+j+"] . ["+j+"x"+k+"]");
            }
           	
            ///////////////
            // essay avec une valeur non valide
            tabM = new int[i][j];
            tabL = new int[j+1][k];
            boolean err = false; // nécessaire car il n'est pas possible de lancer directement dans le block try la méthode fail
            try{
            	M5QAssertStu.question2(tabM, tabL);
                err=true; 
            }catch (AssertionError e) {
            	// c'est bien si un assertion à bien été lancé
            }
            
            if (err)
            	fail("Question 2 :\n La condition de l'assert n'est pas bonne pour la multiplication d'une matrice ["+i+"x"+j+"] . ["+(j+1)+"x"+k+"]");
                
           ///////////////
           //test avec une des deux matrices null
           try{
            	M5QAssertStu.question2(tabM,null);
                err=true;
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancé
            } catch (NullPointerException e) {
            	fail("Question 2 : \n Vous devez utiliser de la programmation défensive.\n Vous devez vérifier avant tout que les matrices ne sont pas null.");
            }
            if (err){
            	fail("Question 2 : \n Vous devez utiliser de la programmation défensive.\n Les assertions ne vérifie pas que les matrices ne sont pas null.");
            }
            
            try{
            	M5QAssertStu.question2(null,tabM);
                err=true;
                
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancé
            } catch (NullPointerException e) {
            	fail("Question 2 : \n Vous devez utiliser de la programmation défensive.\n Vous devez vérifier avant tout que les matrices ne sont pas null.");
            }
            if (err){
            	fail("Question 2 : \n Vous devez utiliser de la programmation défensive.\n Les assertions ne vérifie pas que les matrices ne sont pas null.");
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
		Result result = JUnitCore.runClasses(M5QAssert.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
