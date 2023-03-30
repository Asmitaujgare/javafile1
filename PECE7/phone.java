import java.util.Scanner;
class phone 
{
	Sim s;
	Scanner sc=new Scanner(System.in);
	String name;
	double price;
	phone(String s1,double p1)
	{
		name=s1;
		price=p1;
	}
	public void insertSim()
	{
		if(s==null)
		{
		System.out.println("enter a name");
		String name=sc.next();
		System.out.println("enter Simnumber");
		long simNumber=sc.nextLong();
		System.out.println("enter Contactnumber");
		long Contactnumber=sc.nextLong();
	    s=new Sim(name,simNumber,contactNumber);
		System.out.println("Sim inserted");
	}
	else
	{
		System.out.prinln("Already sim exist");

	}
	public void removeSim()
	{
		if(s!=null)
		{

		s=null;
		System.out.println("Sim removed");
		}
		else
		{
			System.out.println("first add sim");
		}
	}
	

	
	
	












	}
	
}
	

