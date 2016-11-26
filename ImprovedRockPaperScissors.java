import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImprovedRockPaperScissors {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		//Use ASCII code to draw rock paper scissors
		//Then play it in CMD cause why not using color 02
		
		/**
		File File = new java.io.File("RPS.txt");
		Scanner fileStuff = new Scanner(File);
		
		while(fileStuff.hasNext()){
			System.out.println(fileStuff.next());
		}
		*/
		
		//Generating 1, 2 or 3
		int computer = 1 + (int) ((Math.random() * (4)) - 1);
		
		//Saving users choice of 1, 2 or 3
		System.out.println("Enter either 1 for Rock, 2 for Paper or 3 for Scissors: ");		
		int userChoice = input.nextInt();
		
		
		//Computation for when user chooses rock(1)
		if(userChoice == 1){
			if(computer == 1){
				System.out.println("Tie, you didn't lose :D");
			}
			else if(computer == 2){
				System.out.println("You win! For once lol :p");
			}
			else{
				System.out.println("You lose... as always");
			}
		}
		
		
		//Computation for when user chooses paper(2)
		else if(userChoice == 2){
			if(computer == 1){
				System.out.println("You lose.... even my computer can beat you in this game XD ");
			}
			else if(computer == 2){
				System.out.println("Tie");
			}
			else{
				System.out.println("You win... (what cheat code are you using?)");
			}
		}
		
		
		
		//Computation for when user chooses scissors(3)
		else if(userChoice == 3){
			if(computer == 1){
				System.out.println("You win!!!");
			}
			else if(computer == 2){
				System.out.println("As always you lose :p");
			}
			else{
				System.out.println("Tied..");
			}
		}
		
		//Working out errors
		else{
			System.out.println("Please enter either 1, 2 or 3 or it won't work OK Ridaaaa");
		}
	}

}
