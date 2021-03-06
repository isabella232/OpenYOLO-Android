/*
 * Copyright 2017 The OpenYOLO Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openyolo.protocol;

/**
 * Indicates that an OpenYOLO message is missing or could not parsed.
 */
public class MalformedDataException extends OpenYoloException {

    /**
     * Describes the exception with a human-readable string, for debugging.
     */
    public MalformedDataException(String message) {
        super(message);
    }

    /**
     * Specifies the root cause of the exception.
     */
    public MalformedDataException(Throwable cause) {
        super(cause);
    }

    /**
     * Specifies the root cause of the exception, and a higher-level description for debugging.
     */
    public MalformedDataException(String message, Throwable rootCause) {
        super(message, rootCause);
    }
}
