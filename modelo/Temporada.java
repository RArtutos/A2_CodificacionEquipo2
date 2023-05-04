public class Temporada {
    private String fechaProd;
    private String fechaEstreno;

    public String getFechaProd() {
        return fechaProd;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaProd(String fechaProd) {
        this.fechaProd = fechaProd;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Temporada(String fechaEstreno, String fechaProd) {
        this.fechaProd = fechaProd;
        this.fechaEstreno = fechaEstreno;
    }
}


