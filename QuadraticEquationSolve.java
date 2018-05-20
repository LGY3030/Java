package QuadraticEquationSolve;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquationSolve {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		do{
			
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = b*b-4*a*c;
		String e = scanner.next();
		DecimalFormat dt = new DecimalFormat(e);
		if(d<0){
			System.out.println("¨â®Ú¬°µê®Ú");
		}
		else{
			double answer_1 = (-b+Math.sqrt(d))/(2*a);
			double answer_2 = (-b-Math.sqrt(d))/(2*a);
			double trans_1=Math.sqrt(answer_1*answer_1);
			double trans_2=Math.sqrt(answer_2*answer_2);
			String answer1 = dt.format(answer_1);
			String answer2 = dt.format(answer_2);
			if(a>0){
				if(trans_1>trans_2){
					System.out.println(answer2+"\n"+answer1);
				}
				else{
					System.out.println(answer1+"\n"+answer2);
				}
			}
			if(a<0){
				if(trans_1>trans_2){
					System.out.println(answer1+"\n"+answer2);
				}
				else{
					System.out.println(answer2+"\n"+answer1);
				}
			}
		  }
		}while(scanner.hasNext());
	}

}
