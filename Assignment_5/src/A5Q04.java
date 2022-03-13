import java.util.Scanner;
public class A5Q04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int negCount=0,posCount=0,sum=0;
		System.out.print("Enter some integer, input ends on 0: ");
		int n = sc.nextInt();
		while(n!=0) {
			if (n<0) negCount++;
			else posCount++;
			sum+=n;
			n = sc.nextInt();
		}
		if ((posCount + negCount)==0)
			System.out.println("No numbers are entered except 0");
		else {
			float avg = (float)sum/(posCount + negCount);
			System.out.println("The number of positives is "+posCount);
			System.out.println("The number of negatives is "+negCount);
			System.out.println("The total is "+sum);
			System.out.println("The average is "+avg);
		}
	}
}
