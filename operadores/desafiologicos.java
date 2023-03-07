package Fundamentos.operadores;

public class desafiologicos {
    public static void main(String[] args) {
        // terça - t or f
        // quinta - t or f
        //  se t e t - compra a tv de 50
        // se 1 for true - compra tv de 32
        // se comprar uma das duas - vai tomar sorvete
        // se f - a familia vai ficar em casa
        // se nao tomar sorvete - ficar saudavel

        boolean job1 = true;
        boolean job2 = false;
                System.out.println(job1 || job2);

        boolean tv50 = (job1 || job2);
        System.out.println(tv50);

        boolean tv32 = (job1 ^ job2);
        System.out.println(tv32);

    }
}
