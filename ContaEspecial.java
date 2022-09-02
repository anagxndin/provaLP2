public class ContaEspecial extends ContaBancaria {

    double limite;


    public ContaEspecial(String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
    }

    public static void Sacar(float saque){
        float sacar = saldo - saque;
    }
    
}
