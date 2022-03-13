public class A2Q18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		boolean bool = (x>y && y > z)||(x<y && y<z);
		System.out.println(bool);
		/*
		if((x>y && y > z)||(x<y && y<z)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		*/
	}
}