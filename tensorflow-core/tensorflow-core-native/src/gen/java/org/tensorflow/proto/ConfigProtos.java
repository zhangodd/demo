// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.proto;

public final class ConfigProtos {
  private ConfigProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OptimizerOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OptimizerOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SessionMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SessionMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_Experimental_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_Experimental_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_Experimental_RunHandlerPoolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_Experimental_RunHandlerPoolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunMetadata_FunctionGraphs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunMetadata_FunctionGraphs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_FeedDevicesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CallableOptions_FetchDevicesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%tensorflow/core/protobuf/config.proto\022" +
      "\ntensorflow\032*tensorflow/core/framework/c" +
      "ost_graph.proto\032%tensorflow/core/framewo" +
      "rk/graph.proto\032*tensorflow/core/framewor" +
      "k/step_stats.proto\032&tensorflow/core/prot" +
      "obuf/cluster.proto\032$tensorflow/core/prot" +
      "obuf/debug.proto\032.tensorflow/core/protob" +
      "uf/rewriter_config.proto\032*tensorflow/cor" +
      "e/protobuf/rpc_options.proto\032&tsl/protob" +
      "uf/coordination_config.proto\"\352\007\n\nGPUOpti" +
      "ons\022\'\n\037per_process_gpu_memory_fraction\030\001" +
      " \001(\001\022\024\n\014allow_growth\030\004 \001(\010\022\026\n\016allocator_" +
      "type\030\002 \001(\t\022\037\n\027deferred_deletion_bytes\030\003 " +
      "\001(\003\022\033\n\023visible_device_list\030\005 \001(\t\022\"\n\032poll" +
      "ing_active_delay_usecs\030\006 \001(\005\022$\n\034polling_" +
      "inactive_delay_msecs\030\007 \001(\005\022\034\n\024force_gpu_" +
      "compatible\030\010 \001(\010\0229\n\014experimental\030\t \001(\0132#" +
      ".tensorflow.GPUOptions.Experimental\032\243\005\n\014" +
      "Experimental\022K\n\017virtual_devices\030\001 \003(\01322." +
      "tensorflow.GPUOptions.Experimental.Virtu" +
      "alDevices\022#\n\033num_virtual_devices_per_gpu" +
      "\030\017 \001(\005\022\032\n\022use_unified_memory\030\002 \001(\010\022#\n\033nu" +
      "m_dev_to_dev_copy_streams\030\003 \001(\005\022\035\n\025colle" +
      "ctive_ring_order\030\004 \001(\t\022\035\n\025timestamped_al" +
      "locator\030\005 \001(\010\022#\n\033kernel_tracker_max_inte" +
      "rval\030\007 \001(\005\022 \n\030kernel_tracker_max_bytes\030\010" +
      " \001(\005\022\"\n\032kernel_tracker_max_pending\030\t \001(\005" +
      "\022\'\n\037internal_fragmentation_fraction\030\n \001(" +
      "\001\022\035\n\025use_cuda_malloc_async\030\013 \001(\010\022,\n$disa" +
      "llow_retry_on_allocation_failure\030\014 \001(\010\022 " +
      "\n\030gpu_host_mem_limit_in_mb\030\r \001(\002\022$\n\034gpu_" +
      "host_mem_disallow_growth\030\016 \001(\010\022$\n\034gpu_sy" +
      "stem_memory_size_in_mb\030\020 \001(\005\032S\n\016VirtualD" +
      "evices\022\027\n\017memory_limit_mb\030\001 \003(\002\022\020\n\010prior" +
      "ity\030\002 \003(\005\022\026\n\016device_ordinal\030\003 \003(\005\"\235\003\n\020Op" +
      "timizerOptions\022+\n#do_common_subexpressio" +
      "n_elimination\030\001 \001(\010\022\033\n\023do_constant_foldi" +
      "ng\030\002 \001(\010\022$\n\034max_folded_constant_in_bytes" +
      "\030\006 \001(\003\022\034\n\024do_function_inlining\030\004 \001(\010\0225\n\t" +
      "opt_level\030\003 \001(\0162\".tensorflow.OptimizerOp" +
      "tions.Level\022E\n\020global_jit_level\030\005 \001(\0162+." +
      "tensorflow.OptimizerOptions.GlobalJitLev" +
      "el\022\026\n\016cpu_global_jit\030\007 \001(\010\" \n\005Level\022\006\n\002L" +
      "1\020\000\022\017\n\002L0\020\377\377\377\377\377\377\377\377\377\001\"C\n\016GlobalJitLevel\022\013" +
      "\n\007DEFAULT\020\000\022\020\n\003OFF\020\377\377\377\377\377\377\377\377\377\001\022\010\n\004ON_1\020\001\022" +
      "\010\n\004ON_2\020\002\"\356\002\n\014GraphOptions\022\036\n\026enable_rec" +
      "v_scheduling\030\002 \001(\010\0227\n\021optimizer_options\030" +
      "\003 \001(\0132\034.tensorflow.OptimizerOptions\022\030\n\020b" +
      "uild_cost_model\030\004 \001(\003\022\036\n\026build_cost_mode" +
      "l_after\030\t \001(\003\022\024\n\014infer_shapes\030\005 \001(\010\022\032\n\022p" +
      "lace_pruned_graph\030\006 \001(\010\022 \n\030enable_bfloat" +
      "16_sendrecv\030\007 \001(\010\022\025\n\rtimeline_step\030\010 \001(\005" +
      "\0223\n\017rewrite_options\030\n \001(\0132\032.tensorflow.R" +
      "ewriterConfigJ\004\010\001\020\002R%skip_common_subexpr" +
      "ession_elimination\"A\n\025ThreadPoolOptionPr" +
      "oto\022\023\n\013num_threads\030\001 \001(\005\022\023\n\013global_name\030" +
      "\002 \001(\t\"0\n\017SessionMetadata\022\014\n\004name\030\001 \001(\t\022\017" +
      "\n\007version\030\002 \001(\003\"\225\017\n\013ConfigProto\022>\n\014devic" +
      "e_count\030\001 \003(\0132(.tensorflow.ConfigProto.D" +
      "eviceCountEntry\022$\n\034intra_op_parallelism_" +
      "threads\030\002 \001(\005\022$\n\034inter_op_parallelism_th" +
      "reads\030\005 \001(\005\022\037\n\027use_per_session_threads\030\t" +
      " \001(\010\022G\n\034session_inter_op_thread_pool\030\014 \003" +
      "(\0132!.tensorflow.ThreadPoolOptionProto\022\030\n" +
      "\020placement_period\030\003 \001(\005\022\026\n\016device_filter" +
      "s\030\004 \003(\t\022+\n\013gpu_options\030\006 \001(\0132\026.tensorflo" +
      "w.GPUOptions\022\034\n\024allow_soft_placement\030\007 \001" +
      "(\010\022\034\n\024log_device_placement\030\010 \001(\010\022/\n\rgrap" +
      "h_options\030\n \001(\0132\030.tensorflow.GraphOption" +
      "s\022\037\n\027operation_timeout_in_ms\030\013 \001(\003\022+\n\013rp" +
      "c_options\030\r \001(\0132\026.tensorflow.RPCOptions\022" +
      "+\n\013cluster_def\030\016 \001(\0132\026.tensorflow.Cluste" +
      "rDef\022\035\n\025isolate_session_state\030\017 \001(\010\022(\n s" +
      "hare_cluster_devices_in_session\030\021 \001(\010\022:\n" +
      "\014experimental\030\020 \001(\0132$.tensorflow.ConfigP" +
      "roto.Experimental\0322\n\020DeviceCountEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\032\217\t\n\014Experi" +
      "mental\022\037\n\027collective_group_leader\030\001 \001(\t\022" +
      "\025\n\rexecutor_type\030\003 \001(\t\022\032\n\022recv_buf_max_c" +
      "hunk\030\004 \001(\005\022\031\n\021use_numa_affinity\030\005 \001(\010\0225\n" +
      "-collective_deterministic_sequential_exe" +
      "cution\030\006 \001(\010\022\027\n\017collective_nccl\030\007 \001(\010\0226\n" +
      ".share_session_state_in_clusterspec_prop" +
      "agation\030\010 \001(\010\022\037\n\027disable_thread_spinning" +
      "\030\t \001(\010\022(\n share_cluster_devices_in_sessi" +
      "on\030\n \001(\010\0225\n\020session_metadata\030\013 \001(\0132\033.ten" +
      "sorflow.SessionMetadata\022!\n\031optimize_for_" +
      "static_graph\030\014 \001(\010\022\032\n\022enable_mlir_bridge" +
      "\030\r \001(\010\022S\n\023mlir_bridge_rollout\030\021 \001(\01626.te" +
      "nsorflow.ConfigProto.Experimental.MlirBr" +
      "idgeRollout\022&\n\036enable_mlir_graph_optimiz" +
      "ation\030\020 \001(\010\022\'\n\037disable_output_partition_" +
      "graphs\030\016 \001(\010\022#\n\033xla_fusion_autotuner_thr" +
      "esh\030\017 \001(\003\022\020\n\010use_tfrt\030\022 \001(\010\022\'\n\037disable_f" +
      "unctional_ops_lowering\030\025 \001(\010\022\'\n\037xla_pref" +
      "er_single_graph_cluster\030\026 \001(\010\022B\n\023coordin" +
      "ation_config\030\027 \001(\0132%.tensorflow.Coordina" +
      "tionServiceConfig\022)\n!disable_optimize_fo" +
      "r_static_graph\030\030 \001(\010\0220\n(disable_eager_ex" +
      "ecutor_streaming_enqueue\030\032 \001(\010\"\336\001\n\021MlirB" +
      "ridgeRollout\022#\n\037MLIR_BRIDGE_ROLLOUT_UNSP" +
      "ECIFIED\020\000\022\037\n\033MLIR_BRIDGE_ROLLOUT_ENABLED" +
      "\020\001\022 \n\034MLIR_BRIDGE_ROLLOUT_DISABLED\020\002\"\004\010\003" +
      "\020\003\"\004\010\004\020\004*%MLIR_BRIDGE_ROLLOUT_SAFE_MODE_" +
      "ENABLED*.MLIR_BRIDGE_ROLLOUT_SAFE_MODE_F" +
      "ALLBACK_ENABLEDJ\004\010\002\020\003J\004\010\023\020\024J\004\010\024\020\025J\004\010\031\020\032\"" +
      "\341\004\n\nRunOptions\0226\n\013trace_level\030\001 \001(\0162!.te" +
      "nsorflow.RunOptions.TraceLevel\022\025\n\rtimeou" +
      "t_in_ms\030\002 \001(\003\022\034\n\024inter_op_thread_pool\030\003 " +
      "\001(\005\022\037\n\027output_partition_graphs\030\005 \001(\010\022/\n\r" +
      "debug_options\030\006 \001(\0132\030.tensorflow.DebugOp" +
      "tions\022*\n\"report_tensor_allocations_upon_" +
      "oom\030\007 \001(\010\0229\n\014experimental\030\010 \001(\0132#.tensor" +
      "flow.RunOptions.Experimental\032\322\001\n\014Experim" +
      "ental\022\034\n\024collective_graph_key\030\001 \001(\003\022\034\n\024u" +
      "se_run_handler_pool\030\002 \001(\010\022[\n\030run_handler" +
      "_pool_options\030\003 \001(\01329.tensorflow.RunOpti" +
      "ons.Experimental.RunHandlerPoolOptions\032)" +
      "\n\025RunHandlerPoolOptions\022\020\n\010priority\030\001 \001(" +
      "\003\"R\n\nTraceLevel\022\014\n\010NO_TRACE\020\000\022\022\n\016SOFTWAR" +
      "E_TRACE\020\001\022\022\n\016HARDWARE_TRACE\020\002\022\016\n\nFULL_TR" +
      "ACE\020\003J\004\010\004\020\005\"\276\003\n\013RunMetadata\022)\n\nstep_stat" +
      "s\030\001 \001(\0132\025.tensorflow.StepStats\022,\n\ncost_g" +
      "raph\030\002 \001(\0132\030.tensorflow.CostGraphDef\022.\n\020" +
      "partition_graphs\030\003 \003(\0132\024.tensorflow.Grap" +
      "hDef\022?\n\017function_graphs\030\004 \003(\0132&.tensorfl" +
      "ow.RunMetadata.FunctionGraphs\0225\n\020session" +
      "_metadata\030\005 \001(\0132\033.tensorflow.SessionMeta" +
      "data\032\255\001\n\016FunctionGraphs\022.\n\020partition_gra" +
      "phs\030\001 \003(\0132\024.tensorflow.GraphDef\0224\n\026pre_o" +
      "ptimization_graph\030\002 \001(\0132\024.tensorflow.Gra" +
      "phDef\0225\n\027post_optimization_graph\030\003 \001(\0132\024" +
      ".tensorflow.GraphDef\":\n\020TensorConnection" +
      "\022\023\n\013from_tensor\030\001 \001(\t\022\021\n\tto_tensor\030\002 \001(\t" +
      "\"\260\003\n\017CallableOptions\022\014\n\004feed\030\001 \003(\t\022\r\n\005fe" +
      "tch\030\002 \003(\t\022\016\n\006target\030\003 \003(\t\022+\n\013run_options" +
      "\030\004 \001(\0132\026.tensorflow.RunOptions\0227\n\021tensor" +
      "_connection\030\005 \003(\0132\034.tensorflow.TensorCon" +
      "nection\022B\n\014feed_devices\030\006 \003(\0132,.tensorfl" +
      "ow.CallableOptions.FeedDevicesEntry\022D\n\rf" +
      "etch_devices\030\007 \003(\0132-.tensorflow.Callable" +
      "Options.FetchDevicesEntry\022\027\n\017fetch_skip_" +
      "sync\030\010 \001(\010\0322\n\020FeedDevicesEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0323\n\021FetchDevicesEn" +
      "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\200\001\n\024" +
      "org.tensorflow.protoB\014ConfigProtosP\001ZUgi" +
      "thub.com/tensorflow/tensorflow/tensorflo" +
      "w/go/core/protobuf/for_core_protos_go_pr" +
      "oto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.CostGraphProtos.getDescriptor(),
          org.tensorflow.proto.GraphProtos.getDescriptor(),
          org.tensorflow.proto.StepStatsProtos.getDescriptor(),
          org.tensorflow.proto.ClusterProtos.getDescriptor(),
          org.tensorflow.proto.DebugProtos.getDescriptor(),
          org.tensorflow.proto.RewriterConfigProtos.getDescriptor(),
          org.tensorflow.proto.dummy.RpcOptions.getDescriptor(),
          org.tensorflow.proto.CoordinationConfig.getDescriptor(),
        });
    internal_static_tensorflow_GPUOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_GPUOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_descriptor,
        new java.lang.String[] { "PerProcessGpuMemoryFraction", "AllowGrowth", "AllocatorType", "DeferredDeletionBytes", "VisibleDeviceList", "PollingActiveDelayUsecs", "PollingInactiveDelayMsecs", "ForceGpuCompatible", "Experimental", });
    internal_static_tensorflow_GPUOptions_Experimental_descriptor =
      internal_static_tensorflow_GPUOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_GPUOptions_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_Experimental_descriptor,
        new java.lang.String[] { "VirtualDevices", "NumVirtualDevicesPerGpu", "UseUnifiedMemory", "NumDevToDevCopyStreams", "CollectiveRingOrder", "TimestampedAllocator", "KernelTrackerMaxInterval", "KernelTrackerMaxBytes", "KernelTrackerMaxPending", "InternalFragmentationFraction", "UseCudaMallocAsync", "DisallowRetryOnAllocationFailure", "GpuHostMemLimitInMb", "GpuHostMemDisallowGrowth", "GpuSystemMemorySizeInMb", });
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor =
      internal_static_tensorflow_GPUOptions_Experimental_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_Experimental_VirtualDevices_descriptor,
        new java.lang.String[] { "MemoryLimitMb", "Priority", "DeviceOrdinal", });
    internal_static_tensorflow_OptimizerOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_OptimizerOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OptimizerOptions_descriptor,
        new java.lang.String[] { "DoCommonSubexpressionElimination", "DoConstantFolding", "MaxFoldedConstantInBytes", "DoFunctionInlining", "OptLevel", "GlobalJitLevel", "CpuGlobalJit", });
    internal_static_tensorflow_GraphOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GraphOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphOptions_descriptor,
        new java.lang.String[] { "EnableRecvScheduling", "OptimizerOptions", "BuildCostModel", "BuildCostModelAfter", "InferShapes", "PlacePrunedGraph", "EnableBfloat16Sendrecv", "TimelineStep", "RewriteOptions", });
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ThreadPoolOptionProto_descriptor,
        new java.lang.String[] { "NumThreads", "GlobalName", });
    internal_static_tensorflow_SessionMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_SessionMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SessionMetadata_descriptor,
        new java.lang.String[] { "Name", "Version", });
    internal_static_tensorflow_ConfigProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_ConfigProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_descriptor,
        new java.lang.String[] { "DeviceCount", "IntraOpParallelismThreads", "InterOpParallelismThreads", "UsePerSessionThreads", "SessionInterOpThreadPool", "PlacementPeriod", "DeviceFilters", "GpuOptions", "AllowSoftPlacement", "LogDevicePlacement", "GraphOptions", "OperationTimeoutInMs", "RpcOptions", "ClusterDef", "IsolateSessionState", "ShareClusterDevicesInSession", "Experimental", });
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor =
      internal_static_tensorflow_ConfigProto_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_ConfigProto_Experimental_descriptor =
      internal_static_tensorflow_ConfigProto_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_ConfigProto_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_Experimental_descriptor,
        new java.lang.String[] { "CollectiveGroupLeader", "ExecutorType", "RecvBufMaxChunk", "UseNumaAffinity", "CollectiveDeterministicSequentialExecution", "CollectiveNccl", "ShareSessionStateInClusterspecPropagation", "DisableThreadSpinning", "ShareClusterDevicesInSession", "SessionMetadata", "OptimizeForStaticGraph", "EnableMlirBridge", "MlirBridgeRollout", "EnableMlirGraphOptimization", "DisableOutputPartitionGraphs", "XlaFusionAutotunerThresh", "UseTfrt", "DisableFunctionalOpsLowering", "XlaPreferSingleGraphCluster", "CoordinationConfig", "DisableOptimizeForStaticGraph", "DisableEagerExecutorStreamingEnqueue", });
    internal_static_tensorflow_RunOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_RunOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_descriptor,
        new java.lang.String[] { "TraceLevel", "TimeoutInMs", "InterOpThreadPool", "OutputPartitionGraphs", "DebugOptions", "ReportTensorAllocationsUponOom", "Experimental", });
    internal_static_tensorflow_RunOptions_Experimental_descriptor =
      internal_static_tensorflow_RunOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RunOptions_Experimental_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_Experimental_descriptor,
        new java.lang.String[] { "CollectiveGraphKey", "UseRunHandlerPool", "RunHandlerPoolOptions", });
    internal_static_tensorflow_RunOptions_Experimental_RunHandlerPoolOptions_descriptor =
      internal_static_tensorflow_RunOptions_Experimental_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RunOptions_Experimental_RunHandlerPoolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_Experimental_RunHandlerPoolOptions_descriptor,
        new java.lang.String[] { "Priority", });
    internal_static_tensorflow_RunMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_RunMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunMetadata_descriptor,
        new java.lang.String[] { "StepStats", "CostGraph", "PartitionGraphs", "FunctionGraphs", "SessionMetadata", });
    internal_static_tensorflow_RunMetadata_FunctionGraphs_descriptor =
      internal_static_tensorflow_RunMetadata_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RunMetadata_FunctionGraphs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunMetadata_FunctionGraphs_descriptor,
        new java.lang.String[] { "PartitionGraphs", "PreOptimizationGraph", "PostOptimizationGraph", });
    internal_static_tensorflow_TensorConnection_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_TensorConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorConnection_descriptor,
        new java.lang.String[] { "FromTensor", "ToTensor", });
    internal_static_tensorflow_CallableOptions_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_CallableOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_descriptor,
        new java.lang.String[] { "Feed", "Fetch", "Target", "RunOptions", "TensorConnection", "FeedDevices", "FetchDevices", "FetchSkipSync", });
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor =
      internal_static_tensorflow_CallableOptions_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CallableOptions_FeedDevicesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_FeedDevicesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor =
      internal_static_tensorflow_CallableOptions_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_CallableOptions_FetchDevicesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CallableOptions_FetchDevicesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.tensorflow.proto.CostGraphProtos.getDescriptor();
    org.tensorflow.proto.GraphProtos.getDescriptor();
    org.tensorflow.proto.StepStatsProtos.getDescriptor();
    org.tensorflow.proto.ClusterProtos.getDescriptor();
    org.tensorflow.proto.DebugProtos.getDescriptor();
    org.tensorflow.proto.RewriterConfigProtos.getDescriptor();
    org.tensorflow.proto.dummy.RpcOptions.getDescriptor();
    org.tensorflow.proto.CoordinationConfig.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}