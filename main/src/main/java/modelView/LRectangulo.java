/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

/**
 *
 * @author juanr
 */
public class LRectangulo extends Logica {

    @Override
    public double calcular(String x, String y){
        double l1 = Double.valueOf(x);
        double l2 = Double.valueOf(y);
        
        double area = l1 * l2;
        return area;
        
    }
    
    public static String convertir(double p){
        
        String res = String.valueOf(p);
        return res;
    }
    
}
