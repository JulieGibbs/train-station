// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: grpc/health/v1/health.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.trainstationapp.data.grpc.grpc.health.v1;

@kotlin.jvm.JvmName("-initializehealthCheckResponse")
public inline fun healthCheckResponse(block: com.example.trainstationapp.data.grpc.grpc.health.v1.HealthCheckResponseKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse =
  com.example.trainstationapp.data.grpc.grpc.health.v1.HealthCheckResponseKt.Dsl._create(com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `grpc.health.v1.HealthCheckResponse`
 */
public object HealthCheckResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse = _builder.build()

    /**
     * `.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];`
     */
    public var status: com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse.ServingStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    public var statusValue: kotlin.Int
      @JvmName("getStatusValue")
      get() = _builder.getStatusValue()
      @JvmName("setStatusValue")
      set(value) {
        _builder.setStatusValue(value)
      }
    /**
     * `.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
  }
}
public inline fun com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse.copy(block: com.example.trainstationapp.data.grpc.grpc.health.v1.HealthCheckResponseKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.grpc.health.v1.HealthProto.HealthCheckResponse =
  com.example.trainstationapp.data.grpc.grpc.health.v1.HealthCheckResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
