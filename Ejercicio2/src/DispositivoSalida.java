public abstract class DispositivoSalida {
    private String fabricante;
    private String modelo;
    private double precio;
    private int[] puertos;

    public DispositivoSalida(String fabricante, String modelo, double precio, int[] puertos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.puertos = puertos;
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
    public int[] getPuertos() {
        return puertos;
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
    public void setPuertos(int[] puertos) {
        this.puertos = puertos;
    }
}
