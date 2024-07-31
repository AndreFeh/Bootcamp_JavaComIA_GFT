package list.tarefas;

import list.tarefas.model.ListaTarefas;

public class MainApplication {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Numero Total de Tarefas: " + listaTarefas.obterQtdTarefas());
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("Numero Total de Tarefas: " + listaTarefas.obterQtdTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.removerTarefa("Tarefa 3");
        System.out.println("Numero Total de Tarefas: " + listaTarefas.obterQtdTarefas());
        listaTarefas.obterDescTarefas(); /*para esse metodo dar certo, necessario configurar o ToString em TAREFA */

    }
}
