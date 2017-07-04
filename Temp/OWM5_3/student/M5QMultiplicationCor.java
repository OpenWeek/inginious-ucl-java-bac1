/**
 *  Copyright (c) 2016 Gellens Arnaud, Gonzalez Alvarez Pablo
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

public class M5QMultiplicationStu {

	public static int[][] multiplication(int l[][], int m[][]){
        assert(l!=null && m!=null);
        assert(l[0].length==m.length);
        int sol[][]=new int[l.length][m[0].length];
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol[0].length; j++){
                sol[i][j]=0; //initialisation du tableau
                for(int k=0;k<l[0].length;k++){
                    sol[i][j]+=l[i][k]*m[k][j];
                }
            }
        }
        return sol;
	}
}
