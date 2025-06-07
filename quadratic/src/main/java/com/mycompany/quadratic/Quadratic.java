/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadratic;


/**
 *
 * @author lamol
 */import java.util.Scanner ;
public class Quadratic {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter the value of a:");
    int a =input.nextInt();
    
    System.out.println("Enter the value of b:");
    int b =input.nextInt();
            
    System.out.println("Enter the value of c:");
    int c =input.nextInt();
    System.out.println("Enter the quadratic formula:"); 
    double FirstAnswer  = (-b + Math.sqrt((b*b) -4*(a*c)))/2*a;
         double SecondAnswer= (-b - Math.sqrt((b*b) -4*(a*c)))/2*a;
                    
                    
System.out.println("Your first answer:" + FirstAnswer);
System.out.println("Your second answer:" + SecondAnswer);

    
        
        
    }
}
