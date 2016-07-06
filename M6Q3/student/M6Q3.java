package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class M6Q3 {
	
    private static String str = "Le code semble comporter des erreurs : ";
    int a=(int)(Math.random()*10);
    int b=(int)(Math.random()*10);
    int c=(int)(Math.random()*10);
    M6Q3Stu.Cours cours1=new M6Q3Stu.Cours("Pecheur","FSAB1401",a);
    M6Q3Stu.Cours cours2=new M6Q3Stu.Cours("Bonaventure","FSAB1401",b);
    M6Q3Stu.Cours cours3=new M6Q3Stu.Cours("Van Roy","FSAB1402",c);
    M6Q3Stu.Cours[] tab=new M6Q3Stu.Cours[]{cours1,cours2,cours3,null,null};
    M6Q3Stu etu = new M6Q3Stu(54341300,tab,3);
    M6Q3Stu etu2 = new M6Q3Stu(54341300,null,0);
	
    @Test
	public void testCredit1(){
		try{ 
        		
        	   int res=etu.nbCredit();
				assertEquals(str + "le nombre de credit renvoyé n'est pas correct", a+b+c, res);
                                                                             
			}
		catch(StringIndexOutOfBoundsException e){
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
    
    @Test
	public void testCredit2(){
		try{ 
        		
        	   int res=etu2.nbCredit();
				assertEquals(str + "le nombre de credit renvoyé n'est pas correct", 0, res);
                                                                             
			}
		catch(StringIndexOutOfBoundsException e){
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
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(M6Q3.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}