package BigintegerOperationClassDesign;

public class Comparison implements IOperation{

	public String perform(String num1, String num2) {
		int num1len=num1.length();
		int num2len=num2.length();
		if(num1len<num2len){
			
			num1len=num2len;
		}
		int a[]=new int[num1len];
		int b[]=new int[num1len];
		int i,j;
		String answer="";
		
		
		
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-'){
			if (num1.length() > num2.length()){
				answer="1";
			}
			if (num1.length() < num2.length()){
				answer="-1";
			}
			if (num1.length() == num2.length()){
				for (i = 0; i < num1.length(); ++i) {
					int n1 = num1.charAt(i);
					int n2 = num2.charAt(i);
				if(n1==n2){
					answer="0";
				}
				if(n1>n2){
					answer="1";
					break;
				}
				if(n1<n2){
					answer="-1";
					break;
				}
			}
			
			}
		}
		if (num1.charAt(0) == '-' && num2.charAt(0) != '-'){
			
					answer="-1";
				
			
		}
		if (num1.charAt(0) != '-' && num2.charAt(0) == '-'){
			
			answer="1";
		
	
}
		if (num1.charAt(0) == '-' && num2.charAt(0) == '-'){
			if (num1.length() > num2.length()){
				answer="-1";
			}
			if (num1.length() < num2.length()){
				answer="1";
			}
			if (num1.length() == num2.length()){
				for (i = 1; i < num1.length(); ++i) {
					int n1 = num1.charAt(i);
					int n2 = num2.charAt(i);
				if(n1==n2){
					answer="0";
				}
				if(n1>n2){
					answer="-1";
					break;
				}
				if(n1<n2){
					answer="1";
					break;
				}
			}
			
		}
		}
		return answer;
	}
	public static String com(String a, String b) {
		if (a.length() != b.length())
			return (a.length() > b.length()) ? ">" : "<";
		int i;
		for (i = 0; i < a.length(); ++i) {
			int n1 = a.charAt(i) - '0';
			int n2 = b.charAt(i) - '0';
			if (n1 > n2)
				return ">";
			if (n1 < n2)
				return "<";
		}
		return "=";
	}

		}
