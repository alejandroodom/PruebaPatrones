public class UnidadCentral {
    private String fabricante;
    private String modelo;
    private double precio;

    public UnidadCentral(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
