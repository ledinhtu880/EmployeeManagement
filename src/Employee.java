public class Employee {
    private int id;
    private String name;
    private int age;
    private int code;
    private String department;
    private double salaryRate;

    public Employee() {
    }

    public Employee(int id, String name, int age, int code, String department, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.code = code;
        this.department = department;
        this.salaryRate = salaryRate;
    }

    public void Output() {
        System.out.format("%-25s %-5s %-5s %-20s %-5s\n", name, age, code, department, salaryRate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getsalaryRate() {
        return salaryRate;
    }

    public void setsalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
}
