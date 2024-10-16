package org.example;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        Temperature temperature = TemperatureFactory.createTemperature(1,100);
        ArrayList<Double> converted = new ArrayList<>();
        converted = temperature.getConvertedValues();


    }
}