public class Device {
    String name;
    int minAge;
    double minWeight;
    double minHeight;
    Manufactor manufactor;

    public boolean canVisitorPlayThisDevice(Visitor visitor){
        return visitor.age >= minAge && visitor.height >= minHeight && visitor.weight >= minWeight;
    }

    public Boolean isExtreme(){
        return false;
    }
}
