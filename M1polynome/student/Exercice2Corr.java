package student;

public class Exercice2Stu {

    /**
     * @pre : -
     * @post : calcule les coefficients d'un polynome de 3ème degré, en fonction des 3 racines
     */
    public static int[] prodAlgeb(int a, int b, int c){

        int xCube = 1;
        int xCarre = -(a+b+c);
        int x = (a*b+a*c+b*c);
        int tI = -a*b*c;
        
        int i[] = {xCube, xCarre, x, tI};
        return i;
        }
}
