/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran, Maxime Mawait
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

public class Sum {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testSum(){
		try{
        	assertNull("n'oubliez pas ou le cas ou le parametre est null",SumStu.sum(null));
            int[] a = {1,2,3,4,5};
            int[] b = SumStu.sum(a);
            int[] c = {1,3,6,10,15};
            assertArrayEquals("le tableau retourne par sum([1,2,3,4,5]) est incorrect",b,c);
            a = new int[0];
            b = SumStu.sum(a);
            c = new int[0];
            assertArrayEquals("le tableau renvoyé par sum([]) (un tableau vide) est incorrect",b,c);
            a = new int[1000000];
            for(int i =0;i<a.length;i++)
            {
                a[i]=i;
            }
            b = SumStu.sum(a);
            c = mySum(a);
            assertArrayEquals("le tableau renvoyé par sum([a]) (ou a est un tableau de 5000 élément contentant les entiers de 0 a 4999) est incorrect",b,c);
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
			//e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			//e.printStackTrace();
		}catch(NullPointerException e){
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    public int[] mySum(int[]tab)
    {
        if(tab==null)
			return null;

		if(tab.length==0)
			return new int[0];

		int[] res = new int[tab.length];
		res[0] = tab[0];

		for(int i = 0;i<tab.length;i++)
		{
			if(i != 0)
			{
				res[i] = res[i-1]+tab[i];
			}
		}
		return res;
    }
	

	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Sum.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
