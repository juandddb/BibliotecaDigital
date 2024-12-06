public abstract class Publicacion {
    private String titulo;
    private String autor;
    private double precioAlquiler;

    public Publicacion(String titulo, String autor, double precioAlquiler) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioAlquiler = precioAlquiler;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecioAlquiler() { return precioAlquiler; }

    public abstract String toString();
}

