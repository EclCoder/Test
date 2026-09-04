package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "", "encoder", "", "decoder", "joiner", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getJoiner", "setJoiner", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OnlineTransducerModelConfig {
    private String decoder;
    private String encoder;
    private String joiner;

    public OnlineTransducerModelConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OnlineTransducerModelConfig copy$default(OnlineTransducerModelConfig onlineTransducerModelConfig, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onlineTransducerModelConfig.encoder;
        }
        if ((i10 & 2) != 0) {
            str2 = onlineTransducerModelConfig.decoder;
        }
        if ((i10 & 4) != 0) {
            str3 = onlineTransducerModelConfig.joiner;
        }
        return onlineTransducerModelConfig.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncoder() {
        return this.encoder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDecoder() {
        return this.decoder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJoiner() {
        return this.joiner;
    }

    public final OnlineTransducerModelConfig copy(String encoder, String decoder, String joiner) {
        s.h(encoder, "encoder");
        s.h(decoder, "decoder");
        s.h(joiner, "joiner");
        return new OnlineTransducerModelConfig(encoder, decoder, joiner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineTransducerModelConfig)) {
            return false;
        }
        OnlineTransducerModelConfig onlineTransducerModelConfig = (OnlineTransducerModelConfig) other;
        return s.c(this.encoder, onlineTransducerModelConfig.encoder) && s.c(this.decoder, onlineTransducerModelConfig.decoder) && s.c(this.joiner, onlineTransducerModelConfig.joiner);
    }

    public final String getDecoder() {
        return this.decoder;
    }

    public final String getEncoder() {
        return this.encoder;
    }

    public final String getJoiner() {
        return this.joiner;
    }

    public int hashCode() {
        return (((this.encoder.hashCode() * 31) + this.decoder.hashCode()) * 31) + this.joiner.hashCode();
    }

    public final void setDecoder(String str) {
        s.h(str, "<set-?>");
        this.decoder = str;
    }

    public final void setEncoder(String str) {
        s.h(str, "<set-?>");
        this.encoder = str;
    }

    public final void setJoiner(String str) {
        s.h(str, "<set-?>");
        this.joiner = str;
    }

    public String toString() {
        return "OnlineTransducerModelConfig(encoder=" + this.encoder + ", decoder=" + this.decoder + ", joiner=" + this.joiner + ')';
    }

    public OnlineTransducerModelConfig(String encoder, String decoder, String joiner) {
        s.h(encoder, "encoder");
        s.h(decoder, "decoder");
        s.h(joiner, "joiner");
        this.encoder = encoder;
        this.decoder = decoder;
        this.joiner = joiner;
    }

    public /* synthetic */ OnlineTransducerModelConfig(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
