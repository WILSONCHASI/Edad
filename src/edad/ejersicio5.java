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
public class ejersicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1,nota2,nota3, promedio;
        System.out.println("INGRESE LA NOTA 1: ");
        nota1 = sc.nextInt();
         System.out.println("INGRESE LA NOTA 2: ");
        nota2 = sc.nextInt();
    
         System.out.println("INGRESE LA NOTA 3: ");
        nota3 = sc.nextInt();
    
        promedio = (nota1+nota2+nota3)/3;
        
        if (promedio>=7) {
            System.out.println("ACEPTADO");
            System.out.println("SU PRIMEDIO ES:"+promedio);
        }else{
            System.out.println("RECHAZADO");
            System.out.println("SU PROMEDIO ES: "+promedio);
        }
    }
    
}
