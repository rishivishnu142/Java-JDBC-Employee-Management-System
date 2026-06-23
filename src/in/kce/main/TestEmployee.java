package in.kce.main;

import java.util.Scanner;

import in.kce.bean.Employee;
import in.kce.service.EmployeeService;

public class TestEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        System.out.println("===== Employee Management System =====");
        System.out.println("1. Store Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Fetch One Employee");
        System.out.println("4. Fetch All Employees");
        System.out.println("5. Delete Employee");
        System.out.print("Enter your choice: ");

        int option = sc.nextInt();

        switch (option) {

        case 1:

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            boolean result = employeeService.saveEmployee(id, name, designation);

            if (result) {
                System.out.println("Employee Stored Successfully.");
            } else {
                System.out.println("Employee Not Stored.");
            }
            break;

        case 2:

            System.out.print("Enter Employee ID: ");
            id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter New Employee Name: ");
            name = sc.nextLine();

            System.out.print("Enter New Designation: ");
            designation = sc.nextLine();

            result = employeeService.updateEmployee(id, name, designation);

            if (result) {
                System.out.println("Employee Updated Successfully.");
            } else {
                System.out.println("Employee Update Failed.");
            }

            break;

        case 3:

            System.out.print("Enter Employee ID: ");
            id = sc.nextInt();

            Employee emp = employeeService.getEmployee(id);

            if (emp != null) {
                System.out.println("Employee ID : " + emp.getEmpId());
                System.out.println("Employee Name : " + emp.getEmpName());
                System.out.println("Designation : " + emp.getDesignation());
            } else {
                System.out.println("Employee Not Found.");
            }

            break;

        case 4:

            for (Employee e : employeeService.getAllEmployees()) {
                System.out.println("--------------------------------");
                System.out.println("Employee ID : " + e.getEmpId());
                System.out.println("Employee Name : " + e.getEmpName());
                System.out.println("Designation : " + e.getDesignation());
            }

            break;

        case 5:

            System.out.print("Enter Employee ID: ");
            id = sc.nextInt();

            result = employeeService.deleteEmployee(id);

            if (result) {
                System.out.println("Employee Deleted Successfully.");
            } else {
                System.out.println("Employee Delete Failed.");
            }

            break;

        default:
            System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}