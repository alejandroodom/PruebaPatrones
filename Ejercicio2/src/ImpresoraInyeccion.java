public class ImpresoraInyeccion extends DispositivoSalida {

    private String tipoCartucho;

    public ImpresoraInyeccion(String fabricante, String modelo, double precio, int[] puertos, String tipoCartucho) {
        super(fabricante, modelo, precio, puertos);
        this.tipoCartucho = tipoCartucho;
    }

    public String getTipoCartucho() {
        return tipoCartucho;
    }

    public void setTipoCartucho(String tipoCartucho) {
        this.tipoCartucho = tipoCartucho;
    }

}
