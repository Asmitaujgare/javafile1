import java.util.Scanner;
class PenStand 
{
	Pen p;
	Scanner sc=new Scanner(System.in);
	String Name;
	int price;
	PenStand(String s1,int p)
	{
		Name=s1;
		price=p;
	}
	public void addPen()
	{
		if(p==null)
		{
		System.out.println("enter a name of pen");
		String Name=sc.next();
		System.out.println("enter price");
		int price=sc.nextInt();
	    p=new Pen(Name,price);
		System.out.println("Pen added");
	}
	else
	{
		System.out.println("Already pen exist");
	}
	}
	public void removePen()
	{
		if(p!=null)
		{
			p=null;
		System.out.println("Pen removed");
		}
		else
		{
			System.out.println("first add pen");
		}
	}
	
}
	
	
	












	
