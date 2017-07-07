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

public class M01Q04Stu {

    /**
    * @pre : 
    * @post : distribue 3 polynomes de 1er degré, et retourne  les coefficients du polynome de 3ème degré obtenu dans un tableau.
    */
    public static int[] prodAlgeb(int a, int b, int c){

        int xCube = 1;
        int xCarre = -(a+b+c);
        int x = (a*b+a*c+b*c);
        int tI = -a*b*c;
        
        int i[] = {xCube, xCarre, x, tI};
        return i;
        }
}
