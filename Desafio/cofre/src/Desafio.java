import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Desafio { // Ajuste aqui, a classe deve ser pública
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tipo de cofre (primeira linha da entrada)
        String tipoCofre = scanner.nextLine().trim(); // .trim() para remover espaços em branco

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Lê a senha do cofre digital
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);

            // Lê a confirmação da senha
            int confirmacaoSenha = scanner.nextInt();
            if (!cofreDigital.validarSenha(confirmacaoSenha)) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            } else {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre desconhecido!");
        }

        // Fecha o scanner após o uso
        scanner.close();
    }
}


