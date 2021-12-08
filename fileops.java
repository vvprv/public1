import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileops {

	public static void main(String[] args) throws Exception
	{

		File file = new File ("C:\\Users\\rames\\Desktop\\Java\\inputfile.txt");
		BufferedReader fl = new BufferedReader (new FileReader(file));
		String st;
		while ((st = fl.readLine()) != null)
			System.out.println(st);

	}

}
