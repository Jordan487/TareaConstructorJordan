package TareaConstructorJordan;
public class Main {
    public static void main(String[] args) {
        // Crear objetos con distintos constructores
        Persona p1 = new Persona(); // constructor por defecto
        Persona p2 = new Persona("Carlos", 25); // constructor parametrizado
        Persona p3 = new Persona("Ana"); // constructor sobrecargado

        // Mostrar datos de cada objeto
        System.out.println("---- Persona 1 ----");
        p1.mostrarDatos();

        System.out.println("---- Persona 2 ----");
        p2.mostrarDatos();

        System.out.println("---- Persona 3 ----");
        p3.mostrarDatos();
    }
}