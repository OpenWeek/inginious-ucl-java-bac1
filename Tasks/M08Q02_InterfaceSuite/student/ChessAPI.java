package student;
import java.util.Random;

public class ChessAPI {
	static M08Q02Stu ss;
	public static int deplacerPion(){
		return (ss.temp)+1;
	}
	public static int disparaitre(Object mangeur){
    	return (ss.temp)+2;
	}
	public static int mangerPion(Object victime){
		return (ss.temp)+3;
	}
	
	public static String nomPion(){
		return "pion";
	}
    
}
