package Modelo.Tipos;

import Modelo.Pokemon;

public class PokemonHada extends Pokemon{

	public PokemonHada(int pPosicion) {
		super(pPosicion);
		this.tipo = Tipo.HADA;
	}
	
	protected int aumentarAtaque(Tipo tipo) {
		int aumento = 1;
		if (tipo.equals(Tipo.ELECTRICO) || tipo.equals(Tipo.PLANTA)) {
			aumento = this.random.nextInt(2)+2;
		}
		return aumento;
	}
}
