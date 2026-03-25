public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;

    public Robot(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
        this.batteryLevel = 0;
    }

    public String getModelName() {
        return modelName;
    }

    public void chargeBattery() {
        this.batteryLevel = 100;
        System.out.println(modelName + " battery charged to 100%");
    }

    public final void showIdentity() {
        System.out.println("ID: " + id + ", Model: " + modelName);
    }
    public abstract void performMainTask();
}


interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
interface GPS {
    void getCoordinates();
}
interface ElectronicDevice {
    void turnOn();
}