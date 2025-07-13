package service.client;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import service.ServicioCalculadoraGrpc;
import service.DosOperandos;
import service.Operando;
import service.Resultado;

public class PruebaClienteCalculadora {
    public static void main(String[] args) {

        // Crear canal hacia el servidor en localhost:50051
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext() // sin TLS
                .build();

        // Crear un stub bloqueante (síncrono)
        ServicioCalculadoraGrpc.ServicioCalculadoraBlockingStub stub =
                ServicioCalculadoraGrpc.newBlockingStub(channel);

        // Ejemplo: sumar 10 + 5
        DosOperandos suma = DosOperandos.newBuilder().setNumber1(10).setNumber2(5).build();
        Resultado resultadoSuma = stub.sumar(suma);
        System.out.println("Suma: " + resultadoSuma.getResultado());

        // Ejemplo: elevar al cuadrado 7
        Operando op = Operando.newBuilder().setNumber(7).build();
        Resultado resCuadrado = stub.elevarAlCuadrado(op);
        System.out.println("7 al cuadrado: " + resCuadrado.getResultado());

        // Añadir 20 a la memoria
        stub.memoriaAniadir(Empty.getDefaultInstance());

        // Recuperar memoria
        Resultado resMemoria = stub.memoriaRecuperar(Empty.getDefaultInstance());
        System.out.println("Memoria actual: " + resMemoria.getResultado());

        // Obtener último resultado
        Resultado resUltimo = stub.ultimoResultado(Empty.getDefaultInstance());
        System.out.println("Último resultado: " + resUltimo.getResultado());

        // Dejar memoria a cero
        stub.memoriaACero(Empty.getDefaultInstance());
        Resultado memoriaCero = stub.memoriaRecuperar(Empty.getDefaultInstance());
        System.out.println("Memoria tras poner a cero: " + memoriaCero.getResultado());

        // Cerrar el canal
        channel.shutdown();
    }
}
