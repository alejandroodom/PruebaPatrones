public class ImpresoraLaser extends DispositivoSalida {
    private String tipoToner;
    private int paginasDesdeUltimoCambio;

    public ImpresoraLaser(String fabricante, String modelo, double precio, int[] puertos, String tipoToner, int paginasDesdeUltimoCambio) {
        super(fabricante, modelo, precio, puertos);
        this.tipoToner = tipoToner;
        this.paginasDesdeUltimoCambio = paginasDesdeUltimoCambio;
    }

    public String getTipoToner() {
        return tipoToner;
    }

    public void setTipoToner(String tipoToner) {
        this.tipoToner = tipoToner;
    }

    public int getPaginasDesdeUltimoCambio() {
        return paginasDesdeUltimoCambio;
    }

    public void setPaginasDesdeUltimoCambio(int paginasDesdeUltimoCambio) {
        this.paginasDesdeUltimoCambio = paginasDesdeUltimoCambio;
    }
}