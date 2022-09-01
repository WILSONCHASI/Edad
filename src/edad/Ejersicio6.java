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
public class Ejersicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("INGRESE PRIMER NUMERO: ");
        num1 = sc.nextInt();
        if (num1>=10) {
            System.out.println("El numero tiene 2 digitos");
            
        }else{
            System.out.println("El numero tiene 1 digito");
        }
    }
    
}
