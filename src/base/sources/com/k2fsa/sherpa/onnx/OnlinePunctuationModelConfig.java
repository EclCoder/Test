package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006%"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlinePunctuationModelConfig;", "", "cnnBilstm", "", "bpeVocab", "numThreads", "", "debug", "", "provider", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getCnnBilstm", "setCnnBilstm", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OnlinePunctuationModelConfig {
    private String bpeVocab;
    private String cnnBilstm;
    private boolean debug;
    private int numThreads;
    private String provider;

    public OnlinePunctuationModelConfig() {
        this(null, null, 0, false, null, 31, null);
    }

    public static /* synthetic */ OnlinePunctuationModelConfig copy$default(OnlinePunctuationModelConfig onlinePunctuationModelConfig, String str, String str2, int i10, boolean z10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = onlinePunctuationModelConfig.cnnBilstm;
        }
        if ((i11 & 2) != 0) {
            str2 = onlinePunctuationModelConfig.bpeVocab;
        }
        if ((i11 & 4) != 0) {
            i10 = onlinePunctuationModelConfig.numThreads;
        }
        if ((i11 & 8) != 0) {
            z10 = onlinePunctuationModelConfig.debug;
        }
        if ((i11 & 16) != 0) {
            str3 = onlinePunctuationModelConfig.provider;
        }
        String str4 = str3;
        int i12 = i10;
        return onlinePunctuationModelConfig.copy(str, str2, i12, z10, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCnnBilstm() {
        return this.cnnBilstm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final OnlinePunctuationModelConfig copy(String cnnBilstm, String bpeVocab, int numThreads, boolean debug, String provider) {
        s.h(cnnBilstm, "cnnBilstm");
        s.h(bpeVocab, "bpeVocab");
        s.h(provider, "provider");
        return new OnlinePunctuationModelConfig(cnnBilstm, bpeVocab, numThreads, debug, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlinePunctuationModelConfig)) {
            return false;
        }
        OnlinePunctuationModelConfig onlinePunctuationModelConfig = (OnlinePunctuationModelConfig) other;
        return s.c(this.cnnBilstm, onlinePunctuationModelConfig.cnnBilstm) && s.c(this.bpeVocab, onlinePunctuationModelConfig.bpeVocab) && this.numThreads == onlinePunctuationModelConfig.numThreads && this.debug == onlinePunctuationModelConfig.debug && s.c(this.provider, onlinePunctuationModelConfig.provider);
    }

    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    public final String getCnnBilstm() {
        return this.cnnBilstm;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final int getNumThreads() {
        return this.numThreads;
    }

    public final String getProvider() {
        return this.provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((this.cnnBilstm.hashCode() * 31) + this.bpeVocab.hashCode()) * 31) + Integer.hashCode(this.numThreads)) * 31;
        boolean z10 = this.debug;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode + r10) * 31) + this.provider.hashCode();
    }

    public final void setBpeVocab(String str) {
        s.h(str, "<set-?>");
        this.bpeVocab = str;
    }

    public final void setCnnBilstm(String str) {
        s.h(str, "<set-?>");
        this.cnnBilstm = str;
    }

    public final void setDebug(boolean z10) {
        this.debug = z10;
    }

    public final void setNumThreads(int i10) {
        this.numThreads = i10;
    }

    public final void setProvider(String str) {
        s.h(str, "<set-?>");
        this.provider = str;
    }

    public String toString() {
        return "OnlinePunctuationModelConfig(cnnBilstm=" + this.cnnBilstm + ", bpeVocab=" + this.bpeVocab + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ')';
    }

    public OnlinePunctuationModelConfig(String cnnBilstm, String bpeVocab, int i10, boolean z10, String provider) {
        s.h(cnnBilstm, "cnnBilstm");
        s.h(bpeVocab, "bpeVocab");
        s.h(provider, "provider");
        this.cnnBilstm = cnnBilstm;
        this.bpeVocab = bpeVocab;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
    }

    public /* synthetic */ OnlinePunctuationModelConfig(String str, String str2, int i10, boolean z10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? "cpu" : str3);
    }
}
