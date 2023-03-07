package Fundamentos.Classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data () {

    }



    String obterData() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
