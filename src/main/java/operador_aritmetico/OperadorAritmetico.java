package operador_aritmetico;

public class OperadorAritmetico {
	
	double memoria = 0.0;
	double ultimo = 0.0;
	
	public double suma(double operando1, double operando2) {
		double result = operando1 + operando2;
		this.ultimo = result;
		return result;
	}
	
	public double resta(double operando1, double operando2) {
		double result = operando1 - operando2;
		this.ultimo = result;
		return result;
	}
	
	public double multiplica(double operando1, double operando2) {
		double result = operando1 * operando2;
		this.ultimo = result;
		return result;
	}
	
	public double divide(double operando1, double operando2) {
		double result;
		if(operando2==0) {
			result = Double.NaN;
		} else {
			result = operando1 / operando2;	
		}
		this.ultimo = result;
		return result;
	}
	
	public double cuadrado(double operando) {
		double result = operando * operando;
		this.ultimo = result;
		return result;
	}
	
	public double getUltimo() {
		return this.ultimo;
	}
	
	public void memoriaACero() {
		this.memoria = 0.0;
	}

	public void sumaAMemoria() {
		this.memoria += this.ultimo;
	}
	
	public double getMemoria() {
		return this.memoria;
	}
	
}
