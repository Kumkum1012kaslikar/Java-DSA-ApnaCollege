package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Shraddha"); // parametrized
        Student s2 = new Student(); // non-parametrized

        // copy constructor
        Student s3 = new Student();
        s3.name = "Kumkum";
        s3.roll = 102;
        s3.pass = "abcd";
        s3.marks[0] = 100;
        s3.marks[1] = 90;
        s3.marks[2] = 80;

        Student s4 = new Student(s3); // copy s3
        s4.pass = "xyz";
        s3.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    // shallow copy constructor
    /*
     * Student(Student s3){
     * marks=new int[3];
     * this.name=s3.name;
     * this.roll=s3.roll;
     * this.marks=s3.marks;
     * }
     */

    // deep copy constructor
    Student(Student s3) {
        marks = new int[3];
        this.name = s3.name;
        this.roll = s3.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s3.marks[i];
        }
    }

    Student(String name) {
        this.name = name;
    }

    Student() {
        System.out.println("Constructor is called");
    }
}
