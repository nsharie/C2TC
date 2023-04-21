package daytwelve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionIndex {

	public static void main(String[] args) {
		List<String> obj1= new LinkedList<>();
		obj1.add("Amit");
		obj1.add("akash");
		obj1.add("Trupti");
		obj1.add("Guru");
		// search by string (name) and find out position 
		
		System.out.println(obj1);
		System.out.println(obj1.indexOf("amit")); 
		
		// wrong letter searching

	}

}
