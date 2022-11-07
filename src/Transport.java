package ooo.part3. transport;

import oop.part1.ValidationUtils;

public abstract class Transport{

    private final String brand;
    private final String model;
    private final int manufacturingYear;
    private final String manufactureCountry;
    private final String color;
    private int maxSpeed;
    protected final int fuelYype;

    public Transport (String brand, String model, int manufactureCountry, String color,
                      int maxSpeed, int fuelYype){

        this.brand = ValidationUtils.validOrDefault (brand, "default");
        this.model = ValidationUtils.validOrDefault (model, "default");
        this.manufacturingYear = Math.max(manufacturingYear, 0);
        this.fuelType = checkFuelOrDefault( fuelType);
        setColor (color);
        setMaxSpeed (maxSpeed);

        public abstract void

        protected abstract String checFuelTypeOrDefault (String fuelType);

        public String getBrand() {return brand;}
        public String getModel () {return model;}
        public int getManufacturingYear() {return manufacturingYear;}
        public String getManufactureCountry () {return manufactureCountry;}
        public String getColor() { return color;}
        public void setColor (String color)}
this.color = ValidationUtils.validOrDefault (color,"white");

    public int getMaxSpeed () {return  maxSpeed;}
}