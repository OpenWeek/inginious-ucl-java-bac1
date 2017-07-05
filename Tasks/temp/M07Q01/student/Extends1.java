/**
 *  Copyright (c) 2016 Olivier Martin
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

package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import java.net.URLClassLoader;
import org.junit.runner.notification.Failure;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Extends1 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testLapin(){
		try{        
        	Extends1Stu mission = new Extends1Stu();
            Class<?> enclosingClass = Class.forName("student.Extends1Stu");
        	Object enclosingInstance = enclosingClass.newInstance();

        	Class<?> innerClass = Class.forName("student.Extends1Stu$Lapin");
        	Constructor<?> ctor = innerClass.getDeclaredConstructor(enclosingClass);

        	Object lapin = ctor.newInstance(enclosingInstance);
            if (!(lapin instanceof Extends1Stu.Animal))
        		fail("Votre classe Lapin n'hérite pas de la classe Animal");
                
            for (Field field : lapin.getClass().getSuperclass().getDeclaredFields()) {
        	   	field.setAccessible(true);
        	    Object value = field.get(lapin); 
        	    if (value != null) {
        	    	if(field.getName().equals("nombre_de_pattes") && !value.toString().equals("4"))
        	    		fail("Vous n'avez pas défini le nombre de pattes à 4");
        	    	if(field.getName().equals("fourrure") && !value.toString().equals("true"))
        	    		fail("Vous n'avez pas défini fourrure à true");
        	    }
        	}

        }catch (ClassNotFoundException e){
            fail("La classe Lapin n'existe pas.\nVous n'avez peut-être pas écrit la classe Lapin ou vous avez n'avez pas nommé votre classe Lapin.\nVeuillez donc à ce que votre classe s'appelle Lapin.");
		
        }catch (InstantiationException e){
			fail("La classe Lapin est abstract ou est une interface ou n'a pas de constructeur accessible sans paramètre");
       	
        }catch (IllegalAccessException e){
        	fail("La classe Lapin n'est pas accessible.\nVeuillez mettre votre constructeur/classe en public.");
        
        }catch(NoSuchMethodException e){
            fail("Votre Lapin n'a pas pu être crée.\nVeiller à ce que le constructeur de la classe Lapin ne prenne pas d'argument.");
            
        }catch(InvocationTargetException e){
            fail("Votre code provoque une erreur\nlors d'un appel à une méthode ou un constructeur.");
            
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
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Extends1.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
