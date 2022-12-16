package tech.ada.banco;

import tech.ada.banco.model.Conta;
import tech.ada.banco.model.ContaEspecial;
import tech.ada.banco.model.ModalidadeConta;
import tech.ada.banco.model.Pessoa;
import tech.ada.banco.services.*;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Banco {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada.");
        Pix pix = new Pix();
        Deposito deposito = new Deposito();
        Saque saque = new Saque();
        Saldo saldo = new Saldo();
        boolean ligado = true;
        while (ligado) {
            menu();
            int opcao = LeitorTeclado.getNumero("Digite uma das opções.");
            switch (opcao) {
                case 0:
                    System.out.println("O programa será finalizado. Te vejo depois!");
                    ligado = false;
                    break;

                case 1:
                    AberturaDeConta.executar();
                    break;

                case 2:
                    deposito.executar();
                    break;

                case 3:
                    saque.executar();
                    break;

                case 4:
                    pix.transferirDinheiro();
                    break;

                case 5:
                    saldo.executar();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("Escolha uma das opções abaixo.");
        System.out.println("0 - Para Encerrar.");
        System.out.println("1 - Para abrir uma conta.");
        System.out.println("2 - Para depositar um valor.");
        System.out.println("3 - Para retirar um valor.");
        System.out.println("4 - Para realizar uma transferência via PIX.");
        System.out.println("5 - Obter saldo da conta.");

    }

}