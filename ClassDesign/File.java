package ClassDesign;

import java.util.Scanner;

public class File extends Document{
	private String pathname;

	public File(String textMsg, String pathDes) 
	{
		super(textMsg);
		pathname = pathDes;
	}

	public String getPathname()
	{
		return pathname;
	}

	public String getText() 
	{
		return super.toString();
	}

	public void setPathname(String newPath)
	{
		pathname = newPath;
	}

	public String toString() 
	{
		return "path" + ": " + pathname+"\n"+super.toString();
	}

	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if (docObject.toString().indexOf(keyword, 0) >= 0)
			return true;

		return false;
	}

	public static void main(String args[]) 
	{   
		Scanner keyboard = new Scanner(System.in);
		String mode = keyboard.nextLine();
		String type = keyboard.nextLine();
		if(mode.equals("A")||mode.equals("a")){
			if(type.equals("Document")||type.equals("document")){
				String text = keyboard.nextLine();
				System.out.println(text);
			}
			if(type.equals("Email")||type.equals("email")){
				String name1 = keyboard.nextLine();
				String name2 = keyboard.nextLine();
				String emailtitle = keyboard.nextLine();
				String text = keyboard.nextLine();
				Document email = new Email(text, name1, name2, emailtitle);
				System.out.println(email.toString());
			}
			if(type.equals("File")||type.equals("file")){
				String datapath = keyboard.nextLine();
				String text = keyboard.nextLine();
				Document file = new File(text, datapath);
				System.out.println(file.toString());
				
			}
		}
		if(mode.equals("B")||mode.equals("b")){
			if(type.equals("Document")||type.equals("document")){
				String text = ' '+keyboard.nextLine()+' ';
				String compare = keyboard.nextLine();
				String eachcompare[]=compare.split(" ");
				String judge = null;
				int i=0,j=compare.length(),k,x;
				while(j>0){
					j=j-eachcompare[i].length()-1;
					i=i+1;
				}
				for (k=0;k<i;k++){
					for(x=0;x<text.length();x++){
				if(text.indexOf(eachcompare[k],x)>=0&&
				   (text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==')'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
				   (text.charAt(text.indexOf(eachcompare[k],x)-1)==')'||text.charAt(text.indexOf(eachcompare[k],x)-1)=='('||text.charAt(text.indexOf(eachcompare[k],x)-1)==' ')){
					judge="true";
					break;
				}
				else{
					judge="false";
				}
				}
					}
				if(judge.equals("true")){
					System.out.println(("true"));
				}
				else{
					System.out.println(("false"));
				}
		    }
		
		if(type.equals("Email")||type.equals("email")){
			String name1 = ' '+keyboard.nextLine()+' ';
			String name2 = ' '+keyboard.nextLine()+' ';
			String emailtitle = ' '+keyboard.nextLine()+' ';
			String text = ' '+keyboard.nextLine()+' ';
			String compare = keyboard.nextLine();
			String eachcompare[]=compare.split(" ");
			String judge = null;
			int i=0,j=compare.length(),k,x;
			while(j>0){
				j=j-eachcompare[i].length()-1;
				i=i+1;
			}
			for (k=0;k<i;k++){
				for(x=0;x<text.length();x++){
			if((text.indexOf(eachcompare[k],x)>=0&&
					(text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==')'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='('||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
				(text.charAt(text.indexOf(eachcompare[k],x)-1)==')'||text.charAt(text.indexOf(eachcompare[k],x)-1)=='('||text.charAt(text.indexOf(eachcompare[k],x)-1)==' '))||
				(emailtitle.indexOf(eachcompare[k],x)>=0&&
				(emailtitle.charAt(emailtitle.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||emailtitle.charAt(emailtitle.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||emailtitle.charAt(emailtitle.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
				emailtitle.charAt(emailtitle.indexOf(eachcompare[k],x)-1)==' ')||(name2.indexOf(eachcompare[k],x)>=0&&
				(name2.charAt(name2.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||name2.charAt(name2.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||name2.charAt(name2.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
				name2.charAt(name2.indexOf(eachcompare[k],x)-1)==' ')||(name1.indexOf(eachcompare[k],x)>0
				&&(name1.charAt(name1.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||name1.charAt(name1.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||name1.charAt(name1.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
				name1.charAt(name1.indexOf(eachcompare[k],x)-1)==' ')||
			   eachcompare[k].equals("To")||eachcompare[k].equals("From")||
			   eachcompare[k].equals("Title")){
				judge="true";
				break;
			}
			else{
				judge="false";
			}
				}
			
			}
			if(judge.equals("true")){
				System.out.println(("true"));
			}
			else{
				System.out.println(("false"));
			}
				
			}
		if(type.equals("File")||type.equals("file")){
			String datapath = ' '+keyboard.nextLine()+' ';
			String text = ' '+keyboard.nextLine()+' ';
			String compare = keyboard.nextLine();
			String eachcompare[]=compare.split(" ");
			String judge = null;
			int i=0,j=compare.length(),k,x;
			while(j>0){
				j=j-eachcompare[i].length()-1;
				i=i+1;
				}
				for (k=0;k<i;k++){
					for(x=0;x<eachcompare[k].length();x++){
					if((text.indexOf(eachcompare[k],x)>=0&&
							(text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==')'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||text.charAt(text.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!')&&
						(text.charAt(text.indexOf(eachcompare[k],x)-1)==')'||text.charAt(text.indexOf(eachcompare[k],x)-1)=='('||text.charAt(text.indexOf(eachcompare[k],x)-1)==' '))||
						(datapath.indexOf(eachcompare[k],x)>=0&&
						 (datapath.charAt(datapath.indexOf(eachcompare[k],x)+eachcompare[k].length())==' '||datapath.charAt(datapath.indexOf(eachcompare[k],x)+eachcompare[k].length())=='.'||datapath.charAt(datapath.indexOf(eachcompare[k],x)+eachcompare[k].length())=='!'||datapath.charAt(datapath.indexOf(eachcompare[k],x)+eachcompare[k].length())==':'||datapath.charAt(datapath.indexOf(eachcompare[k])+eachcompare[k].length())=='\\')&&
						 (datapath.charAt(datapath.indexOf(eachcompare[k],x)-1)==' ')||datapath.charAt(datapath.indexOf(eachcompare[k],x)-1)=='.'||datapath.charAt(datapath.indexOf(eachcompare[k],x)-1)=='!'||datapath.charAt(datapath.indexOf(eachcompare[k],x)-1)=='\\'||datapath.charAt(datapath.indexOf(eachcompare[k],x)-1)==':')||
					   eachcompare[k].equals("Path")){
						judge="true";
						break;
					}
					else{
						judge="false";
					}
				}
					
					}
					if(judge.equals("true")){
						System.out.println(("true"));
					}
					else{
						System.out.println(("false"));
					}
			}
		}
	 if(mode.equals("C")||mode.equals("c")){
		 if(type.equals("Document")||type.equals("document")){
			 String text = keyboard.nextLine();
			 String change=keyboard.nextLine();
			 String changeget=keyboard.nextLine();
			 if(change.equals("text")){
				 text=changeget;
			 }
			 System.out.println(text);
		 }
		 if(type.equals("Email")||type.equals("email")){
			    String name1 = keyboard.nextLine();
				String name2 = keyboard.nextLine();
				String emailtitle = keyboard.nextLine();
				String text = keyboard.nextLine();
				String change=keyboard.nextLine();
				String changeget=keyboard.nextLine();
				if(change.equals("text")){
					text=changeget;
				}
				if(change.equals("sender")){
					name1=changeget;
				}
				if(change.equals("recipient")){
					name2=changeget;
				}
				if(change.equals("title")){
					emailtitle=changeget;
				}
				Document email = new Email(text, name1, name2, emailtitle);
				System.out.println(email.toString());
		 }
		 if(type.equals("File")||type.equals("file")){
			    String datapath = keyboard.nextLine();
				String text = keyboard.nextLine();
				String change=keyboard.nextLine();
				String changeget=keyboard.nextLine();
				if(change.equals("text")){
					text=changeget;
				}
				if(change.equals("pathname")){
					datapath=changeget;
				}
				Document file = new File(text, datapath);
				System.out.println(file.toString());
		 }
	 }
}
	}

