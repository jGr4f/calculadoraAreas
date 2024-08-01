/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

/**
 *
 * @author juanr
 */
public class LTriangulo extends Logica {

    @Override
    public double calcular(String x, String y) {
        double bas = Double.valueOf(x);
        double alt = Double.valueOf(y);
        
        double area = (bas * alt)/2;
        return area;
    }
    
    public static String convertir(double p){
        String res = String.valueOf(p);
        return res;
    }
    
}
