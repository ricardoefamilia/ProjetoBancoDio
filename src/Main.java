import java.util.ArrayList;
import java.util.List;

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

        //cc.imprimirExtrato();
        //poupanca.imprimirExtrato();

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria da Silva");
        cliente2.setCpf("111.222.333-11");
        cliente2.setEmail("maria@gmail.com");
        cliente2.setTelefone("61 9944-5555");

        Conta cc2 = new ContaCorrente(cliente2);
        cc2.depositar(300);

        Conta poupanca2 = new Poupanca(cliente2);
        cc2.transferir(100, poupanca2);

        //cc2.imprimirExtrato();
        //poupanca2.imprimirExtrato();

        List<Conta> listaContas = new ArrayList<Conta>();
        listaContas.add(cc);
        listaContas.add(poupanca);
        listaContas.add(cc2);
        listaContas.add(poupanca2);

        Banco banco = new Banco();
        banco.setContas(listaContas);
        banco.imprimirExtratosContas();

    }
}
