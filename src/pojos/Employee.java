package pojos;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(){}

    public Employee( String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
