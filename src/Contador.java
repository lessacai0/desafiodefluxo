import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            validarParametros(parametroUm, parametroDois);
            int contagem = parametroDois - parametroUm;
            imprimirNumeros(contagem);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    private static void imprimirNumeros(int contagem) {
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (i + contagem));
        }
    }
}
