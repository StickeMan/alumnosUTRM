package alumnosutrm;

import java.util.Scanner;
public class Alumno {

    String nombre;
    double[] calificacion;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double[] calificacion) {
        this.calificacion = calificacion;
    }    
    
    public Alumno() {
    }
    
    public double CalcularPromedio(){
        double suma=0;
        double promedio=0;
        for(int i = 0; i<calificacion.length ; i++){
            suma += calificacion[i];
        }
            promedio = suma / calificacion.length;
                        
        return promedio;
    }
    
    public double[] LeerCalificaciones(){
        //Determinar el tamanio que tendrá el arreglo
        Scanner in = new Scanner (System.in);               
        System.out.println("Introduce el número de calf");
        int tamanio = in.nextInt();
        
        //Declarar un arreglo con tamaño dinámico
        double arreglo[]= new double[tamanio];
        
        //Lectura de las calificaciones utilizando un arreglo
        System.out.println("Introduce las "+tamanio+" calificaciones");
        for(int i=0; i<arreglo.length; i++){
            System.out.print("Calificación "+(i+1)+" : ");
            arreglo[i]= in.nextDouble();
        }                               
        return arreglo;
    }    
    
    public String LeerNombre(){
        Scanner in = new Scanner (System.in);               
        System.out.println("Escribe el nombre del alumno: ");
        String nombre = in.nextLine();
        
        return nombre;
    }     
}
