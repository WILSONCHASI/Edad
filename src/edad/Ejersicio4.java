/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejersicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2,suma,resta,multiplicacion, division;
        System.out.println("INGRESE NOTA 1: ");
        num1 = sc.nextInt();

        System.out.println("INGRESE NOTA 2: ");
        num2 = sc.nextInt();

        

        if (num1 > num2) {
            
            suma = num1+num2;
            resta = num1 - num2;
            System.out.println("La suma es: "+suma);
            System.out.println("La resta es: "+resta);
         

        }else{
            
            multiplicacion = num1* num2;
            division = num1 / num2;
            System.out.println("La multiplicacion es: "+multiplicacion);
            System.out.println("La division del primero respecto al segundo es: "+division);
            
            
        }
    }

}
