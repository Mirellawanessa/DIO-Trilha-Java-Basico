import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando os dados do usuário
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados informados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner
        scanner.close();
    }
}
