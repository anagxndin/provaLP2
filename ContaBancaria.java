public class ContaBancaria {

    static String cliente;
    static int numConta;
    static float saldo;
    float saque;
    float deposito;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public static void Sacar(float saque){
        if(saldo > 0){
            float sacar = saldo - saque;
        }
        else{
            System.out.println("Saldo negativo");
        }
        
    }

    public static void Depositar(float deposito){
        float depositar = saldo + deposito;
    }
    
}
