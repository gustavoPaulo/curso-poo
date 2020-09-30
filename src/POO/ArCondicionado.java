package POO;

import java.util.Random;

public class ArCondicionado {

	private int temperatura = 24;
	
	
	public void alterarTemperatura(int temperatura) {

		if(temperatura >= 16 && temperatura <= 28) {
			
			gerarNumeroSala();
			
			this.temperatura = temperatura;
			System.out.println("Temperatura atual: " + this.temperatura + "�");
			
		} else if(temperatura < 16){
			
			System.out.println("A temperatura m�nima do ar � de 16�.");
			
		} else if(temperatura > 28) {
			
			System.out.println("A temperatura m�xima do ar � de 28�.");
		
		} else if(temperatura == 0 || temperatura < 0) {
			
			System.out.println("Temperatura padr�o: " + this.temperatura + "�");
		}
	}
	
	public void gerarNumeroSala() {
		
		Random gerador = new Random();
		
		for (int i = 1; i < 2; i++) {
            System.out.println("A sala " + gerador.nextInt(10) + " est� liberada.");
        }
		
	}
	
}
