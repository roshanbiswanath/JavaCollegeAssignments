import java.util.Scanner;
public class A5Q20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N to get its factors: ");
		int n = sc.nextInt(),m=n,i=2;
		String sep;
		while(m>1) {
			if(m%i==0) {
				m /= i;
				sep = (m==1)?".":", ";
				System.out.print(i+sep);
			}
			else
				i++;
		}
	}
}
