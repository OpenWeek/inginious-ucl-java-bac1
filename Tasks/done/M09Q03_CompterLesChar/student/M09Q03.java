package student;
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

import static org.junit.Assert.*;
import java.io.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.*;

public class M09Q03 
{
	private static String str = "Le code semble comporter des erreurs : ";
	
	/*
	 * @pre : length >0
	 * @post : renvoie un string random de longueur length
	 */
	public static String generateString(int length)
	{
		String s = "";
		Random r = new Random();
		for(int i = 0 ; i < length ; i++){
			s += (char) ((r.nextInt('z' - 'a') + 'a'));
		}
		return s;
	}
	
	@Test
	public void test()
	{
		try
		{
			int res = M09Q03Stu.charNumber("fichier.txt"); //on stocke le nombre retourné par l'etudiant
			int res1 = M09Q03Corr.charNumber("fichier.txt"); //on stocke le nombre retourné par notre code
			assertEquals(res, res1); //les 2 valeurs doivent être identiques
		}
		catch(FileNotFoundException e)
		{
			fail(str + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existant.");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			fail(str + "Le code est incorrect: il y a un problème à l'ouverture ou à la fermeture du fichier");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1()
	{
		try
		{
			String content = generateString(5) + " " + generateString(6); //pour être sûr que les étudiants ne hardcode pas le nombre à retourner, on fait un test sur un fichier contenant un string random
			File file = new File("file.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			int res = M09Q03Stu.charNumber("file.txt");
			int res1 = M09Q03Corr.charNumber("file.txt");
			assertEquals(res, res1);
		}
		catch(FileNotFoundException e)
		{
			fail(str + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existant.");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			fail(str + "Le code est incorrect: il y a un problème à l'ouverture ou à la fermeture du fichier");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(M09Q03.class);
		for(Failure failure : result.getFailures())
		{
			System.err.println(failure.toString());
		}
		if(result.wasSuccessful())
		{
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
	
}
