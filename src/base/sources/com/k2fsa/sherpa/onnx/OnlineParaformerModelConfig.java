package com.k2fsa.sherpa.onnx;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "", "encoder", "", "decoder", "(Ljava/lang/String;Ljava/lang/String;)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OnlineParaformerModelConfig {
    private String decoder;
    private String encoder;

    /* JADX WARN: Multi-variable type inference failed */
    public OnlineParaformerModelConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OnlineParaformerModelConfig copy$default(OnlineParaformerModelConfig onlineParaformerModelConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onlineParaformerModelConfig.encoder;
        }
        if ((i10 & 2) != 0) {
            str2 = onlineParaformerModelConfig.decoder;
        }
        return onlineParaformerModelConfig.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncoder() {
        return this.encoder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDecoder() {
        return this.decoder;
    }

    public final OnlineParaformerModelConfig copy(String encoder, String decoder) {
        s.h(encoder, "encoder");
        s.h(decoder, "decoder");
        return new OnlineParaformerModelConfig(encoder, decoder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineParaformerModelConfig)) {
            return false;
        }
        OnlineParaformerModelConfig onlineParaformerModelConfig = (OnlineParaformerModelConfig) other;
        return s.c(this.encoder, onlineParaformerModelConfig.encoder) && s.c(this.decoder, onlineParaformerModelConfig.decoder);
    }

    public final String getDecoder() {
        return this.decoder;
    }

    public final String getEncoder() {
        return this.encoder;
    }

    public int hashCode() {
        return (this.encoder.hashCode() * 31) + this.decoder.hashCode();
    }

    public final void setDecoder(String str) {
        s.h(str, "<set-?>");
        this.decoder = str;
    }

    public final void setEncoder(String str) {
        s.h(str, "<set-?>");
        this.encoder = str;
    }

    public String toString() {
        return "OnlineParaformerModelConfig(encoder=" + this.encoder + ", decoder=" + this.decoder + ')';
    }

    public OnlineParaformerModelConfig(String str, String decoder) {
        s.h(str, obFGmWgqyy.DfCRasYnFvVBVB);
        s.h(decoder, "decoder");
        this.encoder = str;
        this.decoder = decoder;
    }

    public /* synthetic */ OnlineParaformerModelConfig(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
