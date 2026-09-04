package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserDpdfNetModelConfig;", "", "model", "", "(Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "setModel", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineSpeechDenoiserDpdfNetModelConfig {
    private String model;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineSpeechDenoiserDpdfNetModelConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OfflineSpeechDenoiserDpdfNetModelConfig copy$default(OfflineSpeechDenoiserDpdfNetModelConfig offlineSpeechDenoiserDpdfNetModelConfig, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offlineSpeechDenoiserDpdfNetModelConfig.model;
        }
        return offlineSpeechDenoiserDpdfNetModelConfig.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final OfflineSpeechDenoiserDpdfNetModelConfig copy(String model) {
        s.h(model, "model");
        return new OfflineSpeechDenoiserDpdfNetModelConfig(model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OfflineSpeechDenoiserDpdfNetModelConfig) && s.c(this.model, ((OfflineSpeechDenoiserDpdfNetModelConfig) other).model);
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.model.hashCode();
    }

    public final void setModel(String str) {
        s.h(str, "<set-?>");
        this.model = str;
    }

    public String toString() {
        return "OfflineSpeechDenoiserDpdfNetModelConfig(model=" + this.model + ')';
    }

    public OfflineSpeechDenoiserDpdfNetModelConfig(String model) {
        s.h(model, "model");
        this.model = model;
    }

    public /* synthetic */ OfflineSpeechDenoiserDpdfNetModelConfig(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
