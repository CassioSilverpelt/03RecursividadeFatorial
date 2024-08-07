package controller;

public class FatorialController {
	public FatorialController() {
		super();
	}
	
	public int funcaoFatorial(int n) {
		if (n == 0) {return 1;}
		//Ponto de Parada decrescente a partir do número recebido. Número se torna 0 e retorna 1. Ultima parada deve retornar 1 para não interferir no resultado.
		else {return n * funcaoFatorial(n-1);}
		//N que multiplica N-1, até N ser 0.
	}
}

