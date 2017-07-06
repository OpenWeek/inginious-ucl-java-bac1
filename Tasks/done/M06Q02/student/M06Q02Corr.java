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

public class M06Q02Stu { // représente la classe Chanson
    private String prof;
    private String code;
    private int credit;
    
    public M06Q02Stu (String pr, String co, int cr)
    {
		prof = pr;
		code = co;
		credit = cr;
    }
   
    public M06Q02Stu (String texte)
    {
		String[] part = texte.split("-");
		prof = part[0];
		code = part[1];
		credit = Integer.parseInt(part[2]);
    }
    
    public String getProf() {
    	return prof;
    }
    public String getCode() {
    	return code;
    }
    public int getCredit() {
    	return credit;
    }
	
    public void setProf(String pr) {
    	prof = pr;
    }
    
    public void setCode(String co) {
    	code = co;
    }
    
    public void setCredit(int cr) {
    	credit = cr;
    }
}


