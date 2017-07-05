/**
*  Copyright (c) 2017 Mawait Maxime, Habran Antoine, Visée William
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

public class CharArray {

  private static String str = "Le code semble comporter des erreurs : ";

  @Test
  public void test(){
    try{
      assertEquals("Question 1 :\nLe code ne fonctione quand le caractère est présent plus d'une fois",2,CharArrayStu.count("LSINF1252",'2'));
        
      assertEquals("Question 1 :\nLe code ne fonctione quand le caractère est présent une fois",1,CharArrayStu.count("LSINF1252",'5'));
        
      assertEquals("Question 1 :\nLe code ne fonctione quand le caractère n'est pas présent",0,CharArrayStu.count("LSINF1252",'0'));
        
      assertEquals("Question 2 :\nLe code ne fonctione pas correctement","ba",CharArrayStu.inverseArray("ab".toCharArray()));

      // verification de l'utilisation de la programation défensive (assert)
      boolean err1 = false;
      boolean err2 = false;
      try {
        int gg = CharArrayStu.count(null, 'a');
        err1=true;
        
      } catch (AssertionError e) {
        // Pour vérifier qu'une Assertion a bien été lancée
      } catch (NullPointerException e) {
        err1=true;
      }
      if(err1){
        fail("Question 1 :\n Vous devez utiliser de la programmation défensive.");
      }
      
      try {
        String lol =CharArrayStu.inverseArray(null);
        err2 = true;
        
      } catch (AssertionError e) {
        // Pour vérifier qu'une Assertion a bien été lancée
      } catch (NullPointerException e) {
        err2 = true;
      }
      if(err2){
        fail("Question 2 :\n Vous devez utiliser de la programmation défensive.");
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
    Result result = JUnitCore.runClasses(CharArray.class);
    for (Failure failure: result.getFailures()) {
      System.err.println(failure.toString());
    }
    if (result.wasSuccessful()) {
      System.out.println("Tous les tests se sont passés sans encombre");
      System.exit(127);
    }
  }
}

