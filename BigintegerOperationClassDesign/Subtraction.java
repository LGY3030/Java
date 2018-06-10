package BigintegerOperationClassDesign;

public class Subtraction implements IOperation {
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
		
		int borrow = 0;
		String answer=""; 
		String inverseanswer="";
		String d[]=new String[100];
		if(num1.equals("0")&&num2.equals("0")){
			answer="0";
		}
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-'){
			for(j=0;j<num1len;j++){
				 a[j]=Integer.parseInt(num1.substring(num1len-1-1*j,num1len-1*j));
			}
			for(i=0;i<num2len;i++){
				b[i]=Integer.parseInt(num2.substring(num2len-1-1*i,num2len-1*i));
			}
			if (num1.length() > num2.length()){
				for(i =0 ; i <= num1len-1; i++) { 
			        c[i] = a[i] - b[i] - borrow; 
			        if(c[i] >= 0) 
			            borrow = 0; 
			        else {  
			            c[i] = c[i] + 10; 
			            borrow = 1; 
			        } 
			    } 
				for(j=num1len - 1; j >= 0; j--){
			    	 
			    	 d[j]=Integer.toString(c[j]);
			    	 
			    	 
			    	 answer=answer+d[j];
			    	}
				int k=0;
				while(answer.charAt(k)=='0'){
					answer=answer.substring(1,answer.length());
					
				}
			}
			
			if (num1.length() < num2.length()){
				for(i =0 ; i <= num1len-1; i++) { 
			        c[i] = b[i] - a[i] - borrow; 
			        if(c[i] >= 0) 
			            borrow = 0; 
			        else {  
			            c[i] = c[i] + 10; 
			            borrow = 1; 
			        } 
			    } 
				for(j=num1len - 1; j >= 0; j--){
			    	 
			    	 d[j]=Integer.toString(c[j]);
			    	 
			    	 
			    	 answer=answer+d[j];
			    	}
				int k=0;
				while(answer.charAt(k)=='0'){
					answer=answer.substring(1,answer.length());
				}
				answer="-"+answer;
			
			}
			
			if (num1.length() == num2.length()){
				for (i = 0; i < num1.length(); ++i) {
					int n1 = num1.charAt(i);
					int n2 = num2.charAt(i);
				if(n1==n2){
					inverseanswer="0";
				}
				if(n1>n2){
					inverseanswer="1";
					break;
				}
				if(n1<n2){
					inverseanswer="-1";
					break;
				}
			}
				if(inverseanswer.equals("1")){
					 for(i =0 ; i <= num1len-1; i++) { 
				        c[i] = a[i] - b[i] - borrow; 
				        if(c[i] >= 0) 
				            borrow = 0; 
				        else {  
				            c[i] = c[i] + 10; 
				            borrow = 1; 
				        } 
				    } 
					for(j=num1len - 1; j >= 0; j--){
				    	 
				    	 d[j]=Integer.toString(c[j]);
				    	 
				    	 
				    	 answer=answer+d[j];
				    	}
					int k=0;
					while(answer.charAt(k)=='0'){
						answer=answer.substring(1,answer.length());
					}
					
				
					
				}
				if(inverseanswer.equals("-1")){
					 for(i =0 ; i <= num1len-1; i++) { 
				        c[i] = b[i] - a[i] - borrow; 
				        if(c[i] >= 0) 
				            borrow = 0; 
				        else {  
				            c[i] = c[i] + 10; 
				            borrow = 1; 
				        } 
				    } 
					for(j=num1len - 1; j >= 0; j--){
				    	 
				    	 d[j]=Integer.toString(c[j]);
				    	 
				    	 
				    	 answer=answer+d[j];
				    	}
					int k=0;
					while(answer.charAt(k)=='0'){
						answer=answer.substring(1,answer.length());
						
					}
					answer="-"+answer;
				}
			}
		}
				

		if (num1.charAt(0) != '-' && num2.charAt(0) == '-'){
			
			IOperation operation = new Addition();
			answer = operation.perform(num1, num2.substring(1, num2.length()));   
			    	
			}
        if (num1.charAt(0) == '-' && num2.charAt(0) != '-'){
			
			IOperation operation = new Addition();
			answer ="-"+operation.perform(num2, num1.substring(1, num1.length()));   
			    	
			}
        if (num1.charAt(0) == '-' && num2.charAt(0) == '-'){
			
			IOperation operation = new Subtraction();
			answer =operation.perform(num2.substring(1, num2.length()),num1.substring(1, num1.length()) );   
			    	
			}
		
		return answer;
}
}