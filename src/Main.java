public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre= "Daniel";
        cliente.edad = 21;
        cliente.telefono = "123456789";
        cliente.credito= 5000.623;
        cliente.mostrarcliente();
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Juan";
        trabajador.edad = 20;
        trabajador.telefono = "56874327812";
        trabajador.salario = 5056.63;
        trabajador.mostrarTrabajador();
    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;

    public void mostrarcliente(){
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Edad del cliente: " + edad);
        System.out.println("Telefono del cliente: " + telefono);
        System.out.println("Credito del cliente: " + credito);
        System.out.println(" ");
    }
}

class Trabajador extends Persona {
    double salario;

    public void mostrarTrabajador() {

        System.out.println("Nombre del Trabajador: " + nombre);
        System.out.println("Edad del Trabajador: " + edad);
        System.out.println("Telefono del Trabajador: " + telefono);
        System.out.println("Salario del Trabajador: " + salario);
        System.out.println(" ");
    }
}

