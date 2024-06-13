/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pruebas.vartype;
import java.util.Scanner;

/**
 *
 * @author juanr
 */
public class Vartype {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digita una caracter: ");
        char ch = s.next().charAt(0);
        System.out.println("El caracter digitado es: " + ch + "y su tamaño es de 2 bytes.");
        
        System.out.print("Digita un número entero: ");
        int h = s.nextInt();
        System.out.println("El entero de tipo int digitado es: " + h + " y su tamaño es de 4 bytes");
        
        System.out.print("Digita un valor booleano (true o false): "); 
        boolean boo = s.nextBoolean();
         if (boo == true) {  
               System.out.println("Valor booleano true (verdadero), su tamaño es de 1/8 de byte.");  
         } 
         else if (boo == false) {  
               System.out.println("Valor booleano false (falso), su tamaño es de 1/8 de byte.");  
         } 
         
        System.out.println("Digita un valor de bytes: ");
        byte by = s.nextByte();
        System.out.println("El valor digitado es: " + by + " y su tamaño es de 1 byte.");
        

        
        System.out.println("Digita un entero tipo short: ");
        short sh = s.nextShort();
        System.out.println("El entero de tipo short digitado es: " + sh + " y su tamaño es de 2 bytes.");
        
        System.out.println("Digita un entero de tipo long: ");
        long lo = s.nextLong();
        System.out.println("El entero de tipo short digitado es: " + lo + " y su tamaño es de 8 bytes." );
        
        System.out.println("Digita un número de punto flotante tipo float: ");
        float fl = s.nextFloat();
        System.out.println("El número digitado es: " + fl + " y su tamaño es de 4 bytes.");
        
        System.out.println("Digita un número de punto flotante tipo double: ");
        double dou = s.nextDouble();
        System.out.println("El número digitado es: " + dou + " y su tamaño es de 8 bytes.");
    }

    private static void or(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
