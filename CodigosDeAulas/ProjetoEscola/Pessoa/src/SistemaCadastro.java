public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos", "18.165.154-81");

        System.out.println(
                "Nome: " + pessoa1.getNome() +
                "\nCPF: " + pessoa1.getCpf());
    }
}
