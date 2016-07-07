/**
 *  Copyright (c) 2015, 2016 François Michel, Clémentine Munyabarenzi
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

public class StringComparaisonStu {

	// Test de commentaire 
    /* Ici aussi */
	public static /*Commentaire en plein milieu */ boolean stringcmp(String str1,String str2){
    	if(str1.length() != str2.length())
        	return false;
        for(int i=0;i<str1.length();i++){
        	if(str1.charAt(i) != str2.charAt(i))
            	return false;
        }
        return true; //Commentaire inutile
    }
}
