public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construirBaseSimple(String nombre, int numAmbulancias, double tiempoMedioAsistencia) {
        builder.crearBaseSimple(nombre, numAmbulancias, tiempoMedioAsistencia);
    }

    public void construirBaseCompuesta(String nombre, int numAmbulancias, int tiempoMedioAsistencia) {
        builder.crearBaseCompuesta(nombre, numAmbulancias, tiempoMedioAsistencia );
    }

    public void construirSubbaseSimple(String nombre, int numAmbulancias, double tiempoMedioAsistencia) {
        Base subbase = new BaseSimple(nombre, numAmbulancias, tiempoMedioAsistencia);
        builder.addBase(subbase);
    }

    public void construirSubbaseCompuesta(String nombre, int numAmbulancias, int tiempoMedioAsistencia) {
        Base subbase = new BaseCompuesta(nombre, numAmbulancias, tiempoMedioAsistencia);
        builder.addBase(subbase);
    }

    public Base obtenerBase() {
        return builder.getBase();
    }
}


