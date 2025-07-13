package calculadora;

import CalculadoraGUI.ICalculadora;
import operador_aritmetico.OperadorAritmetico;

public class AdaptadorCalculadora implements ICalculadora {

	private OperadorAritmetico operador;
	
	public AdaptadorCalculadora() {
		this.operador = new OperadorAritmetico();
	}
	
	@Override
	public double sumar(double operando1, double operando2) {
		double result = operador.suma(operando1, operando2);
		return result;
	}

	@Override
	public double restar(double operando1, double operando2) {
		double result = operador.resta(operando1, operando2);
		return result;
	}
	
	@Override
	public double multiplicar(double operando1, double operando2) {
		double result = operador.multiplica(operando1, operando2);
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
		double result = operador.divide(dividendo, divisor);
		return result;
	}
	
	@Override
	public double elevarAlCuadrado(double operando) {
		double result = operador.cuadrado(operando);
		return result;
	}
	
	
	@Override
	public void memoriaAniadir() {
		operador.sumaAMemoria();
	}
	
	@Override
	public void memoriaLimpiar() {
		operador.memoriaACero();
	}
	
	@Override
	public double memoriaObtener() {
		return operador.getMemoria();
	}
	
	@Override
	public double obtenerUltimoResultado() {
		return operador.getUltimo();
	}
		
}
