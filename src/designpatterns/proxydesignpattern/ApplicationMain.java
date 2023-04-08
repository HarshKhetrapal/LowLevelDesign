package designpatterns.proxydesignpattern;

public class ApplicationMain {
    public static void main(String[] args) {
        IEmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.createEmployee(1, "USER");
        employeeDao.createEmployee(1, "ADMIN");
    }
}
