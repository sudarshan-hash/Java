package Practice;

public interface   Car {
    int speedLimit = 200;

    public abstract String Break();

    static String SpeedUP(int speed) {
        return "Speed is increse By" + speed;
    }

    default String ChangeGear() {
        return "Gear is change...";
    }

    static  String Battery(){
        return "Battery Mode";
    }
}

