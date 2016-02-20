/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperature;

/**
 *
 * @author HP1
 */
import java.util.Scanner;
public class ConvertTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the temperature in Fahrenheit");
        
        Scanner keyboard = new Scanner(System.in);
        
        double f;
        
        double c;
        
        f = keyboard.nextDouble();
        
        c = 5 * ( f - 32 ) / 9;
        
        System.out.println("The temperature in celsius is: " + c);
        
    }
    
}
