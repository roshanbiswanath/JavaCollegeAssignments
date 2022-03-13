public class A5Q23 {
	public static boolean isPrime(int x) {
		boolean prime = true;
		for(int i = 2;i<=x/2;++i) {
			if(x%i==0) 
			{prime = false; break;}
		}
		return prime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]),count = 0;
		for(int j = 2;j<=n;++j) {
			if (isPrime(j)) {
				System.out.print(j+" ");
				count++;
			}
		}
		System.out.println("\nNo. of primes: "+count);
	}
}
