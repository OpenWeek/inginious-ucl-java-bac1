/*   Copyright (c) 2015, 2016 Massart Aurélie
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

public class M11Q14Stu {
	
    public class Stack{
    	Node first;
        
        public Stack(Node first){
        	this.first = first;
        }
                
        public Stack(){
        	this.first = null;
        }
        
		public int pop(){
			int val = first.value;
            first = first.next;
            return val;
		}
        
        public void push(int val){
        	Node n = new Node(val);
            n.next = first;
            first = n;
        }
    }

}