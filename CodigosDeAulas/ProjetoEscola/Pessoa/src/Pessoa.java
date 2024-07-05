public class Pessoa {
    private String nome, cpf, endereco;

//    Dessa forma, obrigatoriamente, quando criar uma pessoa
//        Essa pessoa deve ter os atributos NOME e CPF

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
