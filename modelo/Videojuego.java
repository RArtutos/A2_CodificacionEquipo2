public class Videojuego extends Producto {
    private String tipo;
    private String consola;
    private String anio;

    public String getTipo() {
        return tipo;
    }

    public String getConsola() {
        return consola;
    }

    public String getAnio() {
        return anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Videojuego(String nombre, String tipo, String consola, String anio) {
        super(nombre);
        this.tipo = tipo;
        this.consola = consola;
        this.anio = anio;
    }
}
