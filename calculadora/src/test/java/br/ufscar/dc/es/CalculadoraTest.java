package br.ufscar.dc.es;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testeSoma1a() {
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 5;
		int resultadoRetornado = calc.soma(2, 3);
		assertEquals(resultadoEsperado, resultadoRetornado);
	}

	@Test
	public void testeSoma1b() {
		Calculadora calc = new Calculadora();
		int resultadoRetornado = calc.soma(3, 2);
		assertEquals(5, resultadoRetornado);
	}

	@Test
	public void testeSoma1c() {
		Calculadora calc = new Calculadora();
		int resultadoRetornado = calc.soma(2, 3);
		assertEquals(resultadoRetornado, 5);
	}

	@Test
	public void testeSoma2() {
		Calculadora calc = new Calculadora();
		assertEquals(10, calc.soma(4, 6));
	}

	@Test
	public void testeSubtracao() {
		Calculadora calc = new Calculadora();
		assertEquals(2, calc.subtrai(6, 4));
	}

}