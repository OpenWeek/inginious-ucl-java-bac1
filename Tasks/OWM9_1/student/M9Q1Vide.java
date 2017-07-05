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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.lang.*;

public class M9Q1Stu
{

	public static void not_throwing() throws IOException {
    	return;
    }


	// Code to check
	public static void premierFichier(String filename)
	{
		BufferedReader br;
        try	{
			not_throwing();
		   	PrintStream out = System.out;
			FileOutputStream f = new FileOutputStream("student/outStu.txt");
			System.setOut(new PrintStream(f));
			@@q1@@
			System.setOut(out);
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
