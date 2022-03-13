///*
public class A5Q24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Integer.parseInt(args[0]);
		//double n = 10000;
		double m = Math.pow(n,1.0/3);
		for(int i=1;i<=m;++i) {
			for(int j=1;j<i;++j) {
				if(i*i*i + j*j*j > n) break;
				for(int k=i+1;k<=m;++k) {
					for(int l=1;l<k;++l) {
						if(k*k*k + l*l*l > n) break;
						if(i*i*i+j*j*j==k*k*k+l*l*l)
							System.out.println(i*i*i+j*j*j+" = "+
						i+"^3 + "+j+"^3 = "+k+"^3 + "+l+"^3");
					}
				}
			}
		}
	}
}
//*/
/*
public class A5Q24{
	public static void main(String[] args){
			int n = 2000;
			for (int a = 1; a <= n; a++){
				int a3 = a*a*a;
				if (a3 > n) break;
				for (int b = a; b <= n; b++){
					int b3 = b*b*b;
					if (a3 + b3 > n) break;
					for (int c = a + 1; c <= n; c++){
						int c3 = c*c*c;
						if (c3 > a3 + b3) break;
						for (int d = c; d <= n; d++)
						{
							int d3 = d*d*d;
							if (c3 + d3 > a3 + b3) break;
							if (c3 + d3 == a3 + b3)
							{
								System.out.print((a3+b3) + " = ");
								System.out.print(a + "^3 + " + b + "^3 = ");
								System.out.print(c + "^3 + " + d + "^3");
								System.out.println();
							}
						}
					}
				}
			}
	}
}
*/