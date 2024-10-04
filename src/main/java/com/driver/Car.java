package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears  = gears;
        this.isManual = isManual;
        this.seats = seats;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }
    public boolean getSeats()
    {
        return seats;
    }

    public boolean isManual()
    {
        return isManual;
    }
    
    public boolean isManual()
    {
        return isManual;
    }
    public int getGears()
    {
        return gears;
    }
    public int getDoors()
    {
        return doors;
    }
    public String getType()
    {
        return type;
    }

    public int getWheels()
    {
        return wheels;
    }
    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
