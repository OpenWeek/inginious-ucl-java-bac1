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

public class M5QInversion {

  private void inv(int[] tab){
    int tmp;
    for(int i=0; i<(int)(tab.length/2);i++){
      tmp = tab[i];
      tab[i]=tab[tab.length-i-1];
      tab[tab.length-i-1]=tmp;
    }
  }

  private static String str = "Le code semble comporter des erreurs : ";

  /*
  * @post: test le code de l'étudiant pour un tableau de longueur len
  */
  private void testComp(int len){
    int tab[] = new int[len];
    for (int i=0; i<len;i++){
      tab[i]=(int)(Math.random()*10);
    }
    int tabInv[] = Arrays.copyOf(tab, tab.length);
    int stuTabInv[] = Arrays.copyOf(tab, tab.length);
    inv(tabInv);
    try{ // vérifie que l'étudiant utilise bien assert
      M5QInversionStu.inverse(stuTabInv);
    } catch(AssertionError e) {
      fail("Question 1 :\n Vous n'utilisez pas correctement assert.");
    }
    assertTrue("Question 1 :\n Le tableau est mal inversé, votre solution est "+ Arrays.toString(stuTabInv)+" avec le tableau suivant "+Arrays.toString(tab) + ".",Arrays.equals(tabInv,stuTabInv));

  }

  @Test
  public void test(){
    try{
      // test la fonction de l'étudiant pour un tableau de longueur...
      testComp(5); // ...impaire...
      testComp(6); // ...et paire

      // verification de l'utilisation de la programation défensive (assert)
      boolean err=false;
      try {
        M5QInversionStu.inverse(null);
        err=true;
      } catch (AssertionError e) {
        // Pour vérifier qu'une Assertion a bien été lancée
      } catch (NullPointerException e) {
        err=true;
      }
      if(err){
        fail("Question 1 :\n Vous devez utiliser de la programmation défensive.");
      }

    } catch (ArithmeticException e)  {
      fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
      e.printStackTrace();
    } catch(ClassCastException e)  {
      fail(str + "Attention, certaines variables ont été mal castées	!");
      e.printStackTrace();
    } catch(StringIndexOutOfBoundsException e)  {
      e.printStackTrace();
      fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
      e.printStackTrace();
    } catch(ArrayIndexOutOfBoundsException e)  {
      e.printStackTrace();
      fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
      e.printStackTrace();
    } catch(NullPointerException e)  {
      fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
      e.printStackTrace();
    } catch(Exception e)  {
      fail(str + "\n" + e.getMessage());
      e.printStackTrace();
    }
  }



  // Code verificateur
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(M5QInversion.class);
    for (Failure failure: result.getFailures()) {
      System.err.println(failure.toString());
    }
    if (result.wasSuccessful()) {
      System.out.println("Tous les tests se sont passés sans encombre");
      System.exit(127);
    }
  }
}
