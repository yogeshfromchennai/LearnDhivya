
public class ClassDemo {

	public ClassDemo() {
		System.out.println("default constructor is called");
	}
	
	public ClassDemo(String s){
		
		System.out.println("one param constructor is called");
		
	}

	public static void main(String[] args) {

		ClassDemo cd = new ClassDemo();
		//ClassDemo cd2 = new ClassDemo("Divya");
	}

}
