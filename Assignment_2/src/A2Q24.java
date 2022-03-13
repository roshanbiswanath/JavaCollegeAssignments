import java.lang.Math;
public class A2Q24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = Math.random();
		double r2 = Math.random();
		double r3 = Math.random();
		double r4 = Math.random();
		double r5 = Math.random();
		System.out.println(r1+" "+r2+"\n"+r3+" "+r4+"\n"+r5);
		double avg = (r1+r2+r3+r4+r5)/5;
		double max = Math.max(r1,Math.max(r2, 
				Math.max(r3, Math.max(r4, r5))));
		double min = Math.min(r1,Math.min(r2, Math.min(r3, Math.min(r4, r5))));
		System.out.println("Average: "+avg);
		System.out.println("Max:     "+max);
		System.out.println("Min:     "+min);
	}
}
