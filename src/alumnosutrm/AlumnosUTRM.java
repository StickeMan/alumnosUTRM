package alumnosutrm;

import java.util.Scanner;

/**
 * @author Francisco
**/
public class AlumnosUTRM {
    
    static Alumno[] Alumnos; 
    
    public static void LeerAlumnos(){
        Scanner in = new Scanner (System.in);               
        System.out.println("¿Cuántos alumnos serán?");
        int tamanio = in.nextInt();                
        
        Alumnos = new Alumno[tamanio];
                                        
        for(int i =0; i<tamanio; i++){
            Alumno objAlumno = new Alumno();
            objAlumno.setNombre(objAlumno.LeerNombre());
            objAlumno.setCalificacion(objAlumno.LeerCalificaciones());                        
            Alumnos[i] = objAlumno;
        }
    }  
    
    public static void ImprimirPromedios(){
        System.out.println("Los promedios de los alumnos son: ");
        double promedio=0;
        
        for(int i=0; i< Alumnos.length; i++){
            promedio = Alumnos[i].CalcularPromedio();
            System.out.println("El promedio de "+Alumnos[i].getNombre()+" es : "+promedio);
        }
    }
    
    public static void main(String[] args) {
        LeerAlumnos();
        ImprimirPromedios();
    }
}
