import java.util.Scanner;
class St1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String[]s2=s.split(" ",3);
		System.out.println(s2);
		for ( int i=0;i<=s2.length-1;i++)
		{
			String s3=s2[i];
			System.out.println(s3);
		}
	}
 }
 
