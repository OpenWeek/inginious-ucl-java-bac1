package student;

public class Exercice2Stu {

    // Soluce
    public static int[] prodAlgeb(int a, int b, int c){

        int xCube = 1;
        int xCarre = -(a+b+c);
        int x = (a*b+a*c+b*c);
        int tI = -a*b*c;
        
        int i[] = {xCube, xCarre, x, tI};
        return i;
        }
}