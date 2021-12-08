
public class methodobject {
	int a;
	int b;
	int c;
	public void addition(){
		c = a + b;
	}
	public static void main(String[] args) {
	
		System.out.println("writing something");
		methodobject obj = new methodobject();
		obj.a=10;
		obj.b=10;
		obj.addition();
		obj.addition();
		System.out.println(obj.c);

	}

}
