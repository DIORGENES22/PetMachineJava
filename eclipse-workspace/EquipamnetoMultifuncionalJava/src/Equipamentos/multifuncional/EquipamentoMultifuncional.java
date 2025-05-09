package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitadora.Digitadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora,Digitadora,Impressora {

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	
	public void digitalizar() {
		System.out.println("DIGITANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}


	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

}
