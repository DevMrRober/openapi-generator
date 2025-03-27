/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.options;

import com.google.common.collect.ImmutableMap;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.languages.TypeScriptNestjsServerCodegen;

import java.util.Map;

public class TypeScriptNestjsServerOptionsProvider implements TypeScriptSharedClientOptionsProvider {
    public static final String STRING_ENUMS_VALUE = "false";
    private static final String NPM_REPOSITORY = "https://registry.npmjs.org";
    public static final String NEST_VERSION = "6";
    public static final String FILE_NAMING_VALUE = "camelCase";
    public static final String SERVICE_SUFFIX = "Service";
    public static final String SERVICE_FILE_SUFFIX = ".service";
    public static final String MODEL_SUFFIX = "";
    public static final String MODEL_FILE_SUFFIX = "";
    public static final String USE_SINGLE_REQUEST_PARAMETER = "false";

    @Override
    public String getLanguage() {
        return "typescript-nestjs-server";
    }

    @Override
    public Map<String, String> createOptions() {
        return ImmutableMap.<String, String>builder()
                .putAll(TypeScriptSharedClientOptionsProvider.super.createOptions())
                .put(TypeScriptNestjsServerCodegen.STRING_ENUMS, STRING_ENUMS_VALUE)
                .put(TypeScriptNestjsServerCodegen.WITH_INTERFACES, Boolean.FALSE.toString())
                .put(TypeScriptNestjsServerCodegen.TAGGED_UNIONS, Boolean.FALSE.toString())
                .put(TypeScriptNestjsServerCodegen.NPM_REPOSITORY, NPM_REPOSITORY)
                .put(TypeScriptNestjsServerCodegen.NEST_VERSION, NEST_VERSION)
                .put(TypeScriptNestjsServerCodegen.SERVICE_SUFFIX, SERVICE_SUFFIX)
                .put(TypeScriptNestjsServerCodegen.SERVICE_FILE_SUFFIX, SERVICE_FILE_SUFFIX)
                .put(TypeScriptNestjsServerCodegen.MODEL_SUFFIX, MODEL_SUFFIX)
                .put(TypeScriptNestjsServerCodegen.MODEL_FILE_SUFFIX, MODEL_FILE_SUFFIX)
                .put(TypeScriptNestjsServerCodegen.FILE_NAMING, FILE_NAMING_VALUE)
                .put(CodegenConstants.USE_SINGLE_REQUEST_PARAMETER, USE_SINGLE_REQUEST_PARAMETER)
                .build();
    }
}
