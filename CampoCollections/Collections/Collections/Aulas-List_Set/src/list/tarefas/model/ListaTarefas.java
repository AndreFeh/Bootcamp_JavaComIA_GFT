package list.tarefas.model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
//    Atributo List
    private List<Tarefa> tarefaList;

//    Quero um construtor vazio para adicionar Descricoes
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

//    Void pois nao vou retornar nada, so adicionar algo
    public void adicionarTarefa (String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

//    Remover tarefa pela descrição
//        REMOVE ALL para remover todas com a mesma descricao
    public void removerTarefa(String descricao){
//         Criar uma nova lista, verificando todos com a msm descicao
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
         for(Tarefa t : tarefaList){
             if(t.getDescricao().equalsIgnoreCase(descricao)){
                 tarefaParaRemover.add(t);
             }
         }/*Percorrendo toda lista, ele finaliza*/
        tarefaList.removeAll(tarefaParaRemover);/*Vai remover todos os com mesma desc*/
    }

//    Saber a quantidade de elementos na lista
    public int obterQtdTarefas(){
        return tarefaList.size();
    }

//    Descricao das Tarefas
    public void obterDescTarefas(){
        System.out.println(tarefaList);
    }

}
