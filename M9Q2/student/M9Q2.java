/**
 *  Copyright (c) 2016 Justine Doutreloux, Carolina Unriza, Charline Outters
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
import java.io.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.*;

public class M9Q2 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
		try{
				String res ="";
				M9Q2Stu.deuxiemeFichier("fichier.txt", res);
				assertEquals("Hello", res);
			}
		catch (FileNotFoundException e){
			fail(str + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existnant.");
			e.printStackTrace();
		}catch(IOException e){
			fail(str + "Le code est incorrect: il y a un problème lors de l'utilisation de la méthode readLine() ou close()");
			e.printStackTrace();
		}catch(IllegalArgumentException  e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOpen(){
		try{
				//File name= new File("fichier.txt");
				String res;
				//name.setReadable(false);
				M9Q2Stu.deuxiemeFichier("fichier.txt", res);	
				assertEquals("Hello",res);			
			}
		catch (FileNotFoundException e){
			fail(str + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existnant.");
			e.printStackTrace();
		}catch(IOException e){
			fail(str + "oh dear! Vous essayez ne gérez pas correctement les erreurs liées à open()");
			e.printStackTrace();
		}catch(IllegalArgumentException  e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}
	}
	
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M9Q2.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
