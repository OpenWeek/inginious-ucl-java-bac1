
package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import java.lang.reflect.Constructor;
import org.junit.runner.notification.Failure;

public class Pion {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
    	PionStu pq=new PionStu();
		try{
        	
        	Class<?> clazz = PionStu.MyPion.class;
            if(!ChessPiece.class.isAssignableFrom(mypion.getClass())){
            	fail(str + "Vous n'implémentez pas l'interface ChessPiece");
            }
            
        	PionStu ps=new PionStu();
            String r="blanc";
			PionStu.MyPion p = ps.new MyPion(r);
            
            if( p.seDeplacer()!= (PionStu.temp)+1){
            	fail(str + "Vous n'avez pas correctement implémenté seDeplacer()");
            }
            //assertEquals(PionStu.temp,0,0);
            if( p.estMangee(null)!=(PionStu.temp)+2){
            	fail(str + "Vous n'avez pas correctement implémenté estMangee()");
            }
            if( p.mangePiece(null)!=(PionStu.temp)+3){
            	fail(str + "Vous n'avez pas correctement implémenté mangePiece()");
            }
            if(! (p.couleurPiece().equals("blanc"))){
            	fail(str + "Vous n'avez pas correctement implémenté couleurPiece()");
            }
            if(! (p.nomPiece().equals("pion"))){
            	fail(str + "Vous n'avez pas correctement implémenté nomPiece()");
            }
            
            
            
		}catch (ArithmeticException e){
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str + "Attention, certaines variables ont été mal castées	!");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(NullPointerException e){
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			fail(str + "Mauvaise classe!");
			e.printStackTrace();
        
        }catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Pion.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
