package TareaConstructorJordan;

// Persona.java
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor por defecto: asigna valores genéricos
    public Persona() {
        this.nombre = "No definido";
        this.edad = 0;
    }

    // Constructor parametrizado: recibe nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga de constructor: recibe solo el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18; // edad por defecto
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}