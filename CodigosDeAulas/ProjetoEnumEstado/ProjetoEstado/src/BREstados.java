public enum BREstados {
// Antes de começar o codigo, em ENUM deve colocar as opcoes que quer que apareca
    SAO_PAULO("SP", "Sao Paulo", 11), RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 12), MARANHAO("MA", "Maranhao", 13);
    String nome, sigla;
    int codIbge;

    BREstados(String nome, String sigla, int codIbge) {
        this.nome = nome;
        this.sigla = sigla;
        this.codIbge = codIbge;
    }

    public int getCodIbge(){
        return codIbge;
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
