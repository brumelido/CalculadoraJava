package vamo;

import java.util.Scanner;

public class Divisao {

    CalcControle CalcControle = new CalcControle();
    CalcInterface calcInterface = new CalcInterface();
    static Scanner scan = new Scanner(System.in);

    public static void dividindo(Divisao divisao) {
        System.out.println("numero1: ");
        int opn1 = scan.nextInt();
        System.out.println("opn2: ");
        int opn2 = scan.nextInt();

        final int opera = opn1 / opn2;

        System.out.println("O resultado da divisão é : " + opera + "\n Deseja realizar outra operação matemática? \n 1 - Sim \n 2 - Não");
        int resp = scan.nextInt();
        switch (resp) {
            case 1:
            CalcInterface.main(null);
                break;
            case 2:
        System.out.println("Obrigada! :)");
                break;
            // case 3:
            // CalcDados.listaSoma();
            //     break;
    }
}
}