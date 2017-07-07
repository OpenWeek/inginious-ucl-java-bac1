/*   Copyright (c) 2015, 2016, 2017 Massart Aurélie, Mawait Maxime
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
package student;

public class M11Q10Corr {

	// Code de correction
	public static int minimum(Node n){
        assert n != null: "Le noeud n est nul !!!!";
		Node current;
        int min = n.value;
        for (current = n; current != null; current = current.next){
            if(current.value < min){
            	min = current.value;
            }
        }
        return min;        
	}
}
