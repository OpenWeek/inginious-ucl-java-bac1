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

public class M07Q03Stu {

	//Classe Chevre
	public class Chevre extends Animal{
    	public Chevre(){
        	set_faim(100);
    	}
    	public boolean manger(PanierDeNourriture p){
        	if(p.manger_carotte()){
            	set_faim(get_faim() + 15);
        	}
        	return get_faim() > 0;
    	}
	}
    
	public class Ours extends Animal{
    	public Ours(){
        	set_faim(200);
    	}
    	public boolean manger(PanierDeNourriture p){
        	if(p.manger_carotte()){
            	set_faim(get_faim() + 10);
        	}
        	return get_faim() > 0;
    	}
	}
}
