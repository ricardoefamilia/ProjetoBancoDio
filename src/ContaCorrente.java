public class ContaCorrente extends Conta{
    private static final String TIPO = "Conta Corrente";
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfoComuns();
    }
}
