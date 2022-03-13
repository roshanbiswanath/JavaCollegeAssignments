import java.util.Scanner;
public class A5Q07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt(),sum=0;
		for(int i=1;i<=n;i=i+1) {
			if (i%2==0) sum -= (2*i - 1);
			else sum += (2*i - 1);
		}
		System.out.println(sum);
		/*
		for(int i=1;i<=n;i=i+1)
			sum+= (2*i - 1)*Math.pow(-1,i-1);
		System.out.println("Sum of "+n+" terms of the series: "+sum);
		*/
		/*
		sum = 0;
		sum = (n%2==0)?-1*n:n;
		System.out.println(sum);
		sum = 0;
		if (n%2 ==0)
			sum = -1*n;
		else
			sum = n;
		System.out.println(sum);
		*/
	}
}