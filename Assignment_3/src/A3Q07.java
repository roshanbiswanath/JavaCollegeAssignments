import java.util.Scanner;
public class A3Q07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x and y co-ordinate: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.print("("+x+", "+y+") ");
		if (x>0 && y>0 )
			System.out.println("is in quadrant I");
		else if (x>0 && y<0)
			System.out.println("is in quadrant IV");
		else if (x<0 && y>0)
			System.out.println("is in quadrant II");
		else if (x<0 && y<0)
			System.out.println("is in quadrant III");
		else if(x==0 && y!= 0)
			System.out.println("is on the y-axis.");
		else if(x!=0 && y==0)
			System.out.println("is on the x-axis.");
		else
			System.out.println("is orgin.");
	}
}