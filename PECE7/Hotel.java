class  Hotel
{
	Food f;
	public void addFood(Food f)
	{
		if(this.f=null)
		{
       this.f=f;
	   System.out.println("order confirm");
	   System.out.println("plz wait");
		}
		else
		{
			System.out.println("Food already ordered")
		}

	}
	public void cancle order()
	{
		if(f!=null)
	{
		f=null;
		System.out.println("order cancle");
	}
	else
		{
			System.out.println("First order the food")
		}
	public void DisplayFood()
	{
		if(f!=null)
		{
		if(f instanceof Veg)
		{
			Veg v1=(Veg)f;
			System.out.println(v1.name);
			System.out.println(v1.qty);
		}
		elses
		{
			Nonveg nv=(Nonveg)f;
			System.out.println(nv.name);
			System.out.println(nv.qty);
		}
	}
	else
		{
			System.out.printn("First order the food");
		}

  }
	



	}


