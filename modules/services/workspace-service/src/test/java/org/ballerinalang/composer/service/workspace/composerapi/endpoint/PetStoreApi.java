/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.composer.service.workspace.composerapi.endpoint;

import org.ballerinalang.composer.service.workspace.composerapi.handlers.interfaces.CatHandlerI;
import org.ballerinalang.composer.service.workspace.composerapi.handlers.interfaces.DogHandlerI;
import org.eclipse.lsp4j.jsonrpc.services.JsonDelegate;
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment;

@JsonSegment("composer")
public interface PetStoreApi {

    @JsonDelegate
    public DogHandlerI getDog();

    @JsonDelegate
    public CatHandlerI getCat();
}
