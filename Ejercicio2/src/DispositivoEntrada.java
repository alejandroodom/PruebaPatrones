public abstract class DispositivoEntrada {
    private String tipoConector;
    private int[] puertos;

    public DispositivoEntrada(String tipoConector, int[] puertos) {
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    // Métodos getters y setters
    public String getTipoConector() {
        return tipoConector;
    }
    public int[] getPuertos() {
        return puertos;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
    public void setPuertos(int[] puertos) {
        this.puertos = puertos;
    }
}
