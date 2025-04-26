package car.example.constructor.injection;

public class Car {

    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayCarDetails(){
        System.out.println("CarDetails: "+specification.toString());
    }
}
