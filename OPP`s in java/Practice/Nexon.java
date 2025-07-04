package Practice;

public class Nexon extends EVCar implements Car , PetrolCar{

    public String Break(){
        return "Break id press...";
    }
    public String Stop(){
        return "Car Stop";
    }
    String CangModeToBattery(){
        return super.Battery();
     //  return Car.Battery();
    }

}
