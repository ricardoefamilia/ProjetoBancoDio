public class Poupanca extends Conta{
    private static final String TIPO = "Poupança";
    public Poupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfoComuns();
    }
}
