public class Cliente {
    private OrdenadorFactory fabrica;

    public Cliente(OrdenadorFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void setFabrica(OrdenadorFactory fabrica) {
        this.fabrica = fabrica;
    }

    public OrdenadorFactory crearOrdenador() {
        // Crear los componentes mín
        return null;
    }
}

