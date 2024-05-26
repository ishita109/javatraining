package employeeData;

import java.util.Scanner;

public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeData ed = new EmployeeData();
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter designation");
		String designation=sc.next();
		
		System.out.println("enter salary");
		int salary=sc.nextInt();
		
		ed.setName(name);
		ed.setDesignation(designation);
		ed.setBasicSalary(salary);
		
		
		System.out.println(ed);
		
		EmployeeData ed2 = new EmployeeData("ishita","HR",50000);
		
		System.out.println(ed2);
		
	}

}