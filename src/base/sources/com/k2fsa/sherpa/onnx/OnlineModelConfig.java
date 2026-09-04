package com.k2fsa.sherpa.onnx;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\t\u0010I\u001a\u00020\u0011HÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u0081\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\u0013\u0010L\u001a\u00020\u00112\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u000fHÖ\u0001J\t\u0010O\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006P"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "", "transducer", "Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "paraformer", "Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "zipformer2Ctc", "Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;", "neMoCtc", "Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;", "toneCtc", "Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;", "tokens", "", "numThreads", "", "debug", "", "provider", "modelType", "modelingUnit", "bpeVocab", "(Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getModelType", "setModelType", "getModelingUnit", "setModelingUnit", "getNeMoCtc", "()Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;", "setNeMoCtc", "(Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getParaformer", "()Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "setParaformer", "(Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;)V", "getProvider", "setProvider", "getTokens", "setTokens", "getToneCtc", "()Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;", "setToneCtc", "(Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;)V", "getTransducer", "()Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "setTransducer", "(Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;)V", "getZipformer2Ctc", "()Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;", "setZipformer2Ctc", "(Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OnlineModelConfig {
    private String bpeVocab;
    private boolean debug;
    private String modelType;
    private String modelingUnit;
    private OnlineNeMoCtcModelConfig neMoCtc;
    private int numThreads;
    private OnlineParaformerModelConfig paraformer;
    private String provider;
    private String tokens;
    private OnlineToneCtcModelConfig toneCtc;
    private OnlineTransducerModelConfig transducer;
    private OnlineZipformer2CtcModelConfig zipformer2Ctc;

    public OnlineModelConfig() {
        this(null, null, null, null, null, null, 0, false, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ OnlineModelConfig copy$default(OnlineModelConfig onlineModelConfig, OnlineTransducerModelConfig onlineTransducerModelConfig, OnlineParaformerModelConfig onlineParaformerModelConfig, OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig, OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, OnlineToneCtcModelConfig onlineToneCtcModelConfig, String str, int i10, boolean z10, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            onlineTransducerModelConfig = onlineModelConfig.transducer;
        }
        if ((i11 & 2) != 0) {
            onlineParaformerModelConfig = onlineModelConfig.paraformer;
        }
        if ((i11 & 4) != 0) {
            onlineZipformer2CtcModelConfig = onlineModelConfig.zipformer2Ctc;
        }
        if ((i11 & 8) != 0) {
            onlineNeMoCtcModelConfig = onlineModelConfig.neMoCtc;
        }
        if ((i11 & 16) != 0) {
            onlineToneCtcModelConfig = onlineModelConfig.toneCtc;
        }
        if ((i11 & 32) != 0) {
            str = onlineModelConfig.tokens;
        }
        if ((i11 & 64) != 0) {
            i10 = onlineModelConfig.numThreads;
        }
        if ((i11 & 128) != 0) {
            z10 = onlineModelConfig.debug;
        }
        if ((i11 & 256) != 0) {
            str2 = onlineModelConfig.provider;
        }
        if ((i11 & 512) != 0) {
            str3 = onlineModelConfig.modelType;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str4 = onlineModelConfig.modelingUnit;
        }
        if ((i11 & 2048) != 0) {
            str5 = onlineModelConfig.bpeVocab;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        int i12 = i10;
        boolean z11 = z10;
        OnlineToneCtcModelConfig onlineToneCtcModelConfig2 = onlineToneCtcModelConfig;
        String str10 = str;
        return onlineModelConfig.copy(onlineTransducerModelConfig, onlineParaformerModelConfig, onlineZipformer2CtcModelConfig, onlineNeMoCtcModelConfig, onlineToneCtcModelConfig2, str10, i12, z11, str8, str9, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OnlineTransducerModelConfig getTransducer() {
        return this.transducer;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModelType() {
        return this.modelType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getModelingUnit() {
        return this.modelingUnit;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OnlineParaformerModelConfig getParaformer() {
        return this.paraformer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OnlineZipformer2CtcModelConfig getZipformer2Ctc() {
        return this.zipformer2Ctc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OnlineNeMoCtcModelConfig getNeMoCtc() {
        return this.neMoCtc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OnlineToneCtcModelConfig getToneCtc() {
        return this.toneCtc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokens() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final OnlineModelConfig copy(OnlineTransducerModelConfig transducer, OnlineParaformerModelConfig paraformer, OnlineZipformer2CtcModelConfig zipformer2Ctc, OnlineNeMoCtcModelConfig neMoCtc, OnlineToneCtcModelConfig toneCtc, String tokens, int numThreads, boolean debug, String provider, String modelType, String modelingUnit, String bpeVocab) {
        s.h(transducer, "transducer");
        s.h(paraformer, "paraformer");
        s.h(zipformer2Ctc, "zipformer2Ctc");
        s.h(neMoCtc, "neMoCtc");
        s.h(toneCtc, "toneCtc");
        s.h(tokens, "tokens");
        s.h(provider, "provider");
        s.h(modelType, "modelType");
        s.h(modelingUnit, "modelingUnit");
        s.h(bpeVocab, "bpeVocab");
        return new OnlineModelConfig(transducer, paraformer, zipformer2Ctc, neMoCtc, toneCtc, tokens, numThreads, debug, provider, modelType, modelingUnit, bpeVocab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineModelConfig)) {
            return false;
        }
        OnlineModelConfig onlineModelConfig = (OnlineModelConfig) other;
        return s.c(this.transducer, onlineModelConfig.transducer) && s.c(this.paraformer, onlineModelConfig.paraformer) && s.c(this.zipformer2Ctc, onlineModelConfig.zipformer2Ctc) && s.c(this.neMoCtc, onlineModelConfig.neMoCtc) && s.c(this.toneCtc, onlineModelConfig.toneCtc) && s.c(this.tokens, onlineModelConfig.tokens) && this.numThreads == onlineModelConfig.numThreads && this.debug == onlineModelConfig.debug && s.c(this.provider, onlineModelConfig.provider) && s.c(this.modelType, onlineModelConfig.modelType) && s.c(this.modelingUnit, onlineModelConfig.modelingUnit) && s.c(this.bpeVocab, onlineModelConfig.bpeVocab);
    }

    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final String getModelType() {
        return this.modelType;
    }

    public final String getModelingUnit() {
        return this.modelingUnit;
    }

    public final OnlineNeMoCtcModelConfig getNeMoCtc() {
        return this.neMoCtc;
    }

    public final int getNumThreads() {
        return this.numThreads;
    }

    public final OnlineParaformerModelConfig getParaformer() {
        return this.paraformer;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getTokens() {
        return this.tokens;
    }

    public final OnlineToneCtcModelConfig getToneCtc() {
        return this.toneCtc;
    }

    public final OnlineTransducerModelConfig getTransducer() {
        return this.transducer;
    }

    public final OnlineZipformer2CtcModelConfig getZipformer2Ctc() {
        return this.zipformer2Ctc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.transducer.hashCode() * 31) + this.paraformer.hashCode()) * 31) + this.zipformer2Ctc.hashCode()) * 31) + this.neMoCtc.hashCode()) * 31) + this.toneCtc.hashCode()) * 31) + this.tokens.hashCode()) * 31) + Integer.hashCode(this.numThreads)) * 31;
        boolean z10 = this.debug;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((((((iHashCode + r10) * 31) + this.provider.hashCode()) * 31) + this.modelType.hashCode()) * 31) + this.modelingUnit.hashCode()) * 31) + this.bpeVocab.hashCode();
    }

    public final void setBpeVocab(String str) {
        s.h(str, "<set-?>");
        this.bpeVocab = str;
    }

    public final void setDebug(boolean z10) {
        this.debug = z10;
    }

    public final void setModelType(String str) {
        s.h(str, "<set-?>");
        this.modelType = str;
    }

    public final void setModelingUnit(String str) {
        s.h(str, "<set-?>");
        this.modelingUnit = str;
    }

    public final void setNeMoCtc(OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig) {
        s.h(onlineNeMoCtcModelConfig, "<set-?>");
        this.neMoCtc = onlineNeMoCtcModelConfig;
    }

    public final void setNumThreads(int i10) {
        this.numThreads = i10;
    }

    public final void setParaformer(OnlineParaformerModelConfig onlineParaformerModelConfig) {
        s.h(onlineParaformerModelConfig, "<set-?>");
        this.paraformer = onlineParaformerModelConfig;
    }

    public final void setProvider(String str) {
        s.h(str, "<set-?>");
        this.provider = str;
    }

    public final void setTokens(String str) {
        s.h(str, "<set-?>");
        this.tokens = str;
    }

    public final void setToneCtc(OnlineToneCtcModelConfig onlineToneCtcModelConfig) {
        s.h(onlineToneCtcModelConfig, "<set-?>");
        this.toneCtc = onlineToneCtcModelConfig;
    }

    public final void setTransducer(OnlineTransducerModelConfig onlineTransducerModelConfig) {
        s.h(onlineTransducerModelConfig, "<set-?>");
        this.transducer = onlineTransducerModelConfig;
    }

    public final void setZipformer2Ctc(OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig) {
        s.h(onlineZipformer2CtcModelConfig, "<set-?>");
        this.zipformer2Ctc = onlineZipformer2CtcModelConfig;
    }

    public String toString() {
        return "OnlineModelConfig(transducer=" + this.transducer + ", paraformer=" + this.paraformer + ", zipformer2Ctc=" + this.zipformer2Ctc + ", neMoCtc=" + this.neMoCtc + ", toneCtc=" + this.toneCtc + ", tokens=" + this.tokens + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ", modelType=" + this.modelType + ", modelingUnit=" + this.modelingUnit + ", bpeVocab=" + this.bpeVocab + ')';
    }

    public OnlineModelConfig(OnlineTransducerModelConfig transducer, OnlineParaformerModelConfig paraformer, OnlineZipformer2CtcModelConfig zipformer2Ctc, OnlineNeMoCtcModelConfig neMoCtc, OnlineToneCtcModelConfig toneCtc, String tokens, int i10, boolean z10, String provider, String modelType, String modelingUnit, String bpeVocab) {
        s.h(transducer, "transducer");
        s.h(paraformer, "paraformer");
        s.h(zipformer2Ctc, "zipformer2Ctc");
        s.h(neMoCtc, "neMoCtc");
        s.h(toneCtc, "toneCtc");
        s.h(tokens, "tokens");
        s.h(provider, "provider");
        s.h(modelType, "modelType");
        s.h(modelingUnit, "modelingUnit");
        s.h(bpeVocab, "bpeVocab");
        this.transducer = transducer;
        this.paraformer = paraformer;
        this.zipformer2Ctc = zipformer2Ctc;
        this.neMoCtc = neMoCtc;
        this.toneCtc = toneCtc;
        this.tokens = tokens;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
        this.modelType = modelType;
        this.modelingUnit = modelingUnit;
        this.bpeVocab = bpeVocab;
    }

    public /* synthetic */ OnlineModelConfig(OnlineTransducerModelConfig onlineTransducerModelConfig, OnlineParaformerModelConfig onlineParaformerModelConfig, OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig, OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, OnlineToneCtcModelConfig onlineToneCtcModelConfig, String str, int i10, boolean z10, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OnlineTransducerModelConfig(null, null, null, 7, null) : onlineTransducerModelConfig, (i11 & 2) != 0 ? new OnlineParaformerModelConfig(null, null, 3, null) : onlineParaformerModelConfig, (i11 & 4) != 0 ? new OnlineZipformer2CtcModelConfig(null, 1, null) : onlineZipformer2CtcModelConfig, (i11 & 8) != 0 ? new OnlineNeMoCtcModelConfig(null, 1, null) : onlineNeMoCtcModelConfig, (i11 & 16) != 0 ? new OnlineToneCtcModelConfig(null, 1, null) : onlineToneCtcModelConfig, (i11 & 32) != 0 ? "" : str, (i11 & 64) == 0 ? i10 : 1, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? "cpu" : str2, (i11 & 512) != 0 ? "" : str3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str4, (i11 & 2048) != 0 ? "" : str5);
    }
}
