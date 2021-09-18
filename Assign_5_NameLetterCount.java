package MyPack;

import java.util.Scanner;

public class Assign_5_NameLetterCount {
	
	public Assign_5_NameLetterCount()
	{
		String str;
		System.out.println("Enter Name ");
		Scanner sc = new Scanner (System.in);
		str=sc.nextLine(); //input is string so just keep it as next()
		
		int i=0, NoofAs=0;
		while(i<str.length())		
		{
			char ch=str.charAt(i);
			if(ch == 'A' || ch == 'a'){
				NoofAs++;
			}			
			i++;			
		}
		System.out.println("\na="+NoofAs);
		
	}

	public static void main(String[] args) {
		Assign_5_NameLetterCount A=new Assign_5_NameLetterCount();

	}

}
