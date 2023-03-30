import java.util.Scanner;
class BankDriver 
	{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter accountHoldername");
		String name=sc.nextLine();
		System.out.println("enter a accountnumber");
		long accountno=sc.nextLong();
		System.out.println("enter a balance");
		double bal=sc.nextDouble();
		System.out.println("enter gpay");
		int pswd1=sc.nextInt();
		System.out.println("enter gpayupi");
		int pswd2=sc.nextInt();
		System.out.println("enter ppay");
		int pswd3=sc.nextInt();
		System.out.println("enter ppay upi");
		int pswd4=sc.nextInt();

		BankDriver b1=new BankDriver(name,accountno,bal,pswd1,pswd2,pswd3,pswd3,pswd4);
		for(;;)
		{
		System.out.println("1.google pay 2.phonepay 3.exit");
		int option=sc.nextInt();
		if(option==1)
			{
			b1.gpay();
			}
			else if(option==2)
				b1.ppay();
			else
				System.exit(0);
			}
	}
}
