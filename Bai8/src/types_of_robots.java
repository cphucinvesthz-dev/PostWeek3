class DroneRobot extends Robot implements Flyable, GPS, ElectronicDevice {
    public DroneRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(getModelName() + " performing main task.");
    }
    public void fly(){
        System.out.println(getModelName() + " flying");
    }
    @Override
    public void getCoordinates() {
        System.out.println(getModelName() + " getting coordinates");
    }

    @Override
    public void turnOn() {
        System.out.println(getModelName() + " electronic device turned on");
    }
}


class FishRobot extends Robot implements Swimmable {
    public FishRobot(int id, String modelName) {
        super(id, modelName);
    }
    @Override
    public void performMainTask() {
        System.out.println(getModelName() + " performing main task");
    }
    @Override
    public void swim() {
        System.out.println(getModelName() + " swimming");
    }
}


class AmphibiousRobot extends Robot implements Flyable, Swimmable, GPS {
    public AmphibiousRobot(int id, String modelName) {
        super(id, modelName);
    }
    @Override
    public void performMainTask() {
        System.out.println(getModelName() + " performing main task");
    }
    @Override
    public void fly() {
        System.out.println(getModelName() + " flying");
    }
    @Override
    public void swim() {
        System.out.println(getModelName() + " swimming");
    }
    @Override
    public void getCoordinates() {
        System.out.println(getModelName() + " getting coordinates");
    }
}