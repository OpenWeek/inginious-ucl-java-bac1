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
import java.util.Arrays;

public class M5QShuffleStu {

	public static void shuffle(int tab[]){
    	assert(tab!=null);
        for(int i=0;i<tab.length;i++){

            // À chaque passage dans la boucle on regarde un élément à la fin en moins, et l'élément qui est choisit est mis à la fin
            int randomPosition=(int)(Math.random()*(tab.length-i));

            // switch de l'élément sélectionner à la dernière position
            int tmp=tab[randomPosition];
            tab[randomPosition]=tab[tab.length-i-1];
            tab[tab.length-i-1]=tmp;
        }
	}
}
