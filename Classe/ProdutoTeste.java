package Fundamentos.Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 1200.50;


        Produto p2 = new Produto();
        p2.nome = "Tablet";
        p2.preco = 500.00;


        System.out.println(p1.nome);
        System.out.println(p1.preco);
            }
}
