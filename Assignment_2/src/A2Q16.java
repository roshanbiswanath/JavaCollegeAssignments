/*
 * P. Biswanath Patra
 * 2141016196
 * Finding the sum of two random numbers each of which is between [1,6].
 * 
*/

import java.lang.Math;
public class A2Q16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = 1 + (int)(Math.random()*(6-1 +1));
		int r2 = 1 + (int)(Math.random()*(6-1 +1));
		int r = r1 + r2;
		System.out.print(r);
	}
}
