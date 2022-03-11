public class ContaCorrente extends Conta{
    public static final String TIPO = "Conta Corrente";
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        super.imprimirInfoComuns();
        System.out.println("*** Extrato " + TIPO + " ***");
        super.imprimirExtrato();
    }

}
