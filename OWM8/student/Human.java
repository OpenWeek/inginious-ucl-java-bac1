package student;
import java.io.*;
import java.lang.Class.*;
import java.lang.reflect.*;
import java.net.URLClassLoader;
import java.net.URL;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class Human {
	
	private static String str = "Le code semble comporter des erreurs : ";
	public Method[] metCorr;
    public Human(){
    	metCorr=Correction.class.getDeclaredMethods();
    }
    public boolean containsMeth(Method[] a, Method b){
    	for(int i = 0; i < a.length ; i++){
        	if((a[i].getName()).equals(b.getName()) && (a[i]. 	getParameterTypes().length)==(b.getParameterTypes().length) && (a[i].getReturnType().getSimpleName()).equals(b.getReturnType().getSimpleName())){
            	return true;
            }
        }
        return false;
    }
	@Test
	public void testPos(){
		try{
        	//HumanDoing //c=(HumanDoing)Proxy.newProxyInstance(HumanDoing.class.getClassLoader(),

            //new Class[]{HumanDoing.class} , new ProxyListener());
			Class<?> c = HumanDoing.class;
            

        int modifier = c.getModifiers();

			

			if(!HumanDoing.class.isInterface()){
            	fail(str + "Le code est incorrect : Vous devez élaborer une interface");
            }
            
			Method[] met=c.getDeclaredMethods();
            if(met.length<metCorr.length){
            	fail(str + "Le code est incorrect : Vous n'avez pas mentionné toutes les méthodes");
            }
            if(met.length>metCorr.length){
            	fail(met.length+"/"+metCorr.length+" "+str + "Le code est incorrect : Ne mettez pas trop de méthodes");
            }
            
            if (!containsMeth(metCorr,met[0])){
            	fail(str + "Le code est incorrect : \nVotre méthode "+met[0].getName() +" n'est pas une de celle demandée ou ne respecte pas la signature");
            }
            if (!containsMeth(metCorr,met[1])){
            	fail(str + "Le code est incorrect : \nVotre méthode "+met[1].getName() +" n'est pas une de celle demandée ou ne respecte pas la signature");
            }
            if (!containsMeth(metCorr,met[2])){
            	fail(str + "Le code est incorrect : \nVotre méthode "+met[2].getName() +" n'est pas une de celle demandée ou ne respecte pas la signature");
            }
            if (!containsMeth(metCorr,met[3])){
            	fail(str + "Le code est incorrect : \nVotre méthode "+met[3].getName() +" n'est pas une de celle demandée ou ne respecte pas la signature");
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
		} /*catch (ClassNotFoundException e) {
	    	fail(str + "Votre interface n'a pas le bon nom");
			e.printStackTrace();
		}*/catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Human.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}