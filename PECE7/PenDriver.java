import java.util.Scanner;
class PenDriver 
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PenStand color");
		String color=sc.next();
		System.out.println("Enter price of penstand");
		int price=sc.nextInt();
		PenStand p=new PenStand(color,price);
		for(;;)
		{
			System.out.println("1.Add pen 2.Remove pen 3.Attributes 4.Exit");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:p.addPen();
				break;
				case 2:p.removePen();
				break;
				case 3:p.p.printAttributes();
				break;
				case 4:System.exit(0);
		}
		}
	}
}