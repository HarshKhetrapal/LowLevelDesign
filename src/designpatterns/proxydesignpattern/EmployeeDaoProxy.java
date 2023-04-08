package designpatterns.proxydesignpattern;

public class EmployeeDaoProxy implements IEmployeeDao{
    IEmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDao();
    }

    @Override
    public Employee createEmployee(int id, String name) {
        if(name.equals("ADMIN"))
            return employeeDao.createEmployee(id, name);
        else {
            System.out.println("Access Denied.");
            return null;
        }
    }

    @Override
    public void deleteEmployee(String name) {
        if(name.equals("ADMIN"))
            employeeDao.deleteEmployee(name);
        else {
            System.out.println("Access Denied.");
        }
    }

    @Override
    public void getEmployee(String name) {
        if(name.equals("ADMIN"))
            employeeDao.getEmployee(name);
        else {
            System.out.println("Access Denied.");
        }
    }
}
