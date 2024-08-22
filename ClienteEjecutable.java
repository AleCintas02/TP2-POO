

public class ClienteEjecutable
{
   
    public static void main(String [] args){
        Cliente C1 = new Cliente(44542020, "Alejandro", "Cintas", 200);
        C1.mostrar();
        C1.agregaSaldo(100.0);
        C1.mostrar();
        C1.nuevoSaldo(50.0);
         C1.mostrar();
    }
}
