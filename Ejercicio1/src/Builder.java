public interface Builder {
    void crearBaseSimple(String nombre, int numAmbulancias, double tiempoMedioAsistencia);
    void crearBaseCompuesta(String nombre, int numAmbulancias, int tiempoMedioAsistencia);
    void addBase(Base base);
    Base getBase();
}

