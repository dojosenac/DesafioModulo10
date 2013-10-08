package br.com.senac.dojo.modulo10;

public class Modulo10 {
    
	private int numero;
    
	public Modulo10(int numero) {
	  this.numero = numero; 	
	}

	public int[] digitos() {
		//Transformando um numero inteiro em uma string
		String stringNumero = String.valueOf(numero);
					
		return digitos(stringNumero);
	}
	
	// método sobrecarregado 
	private int[] digitos(String stringNumero) {	
		
		//Pegando o tamanho da string
		int tamanhoString = stringNumero.length();
		
		//Definindo o tamanho do array baseado no tamanho da string
		int[] result = new int[tamanhoString];

		int intervaloAscii = 48;
		
		for (int i = 0; i < result.length; i++) {
			//subtrai o intervalo para chegar no valor 50ascii = 2 entao 50-48=2
			result[i] = stringNumero.charAt(i) - intervaloAscii;
		}
				
		return result;
	}

	int[] multiplicacao() {
		int multiplicacao[] = digitos();
		for (int i=0;i<multiplicacao.length;i++) {
			if ((i+1)%2==0) {
				multiplicacao[i] = multiplicacao[i]*2;	
			}
			else
				multiplicacao[i] = multiplicacao[i]*1;
				
		}
		
		return multiplicacao;
	}

	int[] explosaoDaMultiplicacao() {
		int digitos[] = multiplicacao();
		String stringDigitos ="";
		
		  for (int i = 0; i < digitos.length; i++) {
			stringDigitos +=digitos[i];
		}
		
		return digitos(stringDigitos);
	}

	int somatorioDaMultiplicacao() {
		int digitos[] = explosaoDaMultiplicacao();
		int result = 0;
		
		for(int i = 0; i<digitos.length; i++){
			result += digitos[i];
		}
	
		return result;
	}

	int resto() {
		int result = 0; 
		result = somatorioDaMultiplicacao()%10;
		return result;
	}

	public int digitoVerificador() {
		int resto = resto();
		
		if(resto == 0){
			return 0;
		}
		return 10 - resto;
	}

}
