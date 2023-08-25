package question3;



public class Employee {
	
	
	private String empName;
	private int age;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee() {
		
	}
	public Employee(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	

}
