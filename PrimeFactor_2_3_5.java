package PrimeFactor_2_3_5;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor_2_3_5 {
	

	public static void main(String[] args){
		
		Scanner scanner =new Scanner(System.in);
		    String a = scanner.next();
		    int s=a.length();
		    int n=Integer.parseInt(a.substring(2,s));
		    int q=n;
		    if(a.charAt(0)=='x'||a.charAt(0)=='X'){
		    	while(q%2==0){
		    		 q=q/2;
		    		 }
		    		while(q%3==0){
		    			 q=q/3;
		    		}
		    			while(q%5==0){
		    				q=q/5;
		    	}
		    	if(q==1){
		    		System.out.println("True");
		    	}
		    	else{
		    		System.out.println("False");
		    	}
		    }
		    else if(a.charAt(0)=='y'||a.charAt(0)=='Y'){
		    	long i=0;
		    	long j=0;
		    	while(j<n){
		    		i=i+1;
		    		long w=i;
		    	
		    		while(w%2==0){
			    		 w=w/2;
			    		 }
			    		while(w%3==0){
			    			 w=w/3;
			    		}
			    			while(w%5==0){
			    				w=w/5;
			    	}
			    	if(w==1){
			    		j=j+1;
			    	}
			    	else{
			    		j=j;
			    	}
			    	
		    	}
		    	System.out.println(i);
		    }
		    else
		    	System.out.println("¿é¤J¿ù»~");
}
}

