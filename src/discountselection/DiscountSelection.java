/*
 * This program was made by Misha Donais
 * On October 8th 2018
 * To determine the discount customers should get from spending a certain amount
 */
package discountselection;

import java.util.Scanner;
/**
 *
 * @author misha
 */
public class DiscountSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Input variable
        double spent;
        
        //Input Prompt
        System.out.println("Enter how much was spent");
        
        //Input value entry
        spent = keyedInput.nextDouble();
        
        //Savings tier 1
        if (spent >= 0.01 && spent <= 40.00) {
        System.out.println("You are saving 10%");
        //Savings
        double savings1 = spent * 0.1;
        System.out.println("You are saving " + savings1 + "$");
        //Total
        double total1 = spent - savings1;
        System.out.println("Your total is " + total1 + "$");
    }
        //Savings tier 2
        else if (spent > 40.00 && spent <= 80.00) {
        System.out.println("You are saving 20%");
        //Savings
        double savings2 = spent * 0.2;
        System.out.println("You are saving " + savings2 + "$");
        //Total
        double total2 = spent - savings2;
        System.out.println("Your total is " + total2 + "$");
    }
        //Savings tier 3
        else if (spent > 80.00 && spent <= 120.00) {
        System.out.println("You are saving 30%");
        //Savings
        double savings3 = spent * 0.3;
        System.out.println("You are saving " + savings3 + "$");
        //Total
        double total3 = spent - savings3;
        System.out.println("Your total is " + total3 + "$");
    }
        //Savings tier 4
        else if (spent > 120) {
        System.out.println("You are saving 40%");
        //Savings
        double savings4 = spent * 0.4;
        System.out.println("You are saving " + savings4 + "$");
        //Total
        double total4 = spent - savings4;
        System.out.println("Your total is " + total4 + "$");
    }
        
        
        
        
    }
    
}
