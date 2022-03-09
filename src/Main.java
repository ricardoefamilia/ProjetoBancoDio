public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Ricardo Amaral");
        cliente.setCpf("123.123.123-12");
        cliente.setEmail("ricardo@gmail.com");
        cliente.setTelefone("61 95555-5555");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta poupanca = new Poupanca(cliente);
        cc.transferir(30, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
