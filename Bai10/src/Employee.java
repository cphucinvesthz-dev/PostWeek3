public class Employee{
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateBonus(){
        return 0.1 * baseSalary;
    }
    public String toString(){
        return name + " - Bonus: " + calculateBonus();
    }
}
class Developer extends Employee{
    private int overtimeHours;
    public Developer(String name, double baseSalary, int overtimeHours){
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateBonus(){
        return 0.1 * baseSalary + (overtimeHours * 200_000);
    }
}
class Tester extends Employee{
    private int bugsFound;
    public Tester(String name, double baseSalary, int bugsFound){
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }
    @Override
    public double calculateBonus(){
        return 0.1 * baseSalary + (bugsFound * 50_000);
    }
}