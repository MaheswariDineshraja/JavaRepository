package MyPack;

import java.util.Scanner;

// accept country number and print the capital of the country
public class Capital {

	public static void main(String[] args)
	{
		int num; // it is the int variable, accept only number
		System.out.println("1.India\n2.Singapore\n3.srilanka\n4.Japan)");
		Scanner sc=new Scanner(System.in); // its is used to accept the input
		System.out.println("Enter your choice between 1 to 4");
		num=sc.nextInt(); //  its accepting value(user entry is string) and converting int to integer
		switch(num)
		{
		case 1: System.out.println("\nCapital of India is Delhi");
		break;
		case 2: System.out.println("\nCapital of Singapore is Singapore");
		break;
		case 3: System.out.println("\nCapital of SriLanka is Columbu");
		break;
		case 4: System.out.println("\nCapital of Japan is Tokyo");
		break;
		default:
			System.out.println("\nPlease check input");	
		}

	}

}
