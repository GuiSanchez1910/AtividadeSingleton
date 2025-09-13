public class accountManager {

    private static accountManager instancia; 
    private String contaId;
    private double saldo;

    private accountManager(String contaId, double saldoInicial) {
        this.contaId = contaId;
        this.saldo = saldoInicial;
    }

    public static accountManager getInstance(String contaId, double saldoInicial) {
        if (instancia == null) {
            instancia = new accountManager(contaId, saldoInicial);
        }
        return instancia;
    }

    public static void destruirInstancia() {
        instancia = null;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double verSaldo() {
        return saldo;
    }

    public String getContaId() {
        return contaId;
    }
}
