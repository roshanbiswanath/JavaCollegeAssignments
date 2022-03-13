import java.util.Scanner;
public class A3Q08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ages of Rahul, Ayush and Ajay respectively");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b) {
			if (a>c)
				System.out.println("Rahul is eldest.");
			else
				System.out.println("Ajay is eldest.");
		}
		else {
			if (b>c)
				System.out.println("Ayush is eldest.");
			else
				System.out.println("Ajay is eldest.");
		}
		/*
		//int x = Math.max(a, Math.max(c, b));
		int y = (a+b + Math.abs(a-b))/2;
		int x = (y+c + Math.abs(y-c))/2;
		String l = "";
		if(x==a) {
			l+="Rahul";
		}
		if(x==b) {
			if(l.length()!=0) {
				l+=", ";
			}
			l+="Ayush";
		}
		if(x==c) {
			if(l.length()!=0) {
				l+=", ";
			}
			l+="Ajay";
		}
		System.out.println("Person with eldest age: "+l);
		*/
	}

}
