
public class Calculadora {

    double valor1;
    double valor2;

    

    public Calculadora(double num1, double num2) {
        this.valor1 = num1;
        this.valor2 = num2;
    }

    public double Somar() {
        return valor1 + valor2;
    }

    public double Subtrair() {
        return valor1 - valor2;
    }

    public double Multiplicar() {
        return valor1 * valor2;
    }

    public double Dividir() {
        return valor1 / valor2;
    }

    public double Mod() {
        return valor1%valor2;
    }


}