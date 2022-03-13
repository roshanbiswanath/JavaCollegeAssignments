import java.util.Scanner;
public class A3Q04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char: ");
		char ch = sc.next().charAt(0);
		if(ch<='Z' && ch>='A')
			System.out.println(ch+" is a capital letter.");
		else if(ch>='a' && ch <='z')
			System.out.println(ch+" is a small case letter.");
		else if(ch>='0' && ch<='9')
			System.out.println(ch+" is a digit.");
		else if(ch>=0 && ch<=127)
			System.out.println(ch+" is a special symbol.");
		else
			System.out.println(ch+" is not in ASCII.");
	}
}
