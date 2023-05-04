public class Serie extends Producto {
    private String anioInicio;
    private String sinopsis;
    private String genero;

    public String getAnioInicio() {
        return anioInicio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Serie(String nombre, String anioInicio, String sinopsis, String genero) {
        super(nombre);
        this.anioInicio = anioInicio;
        this.sinopsis = sinopsis;
        this.genero = genero;
    }
}
