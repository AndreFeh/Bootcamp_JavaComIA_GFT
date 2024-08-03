package classroom.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaMap = new HashMap();

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

//    Adicionar Evento (PUT)
    public void addEvento(LocalDate date, String nome, String atracao){
        Evento evento = new Evento(nome, atracao); /*Fazendo dessa forma, evita ter que criar la dentro do Put*/
        agendaMap.put(date, evento);
    }

//    Para Ordenacao
    public void showEvento(){
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaMap);
        /*COMO DATE VEM DE TIME QUE EXTENDE COMPARABLE, CONSEGUIMOS FAZER DESSA FORMA*/
        System.out.println(agendaTreeMap);
    }

    public void wichNextEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaMap);

        for(Map.Entry<LocalDate, Evento> entry : agendaTreeMap.entrySet()){
//        ^ Sobre isso, dentro de EntrySet ele retorna Set (Sao de tipo unico),
//        vao ter objetos Map.Entry que apontam chave e valor correspondente (Determinada Key, Determinado Valor)
//            Pode ser feito dessa forma...
//        for(var entry : agendaMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O Proximo Evento é: " + entry.getValue() + ", Acontecera em " + entry.getKey());
            }

        }
    }
}
