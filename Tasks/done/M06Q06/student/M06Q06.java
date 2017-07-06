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

public class M06Q06 {
	
    private static String str = "Le code semble comporter des erreurs : ";
    int a=(int)(Math.random()*10);
    int b=(int)(Math.random()*10);
    int c=(int)(Math.random()*10);
    M06Q06Stu.Cours cours1=new M06Q06Stu.Cours("Pecheur","FSAB1401",a);
    M06Q06Stu.Cours cours2=new M06Q06Stu.Cours("Bonaventure","FSAB1401",b);
    M06Q06Stu.Cours info=new M06Q06Stu.Cours("Van Roy","FSAB1402",c);
    M06Q06Stu.Cours math=new M06Q06Stu.Cours("Perreira","FSAB1201",c);
    M06Q06Stu.Cours physique=new M06Q06Stu.Cours("Legat","FSAB1503",a);
    M06Q06Stu.Cours physique3=new M06Q06Stu.Cours("Legat","FSAB1503",c);
    M06Q06Stu.Cours physique2=new M06Q06Stu.Cours("Legat","FSAB1503",59);
    M06Q06Stu.Cours[] tab=new M06Q06Stu.Cours[]{cours1,cours2,null,null,null};
    M06Q06Stu.Cours[] tab2=new M06Q06Stu.Cours[]{cours1,cours2,math,info,physique};
    M06Q06Stu etu = new M06Q06Stu(54341300,tab,2);
    M06Q06Stu etu2 = new M06Q06Stu(54341300,tab2,5);
	
    @Test
    //teste si le cours a été ajouté
	public void testInscription1(){
		try{ 
        	   boolean res=etu.inscription(info);
				assertTrue(str + "La fonction renvoie false alors qu'elle devrait renvoyer true",res);
               assertNotNull("Le cours n'a pas été ajouté correctement",etu.getCours(2));
               assertEquals("Le cours n'a pas été ajouté correctement","Van Roy",((etu.getCours(2).getProf())));
               assertEquals("vous n'avez pas mis à jour le nombre de cours",3,etu.getNbCours());
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
			fail(str + "Le cours n'a pas été ajouté correctement");
			e.printStackTrace();
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    @Test
    //teste si retourne false si l'etudiant est deje inscrit a 5 cours
	public void testInscription2(){
		try{ 
        	assertFalse("Votre fonction devrait renvoyer false quand l'etudiant est deja inscrit a 5 cours, ce qui n'est pas le cas.",etu2.inscription(physique3));
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
    //teste si renvoie false quand l'etudiant est deja inscrit a ce cours
	public void testInscription3(){
		try{ 
            assertFalse("Votre fonction renvoie true même si l'étudiant est déjà inscrit à ce cours",etu.inscription(cours1));                                                                 
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
    //teste si renvoie false quand l'etudiant dépasse les 60 crédits en
    //s'inscrivant
	public void testInscription4(){
		try{ 
            assertFalse("Votre fonction renvoie true même si l'etudiant dépasse les 60 crédits en s'inscrivant",etu.inscription(physique2));                                                                 
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
		Result result = JUnitCore.runClasses(M06Q06.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
