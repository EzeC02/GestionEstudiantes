package Pack0.GestionEstudiantes;
import java.util.ArrayList;

public class GestionEstudiantes {

    private ArrayList<Estudiante> estudiantes=new ArrayList<>();

public void agregarEstudiante(Estudiante est){
    this.estudiantes.add(est);
}
public void eliminarEstudiante(int numMatricula){
    for(int i=0;i<this.estudiantes.size();i++){
if(this.estudiantes.get(i).getNumeroMatricula()==numMatricula){
    this.estudiantes.remove(i);
}
    }
}
public void listarEstudiantes(){
    for(int i=0;i<this.estudiantes.size();i++){
        System.out.println(this.estudiantes.get(i));
        }
}
public void buscarEstudiantes(int nummat){
    
    for(int i =0;i<this.estudiantes.size();i++){
     if (this.estudiantes.get(i).getNumeroMatricula()== nummat){
        System.out.println( this.estudiantes.get(i));
     }else {
        System.out.println("No hay estudiantes con esa matricula");
        break;
     }
    }
    
}

public static void main(String[] args) {
    Estudiante primero=new Estudiante("Ezequiel","Cativas",38242081);
    Estudiante segundo = new Estudiante("Alan","Orellana",5235777);
    Estudiante tercero = new Estudiante("Marcelo","Pacheco",100);
    Estudiante cuarto = new Estudiante ("Nicolas","Cativas",40061767);

GestionEstudiantes uno=new GestionEstudiantes();

    primero.agregarCalificacion(7);
    primero.agregarCalificacion(10);
    primero.agregarCalificacion(5);
    segundo.agregarCalificacion(5);
    segundo.agregarCalificacion(4);
    segundo.agregarCalificacion(3);
    tercero.agregarCalificacion(9);
    tercero.agregarCalificacion(7);
    tercero.agregarCalificacion(6);

uno.agregarEstudiante(primero);
uno.agregarEstudiante(segundo);
uno.agregarEstudiante(tercero);
uno.agregarEstudiante(cuarto);



uno.listarEstudiantes();
uno.eliminarEstudiante(100);
uno.listarEstudiantes();
uno.buscarEstudiantes(400617);


}


}
