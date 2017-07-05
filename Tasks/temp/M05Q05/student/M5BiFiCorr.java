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

public class M5BiFi() {
	// Q1
	public static void shiftRightOne(int[] tab){
		assert tab != null : "le tableau tab ne peut pas etre vide";
        	int newFirst = tab[tab.length - 1];
	        for (int i = tab.length - 1 ; i > 0; i--) {
        		tab[i] = tab[i - 1];
        	}
	        tab[0] = newFirst;
	}
    
	// Q2
    	public static void shiftRight(int[] tab, int n){
    		for (int i = 0; i < n; i++)
    			shiftRightOne(tab);
    }
}
