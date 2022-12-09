package tech.ada.banco;

import tech.ada.banco.model.Conta;
import tech.ada.banco.model.ModalidadeConta;
import tech.ada.banco.model.Pessoa;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco ADA.");

        Conta conta1 = new Conta(ModalidadeConta.CONTA_POUPANCA, null);
        conta1.deposito(BigDecimal.valueOf(100));

        Conta conta2 = new Conta(ModalidadeConta.CONTA_CORRENTE, null);

        //conta2.saque(BigDecimal.valueOf(50),(conta2.deposito(50));

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

    }

}
