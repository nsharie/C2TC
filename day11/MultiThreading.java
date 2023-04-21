package dayeleven;
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Thread ID is "+ Thread.currentThread().getId() );// currentThread method
	}
	
}

class SketchBook extends Thread{
	public void run()
	{
		System.out.println("SkecthBook Thread ID is "+ Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Thread ID is "+ Thread.currentThread().getId());
	}
	
}


public class MultiThreading {

	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		
		SketchBook obj1 = new SketchBook();
		obj1.start();
		Chrome obj2 = new Chrome();
		obj2.start();
		
		for (int i=0; i <5;i++) {
		
			System.out.println("Main Thread ID is "+ Thread.currentThread().getId());
		}	
		// Concurrent
		
		}

}
