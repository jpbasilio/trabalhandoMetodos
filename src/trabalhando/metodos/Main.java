package trabalhando.metodos;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //Scanner ler = new Scanner(System.in);

        //Variaveis
        /*double numero1, numero2;

        //Entrada
        System.out.println("***Calculadora***");
        System.out.println("Digite um número: ");
        numero1 = ler.nextDouble();                        //UMA OPÇÃO
        System.out.println("Digite outro número: ");
        numero2 = ler.nextDouble();
        **/
        System.out.println(" ");

        System.out.println("***Exercício Calculadora***");
        Calculadora.soma(6,8); //(numero1,numero2)
        Calculadora.multiplicacao(12,7);//(numero1,numero2)
        Calculadora.subtracao(40,14);//(numero1,numero2)
        Calculadora.divisao(56,4);//(numero1,numero2)

        System.out.println("\n***Exercício Mensagem***");
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(14);

        System.out.println("***Exercício Empréstimo***");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 5);


    }
}
