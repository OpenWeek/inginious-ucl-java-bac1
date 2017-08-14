package student;

public class PionStu implements ChessPiece {
	public static final int temp=(int)(Math.random()*(1000000-1));
    
    public String couleur;
    public String nom;
    ChessAPI c = new ChessAPI();
    
    public PionStu(String couleur){
        this.couleur = couleur;
        this.nom = "pion";
    }
    

	@@q1@@
	

}