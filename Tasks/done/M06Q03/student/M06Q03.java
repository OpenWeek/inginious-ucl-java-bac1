package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

/*  Copyright (c) 2016 Marie-Marie van der Beek, Doriane Olewicki
*   This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU Affero General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
*   (at your option) any later version.
*
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU Affero General Public License for more details.
*
*   You should have received a copy of the GNU Affero General Public License
*   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

public class M06Q03 {
	
    private static String str = "Le code semble comporter des erreurs : ";
    int a=(int)(Math.random()*10);
    int b=(int)(Math.random()*10);
    int c=(int)(Math.random()*10);
    M06Q03Stu.Cours cours1=new M06Q03Stu.Cours("Pecheur","FSAB1401",a);
    M06Q03Stu.Cours cours2=new M06Q03Stu.Cours("Bonaventure","FSAB1401",b);
    M06Q03Stu.Cours cours3=new M06Q03Stu.Cours("Van Roy","FSAB1402",c);
    M06Q03Stu.Cours[] tab=new M06Q03Stu.Cours[]{cours1,cours2,cours3,null,null};
    M06Q03Stu etu = new M06Q03Stu(54341300,tab,3);
    M06Q03Stu etu2 = new M06Q03Stu(54341300,null,0);
	
    @Test
	public void testCredit1(){
		try{ 
        		
        	   int res=etu.nbCredit();
				assertEquals(str + "le nombre de crédits renvoyé n'est pas correct", a+b+c, res);
                                                                             
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
				assertEquals(str + "le nombre de crédits renvoyé n'est pas correct lorsque le tableau est vide", 0, res);
                                                                             
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
		Result result = JUnitCore.runClasses(M06Q03.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}