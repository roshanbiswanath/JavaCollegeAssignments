import java.util.Scanner;
public class A3Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = sc.nextInt() % 7;
		System.out.print("Enter the number of days elapsed since today: ");
		int days = sc.nextInt();
		int next = (today + days)%7;
		String todayName = "",nextName="";
		switch (today) {
		case 0:todayName = "Sunday";break;
		case 1:todayName = "Monday";break;
		case 2:todayName = "Tuesday";break;
		case 3:todayName = "Wednesday";break;
		case 4:todayName = "Thursday";break;
		case 5:todayName = "Friday";break;
		case 6:todayName = "Saturday";break;
		}
		switch (next) {
		case 0:nextName = "Sunday";break;
		case 1:nextName = "Monday";break;
		case 2:nextName = "Tuesday";break;
		case 3:nextName = "Wednesday";break;
		case 4:nextName = "Thursday";break;
		case 5:nextName = "Friday";break;
		case 6:nextName = "Saturday";break;
		}
		System.out.println("Today is "+todayName+" and the future day is "+nextName);
	}
}
