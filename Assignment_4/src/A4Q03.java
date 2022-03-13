public class A4Q03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1";
		for (int i= 1;i<=5;++i) {
			System.out.println(str);
			str = str + (i+1) + str;
		}
	}
}