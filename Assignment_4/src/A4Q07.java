public class A4Q07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		/*
		int sumOfSquares =(n*(n+1)*(2*n + 1))/6;
		int squareOfSum = (int)Math.pow((n*(n+1))/2,2);
		*/
		int squareOfSum = 0;
		int sumOfSquares = 0;
		for (int i = 1;i<=n;++i) {
			squareOfSum+= i;
			sumOfSquares += Math.pow(i, 2);
		}
		squareOfSum = (int)Math.pow(squareOfSum, 2);
		int difference = sumOfSquares - squareOfSum;
		System.out.println("1^2 + 2^2 + ... + "+n+"^2 : " + sumOfSquares);
		System.out.println("(1 + 2 + ... + " +n+")^2 : " + squareOfSum);
		System.out.println("Difference : "+Math.abs(difference));
		
	}

}
