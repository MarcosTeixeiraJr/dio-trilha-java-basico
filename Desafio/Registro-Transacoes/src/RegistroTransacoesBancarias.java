import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacao = new ArrayList<>();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                transacao.add(String.format("Deposito de %.1f", valorTransacao));
            } else if (tipoTransacao == 'S' || tipoTransacao == 's'){
                saldo -= valorTransacao;
                transacao.add(String.format("Saque de %.1f", valorTransacao));
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        for (int i = 0; i < transacao.size(); i++) {
            System.out.println((i + 1) + ". " + transacao.get(i));
        }
        scanner.close();
    }
}
