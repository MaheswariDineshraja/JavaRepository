package MyPack;

import java.util.Scanner;

public class Assign_4_SentenceCount {

	public Assign_4_SentenceCount()
	{
		String str;
		System.out.println("Enter Sentence ");
		Scanner sc = new Scanner (System.in);
		str=sc.nextLine(); //input is string so just keep it as next()
		
		int i=0, upper=0, lower=0, number=0, special=0, space =0;
		while(i<str.length())		
		{
			char ch=str.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				upper++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				lower++;
			}
			else if (ch>= '0' && ch<='9'){
				number++;
			}
			else if (ch == ' ')
			{
				space++;
			}
			else
			{
				special++;
			}
			i++;			
		}
		System.out.println("\nlowercase letters:"+lower);
		System.out.println("\nUPPERCASE LETTERS:"+upper);
		System.out.println("\nNUMBERS:"+number);
		System.out.println("\nSpaces:"+space);
		System.out.println("\nSpecial characters:"+special);
	}

	public static void main(String[] args) 
	{
		Assign_4_SentenceCount c=new Assign_4_SentenceCount();	

	}

}
