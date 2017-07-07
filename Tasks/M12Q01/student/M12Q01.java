/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre
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
import java.util.*;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class M12Q01 {

	private static String str = "Le code semble comporter des erreurs : ";

	@Test
	public void testM12Q01(){
		try{
      Professeur p1 = new Professeur("Pecheur",35,false,true);
      Professeur p2 = new Professeur("Jeannette",54,true,true);
      Professeur p3 = new Professeur("Elise",42,true,false);
      Professeur p4 = new Professeur("Olivier",35,true,false);
      Etudiant e1 = new Etudiant("Antoine",22,true,false);
      Etudiant e2 = new Etudiant("Manon",18,true,true);
      Etudiant e3 = new Etudiant("Adrien",21,true,true);
      Etudiant e4 = new Etudiant("Bastien",20,false,true);
      Tuteur t1 = new Tuteur("Charles",24,true,true);
      Tuteur t2 = new Tuteur("Pierre",22,false,true);
      Tuteur t3 = new Tuteur("Paul",21,true,false);
      Tuteur t4 = new Tuteur("Jacques",20,false,false);
      Assistant a1 = new Assistant("Jean",28,false,false);
      Assistant a2 = new Assistant("Fabien",26,true,true);
      Assistant a3 = new Assistant("David",27,true,true);
      Assistant a4 = new Assistant("Michael",29,true,true);
	  ArrayList<Personne> l=new ArrayList<Personne>();
      ArrayList<Personne> l2=new ArrayList<Personne>();
      l.add(p1);
      l.add(p2);
      l2.add(p3);
      l2.add(p4);
      l.add(e1);
      l.add(e2);
      l2.add(e3);
      l2.add(e4);
      l.add(t1);
      l.add(t2);
      l2.add(t3);
      l2.add(t4);
      l.add(a1);
      l.add(a2);
      l2.add(a3);
      l2.add(a4);
      String filename = "StudentSol1";
      String filename2 = "StudentSol2";
      M12Q01Stu.antiSpoiler(l,"student/"+filename);
      M12Q01Stu.antiSpoiler(l2,"student/"+filename2);
      	String StudentSol1="";
        String line="";
		BufferedReader bf = new BufferedReader(new FileReader("student/"+filename));
        while((line=bf.readLine()) != null)
        	StudentSol1+=line+"\n";
        bf.close();
        
        String StudentSol2="";
        bf = new BufferedReader(new FileReader("student/"+filename2));
        while((line=bf.readLine()) != null)
        	StudentSol2+=line+"\n";
        bf.close();
        
        String Sol1="";
        bf = new BufferedReader(new FileReader("student/sol1"));
        while((line=bf.readLine()) != null)
        	Sol1+=line+"\n";
        bf.close();
        
        String Sol2="";
        bf = new BufferedReader(new FileReader("student/sol2"));
        while((line=bf.readLine()) != null)
        	Sol2+=line+"\n";
        bf.close();
        
        if(!StudentSol1.equals(Sol1))
        	fail("\nVotre contenu:\n"+StudentSol1+"Contenu attendu:\n"+Sol1);
        if(!StudentSol2.equals(Sol2))
        	fail("Votre contenu:\n"+StudentSol2+"Contenu attendu:\n"+Sol2);
            
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
		Result result = JUnitCore.runClasses(M12Q01.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
