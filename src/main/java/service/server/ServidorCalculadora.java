package service.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ServidorCalculadora {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		final int port = 50051;
		final Server server = ServerBuilder.forPort(port).addService(new ServicioCalculadoraImpl()).build();

		System.out.println("Servidor gRPC para ServicioCalculadora iniciado en el puerto " + port );
		server.start();

		// Shutdown hook: permite un apagado limpio del servidor, 
		// con CTRL+C o señal de terminación. Se puede aprovechar
		// para liberar recursos.
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("Apagando el servidor gRPC");
				try {
					// El tiempo de 30 segundos es arbitrario. 
					// También se puede usar server.shutdownNow()
					server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace(System.err);
				}
			}
		});
		
		// Mantiene vivo el hilo principal hasta que el servidor se cierre
		server.awaitTermination();

	}
}
