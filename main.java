public class main {
    public static void main(String[] args) {

        cliente ana = new cliente("001", "Ana");
        accountManager conta = accountManager.getInstance("001", 1000);

        ana.verSaldo(); 

        ana.depositar(200);
        ana.verSaldo(); 

        cliente bruno = new cliente("002", "Bruno");
        bruno.verSaldo(); 

        accountManager.destruirInstancia();

        accountManager novaConta = accountManager.getInstance("003", 500);
        cliente carol = new cliente("003", "Carol");
        carol.verSaldo(); 
    }
}
