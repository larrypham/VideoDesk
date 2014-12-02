/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package android.media.videoeditor;

/**
 * This listener interface is used by
 * {@link MediaVideoItem#extractAudioWaveform(android.media.videoeditor.ExtractAudioWaveformProgressListener listener)}
 * or
 * {@link AudioTrack#extractAudioWaveform(android.media.videoeditor.ExtractAudioWaveformProgressListener listener)}
 * {@hide}
 */
public interface ExtractAudioWaveformProgressListener {
    /**
     * This method notifies the listener of the progress status of
     * an extractAudioWaveform operation.
     * This method may be called maximum 100 times for one operation.
     *
     * @param progress The progress in %. At the beginning of the operation,
     *          this value is set to 0; at the end, the value is set to 100.
     */
    public void onProgress(int progress);
}

