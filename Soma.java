package vamo;

import java.util.Scanner;

public class Soma {
    CalcControle CalcControle = new CalcControle();
    CalcInterface calcInterface = new CalcInterface();
     static CalcDados calcDados = new CalcDados();
    
    static Scanner scan = new Scanner(System.in);
    /**
     * @param soma
     */
    public static void somando(Soma soma) {
        System.out.println("Número 1: ");
        int opn1 = scan.nextInt();
        System.out.println("Número2: ");
        int opn2 = scan.nextInt();

        int opera = opn1 + opn2;

        System.out.println("O resultado da soma é : " + opera + "\n Deseja realizar outra operação matemática? \n 1 - Sim \n 2 - Não");
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
    // public String Imprimir() {
    //     return null;
    // }
   
}
