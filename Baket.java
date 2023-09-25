/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baket;

import java.util.Scanner;

/**
 *
 * @author Gonzales_CPE
 */
public class Baket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hey!! Welcome to RENZ GWAPO Computing TOOLS");
        System.out.println("  ");
        Scanner ngano = new Scanner(System.in);
        System.out.println("Please Select Option:");
        System.out.println( "  " + "1. Temperature Converter");
        System.out.println( "  " + "2. Odd/Even Number Checker");
        System.out.println( "  " + "3. Trigonometric Calculator");
        System.out.println( "  " + "4. Polygon Surface Area Calculator");
        int wew = ngano.nextInt();

        switch (wew) {
            case 1:
                System.out.println("Please select to convert:");
                System.out.println("  ");
                System.out.println("1. Celsius to Farenheight");
                System.out.println("2. Farenheight to Celsius");
                System.out.println("3. Kelvin to Celsius");
                System.out.println("4. Kelvin to Farenheight");
                System.out.println("5. Celsius to Kelvin");
                System.out.println("6. Farenheight to Kelvin");
                int bang = ngano.nextInt();
                switch (bang) {
                    case 1:
                        System.out.println("Enter Value to Convert:");
                        double c = ngano.nextDouble();
                        double f = (c * 9 / 5) + 32;
                        System.out.println("The Answer is:" + " " + f);
                        break;
                        
                    case 2:
                        System.out.println("Enter Value to Convert:");
                        double f2 = ngano.nextDouble();
                        double c2 = (f2 - 32) * 5 / 9;
                        System.out.println("The Answer is:" + " " + c2);
                        break;
                        
                    case 3:
                        System.out.println("Enter Value to Convert:");
                        double k = ngano.nextDouble();
                        double c3 = k - 273.15;
                        System.out.println("The Answer is:" + " " + c3);
                        break;
                        
                    case 4:
                        System.out.println("Enter Value to Convert:");
                        double k2 = ngano.nextDouble();
                        double f3 = (k2 - 273.15) * 9 / 5 + 32;
                        System.out.println("The Answer is:" + " " + f3);
                        break;
                        
                    case 5:
                        System.out.println("Enter Value to Convert:");
                        double c4 = ngano.nextDouble();
                        double k3 = c4 + 273.15;
                        System.out.println("The Answer is:" + " " + k3);
                        break;
                        
                    case 6:
                        System.out.println("Enter Value to Convert:");
                        double f4 = ngano.nextDouble();
                        double k4 = (f4 - 32) * 5 / 9 + 273.15;
                        System.out.println("The Answer is:" + " " + k4);
                        break;
                }   break;
            case 2:
                System.out.print("Enter a Number: ");
                int x = ngano.nextInt();
                if (x % 2 == 0) {
                    System.out.println(x + " is even.");
                } else {
                    System.out.println(x + " is odd.");
                }   break;
            case 3:
                System.out.println("Please choose trigonometric functions:");
                System.out.println("  ");
                System.out.println("1. Sine (sin)");
                System.out.println("2. Cosine (cos)");
                System.out.println("3. Tangent (tan)");
                int t = ngano.nextInt();
                switch (t) {
                    
                    case 1:
                        System.out.println("Enter value in degree:");
                        double sin = ngano.nextDouble();
                        System.out.println("The sine of" + " " + sin + " " + "is:" + " " + Math.sin(Math.toRadians(sin)));
                        break;
                        
                    case 2:
                        System.out.println("Enter value in degree:");
                        double cos = ngano.nextDouble();
                        System.out.println("The cosine of" + " " + cos + " " + "is:" + " " + Math.cos(Math.toRadians(cos)));
                        break;
                        
                    case 3:
                        System.out.println("Enter value in degree:");
                        double tan = ngano.nextDouble();
                        System.out.println("The tangent of" + " " + tan + " " + "is:" + " " + Math.tan(Math.toRadians(tan)));
                        break;
                }   break;
            case 4:
                System.out.println("Please choose a polygon:");
                System.out.println("  ");
                System.out.println("1. Triangle");
                System.out.println("2. Square");
                System.out.println("3. Rectangle");
                System.out.println("4. Circle");
                int p = ngano.nextInt();
                switch (p) {
                    
                    case 1:
                        System.out.println("Enter the value of three sides of triangle");
                        System.out.println("Side 1:");
                        double a = ngano.nextDouble();
                        System.out.println("Side 2:");
                        double b = ngano.nextDouble();
                        System.out.println("Side 3:");
                        double c = ngano.nextDouble();
                        
                        double abc = ((a + b + c) / 2);
                        double fv = Math.sqrt(abc * (abc - a) * (abc - b) * (abc - c));
                        
                        System.out.println("The area of triangle is:" + " " + fv);
                        break;
                        
                    case 2:
                        System.out.println("Enter the value of length of the square:");
                        double d = ngano.nextDouble();
                        
                        double fv2 = (d * d);
                        
                        System.out.println("The area of Square is:" + " " + fv2);
                        break;
                        
                    case 3:
                        System.out.println("Enter the value of length and width of a rectangle");
                        System.out.println("Length:");
                        double e = ngano.nextDouble();
                        System.out.println("Width");
                        double f = ngano.nextDouble();
                        
                        double fv3 = (e * f);
                        
                        System.out.println("The area of a rectangle is:" + " " + fv3);
                        
                    case 4:
                        System.out.println("Enter the value of radius of the circle:");
                        double g = ngano.nextDouble();
                        
                        double fv4 = (Math.PI * g * g);
                        
                        System.out.println("The area of a circle is:" + " " + fv4);
                }   break;
            default:
                break;
        }
        }
        // TODO code application logic here
    }
   
