package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"getSpokenLanguageIdentificationConfig", "Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;", "type", "", "numThreads", "sherpa_onnx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SpokenLanguageIdentificationKt {
    public static /* synthetic */ SpokenLanguageIdentificationConfig getSpokenLanguageIdentificationConfig$default(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return getSpokenLanguageIdentificationConfig(i10, i11);
    }

    public static final SpokenLanguageIdentificationConfig getSpokenLanguageIdentificationConfig(int i10, int i11) {
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            String str = WwUgngZLNA.hnI;
            sb2.append(str);
            sb2.append("/tiny-encoder.int8.onnx");
            return new SpokenLanguageIdentificationConfig(new SpokenLanguageIdentificationWhisperConfig(sb2.toString(), str + "/tiny-decoder.int8.onnx", 0, 4, null), i11, true, null, 8, null);
        }
        if (i10 != 1) {
            return null;
        }
        return new SpokenLanguageIdentificationConfig(new SpokenLanguageIdentificationWhisperConfig("sherpa-onnx-whisper-base/base-encoder.int8.onnx", "sherpa-onnx-whisper-base/base-decoder.int8.onnx", 0, 4, null), 1, true, null, 8, null);
    }
}
