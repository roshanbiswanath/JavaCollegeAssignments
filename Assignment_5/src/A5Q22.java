import java.util.Scanner;
public class A5Q22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n to check if its prime: ");
		int n = sc.nextInt();
		String message = "prime.";
		for(int i = 2;i<=n/2;++i) {
			if(n%i==0) {
				message = "not prime.";
				break;	
			}
		}
		System.out.print(n+" is "+message);
	}

}
