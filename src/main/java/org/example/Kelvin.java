package org.example;

public class Kelvin extends Temperature{

    public Kelvin(double value){
        this.value = value;
        this.type = 2;
    }

    @Override
    public double[] getConvertedValues(){
        double[] converted = new double[3];
        converted[0] = this.value - 273.15; //to Celsius
        converted[1] = (this.value - 273.15) * 9/5 + 32; //to Fahrenheit
        converted[2] = this.value; //to Kelvin
        return converted;
    }

}
