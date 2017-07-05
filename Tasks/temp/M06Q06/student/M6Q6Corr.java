package student;

/*  Copyright (c) 2016 Marie-Marie van der Beek, Doriane Olewicki
*   This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU Affero General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
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

public class M6Q6Stu {
	
    public static class Cours {
        private String prof;
        private String code;
        private int credit;
        
        public Cours (String pr, String co, int cr)
    	{
		prof = pr;
		code = co;
		credit = cr;
  		}

        public boolean equals(Cours cours) {
    	if ((this.prof).equals(cour.getProf()) && (this.code).equals(cour.getCode()) && this.credit == cour.getCredit()) {
        	return true;
        }
        else {
        	return false;
        }
    	}
        public String getCode(){ return code;}
        public String getProf(){ return prof;}
        public int credit(){ return credit;}
        }
        
     private int noma;
     private Cours[] tab;
     private int nbCours=0;
     
     public M6Q6Stu(int n,Cours[] a,int k)
     {
     	noma=n;
        tab=a;
        nbCours=k;
     }
     //question d'approfondissement 1
     public int nbCredit(){
     	int a=0;
     	for(int i=0;i<nbCours;i++){
     		a=tab[i].getCredit();
     	}
        return a;
     }
     //question d'approfondissement 2
     public boolean inscription(Cours cours){
     	for(int i=0;i<nbCours;i++)
        {
        	if(cours.equals(tab[i])){return false;}
        } 
     	if(nbCours==5){return false;}
        else if((nbCredit()+cours.getCredit())>60){return false;}
        else {
        tab[nbCours]=cours;
        nbCours++;
        return true;
        }
     
     }
    
}