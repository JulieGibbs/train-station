//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: trainstation/v1alpha1/station.proto

package com.example.trainstationapp.data.grpc.trainstation.v1alpha1;

@kotlin.jvm.JvmName("-initializesetFavoriteOneStationRequest")
public inline fun setFavoriteOneStationRequest(block: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.SetFavoriteOneStationRequestKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest =
  com.example.trainstationapp.data.grpc.trainstation.v1alpha1.SetFavoriteOneStationRequestKt.Dsl._create(com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest.newBuilder()).apply { block() }._build()
public object SetFavoriteOneStationRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest = _builder.build()

    /**
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string token = 2 [json_name = "token"];</code>
     */
    public var token: kotlin.String
      @JvmName("getToken")
      get() = _builder.getToken()
      @JvmName("setToken")
      set(value) {
        _builder.setToken(value)
      }
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     */
    public fun clearToken() {
      _builder.clearToken()
    }

    /**
     * <code>bool value = 3 [json_name = "value"];</code>
     */
    public var value: kotlin.Boolean
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bool value = 3 [json_name = "value"];</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
public inline fun com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest.copy(block: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.SetFavoriteOneStationRequestKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.SetFavoriteOneStationRequest =
  com.example.trainstationapp.data.grpc.trainstation.v1alpha1.SetFavoriteOneStationRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
