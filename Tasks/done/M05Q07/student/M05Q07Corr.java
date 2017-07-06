/**
 *  Copyright (c) 2017 Mawait Maxime, Habran Antoine, Visée William
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

public class M05Q07Cor {

    //Correction
    public static void inverse (char tab[]){
        char tmp;
        for(int i=0; i<(int)(tab.length/2);i++){
        	tmp = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = tmp;
        }
	}
    
    /*
    * @pre: str != NULL
    * @post: retourne le nombre d'occurences de c dans str
    **/
    public static int count (String str, char c){
        assert str != null: "Le string est nul";
        int x = 0;
        char[] tab = str.toM05Q07();
        for (char i : tab){
            if (i == c){
                x ++;
            }
        }
        return x;
    }
    
    /*
    * @pre: tab != NULL
    * @post: retourne tab renversé et retransformé en String
    */
    public static String inverseArray (char[] tab){
        assert(tab != null): "Le tableau est nul";
        inverse(tab);
        // return new String(tab); 1ere solution
        String str = new String();
        for (char c: tab){
            str += c;
        }
        return str;
    }
}