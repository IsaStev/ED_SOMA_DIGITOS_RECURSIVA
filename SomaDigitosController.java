package controller;

public class SomaDigitosController {

	public SomaDigitosController() {
		super();
		
	}
	
	public int somaDigitos(int n) {
        //CONDIÇÃO DE PARADA
        if (n == 0) {
            return 0;
        }
        //CHAMADA
        return (n % 10) + somaDigitos(n / 10);
    }
}