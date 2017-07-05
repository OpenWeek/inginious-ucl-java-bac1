/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran, Maxime Mawait, William Visée.
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

public class FactStu {

    public static int fact (int a){
        if(a<0){return -1;}
        if (a==0){return 1;}
        int r=1;
        for (int i=2;i<=a;i++){
            r*=i;
        }
        return r;
    }
    
    public static double expon(int a){
        if (a >= 0) {
            double res = 0.0;
            for (int i = 0; i < 15; i++) {
                res += (Math.pow((double) a, (double) i) / ((double) fact(i)));
            }
            return res;
        }
        else
            return -1;
    }
}
