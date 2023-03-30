import java.util.Scanner;
class Str11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enteer String");
		String s1=sc.nectLine();
		String s2="";
		for(int i=s1.length()-1;i>=0; i--)
		{
			s2=s2+s1.charAt(i);
			}
			System.out.println(s2);
			System.out.println(s2.equals(s1));
	
 }
}
