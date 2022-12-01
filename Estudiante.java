
/**
 *  Descripción de un estudiante
 * 
 * @author - Montse l
 *  
 */
public class Estudiante
{
    private String nombre;
    private int edad;

    /**
     * Constructor  
     */
    public Estudiante(String nombre, int edad)    {
        this.nombre =  nombre;
        this.edad = edad;

    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return nombre;

    }

    /**
     * Accesor para la edad
     */
    public int getEdad() {
        return edad;

    }

    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
            "\nEdad: " + edad);

    }

}
