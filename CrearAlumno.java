
public class CrearAlumno
{
    public static void main(String [] args){
        Alumno alumno1 = new Alumno(2020,"Juan","Perez");
        alumno1.setNota1(5.99);
        alumno1.setNota2(10.0);
        alumno1.mostrar();
        
        Alumno alumno2 = new Alumno(2021,"Maria","Soto");
        alumno2.setNota1(5.0);
        alumno2.setNota2(6.0);
        alumno2.mostrar();
        
    }
}
