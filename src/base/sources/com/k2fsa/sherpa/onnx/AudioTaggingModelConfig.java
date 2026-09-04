package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;", "", "zipformer", "Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;", "ced", "", "numThreads", "", "debug", "", "provider", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;Ljava/lang/String;IZLjava/lang/String;)V", "getCed", "()Ljava/lang/String;", "setCed", "(Ljava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "getZipformer", "()Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;", "setZipformer", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AudioTaggingModelConfig {
    private String ced;
    private boolean debug;
    private int numThreads;
    private String provider;
    private OfflineZipformerAudioTaggingModelConfig zipformer;

    public AudioTaggingModelConfig() {
        this(null, null, 0, false, null, 31, null);
    }

    public static /* synthetic */ AudioTaggingModelConfig copy$default(AudioTaggingModelConfig audioTaggingModelConfig, OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig, String str, int i10, boolean z10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            offlineZipformerAudioTaggingModelConfig = audioTaggingModelConfig.zipformer;
        }
        if ((i11 & 2) != 0) {
            str = audioTaggingModelConfig.ced;
        }
        if ((i11 & 4) != 0) {
            i10 = audioTaggingModelConfig.numThreads;
        }
        if ((i11 & 8) != 0) {
            z10 = audioTaggingModelConfig.debug;
        }
        if ((i11 & 16) != 0) {
            str2 = audioTaggingModelConfig.provider;
        }
        String str3 = str2;
        int i12 = i10;
        return audioTaggingModelConfig.copy(offlineZipformerAudioTaggingModelConfig, str, i12, z10, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineZipformerAudioTaggingModelConfig getZipformer() {
        return this.zipformer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCed() {
        return this.ced;
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

    public final AudioTaggingModelConfig copy(OfflineZipformerAudioTaggingModelConfig zipformer, String ced, int numThreads, boolean debug, String provider) {
        s.h(zipformer, "zipformer");
        s.h(ced, "ced");
        s.h(provider, "provider");
        return new AudioTaggingModelConfig(zipformer, ced, numThreads, debug, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTaggingModelConfig)) {
            return false;
        }
        AudioTaggingModelConfig audioTaggingModelConfig = (AudioTaggingModelConfig) other;
        return s.c(this.zipformer, audioTaggingModelConfig.zipformer) && s.c(this.ced, audioTaggingModelConfig.ced) && this.numThreads == audioTaggingModelConfig.numThreads && this.debug == audioTaggingModelConfig.debug && s.c(this.provider, audioTaggingModelConfig.provider);
    }

    public final String getCed() {
        return this.ced;
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

    public final OfflineZipformerAudioTaggingModelConfig getZipformer() {
        return this.zipformer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((this.zipformer.hashCode() * 31) + this.ced.hashCode()) * 31) + Integer.hashCode(this.numThreads)) * 31;
        boolean z10 = this.debug;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode + r10) * 31) + this.provider.hashCode();
    }

    public final void setCed(String str) {
        s.h(str, "<set-?>");
        this.ced = str;
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

    public final void setZipformer(OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig) {
        s.h(offlineZipformerAudioTaggingModelConfig, "<set-?>");
        this.zipformer = offlineZipformerAudioTaggingModelConfig;
    }

    public String toString() {
        return "AudioTaggingModelConfig(zipformer=" + this.zipformer + ", ced=" + this.ced + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ')';
    }

    public AudioTaggingModelConfig(OfflineZipformerAudioTaggingModelConfig zipformer, String ced, int i10, boolean z10, String provider) {
        s.h(zipformer, "zipformer");
        s.h(ced, "ced");
        s.h(provider, "provider");
        this.zipformer = zipformer;
        this.ced = ced;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
    }

    public /* synthetic */ AudioTaggingModelConfig(OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig, String str, int i10, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OfflineZipformerAudioTaggingModelConfig(null, 1, null) : offlineZipformerAudioTaggingModelConfig, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? "cpu" : str2);
    }
}
