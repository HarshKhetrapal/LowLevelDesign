package designpatterns.proxydesignpattern;

public interface IEmployeeDao {
    public Employee createEmployee(int id, String name);
    public void deleteEmployee(String name);
    public void getEmployee(String name);
}
