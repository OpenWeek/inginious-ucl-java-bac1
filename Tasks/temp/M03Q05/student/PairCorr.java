/**
 *  Copyright (c) 2015, 2016 Fitvoy Florian,Dubray Alexandre
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

public class PairStu {

	/*
	 *@pré: b est un entier
	 *@post: Retourne true si b est pair et false sinon.
         */
	public static boolean isPair(int b){
    	while(b>0){
   			 b -= 2;
		}
			return (b==0);
   		}
		
}
