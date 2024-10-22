package OOP.Midterm;
/**
 * Cubia, Richard L.
 * BSIT-307
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No name yet.";
        age = 0;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        Student student2 = new Student("John Doe", 20);
        System.out.println("");
        System.out.println("Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
    }
}