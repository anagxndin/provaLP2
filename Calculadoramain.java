import java.util.Scanner;

public class Calculadoramain {

    public static void main(String[] args) {

        
    Scanner entrada = new Scanner(System.in);
    System.out.println("Calculadora - Menu");
    System.out.println("Escolha uma operação:\n Digite '1' para Somar\n Digite '2' para Subtrair\n Digite '3' para Multiplicar \n Digite '4' para Dividir \n Digite '5' para Módulo;");
    int operacao = entrada.nextInt();
    System.out.println("Escolha um valor: ");
    double num1 = entrada.nextDouble();
    System.out.println("Escolha outro valor: ");
    double num2 = entrada.nextDouble();
    Calculadora c = new Calculadora(num1, num2);

    switch (operacao) {
        case 1:
            double resultado = c.Somar();
            System.out.println("Resultado da soma = " + resultado);
        break;
        case 2:
            resultado = c.Subtrair();
            System.out.println("Resultado da subtração = " + resultado);
        break;
        case 3:
            resultado = c.Multiplicar();
            System.out.println("Resultado da multiplicação = " + resultado);
        break;
        case 4:
            resultado = c.Dividir();
            System.out.println("Resultado da divisão = " + resultado);
        break;
        case 5:
            resultado = c.Mod();
            System.out.println("Resultado do Módulo de divisão = " + resultado);
        break;
        default:
            break;
    }

    entrada.close();
    }

}
