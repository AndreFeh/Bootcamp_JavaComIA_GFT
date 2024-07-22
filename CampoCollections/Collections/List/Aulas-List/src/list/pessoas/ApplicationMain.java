package list.pessoas;

import list.pessoas.model.OrdenacaoPessoas;

public class ApplicationMain {
    public static void main(String[] args) {

    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.addPessoas("Andre", 23, 1.71);
        ordenacaoPessoas.addPessoas("Zelda", 20, 1.41);
        ordenacaoPessoas.addPessoas("Felipe", 25, 1.90);
        ordenacaoPessoas.addPessoas("Boberman", 32, 1.60);

        System.out.println(ordenacaoPessoas);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
