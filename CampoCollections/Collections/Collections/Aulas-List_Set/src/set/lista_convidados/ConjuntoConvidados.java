package set.lista_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

//    Adicionar Convidado
    public void adicionarConvidado(String nome, int codConvidado){
        convidadoSet.add(new Convidado(nome, codConvidado));
    }

    public void removerConvidado(int codConvite){
        Convidado convidadoRm = null;
        for (Convidado c : convidadoSet){
            if(c.getCodConvite () == codConvite){
                    convidadoRm = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRm);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

}
