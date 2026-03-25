public abstract class Room{
    private double basePrice; 

    public Room(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public abstract double getBill(int day);
}
class Standard extends Room{
    public Standard(){
        super(500_000);
    }
    @Override
    public double getBill(int day){
        if (day <= 3 && day >= 0){
            return getBasePrice() * day;
        } else {return getBasePrice() * day * 0.95;}
    }
}
class VIP extends Room {
    public VIP(){
        super(2_000_000);
    }
    @Override
    public double getBill(int day){
        return getBasePrice() * day;
    }
} 