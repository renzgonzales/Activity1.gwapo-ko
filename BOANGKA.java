/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boangka;

import javax.swing.JOptionPane;

/**
 *
 * @author Gonzales_CPE
 */
public class BOANGKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         double subtotal = 0;
        double total;
        double discount = 0;

        int paboPrice = 15;
        int chickenPrice = 15;
        int porkPrice = 15;
        int royalPrice = 10;
        int pepsiPrice = 10;
        int spritePrice = 10;

        Object[] meatOptions = {"PABO - 15.00", "CHICKEN - 15.00", "PORK - 15.00"};
        Object[] drinkOptions = {"ROYAL - 10.00", "PEPSI NA BLUE - 10.00", "SPRITE NA DILI MO BULA - 10.00"};

        String meatChoice = (String) JOptionPane.showInputDialog(null,
                "Choose a toppings",
                "toppings Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                meatOptions,
                meatOptions[0]);

        if (meatChoice != null) {
            switch (meatChoice) {
                case "PABO - 15.00":
                    subtotal += paboPrice;
                    break;
                case "CHICKEN - 15.00":
                    subtotal += chickenPrice;
                    break;
                case "PORK - 15.00":
                    subtotal += porkPrice;
                    break;
            }

            String drinkChoice = (String) JOptionPane.showInputDialog(null,
                    "Choose a drink option",
                    "Drink Selection",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    drinkOptions,
                    drinkOptions[0]);

            if (drinkChoice != null) {
                switch (drinkChoice) {
                    case "ROYAL - 10.00":
                        subtotal += royalPrice;
                        break;
                    case "PEPSI NA BLUE - 10.00":
                        subtotal += pepsiPrice;
                        break;
                    case "SPRITE NA DILI MO BULA - 10.00":
                        subtotal += spritePrice;
                        break;
                }
                discount = subtotal / 10; // Assuming 10% tax rate
                total = subtotal - discount;

                JOptionPane.showMessageDialog(null, "Subtotal: " + subtotal + "\nTax: " + discount + "\nTotal: " + total);
            }
        }
    }
    
}
