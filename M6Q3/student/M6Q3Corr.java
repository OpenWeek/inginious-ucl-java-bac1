package student;

public class M6Q3Stu {
	
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

        public boolean equals(Cour cour) {
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
     //tableau de 5 
     public M6Q3Stu(int n,Cours[] a)
     {
     	noma=n;
        tab=a;
     }
     public int nbCredit(){
     	int a=0;
     	for(int i=0;i<nbCours;i++){
     		a=tab[i].getCredit();
     	}
        return a;
     }
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