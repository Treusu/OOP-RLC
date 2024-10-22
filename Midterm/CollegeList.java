package OOP.Midterm;
/**
 * Cubia, Richard L.
 * BSIT-307
 */
import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, S for Student: ");
        char choice = scanner.next().charAt(0);

        Person person = null;

        switch (choice) {
            case 'e':
                person = new Employee();
                break;
            case 'f':
                person = new Faculty();
                break;
            case 's':
                person = new Student();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Type employee's name, contact number, salary, and department.");
        System.out.println("Press enter after every input");
        scanner.nextLine(); 
        person.setName(scanner.nextLine()); //name

        String contactNum = scanner.nextLine();
        person.setContactNum(contactNum); //number

        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            double salary = scanner.nextDouble(); //salary
            employee.setSalary(salary);

            scanner.nextLine();  //department
            String department = scanner.nextLine();
            employee.setDepartment(department);
            System.out.println("-------------------------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
        } else if (person instanceof Faculty) {
            Faculty faculty = (Faculty) person;
            System.out.print("Is the faculty member regular/tenured (Y/N)? ");
            char status = scanner.next().charAt(0);
            faculty.setStatus(status == 'Y');
            System.out.println("-------------------------------------------");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular/Tenured" : "Not Regular/Tenured"));
        } else if (person instanceof Student) {
            Student student = (Student) person;
            System.out.print("Enter enrolled program: ");
            scanner.nextLine();
            String program = scanner.nextLine();
            student.setProgram(program);

            System.out.print("Enter year level (1-4): ");
            int yearLevel = scanner.nextInt();
            student.setYearLevel(yearLevel);
            System.out.println("-------------------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        }
    }
}

class Person {
    private String name;
    private String contactNum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean status; // True for regular/tenured, False otherwise

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isRegular() {
        return status;
    }
}

class Student extends Person { //ignore, else marami mangyayari HAHAHA
    private String program;
}