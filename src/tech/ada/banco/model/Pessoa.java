package tech.ada.banco.model;

import java.time.LocalDate;

public class Pessoa {

    String nome;
    private LocalDate dataNascimento;
    String cpf;
    String telefone;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {

            this.dataNascimento = dataNascimento;
            setCpf(cpf);
            this.nome = nome;
    }

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this(nome, cpf, LocalDate.parse(dataNascimento));
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Sr" + nome + '\'' +
                ", vc nasceu na data" + dataNascimento + '\'' +
                ", portador do CPF" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.plusYears(18).isAfter(LocalDate.now())) {
            throw new RuntimeException("Data inválida!");
        } else {
            this.dataNascimento = dataNascimento;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length()!=11) {
            throw new RuntimeException("Tamanho do CPF invalido.");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}