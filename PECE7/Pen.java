class Pen 
{
	private String Name;//(g/s)
	 private int price;//(g/s)
	 Pen(String s1,int p)
	{
		 Name=s1;
		 price=p;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String s1)
	{
		Name=s1;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int p)
	{
		price=p;
	}
public void printAttributes()
{
 System.out.println(Name +"  "+price);
}


}
