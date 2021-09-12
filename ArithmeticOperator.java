package MyPack;

import java.util.Scanner;

public class ArithmeticOperator {
	
	private static String str;

	public static void main(String[] args)
	{
		int a,b,c;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1");
		a=sc.nextInt(); // first value will be accepted in string format and later nextInt() will converted in to integer format
		System.out.println("Enter No2");
		b=sc.nextInt();
		System.out.println("+.Add \n -.Sub\n*.Multiply\n//.Division");
		System.out.println("Enter Your Operator +,-,*,\\");
		str=sc.next(); // it will accept the value in string
		ch=str.charAt(0);
		switch(ch)
		{
		case '+':
			c=a+b;
			System.out.println("Addition is "+c);
			break;
		case '-':
			c=a-b;
			System.out.println("substraction is "+c);
			break;
		case '*':
			c=a*b;
			System.out.println("Multiplication is "+c);
			break;
		case '/':
			c=a/b;
			System.out.println("Division is "+c);
			break;
		default:
			break;
				
		}
		
	}

}
