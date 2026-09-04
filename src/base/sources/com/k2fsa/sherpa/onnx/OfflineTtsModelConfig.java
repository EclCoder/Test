package com.k2fsa.sherpa.onnx;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0015HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003Jm\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010J\u001a\u00020\u00132\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0011HÖ\u0001J\t\u0010M\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006N"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "", "vits", "Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;", "matcha", "Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;", "kokoro", "Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;", "zipvoice", "Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "kitten", "Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "pocket", "Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;", "supertonic", "Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;", "numThreads", "", "debug", "", "provider", "", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;IZLjava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getKitten", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "setKitten", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;)V", "getKokoro", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;", "setKokoro", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;)V", "getMatcha", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;", "setMatcha", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getPocket", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;", "setPocket", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;)V", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "getSupertonic", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;", "setSupertonic", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;)V", "getVits", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;", "setVits", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;)V", "getZipvoice", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "setZipvoice", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineTtsModelConfig {
    private boolean debug;
    private OfflineTtsKittenModelConfig kitten;
    private OfflineTtsKokoroModelConfig kokoro;
    private OfflineTtsMatchaModelConfig matcha;
    private int numThreads;
    private OfflineTtsPocketModelConfig pocket;
    private String provider;
    private OfflineTtsSupertonicModelConfig supertonic;
    private OfflineTtsVitsModelConfig vits;
    private OfflineTtsZipVoiceModelConfig zipvoice;

    public OfflineTtsModelConfig() {
        this(null, null, null, null, null, null, null, 0, false, null, 1023, null);
    }

    public static /* synthetic */ OfflineTtsModelConfig copy$default(OfflineTtsModelConfig offlineTtsModelConfig, OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, int i10, boolean z10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            offlineTtsVitsModelConfig = offlineTtsModelConfig.vits;
        }
        if ((i11 & 2) != 0) {
            offlineTtsMatchaModelConfig = offlineTtsModelConfig.matcha;
        }
        if ((i11 & 4) != 0) {
            offlineTtsKokoroModelConfig = offlineTtsModelConfig.kokoro;
        }
        if ((i11 & 8) != 0) {
            offlineTtsZipVoiceModelConfig = offlineTtsModelConfig.zipvoice;
        }
        if ((i11 & 16) != 0) {
            offlineTtsKittenModelConfig = offlineTtsModelConfig.kitten;
        }
        if ((i11 & 32) != 0) {
            offlineTtsPocketModelConfig = offlineTtsModelConfig.pocket;
        }
        if ((i11 & 64) != 0) {
            offlineTtsSupertonicModelConfig = offlineTtsModelConfig.supertonic;
        }
        if ((i11 & 128) != 0) {
            i10 = offlineTtsModelConfig.numThreads;
        }
        if ((i11 & 256) != 0) {
            z10 = offlineTtsModelConfig.debug;
        }
        if ((i11 & 512) != 0) {
            str = offlineTtsModelConfig.provider;
        }
        boolean z11 = z10;
        String str2 = str;
        OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig2 = offlineTtsSupertonicModelConfig;
        int i12 = i10;
        OfflineTtsKittenModelConfig offlineTtsKittenModelConfig2 = offlineTtsKittenModelConfig;
        OfflineTtsPocketModelConfig offlineTtsPocketModelConfig2 = offlineTtsPocketModelConfig;
        return offlineTtsModelConfig.copy(offlineTtsVitsModelConfig, offlineTtsMatchaModelConfig, offlineTtsKokoroModelConfig, offlineTtsZipVoiceModelConfig, offlineTtsKittenModelConfig2, offlineTtsPocketModelConfig2, offlineTtsSupertonicModelConfig2, i12, z11, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineTtsVitsModelConfig getVits() {
        return this.vits;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OfflineTtsMatchaModelConfig getMatcha() {
        return this.matcha;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OfflineTtsKokoroModelConfig getKokoro() {
        return this.kokoro;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OfflineTtsZipVoiceModelConfig getZipvoice() {
        return this.zipvoice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OfflineTtsKittenModelConfig getKitten() {
        return this.kitten;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OfflineTtsPocketModelConfig getPocket() {
        return this.pocket;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OfflineTtsSupertonicModelConfig getSupertonic() {
        return this.supertonic;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    public final OfflineTtsModelConfig copy(OfflineTtsVitsModelConfig vits, OfflineTtsMatchaModelConfig matcha, OfflineTtsKokoroModelConfig kokoro, OfflineTtsZipVoiceModelConfig zipvoice, OfflineTtsKittenModelConfig kitten, OfflineTtsPocketModelConfig pocket, OfflineTtsSupertonicModelConfig supertonic, int numThreads, boolean debug, String provider) {
        s.h(vits, "vits");
        s.h(matcha, "matcha");
        s.h(kokoro, "kokoro");
        s.h(zipvoice, "zipvoice");
        s.h(kitten, "kitten");
        s.h(pocket, "pocket");
        s.h(supertonic, "supertonic");
        s.h(provider, "provider");
        return new OfflineTtsModelConfig(vits, matcha, kokoro, zipvoice, kitten, pocket, supertonic, numThreads, debug, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTtsModelConfig)) {
            return false;
        }
        OfflineTtsModelConfig offlineTtsModelConfig = (OfflineTtsModelConfig) other;
        return s.c(this.vits, offlineTtsModelConfig.vits) && s.c(this.matcha, offlineTtsModelConfig.matcha) && s.c(this.kokoro, offlineTtsModelConfig.kokoro) && s.c(this.zipvoice, offlineTtsModelConfig.zipvoice) && s.c(this.kitten, offlineTtsModelConfig.kitten) && s.c(this.pocket, offlineTtsModelConfig.pocket) && s.c(this.supertonic, offlineTtsModelConfig.supertonic) && this.numThreads == offlineTtsModelConfig.numThreads && this.debug == offlineTtsModelConfig.debug && s.c(this.provider, offlineTtsModelConfig.provider);
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final OfflineTtsKittenModelConfig getKitten() {
        return this.kitten;
    }

    public final OfflineTtsKokoroModelConfig getKokoro() {
        return this.kokoro;
    }

    public final OfflineTtsMatchaModelConfig getMatcha() {
        return this.matcha;
    }

    public final int getNumThreads() {
        return this.numThreads;
    }

    public final OfflineTtsPocketModelConfig getPocket() {
        return this.pocket;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final OfflineTtsSupertonicModelConfig getSupertonic() {
        return this.supertonic;
    }

    public final OfflineTtsVitsModelConfig getVits() {
        return this.vits;
    }

    public final OfflineTtsZipVoiceModelConfig getZipvoice() {
        return this.zipvoice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.vits.hashCode() * 31) + this.matcha.hashCode()) * 31) + this.kokoro.hashCode()) * 31) + this.zipvoice.hashCode()) * 31) + this.kitten.hashCode()) * 31) + this.pocket.hashCode()) * 31) + this.supertonic.hashCode()) * 31) + Integer.hashCode(this.numThreads)) * 31;
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

    public final void setKitten(OfflineTtsKittenModelConfig offlineTtsKittenModelConfig) {
        s.h(offlineTtsKittenModelConfig, "<set-?>");
        this.kitten = offlineTtsKittenModelConfig;
    }

    public final void setKokoro(OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig) {
        s.h(offlineTtsKokoroModelConfig, "<set-?>");
        this.kokoro = offlineTtsKokoroModelConfig;
    }

    public final void setMatcha(OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig) {
        s.h(offlineTtsMatchaModelConfig, "<set-?>");
        this.matcha = offlineTtsMatchaModelConfig;
    }

    public final void setNumThreads(int i10) {
        this.numThreads = i10;
    }

    public final void setPocket(OfflineTtsPocketModelConfig offlineTtsPocketModelConfig) {
        s.h(offlineTtsPocketModelConfig, "<set-?>");
        this.pocket = offlineTtsPocketModelConfig;
    }

    public final void setProvider(String str) {
        s.h(str, "<set-?>");
        this.provider = str;
    }

    public final void setSupertonic(OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig) {
        s.h(offlineTtsSupertonicModelConfig, "<set-?>");
        this.supertonic = offlineTtsSupertonicModelConfig;
    }

    public final void setVits(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig) {
        s.h(offlineTtsVitsModelConfig, "<set-?>");
        this.vits = offlineTtsVitsModelConfig;
    }

    public final void setZipvoice(OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig) {
        s.h(offlineTtsZipVoiceModelConfig, "<set-?>");
        this.zipvoice = offlineTtsZipVoiceModelConfig;
    }

    public String toString() {
        return "OfflineTtsModelConfig(vits=" + this.vits + ", matcha=" + this.matcha + ", kokoro=" + this.kokoro + ", zipvoice=" + this.zipvoice + ", kitten=" + this.kitten + ", pocket=" + this.pocket + ", supertonic=" + this.supertonic + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ')';
    }

    public OfflineTtsModelConfig(OfflineTtsVitsModelConfig vits, OfflineTtsMatchaModelConfig matcha, OfflineTtsKokoroModelConfig kokoro, OfflineTtsZipVoiceModelConfig zipvoice, OfflineTtsKittenModelConfig kitten, OfflineTtsPocketModelConfig pocket, OfflineTtsSupertonicModelConfig supertonic, int i10, boolean z10, String provider) {
        s.h(vits, "vits");
        s.h(matcha, "matcha");
        s.h(kokoro, "kokoro");
        s.h(zipvoice, "zipvoice");
        s.h(kitten, "kitten");
        s.h(pocket, "pocket");
        s.h(supertonic, "supertonic");
        s.h(provider, "provider");
        this.vits = vits;
        this.matcha = matcha;
        this.kokoro = kokoro;
        this.zipvoice = zipvoice;
        this.kitten = kitten;
        this.pocket = pocket;
        this.supertonic = supertonic;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
    }

    public /* synthetic */ OfflineTtsModelConfig(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, int i10, boolean z10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OfflineTtsVitsModelConfig(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 255, null) : offlineTtsVitsModelConfig, (i11 & 2) != 0 ? new OfflineTtsMatchaModelConfig(null, null, null, null, null, null, 0.0f, 0.0f, 255, null) : offlineTtsMatchaModelConfig, (i11 & 4) != 0 ? new OfflineTtsKokoroModelConfig(null, null, null, null, null, null, null, 0.0f, 255, null) : offlineTtsKokoroModelConfig, (i11 & 8) != 0 ? new OfflineTtsZipVoiceModelConfig(null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 1023, null) : offlineTtsZipVoiceModelConfig, (i11 & 16) != 0 ? new OfflineTtsKittenModelConfig(null, null, null, null, 0.0f, 31, null) : offlineTtsKittenModelConfig, (i11 & 32) != 0 ? new OfflineTtsPocketModelConfig(null, null, null, null, null, null, null, 0, 255, null) : offlineTtsPocketModelConfig, (i11 & 64) != 0 ? new OfflineTtsSupertonicModelConfig(null, null, null, null, null, null, null, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null) : offlineTtsSupertonicModelConfig, (i11 & 128) != 0 ? 1 : i10, (i11 & 256) != 0 ? false : z10, (i11 & 512) != 0 ? "cpu" : str);
    }
}
