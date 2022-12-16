package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;

public class Deposito {

    public void executar() {
        int numeroConta = LeitorTeclado.getNumero("Digite conta: ");
        executar(numeroConta);

    }

    public void executar(int numeroConta) {
        Conta conta = Conta.obtemContaPeloNumero(numeroConta);
        executar(conta);

    }

    public void executar(Conta conta) {
        int valor = LeitorTeclado.getNumero("Digite valor deposito: ");
        executar(conta, valor);
    }

    public void executar(Conta conta, int valor) {
       conta.deposito(BigDecimal.valueOf(valor));
        System.out.println("O saldo da conta é R$" + conta.getSaldo());

    }
}
