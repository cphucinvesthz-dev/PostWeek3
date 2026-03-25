public class PartTimeStaff extends Staff{
    private double hourlyRate;
    private int workingHours;
    public PartTimeStaff(String id, String name, double hourlyRate, int workingHours){
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }
    @Override
    public double getPaymentAmount(){
        return workingHours * hourlyRate;
    }
    @Override
    public String toString(){
        return "PartTimeStaff " + getName() + " - Payment: " + getPaymentAmount();
    }
} 