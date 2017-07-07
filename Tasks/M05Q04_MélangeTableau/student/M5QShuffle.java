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
import java.util.Arrays;
import org.junit.runner.notification.Failure;

public class M5QShuffle {



	private static String str = "Le code semble comporter des erreurs : ";




	@Test
	public void testSame(){ // test que deux exécutions de la fonction ne donne pas le même résultat
		try{
        	int len = 6; // longueur du tableau
			 int tab[] = new int[len];
            for (int i=0; i<len;i++){
                tab[i]=(int)(Math.random()*100);
            }

            int tabShuf1[] = Arrays.copyOf(tab, tab.length);
            int tabShuf2[] = Arrays.copyOf(tab, tab.length);
            try{
                M5QShuffleStu.shuffle(tabShuf1);
                M5QShuffleStu.shuffle(tabShuf2);
        	}catch(AssertionError e) {
            	fail("Question 1 :\n Vous n'utilisez pas correctement assert.");
            }


            assertFalse("Question 1 :\n Votre code ne mélange pas de manière aléatoir le tableau", Arrays.equals(tabShuf1, tabShuf2));


            // verification de l'utilisation de la programation défensive
            boolean err = false;
            try {
		M5QShuffleStu.shuffle(null);
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
	public void testWellShuffle(){ // test que le tableau est bien mélangé
		try{
        	int len = 6; // longeur du taleau
			 int tab[] = new int[len];
            for (int i=0; i<len;i++){
                tab[i]=(int)(Math.random()*100);
            }

            int tabShuf[] = Arrays.copyOf(tab, tab.length);
            int t[] = Arrays.copyOf(tab, tab.length);
            try{
                M5QShuffleStu.shuffle(tabShuf);
        	}catch(AssertionError e) {
            	//pas nécessaire puisque déjà tester dans la fonction de test juste avant
                //fail("Question 1 :\n Vous n'utilisez pas correctement assert.");
            }

            /*boolean found=false;
            for (int i=0; i<len;i++){// parcour le tableau de mélanger par l'étudiant		found=false;
            	for (int j=0; j<len-i;i++){ //parcourt le tableau initial sans regarder les derniers élémnents avec len-i qui ont déjà été trouvé
                	if (tabShuf[i]==tab[j]){ // si on trouve un élément qui à la même valeur on la permute avec le dernier élémentmet à la place du dernier élément
                    	int temp = tab[j];
                        tab[j]=tab[len-i-1]; //tab[len-i-1] est le dernier élément qui aurait été vérifier
                        tab[len-i-1]=tab[j];
                        found=true;
                    }
                }
                if(!found){
                	fail("Question 1 :\n Votre code ne mélange pas correctement le tablleau, votre tableau: "+Arrays.toString(tabShuf)+" avec ce tableau comme paramettre : "+Arrays.toString(t));
                }
            }*/
            int tabShufSort[] = Arrays.copyOf(tabShuf, tab.length);
            Arrays.sort(tab);
            Arrays.sort(tabShufSort);
            assertTrue("Question 1 :\n Votre code ne mélange pas correctement le tablleau, votre tableau: "+Arrays.toString(tabShuf)+" avec ce tableau comme paramettre : "+Arrays.toString(t)+"." + "bon tableau: " + Arrays.toString(tab) + "tableau étudiant: " + Arrays.toString(tabShufSort), Arrays.equals(tab, tabShufSort));

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
		Result result = JUnitCore.runClasses(M5QShuffle.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
