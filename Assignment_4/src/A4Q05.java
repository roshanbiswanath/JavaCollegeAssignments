import java.util.Scanner;
public class A4Q05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		int n = sc.nextInt();
		String firstPrint = "Sum of all even numbers = ";
		String secondPrint = "Product of all odd numbers = ";
		int sum = 0,product = 1;
		for(int i=1;i<=n;++i) {
			if(i%2==0) {
				sum += i;
				firstPrint += " "+i+" ";
				if ((i+1)<n) {
					firstPrint += "+";
				}
			}
			else {
				product *= i;
				secondPrint += " "+i+" ";
				if ((i+1)<n) {
					secondPrint += "*";
				}
			}
		}
		System.out.println(firstPrint+"= "+sum);
		System.out.println(secondPrint+"= "+product);
	}

}
