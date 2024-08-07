import java.util.Scanner;
import java.util.Locale;

public class Contador {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();  // Lendo o primeiro parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois =scanner.nextInt();  // Lendo o segundo parâmetro

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}

// Exceção customizada
class ParametrosInvalidosException extends Exception {
}