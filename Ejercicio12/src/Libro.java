class Libro {
    private String titulo;
    private String autor;
    private int año;

    public Libro(String autor, int año, String titulo) {
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "Libro \nTitulo: " + titulo + "\nAutor: " + autor + "\nAño: " + año;
    }
}
