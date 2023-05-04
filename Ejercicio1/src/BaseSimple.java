public class BaseSimple extends Base {

    private int numAmbulancias;
    private double tiempoMedioAsistencia;

    public BaseSimple(String nombre, int numAmbulancias, double tiempoMedioAsistencia) {
        super(nombre);
        this.numAmbulancias = numAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    @Override
    public String toString() {
        return "BaseSimple{" +
                "numAmbulancias=" + numAmbulancias +
                ", tiempoMedioAsistencia=" + tiempoMedioAsistencia +
                '}';
    }
}

