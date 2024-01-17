package br.ufscar.dc.es;

import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepetidoTest {

  // Teste repetido (será executado 5 vezes)
  // São recomendados no caso de testes flaky
  @RepeatedTest(5)
  public void testaSeNumeroPar() {
    assertTrue(Calculadora.isEven(2));
  }
  
}