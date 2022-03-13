public class A2Q19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = Integer.parseInt(args[0]);
		int da = 40;
		int hra = 20;
		double gross = base*(1.0 + (da + hra)/100.0) ;
		System.out.println(gross);
	}
}
