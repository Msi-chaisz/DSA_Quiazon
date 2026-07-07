/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torrado_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Torrado_Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Torrado, Lyndon Dwight V.");
        System.out.println("enter a number:");
        int x = input.nextInt();
        System.out.println("enter a number:");
        int y = input.nextInt();
        
        int sum,diff,prod,quo;
        
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quo = x / y;
        
        System.out.println("sum is :"+ sum);
        System.out.println("diff is :"+ diff);
        System.out.println("prod is :"+ prod);
        System.out.println("quo is :"+ quo);
    }
}
