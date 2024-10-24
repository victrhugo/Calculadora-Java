import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operacao: ");
        System.out.println("(1) Soma");
        System.out.println("(2) Subtracao");
        System.out.println("(3) Multiplicacao");
        System.out.println("(4) Divisao");

        int operacao = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisao por zero. Erro na operacao");
                }
                break;
            default:
                System.out.println("Operacao invalida");
                return;
        }

        System.out.println("O resultado da operacao ("+operacao+") é: " + resultado);

    }
}
