import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta {
    /**
     * <h1>Condições, Loops e Exceções na Prática com Java</h1>
     * Desafio de código 3 / 5  da DIO - Verificador de Idade para Conta Bancária
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   01/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

// TODO: Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
        if(idade >= 18)
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        else
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}