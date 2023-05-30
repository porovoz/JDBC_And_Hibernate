import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee1 = new Employee("Anton", "Sinitcin", "male", 38, 2);
        employeeDAO.create(employee1);

        System.out.println(employeeDAO.readById(2));

        List<Employee> employeeList = employeeDAO.readAll();
        employeeList.forEach(System.out::println);

        Employee employee2 = new Employee(9, "Andrey", "Petrov", "male", 40, 1);
        employeeDAO.updateEmployee(employee2);

        employeeDAO.deleteEmployee(employee2);
    }
}
