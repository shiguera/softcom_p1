package service.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service.DosOperandos;
import service.Operando;
import service.Resultado;
import service.ServicioCalculadoraGrpc;
import com.google.protobuf.Empty;

public class ClienteCalculadora {
	
	private ManagedChannel channel;
	private ServicioCalculadoraGrpc.ServicioCalculadoraBlockingStub stub;
	
	
	public ClienteCalculadora() {
		channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext() // sin TLS
                .build();
		stub = ServicioCalculadoraGrpc.newBlockingStub(channel);
	}
	
	public double sumar(double operando1, double operando2) {
		DosOperandos operandos = DosOperandos.newBuilder().setNumber1(operando1).setNumber2(operando2).build();
        Resultado resultado = stub.sumar(operandos);
        return resultado.getResultado();
	}
	
	public double restar(double operando1, double operando2) {
		DosOperandos resta = DosOperandos.newBuilder().setNumber1(operando1).setNumber2(operando2).build();
        Resultado resultado = stub.restar(resta);
        return resultado.getResultado();
	}
	
	public double multiplicar(double operando1, double operando2) {
		DosOperandos operandos = DosOperandos.newBuilder().setNumber1(operando1).setNumber2(operando2).build();
        Resultado resultado = stub.multiplicar(operandos);
        return resultado.getResultado();
	}
	
	public double dividir(double operando1, double operando2) {
		DosOperandos operandos = DosOperandos.newBuilder().setNumber1(operando1).setNumber2(operando2).build();
        Resultado resultado = stub.dividir(operandos);
        return resultado.getResultado();
	}
	
	public double cuadrado(double valor) {
		Operando operando = Operando.newBuilder().setNumber(valor).build();
        Resultado resultado = stub.elevarAlCuadrado(operando);
        return resultado.getResultado();
	}

	public double memoriaRecuperar() {
		Resultado resultado = stub.memoriaRecuperar(Empty.getDefaultInstance());
        return resultado.getResultado();
	}
	public double ultimoResultado() {
		Resultado resultado = stub.ultimoResultado(Empty.getDefaultInstance());
        return resultado.getResultado();
	}
	public void memoriaAniadir() {
		stub.memoriaAniadir(Empty.getDefaultInstance());
	}
	public void memoriaACero() {
		stub.memoriaACero(Empty.getDefaultInstance());
	}
		
}
