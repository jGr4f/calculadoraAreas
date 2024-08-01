/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

/**
 *
 * @author juanr
 */
public class Circulo extends Logica{

    
    public double calcular() {
        double pi = 3.1416;
        double radio = x;
        double area = radio * pi;
        return area;
    }
    public String resultado(){
        String r = String.valueOf(calcular());
        return r;
        
        
    }
    
}
