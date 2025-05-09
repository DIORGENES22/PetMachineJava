package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitadora.Digitadora;
import Equipamentos.impressora.*;
import Equipamentos.impressora.Lasejet;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static  void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = new EquipamentoMultifuncional();
		Digitadora digitadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitadora.digitalizar();
		copiadora.copiar();
	}
}
