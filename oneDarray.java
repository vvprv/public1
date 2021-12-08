
public class oneDarray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] array1 = new int[3][3];
		int i,j;
		int x=10;
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				array1[i][j]= 99;
				System.out.println(array1[i][j]);
			}
		}
		if (x == 1)
		{
			System.out.println("I am in IF");
		}
		else
		{
			System.out.println("I am in ELSE");
		}
	}

}
