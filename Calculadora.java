import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples em Java");
        System.out.println("--------------------------");
        
        while (true) {
            System.out.println("\nOperações disponíveis:");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");
            
            System.out.print("Escolha uma operação (1-5): ");
            int escolha = scanner.nextInt();
            
            if (escolha == 5) {
                System.out.println("Saindo da calculadora...");
                break;
            }
            
            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            String operacao = "";
            
            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    operacao = "+";
                    break;
                case 2:
                    resultado = num1 - num2;
                    operacao = "-";
                    break;
                case 3:
                    resultado = num1 * num2;
                    operacao = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        operacao = "/";
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;
                    }
                    break;
            }
            
            System.out.printf("\nResultado: %.2f %s %.2f = %.2f\n", num1, operacao, num2, resultado);
        }
        
        scanner.close();
    }
}
