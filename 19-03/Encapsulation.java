
/**
 * Encapsulation is hiding the data of this class from another. how? by making
 * variables private and creating getters and setters
 * 
 * 
 */
public class Encapsulation {

	private int emp_id;
	private String emp_name;
	private String emp_doj;

	public Encapsulation(int id, String name, String doj) {

		this.emp_id= id;
		this.emp_name= name;
		this.emp_doj= doj;
		
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(String emp_doj) {
		this.emp_doj = emp_doj;
	}

}
