package br.com.senac.dojo.modulo10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaModulo10 {
	private int numero = 261533;
	private Modulo10 modulo10;
	
	@Before
	public void setUp(){
		modulo10 = new Modulo10(numero);
	}

	@Test
	public void testaDivisaoDosDigitos() {
		int digitos[] = {2,6,1,5,3,3};
		
		assertArrayEquals(digitos, modulo10.digitos());
	}

	@Test
	public void testaMultiplicacaoDeDigitos(){
		int multiplicacao[] = {2*1,6*2,1*1,5*2,3*1,3*2};
		
		assertArrayEquals(multiplicacao, modulo10.multiplicacao());
		
	}
	@Test
	public void testaExplosaoDaMultiplicacao(){
		int digitos[] = {2,1,2,1,1,0,3,6};
		
		assertArrayEquals(digitos, modulo10.explosaoDaMultiplicacao());
		
	}
	
	@Test
	public void testaSomatorioDaMultiplicacao() {
		int digitos[] = {2,1,2,1,1,0,3,6};
		int resultado = digitos[0] + digitos[1] + digitos[2] + digitos[3] + digitos[4] + digitos[5] + digitos[6] + digitos[7];

		assertEquals(resultado, modulo10.somatorioDaMultiplicacao());
		
	} 
	
	@Test
	public void testaResto(){
		int result = 0;
		
		result = modulo10.somatorioDaMultiplicacao()%10;
		
		assertEquals(result, modulo10.resto() );
		
	}
	
	@Test
	public void testaDigitoVerificador(){
		
		int result = 0;
		
		result = 10 - modulo10.resto();
		
		assertEquals(result, modulo10.digitoVerificador());
		
	}
	
	@Test
	public void testaDigitoZero(){
		int numero = 81;
		
		Modulo10 modulo10 = new Modulo10(numero);
		
		assertEquals(0, modulo10.digitoVerificador());
	}
	
}
