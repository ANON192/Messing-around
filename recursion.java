
public class recursion {

	public static void main(String[] args) {
		int number1 = 50;
		long max = Long.MAX_VALUE;
		System.out.println(max);
		//int number = 4;

		
		
	}
	
	
	public static int factorialloop(int num){
		for(int i = num - 1 ; i > 0; i--){
			num = num * i;
		}
		return num;
	}
	
	public static int factorial(int num){
		
		if(num==0){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
}
