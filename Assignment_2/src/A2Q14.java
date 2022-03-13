/*
 * P. Biswanath Patra
 * 2141016196
 * Checking if either of the variables taken from args divides the other.
 * 
*/
public class A2Q14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String m = ((a%b==0)||(b%a==0))?
				"Either evenly divides other":"Neither evenly divides other";
		System.out.println(m);
		/*
		if (a%b == 0 || b%a==0) {
			System.out.print("Either evenly divides other");
		}
		else {
			System.out.print("Neither evenly divides other");
		}
		*/
	}

}
