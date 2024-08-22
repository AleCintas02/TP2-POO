
public class CrearEmpleado
{
   public static void main(String [] args){
       Empleado empleado1 = new Empleado(44542020, "Cintas", "Alejandro", 50000.0, 2020);
       empleado1.mostrar();
       System.out.println(empleado1.mostrarLinea());
       
   }
}
