// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/control_flow.proto

package org.tensorflow.proto;

public interface WhileContextDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.WhileContextDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   * @return The contextName.
   */
  java.lang.String getContextName();
  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   * @return The bytes for contextName.
   */
  com.google.protobuf.ByteString
      getContextNameBytes();

  /**
   * <pre>
   * The number of iterations allowed to run in parallel.
   * </pre>
   *
   * <code>int32 parallel_iterations = 2;</code>
   * @return The parallelIterations.
   */
  int getParallelIterations();

  /**
   * <pre>
   * Whether backprop is enabled for this while loop.
   * </pre>
   *
   * <code>bool back_prop = 3;</code>
   * @return The backProp.
   */
  boolean getBackProp();

  /**
   * <pre>
   * Whether GPU-CPU memory swap is enabled for this loop.
   * </pre>
   *
   * <code>bool swap_memory = 4;</code>
   * @return The swapMemory.
   */
  boolean getSwapMemory();

  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 5;</code>
   * @return The pivotName.
   */
  java.lang.String getPivotName();
  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 5;</code>
   * @return The bytes for pivotName.
   */
  com.google.protobuf.ByteString
      getPivotNameBytes();

  /**
   * <pre>
   * Name of the pivot_for_pred tensor.
   * </pre>
   *
   * <code>string pivot_for_pred_name = 6;</code>
   * @return The pivotForPredName.
   */
  java.lang.String getPivotForPredName();
  /**
   * <pre>
   * Name of the pivot_for_pred tensor.
   * </pre>
   *
   * <code>string pivot_for_pred_name = 6;</code>
   * @return The bytes for pivotForPredName.
   */
  com.google.protobuf.ByteString
      getPivotForPredNameBytes();

  /**
   * <pre>
   * Name of the pivot_for_body tensor.
   * </pre>
   *
   * <code>string pivot_for_body_name = 7;</code>
   * @return The pivotForBodyName.
   */
  java.lang.String getPivotForBodyName();
  /**
   * <pre>
   * Name of the pivot_for_body tensor.
   * </pre>
   *
   * <code>string pivot_for_body_name = 7;</code>
   * @return The bytes for pivotForBodyName.
   */
  com.google.protobuf.ByteString
      getPivotForBodyNameBytes();

  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   * @return A list containing the loopExitNames.
   */
  java.util.List<java.lang.String>
      getLoopExitNamesList();
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   * @return The count of loopExitNames.
   */
  int getLoopExitNamesCount();
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   * @param index The index of the element to return.
   * @return The loopExitNames at the given index.
   */
  java.lang.String getLoopExitNames(int index);
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the loopExitNames at the given index.
   */
  com.google.protobuf.ByteString
      getLoopExitNamesBytes(int index);

  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   * @return A list containing the loopEnterNames.
   */
  java.util.List<java.lang.String>
      getLoopEnterNamesList();
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   * @return The count of loopEnterNames.
   */
  int getLoopEnterNamesCount();
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   * @param index The index of the element to return.
   * @return The loopEnterNames at the given index.
   */
  java.lang.String getLoopEnterNames(int index);
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the loopEnterNames at the given index.
   */
  com.google.protobuf.ByteString
      getLoopEnterNamesBytes(int index);

  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   * @return Whether the valuesDef field is set.
   */
  boolean hasValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   * @return The valuesDef.
   */
  org.tensorflow.proto.ValuesDef getValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   */
  org.tensorflow.proto.ValuesDefOrBuilder getValuesDefOrBuilder();

  /**
   * <pre>
   * Optional name of the maximum_iterations tensor.
   * </pre>
   *
   * <code>string maximum_iterations_name = 11;</code>
   * @return The maximumIterationsName.
   */
  java.lang.String getMaximumIterationsName();
  /**
   * <pre>
   * Optional name of the maximum_iterations tensor.
   * </pre>
   *
   * <code>string maximum_iterations_name = 11;</code>
   * @return The bytes for maximumIterationsName.
   */
  com.google.protobuf.ByteString
      getMaximumIterationsNameBytes();

  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  java.util.List<org.tensorflow.proto.ControlFlowContextDef> 
      getNestedContextsList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  org.tensorflow.proto.ControlFlowContextDef getNestedContexts(int index);
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  int getNestedContextsCount();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  java.util.List<? extends org.tensorflow.proto.ControlFlowContextDefOrBuilder> 
      getNestedContextsOrBuilderList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  org.tensorflow.proto.ControlFlowContextDefOrBuilder getNestedContextsOrBuilder(
      int index);
}