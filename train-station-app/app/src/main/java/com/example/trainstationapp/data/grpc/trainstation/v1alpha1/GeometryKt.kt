// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: trainstation/v1alpha1/station.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.trainstationapp.data.grpc.trainstation.v1alpha1;

@kotlin.jvm.JvmName("-initializegeometry")
public inline fun geometry(block: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.GeometryKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry =
  com.example.trainstationapp.data.grpc.trainstation.v1alpha1.GeometryKt.Dsl._create(com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `trainstation.v1alpha1.Geometry`
 */
public object GeometryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry = _builder.build()

    /**
     * `string type = 1 [json_name = "type"];`
     */
    public var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * `string type = 1 [json_name = "type"];`
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CoordinatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated double coordinates = 2 [json_name = "coordinates"];</code>
     */
     public val coordinates: com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCoordinatesList()
      )
    /**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     * @param value The coordinates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCoordinates")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.add(value: kotlin.Double) {
      _builder.addCoordinates(value)
    }/**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     * @param value The coordinates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCoordinates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.plusAssign(value: kotlin.Double) {
      add(value)
    }/**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     * @param values The coordinates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCoordinates")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Double>) {
      _builder.addAllCoordinates(values)
    }/**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     * @param values The coordinates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCoordinates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Double>) {
      addAll(values)
    }/**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     * @param index The index to set the value at.
     * @param value The coordinates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCoordinates")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.set(index: kotlin.Int, value: kotlin.Double) {
      _builder.setCoordinates(index, value)
    }/**
     * `repeated double coordinates = 2 [json_name = "coordinates"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCoordinates")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Double, CoordinatesProxy>.clear() {
      _builder.clearCoordinates()
    }}
}
public inline fun com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry.copy(block: com.example.trainstationapp.data.grpc.trainstation.v1alpha1.GeometryKt.Dsl.() -> kotlin.Unit): com.example.trainstationapp.data.grpc.trainstation.v1alpha1.StationProto.Geometry =
  com.example.trainstationapp.data.grpc.trainstation.v1alpha1.GeometryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

