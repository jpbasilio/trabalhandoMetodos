package trabalhando.metodos;

public class Calculadora {

     public static void soma(double num1, double num2){
          double result = num1 + num2;

          System.out.println("A soma dos numeros, " + num1 + " mais " + num2 + " é: " + result);
     }
     public static void subtracao(double num1, double num2){
          double result = num1 - num2;

          System.out.println("A subtração dos numeros, " + num1 + " menos " + num2 + " é: " + result);
     }
     public static void multiplicacao(double num1, double num2){
          double result = num1 * num2;

          System.out.println("A Multiplicação dos numeros, " + num1 + " vezes " + num2 + " é: " + result);
     }
     public static void divisao(double num1, double num2){
          double result = num1 / num2;

          System.out.println("A Divisão dos numeros, " + num1 + " por " + num2 + " é: " + result);
     }
}
