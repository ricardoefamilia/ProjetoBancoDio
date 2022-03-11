import java.util.ArrayList;
import java.util.List;

public class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    protected int agencia = AGENCIA_PADRAO;
    protected int nrConta;
    protected double saldo;
    private List<String> movimentacao = new ArrayList<String>();
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.nrConta = sequencial++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        this.movimentacao.add("Débito de R$" + valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        this.movimentacao.add("Crédito de R$" + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirSaldoConta() {
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }

    @Override
    public void imprimirExtrato() {
        for (String movimento:
                movimentacao) {
            System.out.println(movimento);
        }
        imprimirSaldoConta();
    }

    public void imprimirInfoComuns(){
        cliente.imprimirDadosCliente();
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Nr. Conta: %d", this.nrConta));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNrConta() {
        return nrConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getMovimentacao() {
        return movimentacao;
    }
}
