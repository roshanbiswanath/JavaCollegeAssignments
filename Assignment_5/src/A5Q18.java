public class A5Q18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		double x = n,y = 0;
		while(Math.abs(y-x)>0.0001) {
			y = x;
			x = (1.0/k)*(x*(k-1) + n/Math.pow(x, k-1));
		}
		System.out.println(n+"^1/"+k+" is "+x);
	}
}