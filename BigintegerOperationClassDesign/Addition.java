package BigintegerOperationClassDesign;

public class Addition implements IOperation {

	public String perform(String num1, String num2) {
		int num1len=num1.length();
		int num2len=num2.length();
		if(num1len<num2len){
			
			num1len=num2len;
		}
	
		int a[]=new int[num1len];
		int b[]=new int[num1len];
		int c[]=new int[num1len];
		int i,j;
		int carry = 0;
		
		String answer=""; 
		
		String d[]=new String[200];
	
		
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-'){
			for(j=0;j<num1len;j++){
				 a[j]=Integer.parseInt(num1.substring(num1len-1-1*j,num1len-1*j));
			}
			for(i=0;i<num2len;i++){
				b[i]=Integer.parseInt(num2.substring(num2len-1-1*i,num2len-1*i));
			}
			
			 for(i =0 ; i <= num1len-1; i++) { 
			        c[i] = a[i] + b[i] + carry; 
			        if(c[i] < 10) 
			            carry = 0; 
			        else {  
			            c[i] = c[i] - 10; 
			            carry = 1; 
			        } 
			    } 
				
				
			     for(j=num1len-1; j >= 0; j--){
			    	 
			    	 d[j]=Integer.toString(c[j]);
			    	 
			    	 
			    			 answer=answer+d[j];
			     }
			     if(carry == 1){
				    answer="1"+answer;
				    }
			    
			
			
			}
		if (num1.charAt(0) != '-' && num2.charAt(0) == '-'){
			
			IOperation operation = new Subtraction();
			answer = operation.perform(num1, num2.substring(1, num2.length()));   
			    	
			}
        if (num1.charAt(0) == '-' && num2.charAt(0) != '-'){
			
			IOperation operation = new Subtraction();
			answer = operation.perform(num2, num1.substring(1, num1.length()));   
			    	
			}
        if (num1.charAt(0) == '-' && num2.charAt(0) == '-'){
			
			IOperation operation = new Addition();
			answer ="-"+operation.perform(num1.substring(1, num1.length()), num2.substring(1, num2.length()));   
			    	
			}
		
		return answer;
	}
}

	
