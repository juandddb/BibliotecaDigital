public class Usuario {
    private String nombre;
    private int dni;
    private Publicacion[] publicacionesPrestadas;
    private int cantidadPrestadas;

    public Usuario(String nombre, int dni, int maxPrestamos) {
        this.nombre = nombre;
        this.dni = dni;
        this.publicacionesPrestadas = new Publicacion[maxPrestamos];
        this.cantidadPrestadas = 0;
    }

    public String getNombre() { return nombre; }
    public int getDni() { return dni; }

    public void agregarPublicacion(Publicacion pub) {
        if (cantidadPrestadas < publicacionesPrestadas.length) {
            publicacionesPrestadas[cantidadPrestadas] = pub;
            cantidadPrestadas++;
        }
    }

    public double calcularTotalGastado() {
        double total = 0;
        for (int i = 0; i < cantidadPrestadas; i++) {
            total += publicacionesPrestadas[i].getPrecioAlquiler();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " - DNI: " + dni + " - Publicaciones Prestadas: " + cantidadPrestadas;
    }
}

