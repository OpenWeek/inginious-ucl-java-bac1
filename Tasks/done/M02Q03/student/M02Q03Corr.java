/**
 *  Copyright (c)  2016 Ody Lucas, Rousseaux Tom
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

public class M02Q03Stu {

    /**
     * @pre : diviseur != 0
     * @post : division entière du dividende, renvoie le qoutient et le reste dans un tableau
     */
    public static int[] M02Q03(int diviseur, int dividende)
    {
        int reste = 0;
        int quotient = 0;
       
        //<exercice>
       
        while(dividende >= diviseur)
        {
            dividende-=diviseur;
            quotient++;
        }
        reste=dividende;
       
        //</exercice>
        int[] res = {quotient, reste}
        return res; 
    }
}
