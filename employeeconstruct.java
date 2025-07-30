package basic;

class Employee {
   
    String name;
    String id;
    double salary;

    
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
public class employeeconstructor {

	public static void main(String[] args) {
		 Employee emp1 = new Employee("Nikhil Saju","CS176", 50000);
	        Employee emp2 = new Employee("Joubert Jose", "CS142", 2000);

	        
	        emp1.displayEmployee();
	        emp2.displayEmployee();
	}
}
}


