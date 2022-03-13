import java.util.Scanner;
public class A5Q05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt(),sum=0;
		System.out.print("Enter set of "+n+" numbers: ");
		for(int i=0;i<n;++i)
			sum+= sc.nextInt();
		float avg = (float)sum/n;
		System.out.println("Sum of "+n+" numbered set: "+sum);
		System.out.println("Their Average: "+avg);
	}
}
