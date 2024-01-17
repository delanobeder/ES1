package br.ufscar.dc.es;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizadoTest {

	// teste parametrizado
	// ele será chamado 5 vezes pelo framework de teste
	// parâmetros de cada chamada são informados explicitamente (@ValueSource)
	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	public void testaSeNumeroPar1(int n) {
		assertTrue(Calculadora.isEven(n));
	}

	// teste não-parametrizado
	@Test
	public void testaSeNumeroPar2() {
		assertTrue(Calculadora.isEven(2));

		// como o assert anterior vai falhar
		// na prática, os próximos assert não serão executados
		assertTrue(Calculadora.isEven(4));
		assertTrue(Calculadora.isEven(6));
		assertTrue(Calculadora.isEven(8));
		assertTrue(Calculadora.isEven(10));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	void testaSeNumeroImpar1(int n) {
		assertFalse(Calculadora.isEven(n));
	}

}