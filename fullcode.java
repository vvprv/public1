public class fullcode {
	int x;
	int y;
	float z;
	
	fullcode()
	{
		x = 10;
		y=  5;
	}
	public void method1()
	{
		z=x+y;
	}
	public void method2()
	{
		z=x-y;
	}
	public void method3()
	{
		z=x*y;
	}
	public void method4()
	{
		try {
			z=x/y;
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args)
	{
		fullcode obj = new fullcode();
	/*	System.out.println(obj.x);
		System.out.println(obj.y);
		obj.method1();
		System.out.println("The sum is " + " " + obj.z);
		obj.method2();
		System.out.println("The sub is " + " " + obj.z);
		obj.method3();
		System.out.println("The multi is " + " " + obj.z); */
		obj.method4();
		System.out.println("The div is " + " " + obj.z);
	}

}
