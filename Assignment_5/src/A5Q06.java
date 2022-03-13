import java.util.Scanner;
public class A5Q06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.print("Enter "+n+" numbers: ");
		double sum=0;
		for(int i=0;i<n;++i)
			sum+= 1.0/sc.nextInt();
		double hm = n/sum;
		System.out.println("HM of "+n+" numbered set: "+hm);
	}
}