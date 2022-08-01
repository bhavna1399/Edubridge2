package employeemanagementsystem;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	/*
	 * Employee emp1=new Employee(101, "Bhavna", 22, "Developer", "CO", 30000);
	 * Employee emp2=new Employee(102, "Virat", 30, "Tester", "IT", 20000); Employee
	 * emp3=new Employee(103, "Alia", 28, "DevOps", "CO", 40000); Employee emp4=new
	 * Employee(104, "Neha", 24, "Developer", "IT", 50000); Employee emp5=new
	 * Employee(105, "shubhman", 22, "System Eng", "Admin", 25000);
	 */
	
	Scanner sc= new Scanner(System.in);
	boolean found=false;
	
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;
	double  bp, pf, gp, np;
    int days, month, year;
	private Scanner in;
	public EmployeeService() {
		/*
		 * empset.add(emp1); empset.add(emp2); empset.add(emp3); empset.add(emp4);
		 * empset.add(emp5);
		 */
		
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
			
		}
	}
	//view emp based on there id
	public void viewEmp(){
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
				
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter  new name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				System.out.println("Enter new designation");
				designation=sc.next();
				System.out.println("Enter new department");
				department=sc.next();
				emp.setName(name);
				emp.setSalary(sal);
				emp.setDesignation(designation);
				emp.setDepartment(department);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
    //delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
			   found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
		
	}
	//add emp
	public void addEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Designation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
	    sc.nextDouble();
	    System.out.println("Enter working no of days");
	    days=sc.nextInt();
	    
	    Employee emp=new Employee(id, name, age, designation, department, sal, days);
	    
	    empset.add(emp);
	    System.out.println(emp);
	    System.out.println("Employee added successfully");
	}
	// calculate salary
	public void calculateSal() {
		in = new Scanner(System.in);
		System.out.println("Enter empid:");
		bp=in.nextDouble();
		pf=10.5/100.0 * bp;
		gp=9.5/100.0 * bp;
		np= gp-pf;
		System.out.println("Provident fund:" +pf);
		System.out.println("Gross pay:" +gp);
		System.out.println("Net pay:" +np);
		
	}
	//calculate working no of days
	public void calculatedays() {
		in= new Scanner(System.in);
		System.out.println("Enter empid:");
		days=in.nextInt();
		month=days / 30;
		year= month / 12;
		System.out.println(" Working number of monthh:" +month);
		System.out.println(" Working number of year:" +year);
	
		
	}
}
