package calculadora;

import CalculadoraGUI.ICalculadora;
import service.client.ClienteCalculadora;

public class AdaptadorCalculadoraRemota implements ICalculadora {

	private ClienteCalculadora operador;
	
	public AdaptadorCalculadoraRemota() {
		this.operador = new ClienteCalculadora();
	}
	
	@Override
	public double sumar(double operando1, double operando2) {
		double result = operador.sumar(operando1, operando2);
		return result;
	}

	@Override
	public double restar(double operando1, double operando2) {
		double result = operador.restar(operando1, operando2);
		return result;
	}
	
	@Override
	public double multiplicar(double operando1, double operando2) {
		double result = operador.multiplicar(operando1, operando2);
		return result;	
	}

	@Override
	public double dividir(double dividendo, double divisor) throws Exception {
		if(divisor == 0) {
			if(dividendo == 0) {
				throw new Exception("Indeterminación");
			} else {
				throw new Exception("Infinito");
			}
		}
		double result = operador.dividir(dividendo, divisor);
		return result;
	}
	
	@Override
	public double elevarAlCuadrado(double operando) {
		double result = operador.cuadrado(operando);
		return result;
	}
	
	
	@Override
	public void memoriaAniadir() { 
		operador.memoriaAniadir();
	}
	
	@Override
	public void memoriaLimpiar() {
		operador.memoriaACero();
	}
	
	@Override
	public double memoriaObtener() {
		return operador.memoriaRecuperar();
	}
	
	@Override
	public double obtenerUltimoResultado() {
		return operador.ultimoResultado();
	}
		
}
