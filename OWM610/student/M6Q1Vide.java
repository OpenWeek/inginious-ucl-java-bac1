//   Copyright (c) 2016 Doriane Olewicki, Marie-Marie van der Beek
//   This program is free software: you can redistribute it and/or modify
//   it under the terms of the GNU Affero General Public License as published by
//   the Free Software Foundation, either version 3 of the License, or
//   (at your option) any later version.
//
//   This program is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU Affero General Public License for more details.
//
//   You should have received a copy of the GNU Affero General Public License
//   along with this program.  If not, see <http://www.gnu.org/licenses/>.

package student;

public class M6Q1Stu {
    public String name; // Student’s name.
    public double test1 , test2 , test3 ; // Grades on three tests .
    
    public M6Q1Stu ( String n) { // create a student with name n   
         name = n;
    }

    /*
     * pre  : -
     * post : le nom a ete mis a jour
     */
    public void setName(String n) {
@		@q1@@
    }
	
    /*
     * pre  : -
     * post : retourne le nom (code administrateur, utile pour les tests)
     */
    public String getNameAdm() {
		return name;
    }
    
    /*
     * pre  : -
     * post : retourne le nom
     */
    public String getName() {
@		@q2@@
    }
}