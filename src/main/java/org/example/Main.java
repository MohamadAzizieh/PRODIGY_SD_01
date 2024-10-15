package org.example;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        Temperature temperature = TemperatureFactory.createTemperature(0,0);
        double [] temperaturesArray = temperature.getConvertedValues();
        System.out.println( " C:" + temperaturesArray[0] + " F:" + temperaturesArray [1] + " K:" + temperaturesArray [2]);
    }
}