package BigintegerOperationClassDesign;
import java.util.Scanner;

public class Implement {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String number = keyboard.nextLine();
		String result;
		String[] eachnumber = number.split(" ");
		int a=eachnumber.length;
		int b=a/2;
		int i;
		String number1 = eachnumber[0];
		result = number1;
		
		for(i=0;i<b;i++){
		String operator=eachnumber[2*i+1];
		if(operator.equals("+")){
		IOperation operation = new Addition();
		result = operation.perform(result, eachnumber[2*i+2]);
		
	}
		
		if(operator.equals("-")){
			IOperation operation = new Subtraction();
		result = operation.perform(result, eachnumber[2*i+2]);
		
	}
		
		if(operator.equals(">")||operator.equals("<")||operator.equals("=")){
			IOperation operation = new Comparison();
		result = operation.perform(eachnumber[0], eachnumber[2]);
		if(operator.equals(">")&&result.equals("1")){
			result ="True";
		}
		else if(operator.equals("<")&&result.equals("-1")){
			result ="True";
		}
		else if(operator.equals("=")&&result.equals("0")){
			result ="True";
		}
		else{
			result ="False";
		}
}

		}
		System.out.println(result);
	}


}


