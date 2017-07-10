/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre
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

public class M03Q02Corr{
	
	/**
	 * @pre a != b != c
	 * @post retourne la médiane de l'ensemble {a,b,c}
	 */
	public static int mediane (int a, int b, int c){
		if (a<b){
    		if (c<a){return a;}
    		else if (c<b){return c;}
    		else {return b;}
		}
		else{
    		if (c<b){return b;}
    		else if (a<c){return a;}
    		else {return c;}
		}
	}
}
