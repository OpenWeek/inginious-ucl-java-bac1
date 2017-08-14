/*   Copyright (c) 2016 KÜHN Alexandre, 2017 Mawait Maxime
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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q16Corr {

    public static class SList {
        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public void removeDuplicates() {
            //Pour cette solution, on peut créer une variable afterNode qui égale current.next pour simplifier la lecture
            if(this.first == null) //liste nulle
                return;
            SNode runner = this.first;
            while(runner.next != null){ 
                if(runner.value == runner.next.value) //doublon
                    runner.next = runner.next.next; //Attention, si runner est l'avant-dernier noeud de la liste, runner.next devient null et on ne peut plus itérer
                if(runner.next != null)
                    runner = runner. next;
			}
            /*SNode current = this.first;
            if (current != null) {
                int val = current.value;
                SNode beforeNode = current;
                current = current.next;
                while(current != null) {
                    if (current.value != val) {
                        beforeNode.next = current;
                        beforeNode = current;
                        val = current.value;
                    }
                    current = current.next;
                }
                beforeNode.next = current;
            }*/ //Autre solution avec un pointeur supplémentaire before
        }
    }
}
