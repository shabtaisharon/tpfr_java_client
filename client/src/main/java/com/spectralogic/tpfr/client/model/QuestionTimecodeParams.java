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

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class QuestionTimecodeParams {

    private final Map<String, String> params;

    /**
     * Represent the QuestionTimecode API call query parameters
     * @param filePath The full path (via a mapped drive) to the media file whose partial offsets are being requested.
     * @param tcin Timecode of the first frame requested
     * @param tcout Timecode of the last frame requested
     * @param fileFrameRate Frame rate, as returned in the file status report
     */
    public QuestionTimecodeParams(final String filePath, final TimeCode tcin, final TimeCode tcout, final String fileFrameRate) {
        params = ImmutableMap.of(
                "filepath", filePath,
                "tcin", tcin.getTime(),
                "tcout", tcout.getTime(),
                "fileframerate", fileFrameRate);
    }

    public Map<String, String> getParams() {
        return params;
    }
}
