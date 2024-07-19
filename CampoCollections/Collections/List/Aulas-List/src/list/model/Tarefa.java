package list.model;

public class Tarefa {
    private String descricao;

    public Tarefa (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

//    Como iremos lidar com Array/Arraylist,
//    necessario mudar a forma que aparece,
//      em vez de aparecer a forma que esta alocado na memoria,
//      aparecer a descricao da Tarefa em formato de txt
    /**Para isso, Sobrescrever o ToString*/

//    @Override
//    public String toString() {
//        return "Tarefa{" +
//                "descricao='" + descricao + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return descricao;
    }
}

