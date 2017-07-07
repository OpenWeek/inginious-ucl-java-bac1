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

public class M04Q05 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testM04Q05(){
		try{
			String str1 = "";
           String str2 = "kayak";
           String str3 = "abab";
           String str4 = "123321";
           String str5 = "123456";
           String str6 = "ab11ba";
           String str7 = "ab13hd";
           String str8 = "ab";
           String str9 = "aa";
           
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : String vide",true,M04Q05Stu.isM04Q05(str1));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str2,true,M04Q05Stu.isM04Q05(str2));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str3,false,M04Q05Stu.isM04Q05(str3));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str4,true,M04Q05Stu.isM04Q05(str4));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str5,false,M04Q05Stu.isM04Q05(str5));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str6,true,M04Q05Stu.isM04Q05(str6));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str7,false,M04Q05Stu.isM04Q05(str7));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str8,false,M04Q05Stu.isM04Q05(str8));
           assertEquals("Votre fonction ne renvoie pas la bonne réponse pour le string : "+str9,true,M04Q05Stu.isM04Q05(str9));
       
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
		Result result = JUnitCore.runClasses(M04Q05.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
