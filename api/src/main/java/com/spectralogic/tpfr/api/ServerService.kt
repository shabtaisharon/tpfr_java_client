/*
 * ***************************************************************************
 *   Copyright 2016-2017 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ***************************************************************************
 */

package com.spectralogic.tpfr.api

import com.spectralogic.tpfr.api.response.IndexStatusResponse
import com.spectralogic.tpfr.api.response.OffsetsStatusResponse
import com.spectralogic.tpfr.api.response.ReWrapResponse
import com.spectralogic.tpfr.api.response.ReWrapStatusResponse

interface ServerService {
    suspend fun indexFile(filePath: String, indexId: String): IndexStatusResponse
    suspend fun fileStatus(indexId: String): IndexStatusResponse
    suspend fun questionTimecode(params: Map<String, String>): OffsetsStatusResponse
    suspend fun reWrap(params: Map<String, String>): ReWrapResponse
    suspend fun reWrapStatus(targetFileName: String): ReWrapStatusResponse
}