package employeeData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBuffer {
	public static void main(String[] args) {
		int Salary;
		String name;
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 
		 name= br.readLine();
		 
		 System.out.println("Enter Salary");
	
		 Salary = Integer.parseInt(br.readLine());
				
	     System.out.println(name + "" + salary);
	}catch{Exception e){
	}
}