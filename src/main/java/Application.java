import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        Employee employee1 = new Employee("Anton", "Sinitcin", "male", 38, new City("Moscow"));
        employeeDAO.create(employee1);

        System.out.println(employeeDAO.readById(2));

        List<Employee> employeeList = employeeDAO.readAll();
        employeeList.forEach(System.out::println);

        Employee employee2 = new Employee(9, "Andrey", "Petrov", "male", 40, new City("St.-Petersburg"));
        employeeDAO.updateEmployee(employee2);

        employeeDAO.deleteEmployee(employee2);

        City city1 = new City("Tver");
        cityDAO.create(city1);

        System.out.println(cityDAO.readById(1));

        List<City> cityList = cityDAO.readAll();
        cityList.forEach(System.out::println);

        City city2 = new City("Kaluga");
        cityDAO.updateCity(city2);

        cityDAO.deleteCity(city2);
    }
}
