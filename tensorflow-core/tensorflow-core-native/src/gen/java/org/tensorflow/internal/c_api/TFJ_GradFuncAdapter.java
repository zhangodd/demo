// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


/** Function to be implemented on the JVM side to be called back by the native library when it is time to attach gradient operations for the given op, graph and scope.
 * 
 *  {@code grad_inputs} are the inputs available to the gradient operations. {@code grad_outputs} must received the address of an array of {@code TF_Output} allocated by the JVM, which
 *  represents the outputs of the gradient operations to attach to the graph. It is important to guarantee that the JVM won't try to trigger the deallocation
 *  of that pointer, since the native code will take care of that when it won't need the array anymore.
 * 
 *  Returns the number of elements pointed by grad_outputs. */
@Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TFJ_GradFuncAdapter extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TFJ_GradFuncAdapter(Pointer p) { super(p); }
    protected TFJ_GradFuncAdapter() { allocate(); }
    private native void allocate();
    public native int call(TFJ_GraphId graphId, TFJ_Scope scope, TF_Operation operation, TF_Output grad_inputs, int grad_inputs_length, @Cast("TF_Output**") PointerPointer grad_outputs);
}
