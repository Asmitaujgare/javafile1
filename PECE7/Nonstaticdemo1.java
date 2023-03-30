class nonstaticdemo1 
{
	static int a=10;
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("nonstatic blocks");
}
public static void main(string[]args)
	{
	System.out.println("main method starts");
	nonstaticdemo1 n1=neww nonstaticdemo1();
	System.out.println("main method ends");
	}
}
}
