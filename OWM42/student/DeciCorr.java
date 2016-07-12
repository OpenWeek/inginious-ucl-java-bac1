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

public class DeciStu {

	/**
	 * @pre str != null
	 * @post affiche l'entier représenter par str sous forme binaire, en forme décimal
	 */
	public static void decimale (String str){
		double r=0.0;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i) == '1'){
				if(i==0)
					r-=Math.pow(2,str.length()-i)
				else
					r+=Math.pow(2,str.length())
			}
		}
		System.out.println((int)r);
	}
}
