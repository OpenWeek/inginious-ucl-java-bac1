/**
 *  Copyright (c) 2016 Lucas Ody & Tom Rousseaux 
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

public class Exercice1Stu {

    // Soluce
    public static int eqSolv(int xCube, int xCarre, int x, int tI){

        for(int i=0; i<=20; i=i+1)
        {
            if(xCube*i*i*i+xCarre*i*i+x*i+tI==0)
            {
                return i;
            }
        }

    }
}
