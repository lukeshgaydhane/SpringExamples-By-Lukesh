package com.example.autowire.name;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayCarDetails(){
        System.out.println("CarDetails: "+specification.toString());
    }
}
