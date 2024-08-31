package Pack0.GestionEstudiantes;
import java.util.ArrayList;

public class Estudiante {

private String nombre;
private String apellido;
private int numeroMatricula;
private ArrayList<Integer> calificaciones=new ArrayList<>();


public Estudiante(String nombre,String apellido,int numeroMatricula){

    this.nombre= nombre;
    this.apellido=apellido;
    this.numeroMatricula= numeroMatricula;
}

public void agregarCalificacion(int calificacion){
    this.calificaciones.add(calificacion);
}

public float calcularPromedio(){
    float acu=0;
    for(int i=0; i<this.calificaciones.size();i++){
         acu=acu+this.calificaciones.get(i);

    }
    return acu/this.calificaciones.size();
}

public String getNombre() {
    return nombre;
}

public String getApellido() {
    return apellido;
}

public int getNumeroMatricula() {
    return numeroMatricula;
}

@Override
public String toString() {
  return "Nombre: "+ this.nombre+" Apellido: "+ this.apellido+" Matricula: "+ this.numeroMatricula;
}

}
