package tech.ada.banco;

import tech.ada.banco.Pessoa;

import java.time.LocalDate;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco ADA.");

        Pessoa pessoa1 = new Pessoa("Joel", "123.456.789-00", LocalDate.parse("1984-08-13"));
        System.out.println("O nome da pessoa é " + pessoa1.nome);
        System.out.println("O CPF da pessoa é " + pessoa1.cpf);
        System.out.println("A data de nascimento da pessoa é " + pessoa1.getDataNascimento());
        System.out.println("O telefone da pessoa é " + pessoa1.telefone);






    }

}
