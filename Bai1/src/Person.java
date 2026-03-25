public class Person{
    String name;
    String dob;
    public Person(String name){
        System.out.println("1. Person is created");
    }
}
class Employee extends Person{
    double salary;
    public Employee(){
        super("Working");
        System.out.println("2. Employee is created");
    }
}
class Manager extends Employee {
    String department;
    public Manager(){
        System.out.println("3. Manager is created");
    }
}