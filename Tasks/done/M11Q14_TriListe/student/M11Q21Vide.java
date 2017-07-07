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

public class M11Q21Stu {

    public class SList {

        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public String toString() {
            String res = "";
            if (this.first == null)
                return "empty SList";
            SNode current = this.first;
            while(current != null) {
                res += current.value;
                current = current.next;
                if (current != null) {
                    res += " -> ";
                }
            }
            return res;
        }

        @@q1@@
    }

    public class SNode {
        public int value;
        public SNode next;

        public SNode(int v) {
            this.value = v;
            this.next = null;
        }
    }
}
