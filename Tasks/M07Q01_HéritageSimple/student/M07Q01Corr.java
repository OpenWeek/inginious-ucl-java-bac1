/**
 *  Copyright (c) 2016 Olivier Martin
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

public class M07Q01Stu {

	public class Animal {
    
    	private int nombre_de_pattes;
    	private boolean fourrure;
    
    	public Animal(){}
        public Animal(int p, boolean f){
        	this.nombre_de_pattes = p;
        	this.fourrure = f;
    	}
        
        public void set_nombre_de_pattes(int n){
        	this.nombre_de_pattes = n;
        }
        public void set_fourrure(boolean f){
        	this.fourrure = f;
        }
 	}
    
    public class Lapin extends Animal{
    	public Lapin(){
        	super(4, true);
        }
    }
}
