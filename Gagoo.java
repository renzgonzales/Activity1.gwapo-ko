/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gagoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Gonzales_CPE
 */
public class Gagoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int wow = 0;

        while (true) {

            JOptionPane.showMessageDialog(null, "hey!! Welcome to RENZ GWAPO Computing TOOLS");
            JOptionPane.showMessageDialog(null, "\nPlease Select Option:\n1. Temperature Converter\n2. Odd/Even Number Checker\n3. Trigonometric Calculator\n4. Polygon Surface Area Calculator");
            int wew = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice:"));

            switch (wew) {
                case 1:
                    int bang = Integer.parseInt(JOptionPane.showInputDialog("Please select to convert:\n1. Celsius to Farenheight\n2. Farenheight to Celsius\n3. Kelvin to Celsius\n4. Kelvin to Farenheight\n5. Celsius to Kelvin\n6. Farenheight to Kelvin"));

                    switch (bang) {
                        case 1:
                            double c = Double.parseDouble(JOptionPane.showInputDialog("Enter Value to Convert:"));
                            double f = (c * 9 / 5) + 32;
                            JOptionPane.showMessageDialog(null, "The Answer is: " + f);
                            break;
                        // other cases for the conversion

                    }
                    break;

                case 2:
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number:"));
                    if (x % 2 == 0) {
                        JOptionPane.showMessageDialog(null, x + " is even.");
                    } else {
                        JOptionPane.showMessageDialog(null, x + " is odd.");
                    }
                    break;

                // other cases for the different options
            }

            int bang = Integer.parseInt(JOptionPane.showInputDialog("Do you want to go back to the main menu?\n0. Yes\n1. No"));
            if (bang == 0) {
                continue;
            } else if (bang == 1) {
                JOptionPane.showMessageDialog(null, "Thank you for using RENZ GWAPO Computing TOOLS");
                break;
            }
        }
    }
    
    
}
