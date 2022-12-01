
/**
 *  Para probar Git Github 
 *  desde línea de comandos
 *  
 */
public class TestEstudiante
{

    /**
     *  
     */
    public static void main(String[] args){
        System.out.println("Creamos varios objetos Estudiante");
        Estudiante e1 = new Estudiante("Alberto", 22);
        e1.printEstudiante();
        Estudiante e2 = new Estudiante("Ana", 18);
        e2.printEstudiante();
        Estudiante e3 = new Estudiante("Elisa", 26);
        e3.printEstudiante();
        

    }
}
