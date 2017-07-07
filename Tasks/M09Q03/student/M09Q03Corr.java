package student;

import java.util.Scanner;
import java.io.*;

/**
 *  Copyright (c) 2017 Justine Doutreloux, Carolina Unriza, Charline Outters, Mawait Maxime
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

public class M09Q03Corr 
{
	/**
	 * @pre -
	 * @post retourne le nombre de caractères contenus dans le fichier
	 */
	public static int charNumber(String filename) throws  IOException
	{
		try{
            Scanner sc = new Scanner( new File(filename) );
            int i = 0;
            while(sc.hasNext())
            {
                sc.next(); //on pourrait imaginer une fonction qui ne compte que certains
                //caractères mais ici on les compte tous.
                i++;
            }
            sc.close();
            return i;
        } catch (IOException e){
            System.out.println(e.getMessage());
            return -1;
        }
	}
}
