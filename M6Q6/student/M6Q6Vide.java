package student;

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
    	if ((this.prof).equals(cours.getProf()) && (this.code).equals(cours.getCode()) && this.credit == cours.getCredit()) {
        	return true;
        }
        else {
        	return false;
        }
    	}
        public String getCode(){ return code;}
        public String getProf(){ return prof;}
        public int getCredit(){ return credit;}
        }
        
     private int noma;
     private Cours[] tab;
     private int nbCours=0;
     
     public M6Q6Stu(int n,Cours[] a, int k)
     {
     	noma=n;
        tab=a;
        nbCours=k;
     }
     public Cours getCours(int indice)
     {
     	if (indice>nbCours-1){return null;}
        return tab[indice];
        
     }
     
     public int getNbCours(){return nbCours;}
     
     //question d'approfondissement 1
     public int nbCredit(){
     	int a=0;
     	for(int i=0;i<nbCours;i++){
     		a+=tab[i].getCredit();
     	}
        return a;
     }
     //question d'approfondissement 2
     public boolean inscription(Cours cours){
     @@q1@@}
    
}