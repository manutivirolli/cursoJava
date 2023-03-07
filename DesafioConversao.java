package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora salarial \n");

        System.out.print("Digite o primeiro salário: ");
        String s1 = entrada.next().replace(",",".");

        System.out.print("\n\n Digite o segundo salário: ");
        String s2 = entrada.next().replace(",",".");

        System.out.print("\n\n Digite o terceiro salário: ");
        String s3 = entrada.next().replace(",",".");

        double valor1 = Double.parseDouble(s1);
        double valor2 = Double.parseDouble(s2);
        double valor3 = Double.parseDouble(s3);

        Double mediasalario = (valor1 + valor2 + valor3) / 3;
        System.out.println("\n\n Média salarial: " + mediasalario);

        entrada.close();

    }
}
