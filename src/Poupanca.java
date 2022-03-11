public class Poupanca extends Conta{
    public static final String TIPO = "Poupança";
    public Poupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        super.imprimirInfoComuns();
        System.out.println("*** Extrato " + TIPO + " ***");
        super.imprimirExtrato();
    }
}
