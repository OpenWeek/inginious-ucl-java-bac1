package student;
public interface ChessPiece {
    
	public int seDeplacer();
	public int estMangee(Object mangeur);
	public int mangePiece(Object victime);
	public String couleurPiece();
	public String nomPiece();
	
	
}
