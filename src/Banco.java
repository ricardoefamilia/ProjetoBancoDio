import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;
    public void imprimirExtratosContas(){
        for (Conta conta: contas) {
            conta.imprimirExtrato();
        }
    }

    public List<Conta> getContas() { return contas; }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
