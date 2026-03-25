public abstract class Employee{
    String name;
    String birthdate;
    String id;
    public Employee(String name, String birthdate, String id){
        this.name = name;
        this.birthdate = birthdate;
        this.id = id;
    }
    public abstract double calculateSalary();
    public abstract String getEmployeeType();
    public String getName(){
        return name;
    }
}
class FullTimeEmployee extends Employee{
    double baseSalary;
    double bonus;
    double penalty;
    public FullTimeEmployee(String name, String birthdate, String id, double baseSalary, double bonus, double penalty){
        super(name, birthdate, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + (bonus - penalty);
    }
    @Override
    public String getEmployeeType() {
        return "Full-time";
    }
}
class PartTimeEmployee extends Employee{
    double workingHours;
    double hourlyRate;
    public PartTimeEmployee(String name, String birthdate, String id, double workingHours, double hourlyRate){
        super(name, birthdate, id);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Part-time";
    }
}
