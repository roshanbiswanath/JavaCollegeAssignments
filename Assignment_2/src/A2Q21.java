import java.lang.Math;
public class A2Q21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = Double.parseDouble(args[0]);
		t = Math.toRadians(t);
		double out = Math.sin(2*t) + Math.sin(3*t);
		System.out.println(out);
	}
}
