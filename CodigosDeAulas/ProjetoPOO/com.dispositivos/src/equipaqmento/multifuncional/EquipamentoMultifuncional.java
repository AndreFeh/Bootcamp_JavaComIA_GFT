package equipaqmento.multifuncional;

import equipaqmento.copiadora.Copiadora;
import equipaqmento.digitalizadora.Digitalizadora;
import equipaqmento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO EM EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO EM  EM EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO EM EQUIPAMENTO MULTIFUNCIONAL");
    }
}
