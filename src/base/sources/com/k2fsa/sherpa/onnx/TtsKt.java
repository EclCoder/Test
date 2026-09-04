package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"getOfflineTtsConfig", "Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "modelDir", "", "modelName", "acousticModelName", "vocoder", "voices", "lexicon", "dataDir", "dictDir", "ruleFsts", "ruleFars", "numThreads", "", "isKitten", "", "isSupertonic", "durationPredictor", "textEncoder", "vectorEstimator", "supertonicVocoder", "ttsJson", "unicodeIndexer", "voiceStyle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "sherpa_onnx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TtsKt {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig, still in use, count: 2, list:
          (r13v3 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig) from 0x0204: MOVE (r17v5 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig) = (r13v3 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig)
          (r13v3 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig) from 0x01fd: MOVE (r17v9 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig) = (r13v3 com.k2fsa.sherpa.onnx.OfflineTtsKokoroModelConfig)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final com.k2fsa.sherpa.onnx.OfflineTtsConfig getOfflineTtsConfig(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.Integer r49, boolean r50, boolean r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.k2fsa.sherpa.onnx.TtsKt.getOfflineTtsConfig(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.k2fsa.sherpa.onnx.OfflineTtsConfig");
    }
}
