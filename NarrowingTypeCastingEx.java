package MyPack;

public class NarrowingTypeCastingEx {

	public static void main(String[] args) {
		double d=166.66; // larger data types
		long l=(long)d;
		int i=(int)l;
		System.out.println("orig value of double data type"+d );	
		System.out.println("After converting into long data type "+l );	
		System.out.println("After converting long into int "+i );	

	}

}
