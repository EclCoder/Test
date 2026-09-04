package com.k2fsa.sherpa.onnx;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;", "", "graph", "", "maxActive", "", "(Ljava/lang/String;I)V", "getGraph", "()Ljava/lang/String;", "setGraph", "(Ljava/lang/String;)V", "getMaxActive", "()I", "setMaxActive", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OnlineCtcFstDecoderConfig {
    private String graph;
    private int maxActive;

    /* JADX WARN: Multi-variable type inference failed */
    public OnlineCtcFstDecoderConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OnlineCtcFstDecoderConfig copy$default(OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = onlineCtcFstDecoderConfig.graph;
        }
        if ((i11 & 2) != 0) {
            i10 = onlineCtcFstDecoderConfig.maxActive;
        }
        return onlineCtcFstDecoderConfig.copy(str, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxActive() {
        return this.maxActive;
    }

    public final OnlineCtcFstDecoderConfig copy(String graph, int maxActive) {
        s.h(graph, "graph");
        return new OnlineCtcFstDecoderConfig(graph, maxActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineCtcFstDecoderConfig)) {
            return false;
        }
        OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig = (OnlineCtcFstDecoderConfig) other;
        return s.c(this.graph, onlineCtcFstDecoderConfig.graph) && this.maxActive == onlineCtcFstDecoderConfig.maxActive;
    }

    public final String getGraph() {
        return this.graph;
    }

    public final int getMaxActive() {
        return this.maxActive;
    }

    public int hashCode() {
        return (this.graph.hashCode() * 31) + Integer.hashCode(this.maxActive);
    }

    public final void setGraph(String str) {
        s.h(str, "<set-?>");
        this.graph = str;
    }

    public final void setMaxActive(int i10) {
        this.maxActive = i10;
    }

    public String toString() {
        return "OnlineCtcFstDecoderConfig(graph=" + this.graph + ", maxActive=" + this.maxActive + ')';
    }

    public OnlineCtcFstDecoderConfig(String graph, int i10) {
        s.h(graph, "graph");
        this.graph = graph;
        this.maxActive = i10;
    }

    public /* synthetic */ OnlineCtcFstDecoderConfig(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : i10);
    }
}
