package service.server;

import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;
import operador_aritmetico.OperadorAritmetico;
import service.DosOperandos;
import service.Operando;
import service.Resultado;
import service.ServicioCalculadoraGrpc;

public class ServicioCalculadoraImpl extends ServicioCalculadoraGrpc.ServicioCalculadoraImplBase {

	private OperadorAritmetico operador;
    
    public ServicioCalculadoraImpl() {
    	operador = new OperadorAritmetico();
    }

    @Override
    public void sumar(DosOperandos request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método sumar()");
        double res = operador.suma(request.getNumber1(), request.getNumber2());
        Resultado resultado = Resultado.newBuilder().setResultado(res).build();        
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void restar(DosOperandos request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método restar()");
    	double res = operador.resta(request.getNumber1(), request.getNumber2());
        Resultado resultado = Resultado.newBuilder().setResultado(res).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void multiplicar(DosOperandos request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método multiplicar()");
    	double res = operador.multiplica(request.getNumber1(), request.getNumber2());
        Resultado resultado = Resultado.newBuilder().setResultado(res).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void dividir(DosOperandos request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método dividir()");
        double res;
        if (request.getNumber2() == 0) {
            res = Double.NaN; 
        } else {
        	res = operador.divide(request.getNumber1(), request.getNumber2());
        }
        Resultado resultado = Resultado.newBuilder().setResultado(res).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void elevarAlCuadrado(Operando request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método elevarAlCuadrado()");
    	double res = operador.cuadrado(request.getNumber());
        Resultado resultado = Resultado.newBuilder().setResultado(res).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void memoriaACero(Empty request, StreamObserver<Empty> responseObserver) {
    	System.out.println("Invocado el método memoriaACero()");
        operador.memoriaACero();
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void memoriaRecuperar(Empty request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método memoriaRecuperar()");
        Resultado resultado = Resultado.newBuilder().setResultado(operador.getMemoria()).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }

    @Override
    public void memoriaAniadir(Empty request, StreamObserver<Empty> responseObserver) {
    	System.out.println("Invocado el método memoriaAniadir()");
        operador.sumaAMemoria();
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void ultimoResultado(Empty request, StreamObserver<Resultado> responseObserver) {
    	System.out.println("Invocado el método ultimoResultado()");
        Resultado resultado = Resultado.newBuilder().setResultado(operador.getUltimo()).build();
        responseObserver.onNext(resultado);
        responseObserver.onCompleted();
    }
}
