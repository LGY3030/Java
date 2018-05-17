
package Hw1;

public class PigLatin {
	
	public static void main(String[] args) {
		
		int i=args.length;
        int j;
        for(j=0;j<i;j++){
	       
	        if(args[j].length()==1){
	        	
	        	System.out.print(args[j].toUpperCase()+"ay ");
	        }
	        else{
	        char v = Character.toLowerCase(args[j].charAt(0));

	        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
	        {
	        	char x = Character.toUpperCase(args[j].charAt(0));
	        	System.out.print(x + args[j].substring(1,args[j].length()) + "ay "); 
	        
	        }
	        else
	        {
	            String first = args[j].substring(0,1);
	            String slice = args[j].substring(2,args[j].length());
	            char x = Character.toUpperCase(args[j].charAt(1));
	            System.out.print( x + slice + first+ "ay ");
	        }
	        }
	        
	        }
	        
	}

}