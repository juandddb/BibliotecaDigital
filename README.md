# Sistema de Biblioteca Digital  

## Descripción  
Este proyecto simula un sistema de biblioteca digital que permite gestionar libros, revistas y usuarios. Incluye funcionalidades como:  
- Registrar publicaciones (libros o revistas).  
- Asociar publicaciones a usuarios.  
- Calcular el costo acumulado de alquileres por usuario.  
- Listar publicaciones disponibles y prestadas.  

## Autor  
- Juan Di Benedetto
  
## Estructura del Proyecto  
El sistema está compuesto por las siguientes clases:  

1. **Publicacion (abstracta):** Clase base para `Libro` y `Revista`.  
2. **Libro:** Extiende `Publicacion`, añade género e ISBN.  
3. **Revista:** Extiende `Publicacion`, añade número de edición y temática.  
4. **Usuario:** Representa un usuario que puede tomar prestadas publicaciones.  
5. **Biblioteca:** Administra publicaciones y usuarios, y realiza préstamos.  

## Requisitos  
- Java 8 o superior.  
- Paquete de lectura y generación aleatoria proporcionado por la cátedra (*opcional para extender el programa*).  

## Ejemplo de Uso  
```java
public class Main {
    public static void main(String[] args) {
        // Crear biblioteca con capacidad para 10 publicaciones y 5 usuarios
        Biblioteca biblioteca = new Biblioteca(10, 5);

        // Agregar libros y revistas
        biblioteca.agregarPublicacion(new Libro("El Quijote", "Cervantes", 50.0, "Novela", "123456789"));
        biblioteca.agregarPublicacion(new Revista("National Geographic", "Editorial NG", 30.0, 202, "Ciencia"));

        // Registrar usuarios
        biblioteca.registrarUsuario(new Usuario("Juan Pérez", 12345678, 3));
        biblioteca.registrarUsuario(new Usuario("María López", 87654321, 2));

        // Asignar publicaciones a usuarios
        biblioteca.asignarPublicacion(12345678, "El Quijote");
        biblioteca.asignarPublicacion(87654321, "National Geographic");

        // Mostrar información de usuarios
        Usuario usuario1 = biblioteca.buscarUsuario(12345678);
        System.out.println(usuario1);
        System.out.println("Total gastado: $" + usuario1.calcularTotalGastado());
    }
}

