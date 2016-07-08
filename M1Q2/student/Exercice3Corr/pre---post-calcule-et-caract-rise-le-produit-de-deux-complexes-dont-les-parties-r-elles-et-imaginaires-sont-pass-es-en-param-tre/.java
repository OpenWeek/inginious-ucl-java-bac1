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

public class Exercice3Stu {

    /**
    * @pre : -
    * @post : calcule et caractérise le produit de deux complexes, dont les
    *        parties réelles et imaginaires sont passées en paramètre
    */
    public static boolean imaginairePur = false;
    public static boolean reelPur = false;
    public static int[] multiplicationComplexe(int xR, int xI, int yR, int yI)
    {

        int a = 0;
        int b = 0;
       
        //<exercice>
       
        a = xR*yR - xI*yI;
        b = xI*yR + xR*yI;
        if(a == 0)
            imaginairePur = true;
        if(b == 0)
            reelPur = true;
       
        //</exercice>
        int[] res = {a, b};
        return res; 
    }
}
