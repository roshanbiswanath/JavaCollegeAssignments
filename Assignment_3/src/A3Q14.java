import java.util.Scanner;
public class A3Q14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("scissor(0), rock(1), paper(2): ");
		int user =  sc.nextInt();
		int pc = (int)(Math.random()*3);
		///*
		String[] move = {"scissor","rock","paper"};
		String[][] outcome = {
				{"Tie", "Lose", "Win"},
				{"Win", "Tie", "Lose"},
				{"Lose", "Win", "Tie"}
				};
		System.out.println("The computer is "+move[pc]+
				". You are "+move[user]+
				". You "+outcome[user][pc]);
				//*/
		/*
		switch(pc) {
		case 0:
			System.out.print("The computer is scissor. ");
			break;
		case 1:
			System.out.print("The computer is rock. ");
			break;
		case 2:
			System.out.print("The computer is paper. ");
			break;
		}
		switch(user) {
		case 0:
			System.out.print("You are scissor");
			break;
		case 1:
			System.out.print("You are rock");
			break;
		case 2:
			System.out.print("You are paper");
			break;
		}
		if(user==pc)
			System.out.println(" too. It is a draw");
		else if ((pc==0 && user==1)||(pc==1 && user==2)||(pc==2 && user==0))
			System.out.println(". You won");	
		else
			System.out.println(". You lost");
		*/
	}
}