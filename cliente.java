public class cliente {
    
    private String id;
    private String nome;

    public cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void depositar(double valor) {
        accountManager.getInstance(id, 0).depositar(valor);
    }

    public void sacar(double valor) {
        accountManager.getInstance(id, 0).sacar(valor);
    }

    public void verSaldo() {
        double saldo = accountManager.getInstance(id, 0).verSaldo();
        System.out.println("Saldo do cliente " + nome + ": " + saldo);
    }
}
