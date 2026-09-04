package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;", "", "model", "Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;)V", "getModel", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;", "setModel", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineSpeechDenoiserConfig {
    private OfflineSpeechDenoiserModelConfig model;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineSpeechDenoiserConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OfflineSpeechDenoiserConfig copy$default(OfflineSpeechDenoiserConfig offlineSpeechDenoiserConfig, OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offlineSpeechDenoiserModelConfig = offlineSpeechDenoiserConfig.model;
        }
        return offlineSpeechDenoiserConfig.copy(offlineSpeechDenoiserModelConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineSpeechDenoiserModelConfig getModel() {
        return this.model;
    }

    public final OfflineSpeechDenoiserConfig copy(OfflineSpeechDenoiserModelConfig model) {
        s.h(model, "model");
        return new OfflineSpeechDenoiserConfig(model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OfflineSpeechDenoiserConfig) && s.c(this.model, ((OfflineSpeechDenoiserConfig) other).model);
    }

    public final OfflineSpeechDenoiserModelConfig getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.model.hashCode();
    }

    public final void setModel(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig) {
        s.h(offlineSpeechDenoiserModelConfig, "<set-?>");
        this.model = offlineSpeechDenoiserModelConfig;
    }

    public String toString() {
        return "OfflineSpeechDenoiserConfig(model=" + this.model + ')';
    }

    public OfflineSpeechDenoiserConfig(OfflineSpeechDenoiserModelConfig model) {
        s.h(model, "model");
        this.model = model;
    }

    public /* synthetic */ OfflineSpeechDenoiserConfig(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new OfflineSpeechDenoiserModelConfig(null, null, 0, false, null, 31, null) : offlineSpeechDenoiserModelConfig);
    }
}
