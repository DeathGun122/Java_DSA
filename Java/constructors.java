public class constructors {
    public static void main(String[] args) {
        Student student1 = new Student("Ravi", 20, 3.8, true);
        Student student2 = new Student("John", 19, 3.5, false);

        System.out.println("Name: " + student1.name + ", Age: " + student1.age + ", GPA: " + student1.gpa + ", Enrolled: " + student1.isEnrolled);
        System.out.println("Name: " + student2.name + ", Age: " + student2.age + ", GPA: " + student2.gpa + ", Enrolled: " + student2.isEnrolled);

        student1.study();
        student2.study();
    }
}

class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
}