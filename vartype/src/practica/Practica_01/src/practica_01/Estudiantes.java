
package practica_01;

/**
 *
 * @author PROFESOR
 */
class Estudiantes {
    static int CodigoClase = 2016365;
    public int edad;
    public boolean activo;
    public String nombre;
    private Integer PAPA;
    
    
    
    public Estudiantes(String name, int age){
        nombre = name;
        edad = age;
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");
              
        
    }
    public Integer getPAPA() {
        return PAPA;
    }
    
    public void setPAPA(int PAPA){
       this.PAPA = PAPA;
    }


    
    
            
}
