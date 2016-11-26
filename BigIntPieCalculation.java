import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigIntPieCalculation {

	public static void main(String[] args) {
		
		BigDecimal pi = BigDecimal.ZERO;
		
		BigDecimal calc = BigDecimal.ZERO;
		
		double denominator = 1;
		
		BigDecimal four = BigDecimal.valueOf(4);
		
		boolean plusMinus = true;
		
		int max = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < max; i++){
			
			calc = calc.valueOf(4 / denominator);
			if(plusMinus){
				pi = pi.add(calc);
				plusMinus = false;
			}
			else{
				pi = pi.subtract(calc);
				plusMinus = true;
			}
			denominator = denominator + 2;
		}
		System.out.println(pi);
	}

}
