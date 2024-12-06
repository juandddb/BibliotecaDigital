public class Libro extends Publicacion {
    private String genero;
    private String isbn;

    public Libro(String titulo, String autor, double precioAlquiler, String genero, String isbn) {
        super(titulo, autor, precioAlquiler);
        this.genero = genero;
        this.isbn = isbn;
    }

    public String getGenero() { return genero; }
    public String getIsbn() { return isbn; }

    @Override
    public String toString() {
        return "Libro: " + getTitulo() + " - Autor: " + getAutor() + " - Género: " + genero + 
               " - ISBN: " + isbn + " - Precio: $" + getPrecioAlquiler();
    }
}

