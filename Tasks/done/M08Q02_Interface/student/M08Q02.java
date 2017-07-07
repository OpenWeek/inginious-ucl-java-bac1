/**
 *  Copyright (c) 2017 Naitali Brandon, Mawait Maxime
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 // @author: Naitali Brandon, Mawait Maxime
 

package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import java.lang.reflect.Constructor;
import org.junit.runner.notification.Failure;

public class M08Q02 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
    	M08Q02Stu p = new M08Q02Stu("blanc");
		try{
            if(!ChessPiece.class.isAssignableFrom(p.getClass())){
            	fail(str + "Vous n'implémentez pas l'interface ChessPiece");
            }
            
            
            if( p.seDeplacer()!= (M08Q02Stu.temp)+1){
            	fail(str + "Vous n'avez pas correctement implémenté seDeplacer()");
            }
            //assertEquals(M08Q02Stu.temp,0,0);
            if( p.estMangee(null)!=(M08Q02Stu.temp)+2){
            	fail(str + "Vous n'avez pas correctement implémenté estMangee()");
            }
            if( p.mangePiece(null)!=(M08Q02Stu.temp)+3){
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
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M08Q02.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}