public class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    protected int agencia = AGENCIA_PADRAO;
    protected int nrConta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.nrConta = sequencial++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Sacou R$" + valor + " da conta: " + nrConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositou R$" + valor + " na conta: " + nrConta);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
    }

    public void imprimirInfoComuns(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("CPF: " + this.cliente.getCpf());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Nr. Conta: " + this.nrConta);
        System.out.printf("Saldo: %.2f", saldo);
        System.out.println();
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
}
