package gestionesestudiantes;

public class GestionEstudiantes {    

    public static void main(String[] args) {
    System.out.println("************************************************");
System.out.println("UNIVERSIDAD -\"PROGRAMACION ORIENTADA A OBJETOS");
System.out.println("ACTIVIDAD 2 - GESTION DE ESTUDIANTES");
System.out.println("************************************************");
System.out.println();    

        // Crear objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante(
                "Francisco Javier Sosa Rodriguez",
                "2026001",
                "Ingenieria en Sistemas",
                95);

        Estudiante estudiante2 = new Estudiante(
                "Maria Lopez Hernandez", 
                "2026002",
                "Administracion",
                82);

        Estudiante estudiante3 = new Estudiante(
                "Juan Perez Garcia",
                "2026003",
                "Contabilidad",
                65);

        // Mostrar información de los estudiantes
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
        estudiante3.mostrarDatos();

        // Actualizar información
        estudiante1.actualizarPromedio(98);
        estudiante2.cambiarCarrera("Ingenieria Industrial");

        // Verificar aprobación
        estudiante1.verificarAprobacion();
        estudiante2.verificarAprobacion();
        estudiante3.verificarAprobacion();
        
System.out.println("==============================================");
System.out.println("Programa ejecutado correctamente.");
System.out.println("Fin de la aplicacion.");
System.out.println("==============================================");        

    }

}
