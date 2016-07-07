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

public class M6Q5Stu {

private Cours infoAdm;
private Cours mathAdm;
private int countEquals = 0;
private int countSets = 0;

public void exo1() {
	Cours info;
    Cours math;
@	@q1@@
	infoAdm = info;
    mathAdm = math;
}

public void exo2(Cours info, Cours math) {
@	@q2@@
	infoAdm = info;
    mathAdm = math;
}

public boolean exo3(Cours info, Cours math) {
	boolean infoMath;
    boolean infoInfo;
@	@q3@@
    return (!infoMath && infoInfo) ;
}

public Cours getInfoAdm() {
	return infoAdm;
}

public Cours getMathAdm() {
	return mathAdm;
}

public int getCountEquals() {
	return countEquals;
}

public int getCountSets() {
	return countSets;
}

public class Cours { // représente la classe Cours
    private String prof;
    private String code;
    private int credit;
    
    public Cours (String pr, String co, int cr)
    {
		prof = pr;
        code = co;
        credit = cr;
    }
   
    public Cours (String texte)
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
        countSets++;
    }
    public void setCode(String co) {
    	code = co;
        countSets++;
    }
    public void setCredit(int cr) {
    	credit = cr;
        countSets++;
    }
    
    public boolean equals (Cours cours) {
    	countEquals++;
    	if (cours == null) {
    		return false;
		}

		if ((this.prof).equals(cours.getProf()) && (this.code).equals(cours.getCode()) && this.credit == cours.getCredit()) {
        	return true;
       }
       else {
        	return false;
       }
    }
}

}


