package calculadora;

import CalculadoraGUI.CalculadoraGUI;

public class AppCalculadora {

	public static void main(String[] args) {
		AdaptadorCalculadora adaptador = new AdaptadorCalculadora();
		new CalculadoraGUI(adaptador);
	}

}
