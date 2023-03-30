import java.util.Scanner;
class Str14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s1=sc.nextLine();
		System.out.println("enterd string is:"+s1);
		s1=s1.toLowerCase();
		System.out.println("after converting to LowerCse:"+s1);
		int count=0;
		for (int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("count of vowels in string is:"+count);
	}
}

