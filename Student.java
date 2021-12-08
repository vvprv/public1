
public class Student {

	int id;
	String name;
	String gender;
 	boolean updateProfile(String newname)
	{
		name=newname;
		return true;
	}
	public static void main(String[] args) {
	
		Student s = new Student();
		s.id=1000;
		s.name="Ramesh";
		s.gender="male";
		System.out.println(s.name);
		s.id=1000;
		s.name="Rameshrose";
		s.gender="male";
		System.out.println(s.name);
		s.updateProfile("RameshManju");
		}

	}

}
