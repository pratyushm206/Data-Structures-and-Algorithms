public class Constructors {

    public static void main(String[] args) {
        
        // StudentV2 s1 = new StudentV2("Pratyush", 134); //For parameterized constructor
        StudentV2 s1 = new StudentV2();
        StudentV2 s2 = new StudentV2("Rohan", 25);
        StudentV2 s3 = new StudentV2("Pratyush Mishra");
        StudentV2 s4 = new StudentV2(100);

        System.out.println(s1.name + " - " + s1.roll);
        System.out.println(s2.name + " - " + s2.roll);
        System.out.println(s3.name + " - " + s3.roll);
        System.out.println(s4.name + " - " + s4.roll);
    
    }
        
}

class StudentV2 {
    String name = "Sujal";
    int roll = 123;

    StudentV2() { // Non-parameterized constructor
        System.out.println("Non-parameterized constructor");
        System.out.println("Your name is: " + name);
        System.out.println("Your roll number is: " + roll);
    }

    StudentV2(String name, int roll) { // Parameterized constructor
        System.out.println("Parameterized constructor");
        System.out.println("Your name is " + name);
        System.out.println("Roll number: " + roll);
    }

    StudentV2(String name) {
        this.name = name;
        System.out.println(name);
    }

    StudentV2(int roll) {
        this.roll = roll;
        System.out.println(roll);
    }
}
