package com.k2fsa.sherpa.onnx;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"getAudioTaggingConfig", "Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;", "type", "", "numThreads", "sherpa_onnx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AudioTaggingKt {
    public static /* synthetic */ AudioTaggingConfig getAudioTaggingConfig$default(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return getAudioTaggingConfig(i10, i11);
    }

    public static final AudioTaggingConfig getAudioTaggingConfig(int i10, int i11) {
        if (i10 == 0) {
            return new AudioTaggingConfig(new AudioTaggingModelConfig(new OfflineZipformerAudioTaggingModelConfig("sherpa-onnx-zipformer-small-audio-tagging-2024-04-15/model.int8.onnx"), null, i11, true, null, 18, null), "sherpa-onnx-zipformer-small-audio-tagging-2024-04-15/class_labels_indices.csv", 3);
        }
        if (i10 == 1) {
            return new AudioTaggingConfig(new AudioTaggingModelConfig(new OfflineZipformerAudioTaggingModelConfig("sherpa-onnx-zipformer-audio-tagging-2024-04-09/model.int8.onnx"), null, i11, true, null, 18, null), "sherpa-onnx-zipformer-audio-tagging-2024-04-09/class_labels_indices.csv", 3);
        }
        if (i10 == 2) {
            return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-tiny-audio-tagging-2024-04-19/model.int8.onnx", i11, true, null, 17, null), "sherpa-onnx-ced-tiny-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
        }
        if (i10 == 3) {
            StringBuilder sb2 = new StringBuilder();
            String str = qEagQqzJZsd.abMDHffqDW;
            sb2.append(str);
            sb2.append("/model.int8.onnx");
            return new AudioTaggingConfig(new AudioTaggingModelConfig(null, sb2.toString(), i11, true, null, 17, null), str + "/class_labels_indices.csv", 3);
        }
        if (i10 == 4) {
            return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-small-audio-tagging-2024-04-19/model.int8.onnx", i11, true, null, 17, null), "sherpa-onnx-ced-small-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
        }
        if (i10 != 5) {
            return null;
        }
        return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-base-audio-tagging-2024-04-19/model.int8.onnx", i11, true, null, 17, null), "sherpa-onnx-ced-base-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
    }
}
