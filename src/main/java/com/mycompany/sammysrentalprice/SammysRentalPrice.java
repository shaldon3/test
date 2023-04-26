/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sammysrentalprice;
import java.util.Scanner;

/**
 *
 * @author Shaldon
 */
public class SammysRentalPrice {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Sammys Seashore Supplies");
         
        System.out.println("Enter the mintues rented : ");
        int totalMinutes = input.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        

        double rentalCost = (40 * hours)+ (1 * minutes);
   
         System.out.println("Hours: " + hours);
          System.out.println("Minutes: " + minutes);
           System.out.println("Total Price: $ " + rentalCost);
    }
}
