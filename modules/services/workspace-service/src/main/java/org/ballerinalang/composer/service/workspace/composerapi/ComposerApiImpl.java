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
package org.ballerinalang.composer.service.workspace.composerapi;

import org.ballerinalang.langserver.BallerinaLanguageServer;
import org.eclipse.lsp4j.services.LanguageServer;

/**
 * Implementation of the Interface of the main composer endpoint.
 */
public class ComposerApiImpl implements ComposerApi {

    @Override
    public LanguageServer getLanguageServer() {
        return new BallerinaLanguageServer();
    }
}
