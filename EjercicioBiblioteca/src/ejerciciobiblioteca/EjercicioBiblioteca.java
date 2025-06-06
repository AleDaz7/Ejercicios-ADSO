/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobiblioteca;

/**
 *
 * @author aleja
 */
public class EjercicioBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca biblioteca1 = new Biblioteca ("Biblioteca municipal");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 
                         "Sudamericana", "858.76/M566", 1976, 
                            "Literatura moderna", "Español", 200);
   biblioteca1.agregarPublicacion(libro1);

   Libro libro2 = new Libro("1984", "George Orwell", 
                            "Secker & Warburg", "823.912/O79", 1949, 
                            "Distopía", "Inglés", 328);
   biblioteca1.agregarPublicacion(libro2);

   Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 
                            "Francisco de Robles", "863.3/C419", 1605, 
                            "Novela clásica", "Español", 863);
   biblioteca1.agregarPublicacion(libro3);

   Libro libro4 = new Libro("Orgullo y prejuicio", "Jane Austen", 
                            "T. Egerton", "823.7/A933", 1813, 
                            "Romance clásico", "Inglés", 279);
   biblioteca1.agregarPublicacion(libro4);

   Libro libro5 = new Libro("El nombre de la rosa", "Umberto Eco", 
                            "Bompiani", "853.914/E19", 1980, 
                            "Misterio histórico", "Italiano", 512);
   biblioteca1.agregarPublicacion(libro5);
   
   
   // 1
Revista revista1 = new Revista("viva el paro armado", 
    "jacobo arenas", "Revista de historia", 
    "1(7)/5-22", 1998, 0, 0, "alfredo");
biblioteca1.agregarPublicacion(revista1);

// 2
Revista revista2 = new Revista("Inteligencia Artificial en la Medicina", 
    "Luis Fernández", "Tecnología y Salud", 
    "8(2)/101-110", 2021, 0, 0, "petro");
biblioteca1.agregarPublicacion(revista2);

// 3
Revista revista3 = new Revista("Economía Circular: Retos y Oportunidades", 
    "María Gómez", "Revista de Economía Sustentable", 
    "15(1)/12-25", 2020, 0, 0, "pique");
biblioteca1.agregarPublicacion(revista3);

// 4
Revista revista4 = new Revista("Avances en Energías Renovables", 
    "Carlos Ruiz", "Ingeniería Verde", 
    "10(4)/89-97", 2022, 0, 0, "james");
biblioteca1.agregarPublicacion(revista4);

// 5
Revista revista5 = new Revista("Psicología y Bienestar en la Era Digital", 
    "Isabel Torres", "Psicología Contemporánea", 
    "5(3)/200-210", 2023, 0, 0, "sisas");
biblioteca1.agregarPublicacion(revista5);

   
   biblioteca1.mostrarPublicacion();


    }
    
}
