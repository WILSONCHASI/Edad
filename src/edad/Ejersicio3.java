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
public class Ejersicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("INGRESE UN NUMERO : ");
        num1 = sc.nextInt();
        System.out.println("INGRESE OTRO NUMERO: ");
        num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("PRIMER NUMERO ES MAYOR");
            if (num2>num1) {
                
                System.out.println("SEGUNDO NUMERO ES MAYOR");
                
                
            }
        }
    }
    
}
