import java.util.Scanner;

public class Fibbinacci {
static double count = 0;
	
	public static int fibinnacci(int n) {
		count++;
		if (n == 1) {
			return 0;
			
		}
		else if(n == 2){
			return 1;
		}
		else {
			return (fibinnacci(n - 1) + fibinnacci(n - 2));
		}
	}

	public static void main(String[] args) {
		
		System.out.println(fibinnacci(60));
		System.out.println(count);

	}

}
