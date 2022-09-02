public class ContasJava {
    public static void main(String[] args) {
        
        ContaPoupanca cliente = new ContaPoupanca("João", 1315, 345678, 15, 0);
    
        cliente.Sacar(135);
        cliente.Depositar(456);
        cliente.calcularNovoSaldo(10);
        System.out.println("O cliente" + cliente.getCliente() + "tem R$" + cliente.getSaldo() + "de saldo");
        System.out.println("Nome: " + cliente.getCliente() + "\n Número da Conta: " + cliente.getNumConta() + "\n Saldo: " + cliente.getSaldo() + "Dia de Rendimento: " + cliente.getDiaDeRendimento());
    }

    
}
