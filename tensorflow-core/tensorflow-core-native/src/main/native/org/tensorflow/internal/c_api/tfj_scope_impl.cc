/* Copyright 2024 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

#ifndef _WIN32

#include <vector>

#include "tensorflow/c/c_api_internal.h"
#include "tensorflow/cc/framework/scope.h"
#include "tensorflow/cc/framework/ops.h"

using namespace tensorflow;

struct TFJ_Scope {
    Scope s;
};

TFJ_Scope TFJ_NewRootScope() {
    Scope new_scope = Scope::NewRootScope();
    return {new_scope};
}

TFJ_Scope TFJ_NewSubScope(const TFJ_Scope* scope, const char* child_scope_name) {
    Scope new_scope = scope->s.NewSubScope(child_scope_name);
    return {new_scope};
}

TFJ_Scope TFJ_NewScopeWithControlDependencies(const TFJ_Scope* scope, TF_Operation* control_deps, int control_deps_size) {
    std::vector<Operation> ops;
    for (int i = 0; i < control_deps_size; ++i) {
        ops.push_back(Operation(&control_deps[i].node));
    }
    Scope new_scope = scope->s.WithControlDependencies(ops);
    return {new_scope};
}

TFJ_Scope TFJ_NewScopeWithDevice(const TFJ_Scope* scope, const char* device) {
    Scope new_scope = scope->s.WithDevice(device);
    return {new_scope};
}

std::string TFJ_GetUniqueNameForOp(const TFJ_Scope* scope, const char* default_name) {
    return scope->s.GetUniqueNameForOp(default_name);
}

#else // #ifndef _WIN32

/* This extension is not available on Windows */

struct TFJ_Scope {};
TFJ_Scope TFJ_NewRootScope() { return {}; }
TFJ_Scope TFJ_NewSubScope(const TFJ_Scope* scope, const char* child_scope_name) { return {}; }
TFJ_Scope TFJ_NewScopeWithControlDependencies(const TFJ_Scope* scope, TF_Operation* control_deps, int control_deps_size) { return {}; }
TFJ_Scope TFJ_NewScopeWithDevice(const TFJ_Scope* scope, const char* device) { return {}; }
std::string TFJ_GetUniqueNameForOp(const TFJ_Scope* scope, const char* default_name) { return ""; }

#endif // #ifndef _WIN32
