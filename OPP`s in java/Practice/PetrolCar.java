package Practice;

public interface PetrolCar {

   default   String petrol(){
        return "Car npw working in Petrol Mode";
    }
    String Stop();
}
