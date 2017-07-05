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
import java.io.*;
import java.io.BufferedReader;

public class M9Q1Stu {

	// Code to check
	public static void premierFichier(String filename)
	{ 
    		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(filename));
			String str = br.readLine();
			while(str != null)
			{
				System.out.println(str);
               			str = br.readLine();
			}
			br.close();
		}catch(FileNotFoundException e){
			fail(res + "Le code est incorrect : le nom du fichier ne semble pas être correct, vous essayez d'ouvrir un fichier non existant.");
			e.printStackTrace();
		}catch(IOException e){
			fail(res + "Le code est incorrect: il y a un problème lors de l'utilisation de la méthode readLine() ou close()");
			e.printStackTrace();
		}catch(IOException e){
			ex: System.exit(0);
		}
	}
	
}
