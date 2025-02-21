package calculadoratest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testSuma() {
		 Calculadora calc = new Calculadora();
		    int a = 1234;
		    int b = 5678;
		    int actual = calc.suma(a, b);
		 
		    int esperado = 6912;
		 
		    assertEquals(esperado, actual);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora();
	    int a = 2;
	    int b = 2;
	    int actual = calc.suma(a, b);
	 
	    int esperado = 0;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora();
	    int a = 2;
	    int b = 2;
	    int actual = calc.suma(a, b);
	 
	    int esperado = 4;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora();
	    int a = 2;
	    int b = 2;
	    int actual = calc.suma(a, b);
	 
	    int esperado = 1;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testPotencia() {
		Calculadora calc = new Calculadora();
	    double b = 2;
	    double e = 2;
	    double actual = calc.potencia(b, e);
	 
	    double esperado = 4;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testRaizCuadrada() {
		Calculadora calc = new Calculadora();
	    double numero=9;
	    double actual = calc.raizCuadrada(numero);
	 
	    double esperado = 3;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testLogaritmoNatural() {
		Calculadora calc = new Calculadora();
	    double numero=2;
	    double actual = calc.logaritmoNatural(numero);
	 
	    double esperado = 0.6931471805599453;
	 
	    assertEquals(esperado, actual);
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
