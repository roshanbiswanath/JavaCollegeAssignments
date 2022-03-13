public class A2Q17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		boolean x = (n1 >= n2 + n3 || n2 >= n3 + n1 || n3 >= n2 + n1);
		System.out.println(x);
		/*
		if (n1 >= n2 + n3 || n2 >= n3 + n1 || n3 >= n2 + n1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		*/
	}

}
