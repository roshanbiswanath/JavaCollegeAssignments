import java.lang.Math;
public class A3Q09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int)(1+Math.random()*12);
		System.out.println(month);
		String monthName = "";
		switch(month) {
			case 1:
				monthName = "January"; break;
			case 2:
				monthName = "February"; break;
			case 3:
				monthName = "March"; break;
			case 4:
				monthName = "April"; break;
			case 5:
				monthName = "May"; break;
			case 6:
				monthName = "June"; break;
			case 7:
				monthName = "July"; break;
			case 8:
				monthName = "August"; break;
			case 9:
				monthName = "September"; break;
			case 10:
				monthName = "October"; break;
			case 11:
				monthName = "November"; break;
			case 12:
				monthName = "December"; break;
			default:
				monthName = "Not a Month";
		}
		//String print = monthName.length()==0? "Not a month" : monthName;
		System.out.println(monthName);
	}
}
