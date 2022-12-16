package tech.ada.banco.exception;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {
        super("Limite acima do saldo disponivel.");
    }
}
