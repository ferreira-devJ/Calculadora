package br.com.leoferreira.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);
}
