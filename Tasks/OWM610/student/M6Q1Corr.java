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

public class StudentCorr {
    public String name; // Student ’s name.
    public double test1 , test2 , test3 ; // Grades on three tests .
    
    public StudentCorr ( String n) { // create a student with name n   
         name = n;
    }

	/*
     * pre : - 
     * post : le nom a ete mis a jour
    public static setName(String n) {
        name = n;
    }
	
    /*
     * pre : - 
     * post : retourne le nom
    public String getName() {
    	return name;
    }
}