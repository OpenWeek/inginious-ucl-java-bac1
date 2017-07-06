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

public class M04Q06Stu {

	/* Fonction à la disposition des étudiants pour réussir l'exercice */
	/*
	 *@pré: str != null
	 *@post: Retourne true si le String str est un palyndrome, false sinon.
         */
	public static boolean isPalyndrome(String str){
    	int length = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
        	if(str.charAt(i) != str.charAt(length-i))
            	return false;
        }
        return true;
    }

        /*
         *@pré: -
         *@post: Retourne true si str contient un palyndrome, false sinon
         */
	public static boolean findPalyndrome(String str){
    
@		@q1@@
	}
}
