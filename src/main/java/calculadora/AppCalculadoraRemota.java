package calculadora;

import CalculadoraGUI.CalculadoraGUI;

public class AppCalculadoraRemota {

	public static void main(String[] args) {
		AdaptadorCalculadoraRemota adaptador = new AdaptadorCalculadoraRemota();
		new CalculadoraGUI(adaptador);
	}

}
