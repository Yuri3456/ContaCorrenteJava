package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        double saldo, limiteDeSaqueDiario, valorDeChequeEspecial, saque, depositar;
        
        SetsGets pegar = new SetsGets();
        Scanner texto = new Scanner(System.in);
        
        System.out.println("Informe o Saldo: ");
        saldo = texto.nextInt();
        
        System.out.println("Informe o limite de saque diario: ");
        limiteDeSaqueDiario = texto.nextInt();
        
        System.out.println("Informe o valor de cheque especial: ");
        valorDeChequeEspecial = texto.nextInt();
        
        System.out.println("Quanto quer sacar: ");
        saque = texto.nextInt();
        
        System.out.println("Quanto quer depositar: ");
        depositar = texto.nextInt();
        
        pegar.setSaldo(saldo);
        pegar.setLimiteDeSaqueDiario(limiteDeSaqueDiario);
        pegar.setValorDeChequeEspecial(valorDeChequeEspecial);
        pegar.setSaque(saque);
        pegar.setDepositar(depositar);
        
        pegar.mostrarTudo();
    }
}
