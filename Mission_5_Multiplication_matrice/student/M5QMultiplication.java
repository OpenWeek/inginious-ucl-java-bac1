/**
 *  Copyright (c) 2016 Gellens Arnaud, Gonzalez Alvarez Pablo
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
import java.util.Arrays;
import org.junit.runner.notification.Failure;

public class M5QMultiplication {
	
    // fonction de référence pour la multiplication
    private int[][] mul(int l[][], int m[][]){
        int sol[][]=new int[l.length][m[0].length];
        for(int i=0; i<sol.length; i++){
        	for(int j=0; j<sol[0].length; j++){
				sol[i][j]=0; //initialisation du tableau
               for(int k=0;k<l[0].length;k++){
               		sol[i][j]+=l[i][k]*m[k][j];
               }
            }
        }
        return sol;
    }
    
    //fonction pour comparer 2 tableaux de tableaux, nécessaire car impossible directement avec Arrays.equals()
    private boolean isEquals(int l[][],int m[][]){
    	if (l.length!=m.length){ // la concordance des autres dimensions n'est pas nécessaire puisque vérifié par la suite avec le Arrays.equals
        	return false;
        }
        for(int i=0; i<l.length; i++){
        	if(!Arrays.equals(l[i],m[i])){
            	return false;
            }
        }
        return true;
    }
    
   	private String printMatr(String err,int m[][]){
    	for(int i =0;i<m.length;i++){
        	for(int j =0;j<m[0].length;j++){
				err+=(m[i][j]+" ");	
        	}
            err+="\n";
        }
        return(err);
    }
    
	private static String str = "Question 1 :\n Le code semble comporter des erreurs : ";
	
    
    
	@Test
	public void test(){
		try{
        	int ll=2+(int)(Math.random()*3); // nombre de ligne de la matrice l(de 2 à 4)
            int lc=2+(int)(Math.random()*3); // nombre de colone de la matrice l(de 2 à 4)
			 int mc=2+(int)(Math.random()*3); // nombre de colone de la matrice m(de 2 à 4)
            //test avec des matrices compatiblles
            int l[][]=new int[ll][lc];
            int m[][]=new int[lc][mc];
            
            //remplissage des matrices l et m 
            for(int j=0; j<lc; j++){
            	for(int i=0; i<ll; i++){
                	l[i][j]=(int)(Math.random()*5);
                }
                for(int k=0; k<mc; k++){
                	m[j][k]=(int)(Math.random()*5);
                }
            }
         	
            
            int solStu[][]=M5QMultiplicationStu.multiplication(l,m);
            int sol[][]=mul(l,m);
            if (!isEquals(solStu,sol)){
            	String err="Question 1 :\n Votre solution ne fournit pas une réponse correcte\n\n";
               err+="l :\n";
                err=printMatr(err, l);
                err+="\n";

                err+="m :\n";
                err=printMatr(err, m);
				 err+="\n";
                 
                err+="et votre solution :\n";
                err=printMatr(err, solStu);
                err+="\n";
                
                fail(err);
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
	
    
    @Test
	public void testProgDef(){ // vérification de l'utilisation de la programation défensive
		try{
        	int ll=2+(int)(Math.random()*3); // nombre de ligne de la matrice l(de 2 à 4)
            int lc=2+(int)(Math.random()*3); // nombre de colone de la matrice l(de 2 à 4)
			 int mc=2+(int)(Math.random()*3); // nombre de colone de la matrice m(de 2 à 4)	
            ///////////////
            //test avec des matrices incompatibles
            
            int l[][]=new int[ll][lc];
            int m[][]=new int[lc+1][mc];
            boolean err=false;
            try{
            	M5QMultiplicationStu.multiplication(l,m);
                err=true;                
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancée
            } catch (NullPointerException e) {
            	err=true;
            }
            if(err){
                err=false;
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.\n Aucune assertion vérifie que les matrices soient compatibles pour la multiplication.");
            }
         	
           ///////////////
            // test avec une des deux matrices nulles
           try{
            	M5QMultiplicationStu.multiplication(l,null);
                err=true;
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancée
            } catch (NullPointerException e) {
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.\n Vous devez vérifier avant tout que les matrices ne soient pas nulles.");
            }
            if (err){
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.\n Les assertions ne vérifient pas que les matrices ne sont pas nulles.");
            }
            
            try{
            	M5QMultiplicationStu.multiplication(null,m);
                err=true;
                
            } catch (AssertionError e) {
            	// Pour vérifier qu'une Assertion a bien été lancée
            } catch (NullPointerException e) {
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.\n Vous devez vérifier avant tout que les matrices ne soient pas nulles.");
            }
            if (err){
            	fail("Question 1 : \n Vous devez utiliser de la programmation défensive.\n Les assertions ne vérifient pas que les matrices ne soient pas nulles.");
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
		Result result = JUnitCore.runClasses(M5QMultiplication.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
