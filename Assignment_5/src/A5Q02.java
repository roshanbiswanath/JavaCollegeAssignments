import java.util.Scanner;
public class A5Q02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		int count = 0,marks;
		System.out.print("Enter student's marks: ");
		for (int i=1;i<=n;i++) {
			//System.out.println("Enter marks of student no. "+ i+": ");
			marks = sc.nextInt();
			if(marks>=40)
				count+=1;
		}
		System.out.println(count + " students passed.");
	}
}
