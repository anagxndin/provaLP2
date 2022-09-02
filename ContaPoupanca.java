public class ContaPoupanca extends ContaBancaria {

    int diaDeRendimento;
    double taxaRendimento;


    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento, double taxaRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
        this.taxaRendimento = taxaRendimento;
    }



    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }



    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }



    public double getTaxaRendimento() {
        return taxaRendimento;
    }



    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }



    public static void calcularNovoSaldo(double taxaRendimento){
        double novoSaldo = saldo + taxaRendimento/100;
    }
    
}
