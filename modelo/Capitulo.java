public class Capitulo {
    private String titulo;
    private int duracion;
    private String sinopsis;

    public Capitulo (String titulo, int duracion, String sinopsis){
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
