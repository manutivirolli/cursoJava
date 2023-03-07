package Fundamentos;

import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do dia");

        String diadasemana = entrada.next();

        if (diadasemana.equalsIgnoreCase("domingo")) {
            System.out.println("1");

        } else if (diadasemana.equalsIgnoreCase("segunda")) {
            System.out.println("2");

               }  else if (diadasemana == "sabado") {
            System.out.println("7");
        entrada.close();
    }
    }

}
