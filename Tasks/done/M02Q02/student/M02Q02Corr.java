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

public class M02Q02Stu {


	public static String drawLine(int nMorceau, int nTiret, int nPoint){

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.out;
            System.setOut(ps);

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

        System.setOut(old);
        return baos.toString();

	}
}
