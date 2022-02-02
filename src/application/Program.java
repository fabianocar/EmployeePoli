package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; n<i; i++) {
			System.out.println("Employee #"+ i +" data:");
			System.out.print("Outsourced (y/n)? ");
			char os = sc.nextLine().charAt(0);
			
				if ( os == 'y' ) {
					list.add(new OutsourceEmployee(null, null, null, null));
				}
				else {
					list.add(new Employee(null, null, null));
				}
		}
		
		sc.close();

	}

}
