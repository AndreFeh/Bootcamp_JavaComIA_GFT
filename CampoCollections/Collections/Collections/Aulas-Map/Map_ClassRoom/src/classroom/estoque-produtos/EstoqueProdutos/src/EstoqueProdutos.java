import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueMap =  new HashMap();

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void addProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

//    CALC VALOR TOTAL ESTOQUE
    public double calcEstoque(){
        Double valorTotEstoque = 0d;
        if(!estoqueMap.isEmpty()){
            /*Quero passar por todos os produtos da "Map"*/
            for (Produto p : estoqueMap.values()){ /*VALUES ele vai pegar os valores dentro da lista/map*/
                valorTotEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotEstoque;
    }

    public Produto valorMaisALto(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }
}
