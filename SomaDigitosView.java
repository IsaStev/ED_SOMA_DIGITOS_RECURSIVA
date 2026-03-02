package view;
import controller.SomaDigitosController;

public class SomaDigitosView {

	public static void main(String[] args) {
		
		SomaDigitosController sdc = new SomaDigitosController();
		
        int n = 123;
        System.out.println("Soma dos dígitos de " + n + ": " + sdc.somaDigitos(n));

	}
}