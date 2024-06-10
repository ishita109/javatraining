package member;

public class MainClass {
	
	public static void main(String args[]) {

		Employee emp = new Employee("Akash", "9090909090", "Ahmedabad",34,85000,"JAVA");
		Manager m1 = new Manager("Ayush", "9898989898", "Delhi", 45,60000,"Python");
		
		System.out.println(emp);
		System.out.println(m1);
	}
}