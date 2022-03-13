public class A5Q03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100;i<=1000;i++) {
			if(i%30==0) {
				count++;
				System.out.print(i+" ");
				if(count%10==0)
					System.out.println();
			}
		}
	}
}
