public class A2Q22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[0]);
		double pay = p*Math.exp(r*t);
		System.out.println(pay);
	}
}
