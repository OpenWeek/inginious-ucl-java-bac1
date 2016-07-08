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
import org.junit.runner.notification.Failure;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class M1Q7 {

	/*
	 * @post 	Set l'attribut {champ} de l'objet {o} à {value}
	 * 			Retourne 0 en cas d'échec	
	 */
	public static void setAttribut(Object o, String champ, int value){
		try{
			for (Field field : o.getClass().getSuperclass().getDeclaredFields()) {
	    	   	field.setAccessible(true);
	    	    if(field.getName() == champ){
	    	    	field.set(o, value);
	    	    }
	    	}
		}catch(Exception e){
		}
	}
	
	/*
	 * @post 	Retourne la valeur (int) de l'attribut {champ} de l'objet {o}.
	 * 			Retourne 0 en cas d'échec	
	 */
	public static int getAttribut(Object o, String champ){
		try{
			for (Field field : o.getClass().getSuperclass().getDeclaredFields()) {
	    	   	field.setAccessible(true);
	    	    if(field.getName() == champ){
	        	    Object value = field.get(o); 
	    	    	if (value != null) {
	    	    		return Integer.parseInt(value.toString());
	    	    	}
	    	    }
	    	}
			return 0;
		}catch(Exception e){
			return 0;
		}
	}
	
	//Applique la méthode manger() de l'objet o.
	//Retourne false en cas d'échec
	public static boolean applyManger(Object o, M1Q7Stu.PanierDeNourriture p){
		for (Method method : o.getClass().getDeclaredMethods()) {
        	if(method.getName().equals("manger")){
        		try{
        			Object ret = method.invoke(o, p);
        			return (boolean) ret;
        		}catch(Exception e){
        			return false;
        		}
        	}
		}
		return false;
	}
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testChevre(){
		try{
			try{
			//
			//	On tente de créer un objet Chèvre
			//
        	M1Q7Stu mission = new M1Q7Stu();
            Class<?> enclosingClass = Class.forName("student.M1Q7Stu");
        	Object enclosingInstance = enclosingClass.newInstance();

        	Class<?> innerClass = Class.forName("student.M1Q7Stu$Chevre");
        	Constructor<?> ctor = innerClass.getDeclaredConstructor(enclosingClass);

        	Object c = ctor.newInstance(enclosingInstance);
        	
        	//
        	//	Lance les tests
        	//
    		M1Q7Stu.PanierDeNourriture p = mission.new PanierDeNourriture(2,2);
    		
            if(getAttribut(c, "faim") != 100)
    			fail("Veuillez initialiser la faim de la chèvre à 100 dans le constructeur.");
                
    		//Mange la première carotte
            boolean b = applyManger(c, p);
            if(getAttribut(c, "faim") != 115)
    			fail("La faim de votre chèvre est incorrecte.\nAttendu : 115\nRecu : " + getAttribut(c, "faim") + "\nUne carotte doit augmenter la faim de 15.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Chevre\n a retourné false alors que faim = " + getAttribut(c, "faim"));
    		

    		//Mange la deuxième carotte
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != 130)
    			fail("La faim de votre chèvre est incorrecte.\nAttendu : 130\nRecu : " + getAttribut(c, "faim") + "\nUne carotte doit augmenter la faim de 15.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Chevre\n à retourné false alors que faim = " + getAttribut(c, "faim"));
    	
    		//Mange mais il n'y a plus de carottes
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != 130)
    			fail("La faim de votre chèvre est incorrecte.\nAttendu : 130\nRecu : " + getAttribut(c, "faim") + "\nLa faim a augmenté alors que le panier est vide.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Chevre\n à retourné false alors que faim = " + getAttribut(c, "faim"));

    		
    		//Chèvre morte et panier vide
            p = mission.new PanierDeNourriture(0,0);
    		setAttribut(c, "faim", -1000);
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != -1000)
    			fail("La faim de votre chèvre est incorrecte. \nLa faim est négative et a augmenté alors que le panier est vide.");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Chevre\n a retourné true alors que faim est négative.");
    		
    		//Chèvre morte et panier pas vide
    		p = mission.new PanierDeNourriture(2,2);
    		setAttribut(c, "faim", -1000);
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != -985)
    			fail("La faim de votre chèvre est incorrecte. La faim doit augmenter même si la faim est <= 0");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Chevre\n à retourné true alors que faim est négative.");
                
            //Chèvre morte et panier vide (Corner case faim=0)
    		p = mission.new PanierDeNourriture(0,0);
    		setAttribut(c, "faim", 0);
    		b = applyManger(c, p);
            if(getAttribut(c, "faim") != 0)
    			fail("La faim de votre chèvre est incorrecte. La faim (=0) a augmenté alors que le panier est vide");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Chevre\n à retourné true alors que faim est <= 0.");

    		//Chèvre morte et panier pas vide (Corner case faim=0)
    		p = mission.new PanierDeNourriture(2,2);
    		setAttribut(c, "faim", 0);
    		b = applyManger(c, p);
            if(getAttribut(c, "faim") != 15)
    			fail("La faim de votre chèvre est incorrecte. La faim doit augmenter même si la faim est <= 0");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Chevre\n à retourné false alors que faim est positive");

        	
		}catch (ClassNotFoundException e){
			fail("La classe Chevre n'existe pas.\nVous n'avez peut-être pas écrit la classe Chevre ou vous avez n'avez pas nommé votre classe Chevre.\nVeuillez donc à ce que votre classe s'appelle Chevre.");
		
        }catch (InstantiationException e){
        	fail("La classe Chevre est abstract ou est une interface ou n'a pas de constructeur accessible sans paramètre");
       	
        }catch (IllegalAccessException e){
        	fail("La classe Chevre n'est pas accessible.\nVeuillez mettre votre constructeur/classe en public.");
        
        }catch(NoSuchMethodException e){
        	fail("Votre Chevre n'a pas pu être crée.\nVeiller à ce que le constructeur de la classe Chevre ne prenne pas d'argument.");
            
        }catch(InvocationTargetException e){
        	fail("Votre code provoque une erreur\nlors d'un appel à une méthode ou un constructeur."); 
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
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    
    //
    //
    //
    
    @Test
	public void testOurs(){
		try{
			try{
			//
			//	On tente de créer un objet Ours
			//
        	M1Q7Stu mission = new M1Q7Stu();
            Class<?> enclosingClass = Class.forName("student.M1Q7Stu");
        	Object enclosingInstance = enclosingClass.newInstance();

        	Class<?> innerClass = Class.forName("student.M1Q7Stu$Ours");
        	Constructor<?> ctor = innerClass.getDeclaredConstructor(enclosingClass);

        	Object c = ctor.newInstance(enclosingInstance);
        	
        	//
        	//	Lance les tests
        	//
    		M1Q7Stu.PanierDeNourriture p = mission.new PanierDeNourriture(2,2);
    		
            if(getAttribut(c, "faim") != 200)
    			fail("Veuillez initialiser la faim de l'ours à 200 dans le constructeur.");
                
    		//Mange le premièr poulet
            boolean b = applyManger(c, p);
            if(getAttribut(c, "faim") != 210)
    			fail("La faim de votre ours est incorrecte.\nAttendu : 210\nRecu : " + getAttribut(c, "faim") + "\nUn poulet doit augmenter la faim de 10.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Ours\n a retourné false alors que faim = " + getAttribut(c, "faim"));
    		

    		//Mange le deuxième poulet
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != 220)
    			fail("La faim de votre ours est incorrecte.\nAttendu : 220\nRecu : " + getAttribut(c, "faim") + "\nUn poulet doit augmenter la faim de 10.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Ours\n à retourné false alors que faim = " + getAttribut(c, "faim"));
    	
    		//Mange mais il n'y a plus de poulets
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != 220)
    			fail("La faim de votre ours est incorrecte.\nAttendu : 220\nRecu : " + getAttribut(c, "faim") + "\nLa faim a augmenté alors que le panier est vide.");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Ours\n à retourné false alors que faim = " + getAttribut(c, "faim"));

    		
    		//Ours mort et panier vide
            p = mission.new PanierDeNourriture(0,0);
    		setAttribut(c, "faim", -1500);
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != -1500)
    			fail("La faim de votre ours est incorrecte. \nLa faim est négative et a augmenté alors que le panier est vide.");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Ours\n a retourné true alors que faim est négative.");
    		
    		//Ours mort et panier pas vide
    		p = mission.new PanierDeNourriture(2,2);
    		setAttribut(c, "faim", -1500);
            b = applyManger(c, p);
            if(getAttribut(c, "faim") != -1490)
    			fail("La faim de votre ours est incorrecte. La faim doit augmenter même si la faim est <= 0");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Ours\n à retourné true alors que faim est négative.");
                
            //Ours mort et panier vide (Corner case faim=0)
    		p = mission.new PanierDeNourriture(0,0);
    		setAttribut(c, "faim", 0);
    		b = applyManger(c, p);
            if(getAttribut(c, "faim") != 0)
    			fail("La faim de votre ours est incorrecte. La faim (=0) a augmenté alors que le panier est vide");
    		if(b == true)
    			fail("Votre méthode manger() de la classe Ours\n à retourné true alors que faim est <= 0.");

    		//Ours mort et panier pas vide (Corner case faim=0)
    		p = mission.new PanierDeNourriture(2,2);
    		setAttribut(c, "faim", 0);
    		b = applyManger(c, p);
            if(getAttribut(c, "faim") != 10)
    			fail("La faim de votre ours est incorrecte. La faim doit augmenter même si la faim est <= 0");
    		if(b == false)
    			fail("Votre méthode manger() de la classe Ours\n à retourné false alors que faim est positive");

        	
		}catch (ClassNotFoundException e){
			fail("La classe Chevre n'existe pas.\nVous n'avez peut-être pas écrit la classe Chevre ou vous avez n'avez pas nommé votre classe Chevre.\nVeuillez donc à ce que votre classe s'appelle Chevre.");
		
        }catch (InstantiationException e){
        	fail("La classe Chevre est abstract ou est une interface ou n'a pas de constructeur accessible sans paramètre");
       	
        }catch (IllegalAccessException e){
        	fail("La classe Chevre n'est pas accessible.\nVeuillez mettre votre constructeur/classe en public.");
        
        }catch(NoSuchMethodException e){
        	fail("Votre Chevre n'a pas pu être crée.\nVeiller à ce que le constructeur de la classe Chevre ne prenne pas d'argument.");
            
        }catch(InvocationTargetException e){
        	fail("Votre code provoque une erreur\nlors d'un appel à une méthode ou un constructeur."); 
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
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M1Q7.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
