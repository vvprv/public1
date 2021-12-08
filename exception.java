public class exception {
	int x;
	int y;
	float z;
	
	exception()
	{
		x = 10;
		y=  0;
	}
		public void method4()
	{
		try {
			z=x/y;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("Division exception by a fool");
		}
	
	}
	public static void main(String[] args)
	{
		exception obj = new exception();

		obj.method4();
		System.out.println("The div is " + " " + obj.z);
	}

}
