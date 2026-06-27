package gestionesestudiantes;
public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private String matricula;
    private String carrera;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String matricula, String carrera, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Metodo para mostrar los datos del estudiante
public void mostrarDatos() {

    System.out.println("==============================================");
    System.out.println("SISTEMA DE GESTION DE ESTUDIANTES");
    System.out.println("==============================================");
    System.out.println("Nombre      : " + nombre);
    System.out.println("Matricula   : " + matricula);
    System.out.println("Carrera     : " + carrera);
    System.out.println("Promedio    : " + promedio);
    System.out.println("==============================================");
}

    public void actualizarPromedio(double nuevoPromedio) {

    promedio = nuevoPromedio;

    System.out.println("----------------------------------------------");
    System.out.println("✓ El promedio fue actualizado a: " + promedio);
    System.out.println("----------------------------------------------");

}

    public void cambiarCarrera(String nuevaCarrera) {

    carrera = nuevaCarrera;

    System.out.println("----------------------------------------------");
    System.out.println("✓ La carrera fue actualizada.");
    System.out.println("Nueva carrera: " + carrera);
    System.out.println("----------------------------------------------");

}

   public void verificarAprobacion() {

    if (promedio >= 70) {

        System.out.println("Estado: APROBADO");
        System.out.println(nombre + " ha aprobado la materia.");

    } else {

        System.out.println("Estado: NO APROBADO");
        System.out.println(nombre + " necesita mejorar su promedio.");

    }

    System.out.println();

}   // ← Cierra el metodo

}   // ← ESTA llave cierra la clase Estudiante



