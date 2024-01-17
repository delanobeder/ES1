package br.ufscar.dc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    private Triangulo t;
    
    @BeforeEach
    public void setUp() throws Exception {
        t = new Triangulo();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        t = null;
    }

    @Test
    public void test01() {
        assertEquals(t.classifica(-1, 1, 1), Tipo.NAO);
    }
    
    @Test
    public void test02() {
        assertEquals(t.classifica(1, -1, 1), Tipo.NAO);
    }
    
    @Test
    public void test03() {
        assertEquals(t.classifica(1, 1, -1), Tipo.NAO);
    }

    @Test
    public void test04() {
        assertEquals(t.classifica(4, 1, 1), Tipo.NAO);
    }

    @Test
    public void test05() {
        assertEquals(t.classifica(1, 4, 1), Tipo.NAO);
    }

    @Test
    public void test06() {
        assertEquals(t.classifica(1, 1, 4), Tipo.NAO);
    }

    @Test
    public void test07() {
        assertEquals(t.classifica(1, 1, 1), Tipo.EQ);
    }

    @Test
    public void test08() {
        assertEquals(t.classifica(2, 2, 1), Tipo.ISO);
    }

    @Test
    public void test09() {
        assertEquals(t.classifica(2, 1, 2), Tipo.ISO);
    }

    @Test
    public void test10() {
        assertEquals(t.classifica(1, 2, 2), Tipo.ISO);
    }

    @Test
    public void test11() {
        assertEquals(t.classifica(3, 4, 5), Tipo.ESC);
    }
}
