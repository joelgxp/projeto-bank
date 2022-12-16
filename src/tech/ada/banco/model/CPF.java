package tech.ada.banco.model;

public class CPF extends Documento{
    public CPF(String valor) {
        super(valor);
    }

    @Override
    public void setValor(String valor) {
        if(valor.length()!=11) {
            throw new RuntimeException("Tamanho do CPF invalido.");
        }
        super.setValor(valor);
    }
}
