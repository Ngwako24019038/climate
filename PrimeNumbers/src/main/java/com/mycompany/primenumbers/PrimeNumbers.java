/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

/**
 *
 * @author lamol
 */
import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
  int n = scan.nextInt();
  int k =0;
       for(int i =1;i<n;i++){
       if( n % i==0){
  k++;
}}
       if(k<=2){
                System.out.print("is prime number"+k);}
    }}

