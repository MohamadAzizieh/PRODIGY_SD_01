package org.example;

public class Fahrenheit extends Temperature{

    public Fahrenheit(double value){
        this.value = value;
        this.type = 1;
    }

    @Override
    public double[] getConvertedValues(){
        double[] converted = new double[3];
        converted[0] = (this.value - 32) * 5/9; //to Celsius
        converted[1] = this.value; //to Fahrenheit
        converted[2] = (this.value - 32) * 5/9 + 273.15; //to Kelvin
        return converted;
    }

}
