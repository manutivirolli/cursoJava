package Fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args){

        double a1 = 3 + 2;
        double b2 = 1 - 5;
        double c2 = 2 - 7;

        double d1 = 6 * a1;
        double e2 = b2 * c2;

        double f1 = 3 * 2;

        double h1 = Math.pow(d1,2);

        double i1 = h1 / f1;

        double j2 = e2 / 2;
        double j3 = Math.pow(j2,2);
        double k = i1 - j3;
        double l = Math.pow(k,3);
        double m3 = Math.pow(10,3);
        double n = l / m3;

        System.out.println(n);


    }
       }
