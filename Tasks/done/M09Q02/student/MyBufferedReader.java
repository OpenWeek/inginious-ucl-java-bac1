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

/**
 * This class is made to help us voluntarily fail to open or close a file based on global
 * variables : openSucces and closeSuccess.
 */

package student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class MyBufferedReader 
{
	//cette classe nous sert à faire échouer open volontairement pour vérifier si les étudiants catch bien les exceptions.
	public static boolean openSuccess = true; //en changeant cette variable on contrôle l'ouverture du fichier
	public static boolean closeSuccess = true;//même chose pour la fermeture
	private BufferedReader bf;
	
	public MyBufferedReader(FileReader f) throws IOException, FileNotFoundException
	{
		if(openSuccess == true)
		{
			bf = new BufferedReader(f);
		}
		else
		{
			throw new FileNotFoundException();
		}
	}
	
	public void close() throws IOException
	{
		if(closeSuccess == true)
		{
			bf.close();
		}
		else
		{
			throw new IOException();
		}
	}
	public String readLine() throws IOException
    {
    	return bf.readLine();
    }
}
