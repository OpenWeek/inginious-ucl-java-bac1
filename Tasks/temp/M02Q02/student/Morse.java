/**
 *  Copyright (c) 2016 Ody Lucas, Rousseaux Tom
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
import java.lang.StringBuffer;
import java.lang.System;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;
import java.io.*;

public class Morse {
   
    private static String str = "Le code semble comporter des erreurs : ";
   
    @Test
    public void testNul(){
        try{
            StringBuffer sb = new StringBuffer();
            int nMorceau = 0, nTiret = 2, nPoint = 3;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }

            assertEquals("Avez-vous pensé au cas nul ?", sb.toString(), MorseStu.drawLine(nMorceau, nTiret, nPoint));
            sb = new StringBuffer();
            nMorceau = 2;
            nTiret = 0;
            nPoint = 3;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }
            assertEquals("Avez-vous pensé au cas nul ?", sb.toString(), MorseStu.drawLine(nMorceau, nTiret, nPoint));

            sb = new StringBuffer();
            nMorceau = 2;
            nTiret = 3;
            nPoint = 0;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }
            assertEquals("Avez-vous pensé au cas nul ?", sb.toString(), MorseStu.drawLine(nMorceau, nTiret, nPoint));

            sb = new StringBuffer();
            nMorceau = 2;
            nTiret = 4;
            nPoint = 3;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }
        }catch (ArithmeticException e){
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        }catch(ClassCastException e){
            fail(str + "Attention, certaines variables ont été mal castées    !");
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
    public void testTaille(){
        try{
            StringBuffer sb = new StringBuffer();
            int nMorceau = 2, nTiret = 4, nPoint = 3;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }
            assertEquals("Votre réponse ne contient pas assez de caractères, vérifiez le nombre de tours de vos boucles", MorseStu.drawLine(nMorceau, nTiret, nPoint).length() < sb.toString().length(), false);
            assertEquals("Votre réponse contient trop de caractères, vérifiez le nombre de tours de vos boucles", MorseStu.drawLine(nMorceau, nTiret, nPoint).length() > sb.toString().length(), false);





        }catch (ArithmeticException e){
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        }catch(ClassCastException e){
            fail(str + "Attention, certaines variables ont été mal castées    !");
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
    public void testNormal(){
        try{
            StringBuffer sb = new StringBuffer();
            int nMorceau = 2, nTiret = 4, nPoint = 3;
            for (int i = 0; i < nMorceau; i++)
            {
                // Tirets
                for (int j = 0; j < nTiret; j++)
                {
                    sb.append('-');
                }
                // Points
                for (int j = 0; j < nPoint; j++)
                {
                    sb.append('.');
                }
            }
            assertEquals("Votre réponse n'est pas la réponse attendue. Votre réponse : " + MorseStu.drawLine(nMorceau, nTiret, nPoint) + "\nLa réponse attendue : " + sb.toString(),MorseStu.drawLine(nMorceau, nTiret, nPoint).equals(sb.toString()), true);



        }catch (ArithmeticException e){
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        }catch(ClassCastException e){
            fail(str + "Attention, certaines variables ont été mal castées    !");
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
        Result result = JUnitCore.runClasses(Morse.class);
        for (Failure failure: result.getFailures()) {
            System.err.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("Tous les tests se sont passés sans encombre");
            System.exit(127);
        }
    }
}