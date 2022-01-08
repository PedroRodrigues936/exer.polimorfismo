package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list= new ArrayList<>();
		
		System.out.print("Enter the naumber of employee: ");
        int n = sc.nextInt();
		
		for ( int i=1; i<n; i++) {
			System.out.println("Employee #" + i + " data: ");
		    System.out.print("Outsourced (Y/N)? ");
		    char ch = sc.next().charAt(0);
		    System.out.print("name: ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    System.out.print("hours: ");
		    int hours = sc.nextInt(); 
		    System.out.print("Value per houers: ");
		    double valuePerHour = sc.nextDouble();
		    if(ch == 'y') {
		    	System.out.print("additional charge: ");
		    	double additionalCharge = sc.nextDouble();
		   list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
		    }
		    else {
		    	Employee emp = new Employee(name, hours, valuePerHour);
		    	list.add(emp);
		    }
		}
			System.out.println();
			System.out.println("PAYMENTS: ");
			for(Employee emp : list) {
			   System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			}
		
		sc.close();
	}

}
