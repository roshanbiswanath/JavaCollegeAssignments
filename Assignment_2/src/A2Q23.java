import java.lang.Math;
public class A2Q23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int max = Math.max(x, Math.max(y, z));
		int min = Math.min(x, Math.min(y, z));
		int mid = (x + y + z) - (max + min);
		System.out.println(min+" "+mid+" "+max);
	}
}