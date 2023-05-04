public class Renta implements Rentable {
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Renta(String f) {
        this.fecha = f;
    }

    public void rentar() {
        System.out.println("Rentando...");
    }

    public void devolver() {
        System.out.println("Devolviendo...");
    }
}
