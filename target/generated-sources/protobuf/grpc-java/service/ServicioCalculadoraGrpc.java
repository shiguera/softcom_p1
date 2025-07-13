package service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: calculadora.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServicioCalculadoraGrpc {

  private ServicioCalculadoraGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ServicioCalculadora";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getSumarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sumar",
      requestType = service.DosOperandos.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getSumarMethod() {
    io.grpc.MethodDescriptor<service.DosOperandos, service.Resultado> getSumarMethod;
    if ((getSumarMethod = ServicioCalculadoraGrpc.getSumarMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getSumarMethod = ServicioCalculadoraGrpc.getSumarMethod) == null) {
          ServicioCalculadoraGrpc.getSumarMethod = getSumarMethod =
              io.grpc.MethodDescriptor.<service.DosOperandos, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sumar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.DosOperandos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("sumar"))
              .build();
        }
      }
    }
    return getSumarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getRestarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "restar",
      requestType = service.DosOperandos.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getRestarMethod() {
    io.grpc.MethodDescriptor<service.DosOperandos, service.Resultado> getRestarMethod;
    if ((getRestarMethod = ServicioCalculadoraGrpc.getRestarMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getRestarMethod = ServicioCalculadoraGrpc.getRestarMethod) == null) {
          ServicioCalculadoraGrpc.getRestarMethod = getRestarMethod =
              io.grpc.MethodDescriptor.<service.DosOperandos, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "restar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.DosOperandos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("restar"))
              .build();
        }
      }
    }
    return getRestarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getMultiplicarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiplicar",
      requestType = service.DosOperandos.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getMultiplicarMethod() {
    io.grpc.MethodDescriptor<service.DosOperandos, service.Resultado> getMultiplicarMethod;
    if ((getMultiplicarMethod = ServicioCalculadoraGrpc.getMultiplicarMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getMultiplicarMethod = ServicioCalculadoraGrpc.getMultiplicarMethod) == null) {
          ServicioCalculadoraGrpc.getMultiplicarMethod = getMultiplicarMethod =
              io.grpc.MethodDescriptor.<service.DosOperandos, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiplicar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.DosOperandos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("multiplicar"))
              .build();
        }
      }
    }
    return getMultiplicarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getDividirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dividir",
      requestType = service.DosOperandos.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.DosOperandos,
      service.Resultado> getDividirMethod() {
    io.grpc.MethodDescriptor<service.DosOperandos, service.Resultado> getDividirMethod;
    if ((getDividirMethod = ServicioCalculadoraGrpc.getDividirMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getDividirMethod = ServicioCalculadoraGrpc.getDividirMethod) == null) {
          ServicioCalculadoraGrpc.getDividirMethod = getDividirMethod =
              io.grpc.MethodDescriptor.<service.DosOperandos, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "dividir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.DosOperandos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("dividir"))
              .build();
        }
      }
    }
    return getDividirMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.Operando,
      service.Resultado> getElevarAlCuadradoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "elevarAlCuadrado",
      requestType = service.Operando.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.Operando,
      service.Resultado> getElevarAlCuadradoMethod() {
    io.grpc.MethodDescriptor<service.Operando, service.Resultado> getElevarAlCuadradoMethod;
    if ((getElevarAlCuadradoMethod = ServicioCalculadoraGrpc.getElevarAlCuadradoMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getElevarAlCuadradoMethod = ServicioCalculadoraGrpc.getElevarAlCuadradoMethod) == null) {
          ServicioCalculadoraGrpc.getElevarAlCuadradoMethod = getElevarAlCuadradoMethod =
              io.grpc.MethodDescriptor.<service.Operando, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "elevarAlCuadrado"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Operando.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("elevarAlCuadrado"))
              .build();
        }
      }
    }
    return getElevarAlCuadradoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getMemoriaACeroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "memoriaACero",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getMemoriaACeroMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getMemoriaACeroMethod;
    if ((getMemoriaACeroMethod = ServicioCalculadoraGrpc.getMemoriaACeroMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getMemoriaACeroMethod = ServicioCalculadoraGrpc.getMemoriaACeroMethod) == null) {
          ServicioCalculadoraGrpc.getMemoriaACeroMethod = getMemoriaACeroMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "memoriaACero"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("memoriaACero"))
              .build();
        }
      }
    }
    return getMemoriaACeroMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.Resultado> getMemoriaRecuperarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "memoriaRecuperar",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.Resultado> getMemoriaRecuperarMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.Resultado> getMemoriaRecuperarMethod;
    if ((getMemoriaRecuperarMethod = ServicioCalculadoraGrpc.getMemoriaRecuperarMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getMemoriaRecuperarMethod = ServicioCalculadoraGrpc.getMemoriaRecuperarMethod) == null) {
          ServicioCalculadoraGrpc.getMemoriaRecuperarMethod = getMemoriaRecuperarMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "memoriaRecuperar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("memoriaRecuperar"))
              .build();
        }
      }
    }
    return getMemoriaRecuperarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getMemoriaAniadirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "memoriaAniadir",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getMemoriaAniadirMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getMemoriaAniadirMethod;
    if ((getMemoriaAniadirMethod = ServicioCalculadoraGrpc.getMemoriaAniadirMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getMemoriaAniadirMethod = ServicioCalculadoraGrpc.getMemoriaAniadirMethod) == null) {
          ServicioCalculadoraGrpc.getMemoriaAniadirMethod = getMemoriaAniadirMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "memoriaAniadir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("memoriaAniadir"))
              .build();
        }
      }
    }
    return getMemoriaAniadirMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.Resultado> getUltimoResultadoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ultimoResultado",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.Resultado> getUltimoResultadoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.Resultado> getUltimoResultadoMethod;
    if ((getUltimoResultadoMethod = ServicioCalculadoraGrpc.getUltimoResultadoMethod) == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        if ((getUltimoResultadoMethod = ServicioCalculadoraGrpc.getUltimoResultadoMethod) == null) {
          ServicioCalculadoraGrpc.getUltimoResultadoMethod = getUltimoResultadoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ultimoResultado"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioCalculadoraMethodDescriptorSupplier("ultimoResultado"))
              .build();
        }
      }
    }
    return getUltimoResultadoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicioCalculadoraStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraStub>() {
        @java.lang.Override
        public ServicioCalculadoraStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioCalculadoraStub(channel, callOptions);
        }
      };
    return ServicioCalculadoraStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServicioCalculadoraBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraBlockingV2Stub>() {
        @java.lang.Override
        public ServicioCalculadoraBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioCalculadoraBlockingV2Stub(channel, callOptions);
        }
      };
    return ServicioCalculadoraBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicioCalculadoraBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraBlockingStub>() {
        @java.lang.Override
        public ServicioCalculadoraBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioCalculadoraBlockingStub(channel, callOptions);
        }
      };
    return ServicioCalculadoraBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServicioCalculadoraFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioCalculadoraFutureStub>() {
        @java.lang.Override
        public ServicioCalculadoraFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioCalculadoraFutureStub(channel, callOptions);
        }
      };
    return ServicioCalculadoraFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sumar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumarMethod(), responseObserver);
    }

    /**
     */
    default void restar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestarMethod(), responseObserver);
    }

    /**
     */
    default void multiplicar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplicarMethod(), responseObserver);
    }

    /**
     */
    default void dividir(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDividirMethod(), responseObserver);
    }

    /**
     */
    default void elevarAlCuadrado(service.Operando request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElevarAlCuadradoMethod(), responseObserver);
    }

    /**
     */
    default void memoriaACero(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoriaACeroMethod(), responseObserver);
    }

    /**
     */
    default void memoriaRecuperar(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoriaRecuperarMethod(), responseObserver);
    }

    /**
     */
    default void memoriaAniadir(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoriaAniadirMethod(), responseObserver);
    }

    /**
     */
    default void ultimoResultado(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUltimoResultadoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServicioCalculadora.
   */
  public static abstract class ServicioCalculadoraImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServicioCalculadoraGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServicioCalculadora.
   */
  public static final class ServicioCalculadoraStub
      extends io.grpc.stub.AbstractAsyncStub<ServicioCalculadoraStub> {
    private ServicioCalculadoraStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioCalculadoraStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioCalculadoraStub(channel, callOptions);
    }

    /**
     */
    public void sumar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiplicar(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplicarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dividir(service.DosOperandos request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDividirMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void elevarAlCuadrado(service.Operando request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getElevarAlCuadradoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void memoriaACero(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoriaACeroMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void memoriaRecuperar(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoriaRecuperarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void memoriaAniadir(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoriaAniadirMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ultimoResultado(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUltimoResultadoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServicioCalculadora.
   */
  public static final class ServicioCalculadoraBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServicioCalculadoraBlockingV2Stub> {
    private ServicioCalculadoraBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioCalculadoraBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioCalculadoraBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public service.Resultado sumar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado restar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado multiplicar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplicarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado dividir(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDividirMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado elevarAlCuadrado(service.Operando request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getElevarAlCuadradoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty memoriaACero(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaACeroMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado memoriaRecuperar(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaRecuperarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty memoriaAniadir(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaAniadirMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado ultimoResultado(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUltimoResultadoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServicioCalculadora.
   */
  public static final class ServicioCalculadoraBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServicioCalculadoraBlockingStub> {
    private ServicioCalculadoraBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioCalculadoraBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioCalculadoraBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.Resultado sumar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado restar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado multiplicar(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplicarMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado dividir(service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDividirMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado elevarAlCuadrado(service.Operando request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getElevarAlCuadradoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty memoriaACero(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaACeroMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado memoriaRecuperar(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaRecuperarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty memoriaAniadir(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoriaAniadirMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.Resultado ultimoResultado(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUltimoResultadoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServicioCalculadora.
   */
  public static final class ServicioCalculadoraFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServicioCalculadoraFutureStub> {
    private ServicioCalculadoraFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioCalculadoraFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioCalculadoraFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> sumar(
        service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> restar(
        service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> multiplicar(
        service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplicarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> dividir(
        service.DosOperandos request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDividirMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> elevarAlCuadrado(
        service.Operando request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getElevarAlCuadradoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> memoriaACero(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoriaACeroMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> memoriaRecuperar(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoriaRecuperarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> memoriaAniadir(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoriaAniadirMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Resultado> ultimoResultado(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUltimoResultadoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUMAR = 0;
  private static final int METHODID_RESTAR = 1;
  private static final int METHODID_MULTIPLICAR = 2;
  private static final int METHODID_DIVIDIR = 3;
  private static final int METHODID_ELEVAR_AL_CUADRADO = 4;
  private static final int METHODID_MEMORIA_ACERO = 5;
  private static final int METHODID_MEMORIA_RECUPERAR = 6;
  private static final int METHODID_MEMORIA_ANIADIR = 7;
  private static final int METHODID_ULTIMO_RESULTADO = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUMAR:
          serviceImpl.sumar((service.DosOperandos) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_RESTAR:
          serviceImpl.restar((service.DosOperandos) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_MULTIPLICAR:
          serviceImpl.multiplicar((service.DosOperandos) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_DIVIDIR:
          serviceImpl.dividir((service.DosOperandos) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_ELEVAR_AL_CUADRADO:
          serviceImpl.elevarAlCuadrado((service.Operando) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_MEMORIA_ACERO:
          serviceImpl.memoriaACero((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MEMORIA_RECUPERAR:
          serviceImpl.memoriaRecuperar((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        case METHODID_MEMORIA_ANIADIR:
          serviceImpl.memoriaAniadir((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ULTIMO_RESULTADO:
          serviceImpl.ultimoResultado((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.Resultado>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSumarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              service.DosOperandos,
              service.Resultado>(
                service, METHODID_SUMAR)))
        .addMethod(
          getRestarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              service.DosOperandos,
              service.Resultado>(
                service, METHODID_RESTAR)))
        .addMethod(
          getMultiplicarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              service.DosOperandos,
              service.Resultado>(
                service, METHODID_MULTIPLICAR)))
        .addMethod(
          getDividirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              service.DosOperandos,
              service.Resultado>(
                service, METHODID_DIVIDIR)))
        .addMethod(
          getElevarAlCuadradoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              service.Operando,
              service.Resultado>(
                service, METHODID_ELEVAR_AL_CUADRADO)))
        .addMethod(
          getMemoriaACeroMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_MEMORIA_ACERO)))
        .addMethod(
          getMemoriaRecuperarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              service.Resultado>(
                service, METHODID_MEMORIA_RECUPERAR)))
        .addMethod(
          getMemoriaAniadirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_MEMORIA_ANIADIR)))
        .addMethod(
          getUltimoResultadoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              service.Resultado>(
                service, METHODID_ULTIMO_RESULTADO)))
        .build();
  }

  private static abstract class ServicioCalculadoraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicioCalculadoraBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.Calculadora.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServicioCalculadora");
    }
  }

  private static final class ServicioCalculadoraFileDescriptorSupplier
      extends ServicioCalculadoraBaseDescriptorSupplier {
    ServicioCalculadoraFileDescriptorSupplier() {}
  }

  private static final class ServicioCalculadoraMethodDescriptorSupplier
      extends ServicioCalculadoraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServicioCalculadoraMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServicioCalculadoraGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicioCalculadoraFileDescriptorSupplier())
              .addMethod(getSumarMethod())
              .addMethod(getRestarMethod())
              .addMethod(getMultiplicarMethod())
              .addMethod(getDividirMethod())
              .addMethod(getElevarAlCuadradoMethod())
              .addMethod(getMemoriaACeroMethod())
              .addMethod(getMemoriaRecuperarMethod())
              .addMethod(getMemoriaAniadirMethod())
              .addMethod(getUltimoResultadoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
