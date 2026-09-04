package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;", "", "model", "", "numThreads", "", "debug", "", "provider", "(Ljava/lang/String;IZLjava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getModel", "()Ljava/lang/String;", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SpeakerEmbeddingExtractorConfig {
    private boolean debug;
    private final String model;
    private int numThreads;
    private String provider;

    public SpeakerEmbeddingExtractorConfig() {
        this(null, 0, false, null, 15, null);
    }

    public static /* synthetic */ SpeakerEmbeddingExtractorConfig copy$default(SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig, String str, int i10, boolean z10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = speakerEmbeddingExtractorConfig.model;
        }
        if ((i11 & 2) != 0) {
            i10 = speakerEmbeddingExtractorConfig.numThreads;
        }
        if ((i11 & 4) != 0) {
            z10 = speakerEmbeddingExtractorConfig.debug;
        }
        if ((i11 & 8) != 0) {
            str2 = speakerEmbeddingExtractorConfig.provider;
        }
        return speakerEmbeddingExtractorConfig.copy(str, i10, z10, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final SpeakerEmbeddingExtractorConfig copy(String model, int numThreads, boolean debug, String provider) {
        s.h(model, "model");
        s.h(provider, "provider");
        return new SpeakerEmbeddingExtractorConfig(model, numThreads, debug, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeakerEmbeddingExtractorConfig)) {
            return false;
        }
        SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig = (SpeakerEmbeddingExtractorConfig) other;
        return s.c(this.model, speakerEmbeddingExtractorConfig.model) && this.numThreads == speakerEmbeddingExtractorConfig.numThreads && this.debug == speakerEmbeddingExtractorConfig.debug && s.c(this.provider, speakerEmbeddingExtractorConfig.provider);
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final String getModel() {
        return this.model;
    }

    public final int getNumThreads() {
        return this.numThreads;
    }

    public final String getProvider() {
        return this.provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.model.hashCode() * 31) + Integer.hashCode(this.numThreads)) * 31;
        boolean z10 = this.debug;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode + r10) * 31) + this.provider.hashCode();
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
        return "SpeakerEmbeddingExtractorConfig(model=" + this.model + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ')';
    }

    public SpeakerEmbeddingExtractorConfig(String model, int i10, boolean z10, String provider) {
        s.h(model, "model");
        s.h(provider, "provider");
        this.model = model;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
    }

    public /* synthetic */ SpeakerEmbeddingExtractorConfig(String str, int i10, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 1 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? "cpu" : str2);
    }
}
