public class Employee {
	//Instance Variables
	private String firstName;
	private String lastName;
	private double salary;
	private String department;
	
	//Constructor
	//Default = null, null, 0, null
	public Employee(String firstName, String lastName, double salary, String department) {
		if (firstName == null) {
			this.firstName = "Ryan";
		} else {
			this.firstName = firstName;
		}
		if (lastName == null) {
			this.lastName = "Wilson";
		} else {
			this.lastName = lastName;
		}
		if (salary > 0.00) {
			this.salary = salary;
			
		} else {
			this.salary = 123456.78;
		}
		if (department == null) {
			this.department = "Computer Science";
		} else {
			this.department = department;
		}
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//requestRaise
	public void requestRaise(double raise) {
		if (raise > 0.00) {
			double choice = Math.random();
			if (choice >= 0.75) {
				this.salary = salary + raise;
				System.out.println("Raise granted. Your salary is now " + salary);
			} else {
				System.out.println("Raise denied. Your salary is now " + salary);
			}
		} else {
			System.out.println("Raise amount invalid.");
		}
	}
	
	//toString
	@Override
	public String toString() {
		String result = "{ Name: " + firstName + " " + lastName + ", Salary: " + salary + ", Department: " + department + " }";
		return result;
	}
}