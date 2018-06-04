package BabylonianAlgorithm;

import java.util.Scanner;

public class BabylonianAlgorithm {
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	double n=scanner.nextDouble();
	double guess=2;
	double r=n/guess;
	do{ 
		r=n/guess;
		guess=(guess+r)/2;
	}while((Math.sqrt((((guess+r)/2)-guess)*(((guess+r)/2)-guess)))/guess>0.01);

	System.out.println(Math.rint(guess*100)/100);
}
}
