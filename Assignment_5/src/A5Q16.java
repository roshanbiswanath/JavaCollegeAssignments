import java.util.Scanner;
public class A5Q16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N to reverse: ");
		int n = sc.nextInt();
		int m = n,nRev=0;
		while(m>0) {
			nRev = nRev*10 + m%10;
			m /= 10;
		}
		System.out.println(n+" reversed is "+nRev);
	}
}