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
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("INGRESE SU EDAD: ");
        edad = sc.nextInt();
        if (edad>18) {
            System.out.println("Es mayor de edad");
            
        }
    }
    
}
