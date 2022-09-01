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
public class Ejersiscio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo = sc.nextInt();
        if (sueldo>3000) {
            System.out.println("Usted debe aboar impuestos");
            
        }
    }
    
}
