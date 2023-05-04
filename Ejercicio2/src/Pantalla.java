public class Pantalla extends DispositivoSalida {

    private double tamano;
    private int resolucion;

    public Pantalla(String fabricante, String modelo, double precio, int[] puertos, double tamano, int resolucion) {
        super(fabricante, modelo, precio, puertos);
        this.tamano = tamano;
        this.resolucion = resolucion;
    }

    public double getTamano() {
        return tamano;
    }

    public int getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return "Pantalla [fabricante=" + getFabricante() + ", modelo=" + getModelo() + ", precio=" + getPrecio()
                + ", puertos=" + getPuertos() + ", tamano=" + tamano + ", resolucion=" + resolucion + "]";
    }

}
