import java.util.Scanner;
public class A3Q13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month ");
		int month = sc.nextInt();
		System.out.print("Enter Year ");
		int year = sc.nextInt();
		int days;
		String monthName;
		switch(month) {
		case 1:
			monthName = "January";
			days = 31;
			break;
		case 2:
			monthName = "February";
			days = 28;
			if (((year%4==0) && (year%100 != 0)) || (year%400==0)) {
				days = 29;
			}
			break;
		case 3:
			monthName = "March";
			days = 31;
			break;
		case 4:
			monthName = "April";
			days = 30;
			break;
		case 5:
			monthName = "May";
			days = 31;
			break;
		case 6:
			monthName = "June";
			days = 30;
			break;
		case 7:
			monthName = "July";
			days = 31;
			break;
		case 8:
			monthName = "August";
			days = 31;
			break;
		case 9:
			monthName = "September";
			days = 30;
			break;
		case 10:
			monthName = "October";
			days = 31;
			break;
		case 11:
			monthName = "November";
			days = 30;
			break;
		case 12:
			monthName = "December";
			days = 31;
			break;
		default:
			monthName = "";
			days = 0;
	}
		System.out.println(monthName+" "+year+" has "+days+" days");
	}

}
