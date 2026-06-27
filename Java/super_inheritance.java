public class super_inheritance {
    public static void main(String[] args) {
        Person person = new Person("Ravi", "Patel");
        person.showName();

        CollegeStudent student = new CollegeStudent("Harry", "Potter", 3.8);
        student.showName();
        student.showGpa();

        Employee employee = new Employee("Hermione", "Granger", 100000);
        employee.showName();
        employee.showSalary();
    }
}
class Person{
    String first, last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

class CollegeStudent extends Person{

    double gpa;

    CollegeStudent(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s GPA is: " + this.gpa);
    }
}

class Employee extends Person{
    int salary;

    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is: " + this.salary);
    }
}