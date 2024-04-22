import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Display(ArrayList<Employee> arr) {
        System.out.println("---------------------------------");
        System.out.format("%-25s %-5s %-5s %-20s %-5s\n", "NAME", "AGE", "CODE", "DEPARTMENT", "SALARY");
        for (Employee each : arr) {
            each.Output();
        }
        System.out.println("---------------------------------");
    }

    public static void Add(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.print("Nhap code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap bo phan: ");
        String department = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        double salaryRate = sc.nextDouble();
        sc.nextLine();
        arr.add(new Employee(id, name, age, code, department, salaryRate));
    }

    public static void Delete(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nguoi dung muon xoa: ");
        String str = sc.nextLine();
        if (arr.removeIf(employee -> (employee.getName().equalsIgnoreCase(str)))) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa that bai");
        }
        ;
    }

    public static void displayMenu(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("+-----------------------------+");
        System.out.println("| EMPLOYEES MANAGEMENT SYSTEM |");
        System.out.println("+-----------------------------+");
        System.out.println("| 1. Add new employee         |");
        System.out.println("| 2. Delete employee          |");
        System.out.println("| 3. Display employee         |");
        System.out.println("| 4. Exit                     |");
        System.out.println("+-----------------------------+");
        System.out.print("Enter your choice: ");
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Add(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 2:
                    Delete(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 3:
                    Display(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Enter your choice: ");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Le Dinh Tu", 20, 100, "IT", 1.2));
        employees.add(new Employee(2, "Le Thi Ly", 21, 101, "Marketing", 1.3));
        employees.add(new Employee(3, "Nguyen Thi Hong Nhung", 22, 102, "Accounting", 1.4));
        employees.add(new Employee(4, "Pham Quynh Anh", 30, 103, "Client Service", 1.2));
        employees.add(new Employee(5, "Ha Quang Dung", 25, 104, "Tester", 1.5));
        employees.add(new Employee(6, "Do Huu Tuan", 24, 105, "Human Resource", 1.6));
        employees.add(new Employee(7, "Do Huu Thinh", 19, 106, "Media", 1.1));
        employees.add(new Employee(8, "Nguyen Thi Thom", 18, 107, "Business Analyst", 1.7));
        employees.add(new Employee(9, "Pham Van Quy", 13, 108, "Data Analyst", 1.8));
        employees.add(new Employee(10, "Hoang Thanh Thuy", 24, 109, "Account Manager", 2));
        displayMenu(employees);
    }
}