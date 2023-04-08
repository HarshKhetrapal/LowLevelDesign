package designpatterns.proxydesignpattern;

public class EmployeeDao implements IEmployeeDao {
    @Override
    public Employee createEmployee(int id, String name) {
        System.out.println("Creating Employee in Employee Table");
        return new Employee(id, name);
    }

    @Override
    public void deleteEmployee(String name) {
        System.out.println("Deleting Employee in Employee Table");
    }

    @Override
    public void getEmployee(String name) {
        System.out.println("Getting Employee in Employee Table");
    }
}
