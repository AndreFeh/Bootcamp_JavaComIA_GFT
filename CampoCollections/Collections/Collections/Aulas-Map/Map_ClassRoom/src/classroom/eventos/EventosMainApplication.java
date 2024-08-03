package classroom.eventos;

import java.time.LocalDate;

public class EventosMainApplication {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

//        eventos.addEvento(2025-12-12, "Evento 1", "Show de Bolhas");
        eventos.addEvento(LocalDate.of(2022, 12, 5), "Evento 1","Atracao 1");
        eventos.addEvento(LocalDate.of(2022, 5, 12), "Evento 2","Atracao 2");
        eventos.addEvento(LocalDate.of(2024, 12, 6), "Evento 3","Atracao 3");
        eventos.addEvento(LocalDate.of(2022, 11,14), "Evento 4","Atracao 4");
        eventos.addEvento(LocalDate.of(2023, 9, 11), "Evento 5","Atracao 5");
        eventos.addEvento(LocalDate.of(2025, 6, 05), "Evento 6","Atracao 6");

        eventos.showEvento();
        eventos.wichNextEvento();

    }
}
