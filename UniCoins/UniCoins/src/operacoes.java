import java.util.Scanner;

public class operacoes {
    Scanner scanner = new Scanner(System.in);

    public void executarEscolha(int escolha, saldo conta, String nome) {
        double adicionarSaldo = 0;
        double pagar = 0;
        switch (escolha) {
            case 1:
                System.out.println("---------------------");
                System.out.println("Opção 1: Adicionar Saldo");
                System.out.println("Valor que deseja adicionar: ");
                adicionarSaldo = scanner.nextDouble();
                conta.saldoAtual += adicionarSaldo;
                System.out.println("Saldo adicionado: " + adicionarSaldo);
                System.out.println("Saldo adicionado com sucesso!");
                break;
            case 2:
                System.out.println("---------------------");
                System.out.println("Valor do pagamento: ");
                pagar = scanner.nextDouble();
                conta.saldoAtual -= pagar;
                System.out.println("Valor pago: " + pagar);
                System.out.println("Pagamento efetivado com sucesso!");
                break;
            case 3:
                System.out.println("---------------------");
                System.out.println("Opção 3: Verificar Saldo");
                System.out.println(nome + ", seu saldo atual é: " + conta.saldoAtual);
                break;
            default:
                System.out.println("---------------------");
                System.out.println("Opção inválida.");
                break;
        }
    }
}