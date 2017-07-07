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

public class PalyndromeStu {

	/*
	 *@pré: str != null
	 *@post: Retourne true si le String str est un palyndrome, false sinon.
         */
	public static boolean isPalyndrome(String str){
    	int length = str.length();
        for(int i=0;i<str.length()/2;i++){
        	if(str.charAt(i) != str.charAt(length-i))
            	return false;
        }
        return true;
        /*
         *@pré: -
         *@post: Retourne true si str contient un palyndrome, false sinon
         */
	public static boolean findPalyndrome(String str){
		if(str.equals(""))
        	return true;
        for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
                System.out.println(str+" :"+isPalyndrome(str.substring(i,j)));
				if(isPalyndrome(str.substring(i,j+1)))
						return true;
			}
		}
		return false;
    }	
}
