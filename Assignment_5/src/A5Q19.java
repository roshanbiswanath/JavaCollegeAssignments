import java.util.Scanner;
public class A5Q19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N to convert to binary: ");
		int n = sc.nextInt(),m=n;
		String s = "";
		while(m>=1) {
			s = (m%2)+s;
			m /= 2;
		}
		System.out.println("Binary of "+n+" is "+s);
	}
}
