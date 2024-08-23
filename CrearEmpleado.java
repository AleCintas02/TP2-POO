
public class CrearEmpleado
{
   public static void main(String [] args){
       Empleado empleado1 = new Empleado(20351234385L, "Perez", "Juan", 300000.00, 2002);
       empleado1.mostrar();
       System.out.println("\n" + empleado1.mostrarLinea());
       
   }
}
