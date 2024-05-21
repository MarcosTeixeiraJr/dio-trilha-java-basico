package Banco;

public class Main {
    public static void main(String[] args) {

        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");

        Conta cc = new ContaCorrente(marcos);
        Conta poupanca = new ContaPoupanca(marcos);

        cc.depositar(100);
        cc.transferir(50,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
