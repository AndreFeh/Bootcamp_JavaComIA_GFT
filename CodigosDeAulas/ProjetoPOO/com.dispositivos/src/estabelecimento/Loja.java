package estabelecimento;

import equipaqmento.impressora.DeskJet;
import equipaqmento.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();
        equipamentoMultifuncional.digitalizar();
        equipamentoMultifuncional.copiar();
        equipamentoMultifuncional.imprimir();

        /*Agora se um equipamento que nao */
        DeskJet deskJet = new DeskJet();
        deskJet.imprimir();
//        deskJet.digitalizar;
//        deskJet.copiar;
        /*^- Ele nao tem as funcoes definidas por implements, dessa forma, nao é autorizado*/

    }
}
