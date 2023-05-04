public class Main {

    public static void main(String[] args) {
        BaseBuilder builder = new BaseBuilder();
        Director director = new Director(builder);

        director.construirBaseSimple("Base 1", 5, 10.0);
        Base base1 = builder.getBase();

        director.construirBaseSimple("Base 2", 3, 8.5);
        Base base2 = builder.getBase();

        director.construirBaseCompuesta("Base 3", 8, 9);
        builder.addBase(base1);
        builder.addBase(base2);
        Base base3 = builder.getBase();

        System.out.println(base1.toString());
        System.out.println(base2.toString());
        System.out.println(base3.toString());
    }

}
