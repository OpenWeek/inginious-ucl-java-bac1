package student;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

public class M9Q3Corr 
{
	/**
	 * @pre -
	 * @post affiche le nombre de caractères contenus dans le fichier
	 */
	public static void charNumber(String filename)
	{
		try
		{
			Scanner sc = new Scanner( new FileReader(filename) );
			int i = 0;
			//String s;
			while(sc.hasNext())
			{
//				s = sc.next();
//				if(s=="\n"||s=="\t"||s=="\b"||s=="\r"||s=="\f")
//				{
//					//
//				}
//				else
//				{
//					i++;
//				}
				sc.next();
				i++;
			}
			System.out.println(i);
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
