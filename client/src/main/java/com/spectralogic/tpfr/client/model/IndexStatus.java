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

package com.spectralogic.tpfr.client.model;

import com.spectralogic.tpfr.api.response.IndexStatusResponse;

public class IndexStatus {

    private IndexResult indexResult;

    private String indexTime;

    private final String fileStartTc;

    private final String fileFrameRate;

    private final String fileDuration;

    private final String errorCode;

    private final String errorMessage;

    public IndexStatus(final IndexStatusResponse indexStatusResponse) {
        indexResult = getIndexResult(indexStatusResponse.getIndexResult());
        indexTime = indexStatusResponse.getIndexTime();
        fileStartTc = indexStatusResponse.getFileStartTc();
        fileFrameRate = indexStatusResponse.getFileFrameRate();
        fileDuration = indexStatusResponse.getFileDuration();
        errorCode = indexStatusResponse.getErrorCode();
        errorMessage = indexStatusResponse.getErrorMessage();
    }

    public IndexResult getIndexResult() {
        return indexResult;
    }

    public String getIndexTime() {
        return indexTime;
    }

    public String getFileStartTc() {
        return fileStartTc;
    }

    public String getFileFrameRate() {
        return fileFrameRate;
    }

    public String getFileDuration() {
        return fileDuration;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private IndexResult getIndexResult(final String result)
    {
        switch (result)
        {
            case "Succeeded":
                return IndexResult.Succeeded;
            case "Failed":
                return IndexResult.Failed;
            case "Error File Not Found":
                return IndexResult.ErrorFileNotFound;
            case "Not Indexed":
                return IndexResult.NotIndexed;
            case "Indexing":
                return IndexResult.Indexing;
            default:
                return IndexResult.Unknown;
        }
    }
}
