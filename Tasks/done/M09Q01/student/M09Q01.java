/**
 *  Copyright (c) 2016 Justine Doutreloux, Carolina Unriza Salamanca, Charline Outters
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


public class M09Q01 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	private static String writed;
	
	//Generates a random String to write in the file (to avoid students getting the answer and just print it)
	public static String generateString(int length){
		String s = "";
		Random r = new Random();
		for(int i = 0 ; i < length ; i++){
			s += (char) ((r.nextInt('z' - 'a') + 'a'));
		}
	        writed = s;
		return s;
	}
    
    	//Writes the generated String in the file
	public static void writeFile(){
        String toW = generateString(6);
		try{
			PrintWriter pw = new PrintWriter(new FileWriter("student/fichier.txt"));
			pw.println(toW);
			pw.close();
	 	}catch(IOException e){
			e.printStackTrace();
	 	}
    	}
    
   
	@Test
	//Tests the correct opening of the file
	//Compares the answer given by the student with the text in the file
	public void testPos(){
    		writeFile();
		try{
	            M09Q01Stu.premierFichier("student/fichier.txt");
	            BufferedReader stuFile;
	            stuFile = new BufferedReader(new FileReader("student/outStu.txt"));
	            String res = stuFile.readLine();
	            stuFile.close();
	            assertEquals(writed, res);
		}catch(FileNotFoundException e){
			fail(str + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existant.");
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
	

	
	// Checking code
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M09Q01.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
