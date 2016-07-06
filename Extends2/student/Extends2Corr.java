package student;

public class Extends2Stu {

	// Code a verifier
	public static int sumFirstEvenIntegers(int n){
		int sum = 0;
		for(int i = 1 ; i <= n ; i++){
			sum += i*2;
		}
		return sum;
	}
}
