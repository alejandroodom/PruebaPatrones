import java.util.ArrayList;
import java.util.List;

public class BaseCompuesta extends Base {

    private int numAmbulancias;
    private int tiempoMedioAsistencia;
    private List<Base> bases;

    public BaseCompuesta(String nombre, int numAmbulancias, int tiempoMedioAsistencia) {
        super(nombre);
        this.numAmbulancias = numAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        bases = new ArrayList<>();
    }

    public void addBase(Base base) {
        bases.add(base);
    }

    public void removeBase(Base base) {
        bases.remove(base);
    }

    public List<Base> getBases() {
        return bases;
    }

    @Override
    public String toString() {
        return "BaseCompuesta{" +
                "numAmbulancias=" + numAmbulancias +
                ", tiempoMedioAsistencia=" + tiempoMedioAsistencia +
                ", bases=" + bases +
                '}';
    }
}
