public class SistemaIBGE {
    // Definir Main para Rodar Programa
    public static void main(String[] args) {
        /*Quero mostrar todas as opcoes disponiveis em BR Estados*/
        for(BREstados e: BREstados.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() +" - " + e.getCodIbge());
        }
        BREstados bre = BREstados.SAO_PAULO;

        System.out.println(bre.getSigla() + " - " + bre.getNome() + bre.getCodIbge());
    }
}
