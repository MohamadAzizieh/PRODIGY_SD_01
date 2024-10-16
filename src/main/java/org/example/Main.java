package org.example;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.AbstractDocument;

public class Main{
    public static void main(String[] args){

        // Create the frame
        JFrame frame = new JFrame("Temperature Convertor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(580, 150);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JLabel outputLabel1 = new JLabel("Converted in Celsius: ");
        JLabel outputLabel2 = new JLabel("Converted in Fahrenheit: ");
        JLabel outputLabel3 = new JLabel("Converted in Kelvin: ");

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("Celsius");
        JRadioButton option2 = new JRadioButton("Fahrenheit");
        JRadioButton option3 = new JRadioButton("Kelvin");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        // Add components to the frame
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(submitButton);
        frame.add(outputLabel1);
        frame.add(outputLabel2);
        frame.add(outputLabel3);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input value
                    Temperature temperature;
                    // Calculate output values based on selected radio button
                    double inputValue = Double.parseDouble(inputField.getText());
                    if(option1.isSelected()){
                        temperature = TemperatureFactory.createTemperature(0,inputValue);
                    } else if (option2.isSelected()) {
                        temperature = TemperatureFactory.createTemperature(1,inputValue);
                    } else if (option3.isSelected()) {
                        temperature = TemperatureFactory.createTemperature(2,inputValue);
                    }else{
                        JOptionPane.showMessageDialog(frame, "Please select a temperature measurement value.");
                        return;
                    }
                    ArrayList<Double> converted = temperature.getConvertedValues();

                    double outputValue1 = converted.get(0); // Example calculation
                    double outputValue2 = converted.get(1); // Another example calculation
                    double outputValue3 = converted.get(2); // Another example calculation

                    // Set the output labels
                    outputLabel1.setText("In Celsius: " + outputValue1 + " | ");
                    outputLabel2.setText("In Fahrenheit: " + outputValue2 + " | ");
                    outputLabel3.setText("In Kelvin: " + outputValue3 + " | ");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });
        // Set the frame visibility
        frame.setVisible(true);
    }
}