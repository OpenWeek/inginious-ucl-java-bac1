package student;

public class Exercice1Stu {

    // Soluce
    public static int eqSolv(int xCube, int xCarre, int x, int tI){

        for(int i=0; i<=20; i=i+1)
        {
            if(xCube*i*i*i+xCarre*i*i+x*i+tI==0)
            {
                return i;
            }
        }

    }
}