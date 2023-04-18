package Modelo.Tipos;

import Modelo.Pokemon;

public class PokemonHielo extends Pokemon{

	public PokemonHielo(int pPosicion) {
		super(pPosicion);
		this.tipo = Tipo.HIELO;
	}
	
	protected int aumentarAtaque(Tipo tipo) {
		int aumento = 1;
		if (tipo.equals(Tipo.ELECTRICO) || tipo.equals(Tipo.PLANTA)) {
			aumento = this.random.nextInt(2)+2;
		}
		return aumento;
	}
}