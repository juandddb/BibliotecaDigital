public class Biblioteca {
    private Publicacion[] publicaciones;
    private Usuario[] usuarios;
    private int cantPublicaciones;
    private int cantUsuarios;

    public Biblioteca(int maxPublicaciones, int maxUsuarios) {
        this.publicaciones = new Publicacion[maxPublicaciones];
        this.usuarios = new Usuario[maxUsuarios];
        this.cantPublicaciones = 0;
        this.cantUsuarios = 0;
    }

    public void agregarPublicacion(Publicacion pub) {
        if (cantPublicaciones < publicaciones.length) {
            publicaciones[cantPublicaciones] = pub;
            cantPublicaciones++;
        }
    }

    public void registrarUsuario(Usuario usr) {
        if (cantUsuarios < usuarios.length) {
            usuarios[cantUsuarios] = usr;
            cantUsuarios++;
        }
    }

    public void asignarPublicacion(int dni, String titulo) {
        Usuario usuario = buscarUsuario(dni);
        Publicacion pub = buscarPublicacion(titulo);
        if (usuario != null && pub != null) {
            usuario.agregarPublicacion(pub);
        }
    }

    private Usuario buscarUsuario(int dni) {
        for (int i = 0; i < cantUsuarios; i++) {
            if (usuarios[i].getDni() == dni) return usuarios[i];
        }
        return null;
    }

    private Publicacion buscarPublicacion(String titulo) {
        for (int i = 0; i < cantPublicaciones; i++) {
            if (publicaciones[i].getTitulo().equalsIgnoreCase(titulo)) return publicaciones[i];
        }
        return null;
    }
}

