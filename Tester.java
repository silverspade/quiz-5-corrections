public class Tester {
	public static void main(String[] args) {
		Employee ryan = new Employee(null, null, 0, null);
		System.out.println(ryan.toString());
		Employee sue = new Employee("Sue", "Doe", 123456789.90, "English");
		System.out.println(sue.toString());
		ryan.requestRaise(-100);
		System.out.println(ryan.toString());
	}
}