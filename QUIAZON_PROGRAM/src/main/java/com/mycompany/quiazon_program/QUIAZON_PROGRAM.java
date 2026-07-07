/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiazon_program;
import java.util.Scanner;   
/**
 *
 * @author CL2-PC
 */
public class QUIAZON_PROGRAM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Quiazon, Channel Aleli B.");
        
        System.out.println("Enter a Number: ");
        int x = input.nextInt();

        System.out.println("Enter a Number: ");
        int y = input.nextInt();
        
        int sum;
        sum = x + y;
        
        if (sum == 0)
        {
            System.out.println ("Null Number");
        }
        else{
           System.out.println("Sum is " + sum);
        }
    }
}
