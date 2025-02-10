package OOP;

public class Car {

    private String model;
    private int year;
   

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void disPlayDetails() {
        System.out.println("Car Model :" + model + ", Year :" + year );
    }
}
