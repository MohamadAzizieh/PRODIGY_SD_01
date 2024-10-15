package org.example;

abstract class Temperature {
    protected double value;
    protected int type; // 1 for Celsius 2 for Fahrenheit 3 for Kelvin

    public double[] getConvertedValues(){ // Method is set as Celsius by default and will be overridden in the temperature objects classes
        double[] converted = new double[3];
            converted[0] = this.value; //to Celsius
            converted[1] = (this.value * 9/5) + 32; //to Fahrenheit
            converted[2] = this.value + 273.15; //to Kelvin
        return converted;
    }
}