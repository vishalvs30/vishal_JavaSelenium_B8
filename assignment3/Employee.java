package assignment3;

public class Employee {
	 int empId = 101;           // instance variable
	    static String company = "ABC Corp"; // static variable

	    void showDetails() {
	        String name = "John"; // local variables
	        System.out.println("ID: " + empId);
	        System.out.println("Company: " + company);
	        System.out.println("Name: " + name);
	    }
	    public static void main(String[] args) {
			Employee emp = new Employee();
			emp.showDetails();
		}
}
