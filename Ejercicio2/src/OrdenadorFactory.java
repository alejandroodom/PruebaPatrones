public class OrdenadorFactory {
    public UnidadCentral crearUnidadCentral() {
        return new UnidadCentral("Intel", "i3", 200);
    }

    public DispositivoEntrada crearDispositivoEntrada() {
        return new Teclado("USB", new int[]{1,2,3});
    }

    public DispositivoSalida crearDispositivoSalida() {
        return new Pantalla("Samsung", "S24F350FHU", 150, new int[]{1,2,3}, 24, 1920);
    }
}
