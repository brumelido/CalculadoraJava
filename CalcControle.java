package vamo;

// 1 - Fazer um sistema de calculadora simples, a partir das seguintes classes:
//  CalcControle: controle da calculadora (“processador”), com os seguintes métodos:
// public void executar() – faz a execução da classe.
// private double opera(double opn1, double opn2, char op) - executa a operação desejada e retorna o resultado.
// CalcDados: implementa a parte da calculadora que armazena os dados para o seu funcionamento. Possui as seguintes características:
// Atributos: dois números do tipo double para armazenar os operandos e um dado do tipo char para armazenar a operação.
// Métodos:
//  public void setOperando(int i, double valor) 
// public double getOperando(int i) 
// public void setOperacao(char op) atual
// public char getOperacao() 
// CalcInterface: implementa a parte da calculadora que irá conter as assinaturas de métodos e atributos de outras classes. 

public class CalcControle {
    //processador
  
    private double opera;
    private double opn1;
    private double opn2;
    private  char op;

    public double getOpera() {
        return opera;
    }
    public void setOpera(double opera) {
        this.opera = opera;
    }
    public double getOpn1() {
        return opn1;
    }
    public void setOpn1(double opn1) {
        this.opn1 = opn1;
    }
    public double getOpn2() {
        return opn2;
    }
    public void setOpn2(double opn2) {
        this.opn2 = opn2;
    }
    public char getOp() {
        return op;
    }
    public void setOp(char op) {
        this.op = op;
    }
    
    // public String Imprimir(){
    //     String saida = "";
    //     saida += "#### CONTAS #### \n" + getOpn1() + "+" + getOpn2() + " = " + getOpera() ;
    //     return saida;
    // }
}
