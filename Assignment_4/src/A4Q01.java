import java.util.Scanner;
public class A4Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message");
		String message = sc.next();
		int i = 1;
		while (i<11) {
			System.out.print(i);
			if (i ==1) {
				System.out.print("st");
			}
			else if(i==2) {
				System.out.print("nd");
			}
			else if(i==3) {
				System.out.print("rd");
			}
			else {
				System.out.print("th");
			}
			System.out.println(" "+message);
			i++;
		}
	}

}
