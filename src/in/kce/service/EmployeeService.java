package in.kce.service;

import java.util.ArrayList;

import in.kce.bean.Employee;
import in.kce.dao.EmployeeDAO;

public class EmployeeService {

    EmployeeDAO employeeDAO = new EmployeeDAO();

    // Store Employee
    public boolean saveEmployee(int id, String name, String designation) {

        Employee employee = new Employee();
        employee.setEmpId(id);
        employee.setEmpName(name);
        employee.setDesignation(designation);

        return employeeDAO.saveEmployee(employee);
    }

    // Update Employee
    public boolean updateEmployee(int id, String name, String designation) {

        Employee employee = new Employee();
        employee.setEmpId(id);
        employee.setEmpName(name);
        employee.setDesignation(designation);

        return employeeDAO.updateEmployee(employee);
    }

    // Fetch One Employee
    public Employee getEmployee(int id) {

        return employeeDAO.getEmployee(id);
    }

    // Fetch All Employees
    public ArrayList<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();
    }

    // Delete Employee
    public boolean deleteEmployee(int id) {

        return employeeDAO.deleteEmployee(id);
    }
}