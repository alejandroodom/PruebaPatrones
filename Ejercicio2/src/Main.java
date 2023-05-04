public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de componentes de entrada USB
        DispositivoEntrada entradaFactory = new DispositivoEntrada() {
            @Override
            public String getTipoConector() {
                return super.getTipoConector();
            }

            @Override
            public int[] getPuertos() {
                return super.getPuertos();
            }

            @Override
            public void setTipoConector(String tipoConector) {
                super.setTipoConector(tipoConector);
            }

            @Override
            public void setPuertos(int[] puertos) {
                super.setPuertos(puertos);
            }
        };


        // Crear una unidad central
        UnidadCentral unidadCentral = new UnidadCentral("Intel", "Core i7", 800)

    }
}
