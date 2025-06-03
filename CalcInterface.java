package vamo;

import java.util.Scanner;

public class CalcInterface {

    CalcControle calcControle = new CalcControle();
    
    public static void main(String[] args) {


        try (Scanner scan = new Scanner(System.in)) {
                
            System.out.println("##### Calculadora #####");
            System.out.println("OPERAÇÕES");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");
            int operador = scan.nextInt();
            

            switch (operador) {
                case 1:
                Soma.somando(null);
                    break;
                case 2:
                    subtracao.subtraindo(null);
                    break;
                case 3:
                    Divisao.dividindo(null);
                    break;
                case 4:
                    Multiplicacao.multiplicando(null);
                    break;
             }
        }
    }
}