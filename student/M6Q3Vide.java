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

        public boolean equals(Cours cour) {
    		if ((this.prof).equals(cour.getProf()) && (this.code).equals(cour.getCode()) && this.credit == cour.getCredit()) {
        		return true;
        	}
        	else {
        		return false;
        	}
    	}
        public String getCode(){return code;}
        public String getProf(){return prof;}
        public int getCredit(){return credit;}
   }
        
     private int noma;
     private Cours[] tab;
     private int nbCours;
     
     public M6Q3Stu(int n,Cours[] a,int k)
     {
     	noma=n;
        tab=a;
        nbCours=k;
        
     }
     public int nbCreditAdm(){ // code administrateur utile pour les tests
     	int a=0;
     	for(int i=0;i<nbCours;i++){
     		a+=tab[i].getCredit();
     	}
        return a;
     }
     
     public boolean inscriptionAdm(Cours cours){
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
     
     public int nbCredit(){
     @@Q1@@
     }
     
     /*
     *public boolean inscription(Cours cours){
     *@@Q2@@}
     */
    
}