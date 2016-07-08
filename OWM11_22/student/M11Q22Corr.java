/*   Copyright (c) 2016 KÜHN Alexandre
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

public class M11Q22Stu {

    public class List {
        public Node first;

        public List() {
            this.first = null; // empty list
        }

        public void reverse() {
            
            Node before = null;
            Node current = this.first;
            if (current != null) {
                Node after = current.next;
                if(after != null) {
                    current.next = before;
                    while (after != null) {
                        before = current;
                        current = after;
                        after = after.next;
                        current.next = before;
                    }
                    this.first = current;
                }
            }
        }

        public String toString() {
            String res = "";
            if (this.first == null)
                return "empty List";
            Node current = this.first;
            while(current != null) {
                res += current.value;
                current = current.next;
                if (current != null) {
                    res += " -> ";
                }
            }
            return res;
        }
    }

    public class Node {
        public int value;
        public Node next;

        public Node(int v) {
            this.value = v;
            this.next = null;
        }
    }
}
