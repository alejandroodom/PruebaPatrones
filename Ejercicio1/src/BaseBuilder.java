public class BaseBuilder implements Builder {
    private Base base;


    public void crearBaseSimple(String nombre, int numAmbulancias, double tiempoMedioAsistencia) {
        base = new BaseSimple(nombre, numAmbulancias, tiempoMedioAsistencia);
    }

    public void crearBaseCompuesta(String nombre, int numAmbulancias, int tiempoMedioAsistencia) {
        base = new BaseCompuesta(nombre, numAmbulancias, tiempoMedioAsistencia);
    }


    public void addBase(Base base) {
        ((BaseCompuesta) this.base).addBase(base);
    }

    public Base getBase() {
        return base;
    }
}

