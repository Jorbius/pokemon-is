package Modelo.Tipos;

import Modelo.Pokemon;

public class PokemonAcero extends Pokemon{

	public PokemonAcero(int pPosicion) {
		super(pPosicion);
		this.tipo = Tipo.ACERO;
	}
	
	protected int aumentarAtaque(Tipo tipo) {
		int aumento = 1;
		if (tipo.equals(Tipo.HIELO) || tipo.equals(Tipo.ROCA)|| tipo.equals(Tipo.HADA)) {
			aumento = this.random.nextInt(2)+2;
		}
		return aumento;
	}
}