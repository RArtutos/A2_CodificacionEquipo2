public class Pelicula extends Producto {
    private String sinopsis;
    private String anio;
    private String genero;
    private String pais;

    public String getSinopsis() {
        return sinopsis;
    }

    public String getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pelicula(String nombre, String sinopsis, String anio, String genero, String pais) {
        super(nombre);
        this.sinopsis = sinopsis;
        this.anio = anio;
        this.genero = genero;
        this.pais = pais;
    }
}
