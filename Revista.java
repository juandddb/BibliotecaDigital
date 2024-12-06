public class Revista extends Publicacion {
    private int numeroEdicion;
    private String tematica;

    public Revista(String titulo, String autor, double precioAlquiler, int numeroEdicion, String tematica) {
        super(titulo, autor, precioAlquiler);
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public String getTematica() { return tematica; }

    @Override
    public String toString() {
        return "Revista: " + getTitulo() + " - Autor: " + getAutor() + " - Edición: " + numeroEdicion + 
               " - Temática: " + tematica + " - Precio: $" + getPrecioAlquiler();
    }
}

