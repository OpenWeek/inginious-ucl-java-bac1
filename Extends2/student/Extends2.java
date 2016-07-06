package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;
import java.lang.reflect.Method;

public class Extends2 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testKirby(){
		try{
        	Extends2Stu mission = new Extends2Stu();
           	Extends2Stu.Kirby kirby = mission.new Kirby();
            
            Class c = kirby.getClass();
			boolean toutBon = false;
			for (Method method : c.getDeclaredMethods()) {
            	if(method.getName().equals("toString")
            		&& method.getReturnType().getName().equals("java.lang.String")
            		&& method.getGenericParameterTypes().length == 0)
            		toutBon = true;
			}
			if(!toutBon)
				fail("Vous n'avez pas bien redéfini toString.\nAssurez vous que ne nom, la type de retour et les paramètres sont corrects\net sont les mêmes que toString de la classe Object.");
            
        	Object o = kirby;
            String res = o.toString();
            if (res == null)
            	fail("Votre méthode à retourné null.");
           	res = res.toUpperCase();
            if(!res.contains("KIRBY"))
            	fail("Votre méthode ne retourne pas la bonne description\n('Kirby' n'est pas présent dans le String.)");
            
            if(!res.contains("ROSE"))
            	fail("Votre méthode ne retourne pas la bonne description\n('Rose' n'est pas présent dans le String.)");
            
			if(!res.contains(""+kirby.pv))
            	fail("Votre méthode ne retourne pas la bonne description\n(le nombre de pv n'est pas présent dans le String.)");
                
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
        }catch(StackOverflowError e){
            fail(str + "StackOverflowError :\nVous utilisez trop de mémoire\nou vous avez fait un programme qui contient une récursion infinie");
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}catch(Throwable t){
        	fail(str + "\n" + t.getMessage() + " " + t.getClass().getName());
			t.printStackTrace();
        }
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Extends2.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
