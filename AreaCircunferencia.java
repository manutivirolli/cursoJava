package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
      double raio = 3.4;
      final double PI = 3.14159;

      double area = PI * raio * raio;

      System.out.println(area);

      raio = 10;
      area = PI * raio * raio;
      System.out.println("Área = " + area);
    }

    public static class PrimeiroPrograma {

        public static void main(String[] args) {
            System.out.println("teste 1");
            System.out.println("teste 2");
        }
    }
}
