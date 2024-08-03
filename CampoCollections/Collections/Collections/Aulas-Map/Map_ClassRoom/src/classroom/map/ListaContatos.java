package classroom.map;

import java.util.HashMap;
import java.util.Map;

public class ListaContatos {
    private Map<String, Integer> listaMap;

    public ListaContatos() {
        this.listaMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone) {
        listaMap.put(nome, telefone);
    }

    public void rmContato(String nome) {
        if (!listaMap.isEmpty()) {
            listaMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(listaMap);
    }

    public Integer pesquisaNome(String nome) {
        Integer pesquisaPorNome = null;
        if (!listaMap.isEmpty()) {
            listaMap.get(nome);
            pesquisaPorNome = listaMap.get(nome);
        } else System.out.println("Contato nao encontrado");
        return pesquisaPorNome;
    }


    public void atualizarContato(String nome, Integer telefone) {
        if (listaMap.containsKey(nome)) {
            listaMap.put(nome, telefone);/*Como map trabalha com atualização da ultima informação, ira atualizar*/
        } else System.out.println("erro");
    }
}

class Application {
    public static void main(String[] args) {
        ListaContatos contatos = new ListaContatos();

        contatos.addContato("Kurt", 995654562);
        contatos.addContato("Jhonathan", 998629765);
        contatos.addContato("Louise", 995346330);
        contatos.addContato("Jessy", 997704540);
        contatos.addContato("Ysmael", 998759680);
        contatos.addContato("Izak", 994611932);
        contatos.addContato("Karol", 995498180);

        contatos.exibirContato();
        contatos.pesquisaNome("Jess");
        contatos.pesquisaNome("Jessy");
        contatos.exibirContato();
        contatos.rmContato("Izak");
        contatos.exibirContato();
        contatos.atualizarContato("Jessy", 996463310);
        contatos.exibirContato();
        contatos.atualizarContato("Jess", 996463310);




    }
}