import java.util.Scanner;

public class DectoHex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ender number");
		int number = input.nextInt();
		
		String hex = "";
		
		while(number != 0)
		{
			int remainder = number % 16;
			
			char hexDigit = (remainder <=9 && remainder >=0) ?
					(char)(remainder + '0') : (char)(remainder - 10 + 'A');
					
					hex = hexDigit + hex;
					
					number = number / 16;
					
			}
		System.out.print(hex);
		}
		
	}

