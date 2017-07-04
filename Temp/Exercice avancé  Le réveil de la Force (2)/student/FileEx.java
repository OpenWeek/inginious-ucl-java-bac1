/**
 *  Copyright (c) 2016 Naitali Brandon
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
 // @author: Naitali Brandon
 
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

public class FileEx {
	
	private static String str = "Le code semble comporter des erreurs : ";
    public FileEx(){
    }
    // Méthode qui redirige l'output de la méthode Search à implémenter vers un fichier "out".txt
    public static void redirect(String nom, int age, String filename){
		PrintStream orgStream   = null;
        PrintStream fileStream  = null;
        try
        {
            // Saving the orginal stream
            orgStream = System.out;
            fileStream = new PrintStream(new FileOutputStream("out.txt",true));
            // Redirecting console output to file
            System.setOut(fileStream);
            FileExStu.search(nom,age,filename);

        }
        catch (FileNotFoundException fnfEx)
        {
            System.out.println("Error in IO Redirection");
            fnfEx.printStackTrace();
        }
        catch (Exception ex)
        {
            //Gets printed in the file
            System.out.println("Redirecting output & exceptions to file");
            ex.printStackTrace();
        }
        finally
        {
            //Restoring back to console
            System.setOut(orgStream);
            

        }

	}
    // Vérifie si A EVITER se trouve dans le fichier "out.txt"
    public static boolean checkOutAEviter(){
        try{
            InputStream ips=new FileInputStream("out.txt"); 
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String ligne;
            while ((ligne=br.readLine())!=null){

                if(ligne.equals("A EVITER")){
                	return true;
                }
            }
            br.close(); 
            return false;
        }		
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
	}
    // Vérifie si OK se trouve dans le fichier "out.txt"

    public static boolean checkOutOk(){
        try{
            InputStream ips=new FileInputStream("out.txt"); 
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String ligne;
            while ((ligne=br.readLine())!=null){
                if(ligne.equals("OK")){
                	return true;
                }
            }
            br.close(); 
            return false;
        }		
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
	}
    // Supprime le fichier "out.txt" généré pour le premier test
    public static void deleteFile(String filename){
		try{
    		
    		File file = new File(filename);
        	
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    		
    	}
	}
	@Test
	public void testAEviter(){
		try{
        
        	//Appel de la méthode
            
        	String nom="Olivier";
			int age = 18;
			String filename="student/personnes.txt";
			redirect(nom,age,filename);
            
            //Test de l'output
            
            if(!checkOutAEviter()){
            	System.setOut(System.out);
                fail(str + "Vous n'avez pas écrit A EVITER sur la sortie standard");
            }
            deleteFile("out.txt");
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
		} catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    @Test
	public void testOk(){
		try{
        
        	//Appel de la méthode
            
        	String nom="dfgjdknf";
			int age = 18;
			String filename="student/personnes.txt";
			redirect(nom,age,filename);
            
            //Test de l'output
            
            if(!checkOutOk()){
            	System.setOut(System.out);
				fail(str + "Vous n'avez pas écrit OK sur la sortie standard");
            }
            
            deleteFile("out.txt");

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
	public void testStream(){
    	try{
        	File file = new File("student/personnes.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("j'ai pas fermé les streams");
            bw.close();
            
        }catch(IOException e){
        	fail("Vous n'avez pas fermé un de vos streams");
        }
    }
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(FileEx.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}