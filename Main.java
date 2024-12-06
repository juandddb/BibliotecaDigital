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
        System.out.println("Usuarios registrados:");
        Usuario usuario1 = biblioteca.buscarUsuario(12345678);
        Usuario usuario2 = biblioteca.buscarUsuario(87654321);
        System.out.println(usuario1);
        System.out.println("Total gastado: $" + usuario1.calcularTotalGastado());
        System.out.println(usuario2);
        System.out.println("Total gastado: $" + usuario2.calcularTotalGastado());
    }
}

