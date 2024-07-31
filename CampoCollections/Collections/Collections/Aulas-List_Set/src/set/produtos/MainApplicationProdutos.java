package set.produtos;

import java.util.Set;

public class MainApplicationProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1000000, "Sabao", 10, 5.99);
        cadastroProdutos.adicionarProduto(1000001, "Pasta", 10, 2.49);
        cadastroProdutos.adicionarProduto(1000002, "Shampoo", 10, 6.49);
        cadastroProdutos.adicionarProduto(1000003, "PapelHIg", 10, 9.90);
        cadastroProdutos.adicionarProduto(1000004, "Detergente", 10, 5.99);
        cadastroProdutos.adicionarProduto(1000005, "Desinfetante", 10, 8.99);
        cadastroProdutos.adicionarProduto(1000006, "Cloro", 10, 15.90);

        cadastroProdutos.exibirProdutos();
        System.out.println(cadastroProdutos.ordenarPorNome());
        System.out.println(cadastroProdutos.ordenarPorPreco());
    }
}
