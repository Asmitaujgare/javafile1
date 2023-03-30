class  Driver
{
	public static void main(String[] args) 
	Scanner sc=new Scanner(System.in);
	Hotel h=new Hotel();
	for(;;)
	{
		System.out.println("1.Add order 2. Cancle order 3. Dis;ay 3.Exit");
		switch(sc.next())
		{
			case 1:
			{
              System.out.println("1.Veg 2.Nonveg")
			  switch(sc.next())
				{
				  case 1:
					{
					  System.out.println("enter food");
					  String name=sc.next();
					  System.out.printn("enter qty");

					  int qty=sc.nextInt();
					  Veg v=new Veg(name,qty);
					  h.addFood(v);
                      
					}
					break;
					case 2:
					{
						 System.out.println("enter food");
					  String name=sc.next();
					  System.out.printn("enter qty");

					  int qty=sc.nextInt();
					  Nonveg nv=new Nonveg(name,qty);
					  h.addFood(nv);


					}
					break;
				
				}
			}
			break;
			case 2:
			{
             
			}
			break;
			case 3:
			{

			}
			break;
			case 4:
			{
				System.exit(0);
			}
			break;

	
	}
}
