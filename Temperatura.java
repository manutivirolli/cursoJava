package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double AJUSTE = 32;
        final double FATOR = 5 / 9.0;

        double FAREN = 70;

        double CELSIUS = (FAREN - AJUSTE) * FATOR;

        System.out.println("RESULTADO:" + CELSIUS);

    }
}
