/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

/**
 *
 * @author juanr
 */
public class LCirculo extends Logica{

    public double calcular(String x, String y) {
        
        double radio = Double.parseDouble(x);
        double pi = 3.1416;
        double ig = Math.pow(radio, 2) * pi;
        return ig;
    }
    public static String convertir(double p){
        String res = String.valueOf(p);
        return res;
    }
 
}
