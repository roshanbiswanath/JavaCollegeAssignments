/*
 * P. Biswanath Patra
 * 2141016196
 * Finding a random number between two numbers given in args[].
 * 
*/
import java.lang.Math;
public class A2Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + (int)(Math.random()*(b-a+1));
		System.out.println("Random integer between "+a+" and "+b+" is "+c+" .");
	}
}
