import java.util.Scanner;

public class Main {
    public static int escolha;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        saldo minhaConta = new saldo();
        operacoes op = new operacoes();

        System.out.println("Bem-Vindo ao UniCoins!");
        System.out.println("Diga o seu nome");
        String nome = scanner.nextLine();

        System.out.println("---------------------");
        System.out.println("Usuário: " + nome);
        System.out.println("Seu saldo atual é: " + minhaConta.saldoAtual);
        System.out.println("---------------------");
        System.out.println("Bem-vindo à sua carteira digital!");

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Saldo");
            System.out.println("2 - Realizar Pagamento");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Sair");

            escolha = scanner.nextInt();
            op.executarEscolha(escolha, minhaConta, nome);
            System.out.println("---------------------");

        } while (escolha != 4);

        System.out.println("Obrigado por usar o UniCoins!");
    }
}

class saldo {
    public double saldoAtual = 0;
}