public enum BREstados {
// Antes de começar o codigo, em ENUM deve colocar as opcoes que quer que apareca
    SAO_PAULO("SP", "Sao Paulo"), RIO_DE_JANEIRO("RJ", "Rio de Janeiro");
    String nome, sigla;

    BREstados(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
