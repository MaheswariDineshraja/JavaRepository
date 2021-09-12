package MyPack;
//in do while loop first execute the body of the do loop and then condition will evaluate
//if the condition is true it will do loop
public class DoWhileDemo {

	public static void main(String[] args) 
	{
		int i=11;
		do
		{
			System.out.println(i);
			i++; // post incrementation, first vale will be print and then it will increment
		}
		while(i<=10);		

	}

}
