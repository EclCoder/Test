package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;", "", "model", "", "qnnConfig", "Lcom/k2fsa/sherpa/onnx/QnnConfig;", "(Ljava/lang/String;Lcom/k2fsa/sherpa/onnx/QnnConfig;)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getQnnConfig", "()Lcom/k2fsa/sherpa/onnx/QnnConfig;", "setQnnConfig", "(Lcom/k2fsa/sherpa/onnx/QnnConfig;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineParaformerModelConfig {
    private String model;
    private QnnConfig qnnConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineParaformerModelConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OfflineParaformerModelConfig copy$default(OfflineParaformerModelConfig offlineParaformerModelConfig, String str, QnnConfig qnnConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offlineParaformerModelConfig.model;
        }
        if ((i10 & 2) != 0) {
            qnnConfig = offlineParaformerModelConfig.qnnConfig;
        }
        return offlineParaformerModelConfig.copy(str, qnnConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QnnConfig getQnnConfig() {
        return this.qnnConfig;
    }

    public final OfflineParaformerModelConfig copy(String model, QnnConfig qnnConfig) {
        s.h(model, "model");
        s.h(qnnConfig, "qnnConfig");
        return new OfflineParaformerModelConfig(model, qnnConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineParaformerModelConfig)) {
            return false;
        }
        OfflineParaformerModelConfig offlineParaformerModelConfig = (OfflineParaformerModelConfig) other;
        return s.c(this.model, offlineParaformerModelConfig.model) && s.c(this.qnnConfig, offlineParaformerModelConfig.qnnConfig);
    }

    public final String getModel() {
        return this.model;
    }

    public final QnnConfig getQnnConfig() {
        return this.qnnConfig;
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.qnnConfig.hashCode();
    }

    public final void setModel(String str) {
        s.h(str, "<set-?>");
        this.model = str;
    }

    public final void setQnnConfig(QnnConfig qnnConfig) {
        s.h(qnnConfig, "<set-?>");
        this.qnnConfig = qnnConfig;
    }

    public String toString() {
        return "OfflineParaformerModelConfig(model=" + this.model + ", qnnConfig=" + this.qnnConfig + ')';
    }

    public OfflineParaformerModelConfig(String model, QnnConfig qnnConfig) {
        s.h(model, "model");
        s.h(qnnConfig, "qnnConfig");
        this.model = model;
        this.qnnConfig = qnnConfig;
    }

    public /* synthetic */ OfflineParaformerModelConfig(String str, QnnConfig qnnConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new QnnConfig(null, null, null, 7, null) : qnnConfig);
    }
}
