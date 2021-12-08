import java.util.Scanner;

public class myclass 
{
	
		static int mymethod1(int a, int b)
		{
			System.out.println("My method");
			 int c = a + b;
			 System.out.println("My method1 result " + c);
			 return c;
			
		}
		static int mymethod2(int a, int b)
		{
			System.out.println("My method");
			 int c = a * b;
			 System.out.println("My method2 result " + c);
			 System.out.println("\n");
			 return c;
			
		}
		public static void main(String[] args) 
		{
			
			Scanner a = new Scanner(System.in);
			System.out.println("Enter number for a\n");
			System.out.println("\n");
			int num1 = a.nextInt();
			Scanner b = new Scanner(System.in);
			System.out.println("Enter number for b");
			System.out.println("\n");
			int num2 = b.nextInt();
			mymethod1(num1,num2);
			mymethod2(num1,num2);
		}

}
