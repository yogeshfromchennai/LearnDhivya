
public class Client {
	public static void main(String[] args) {

		Encapsulation e= new Encapsulation(1,"Dhivya","19/03");
		/*e.setEmp_id(1);
		e.setEmp_name("Dhivya");
		e.setEmp_doj("19/03/2017");*/
		
		Client c = new Client();
		c.printDetails(e);
		
		
	}
	
	public void printDetails(Encapsulation e){
		System.out.println(e.getEmp_id()+": " + e.getEmp_name()+":"+e.getEmp_doj());
		
	}
}
