package daytwelve;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
	
	void Display (List<String> list) {
		ListIterator<String> obj = list.listIterator();
		while(obj.hasNext()) {
			System.out.println("Elements is: "+ obj.next());
		}
			}

	public static void main(String[] args) {
		List<String> obj1 = new LinkedList<>();
		obj1.add("prine");
		obj1.add("komal");
		obj1.add("Rahul");
		
		App obj3 = new App();
	  obj3.Display(obj1);
		

	}

}
