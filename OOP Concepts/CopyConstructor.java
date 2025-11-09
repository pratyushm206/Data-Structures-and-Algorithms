public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pratyush Mishra";
        s1.roll = 100;
        s1.password = "abcdef";
        s1.marks[0] = 100;
        s1.marks[1] = 85;
        s1.marks[2] = 92;

        Student s2 = new Student(s1); // Shallow copy
        s2.password = "xyz";
        s2.marks[1] = 99; // Changing s2's marks[1] will affect s1 too!

        System.out.println("== s1 ==");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll: " + s1.roll);
        System.out.println("Password: " + s1.password);
        System.out.print("Marks: ");
        for (int mark : s1.marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\n\n== s2 ==");
        System.out.println("Name: " + s2.name);
        System.out.println("Roll: " + s2.roll);
        System.out.println("Password: " + s2.password);
        System.out.print("Marks: ");
        for (int mark : s2.marks) {
            System.out.print(mark + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Default constructor
    Student() {
        marks = new int[3]; // Initialize the array
    }

    // Shallow copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = s1.marks; // Shallow copy
    }
}
