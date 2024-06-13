
package practica_01;

/**
 *
 * @author NESTOR
 * ESTE CODIGO ES UNA EXPLICACION
 */

import java.util.Scanner;

public class Practica_01 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite su nombre: ");
        String nombre = s.nextLine();
        
        System.out.println("Digite su edad: ");
        int edad = s.nextInt();
        
        System.out.println("Digite su PAPA a cotinuación: ");
        int ñ = s.nextInt();
      
        
        Estudiantes obj1 = new Estudiantes(nombre, edad);
        obj1.setPAPA(ñ);
        int pap = obj1.getPAPA();
        System.out.println("Actualmente tienes un papa de: " + pap);

        
        
        
        System.out.println("Código de clase:  " + Estudiantes.CodigoClase);

        
        

        
    }

    
}
