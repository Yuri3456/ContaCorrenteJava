package ContaCorrente;
import java.util.Scanner;

public class SetsGets {
    double saldo, limiteDeSaqueDiario, valorDeChequeEspecial;
    double saque;
    double depositar;
    
    public void setSaldo(double meuSaldo) {
        saldo = meuSaldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setLimiteDeSaqueDiario(double meuLimiteDeSaqueDiario) {
        limiteDeSaqueDiario = meuLimiteDeSaqueDiario;
    }
    
    public double getLimiteDeSaqueDiario() {
        return limiteDeSaqueDiario;
    }
    
    public void setValorDeChequeEspecial(double meuValorDeChequeEspecial) {
        valorDeChequeEspecial = meuValorDeChequeEspecial;
    }
    
    public double getValorDeChequeEspecial() {
        return valorDeChequeEspecial;
    }

    public void setSaque(double meuSaque) {
        saque = meuSaque;
    }
    
    public double getSaque() {
        return saldo - saque;
    }
    
    public void setDepositar(double meuDepositar) {
        depositar = meuDepositar;
    }
    
    public double getDepositar() {
        return depositar;
    }
    
    public void mostrarTudo() {
        System.out.println(getSaldo());
        System.out.println(getLimiteDeSaqueDiario());
        System.out.println(getValorDeChequeEspecial());
        System.out.println(getSaque());
        System.out.println(getDepositar());
    }
    
    public void sacar() {
        System.out.println(getSaldo());
    }
}
