package com.k2fsa.sherpa.onnx;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003JO\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0007HÖ\u0001J\t\u00103\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u00064"}, d2 = {"Lcom/k2fsa/sherpa/onnx/KeywordSpotterConfig;", "", "featConfig", "Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "modelConfig", "Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "maxActivePaths", "", "keywordsFile", "", "keywordsScore", "", "keywordsThreshold", "numTrailingBlanks", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;ILjava/lang/String;FFI)V", "getFeatConfig", "()Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "setFeatConfig", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;)V", "getKeywordsFile", "()Ljava/lang/String;", "setKeywordsFile", "(Ljava/lang/String;)V", "getKeywordsScore", "()F", "setKeywordsScore", "(F)V", "getKeywordsThreshold", "setKeywordsThreshold", "getMaxActivePaths", "()I", "setMaxActivePaths", "(I)V", "getModelConfig", "()Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "setModelConfig", "(Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;)V", "getNumTrailingBlanks", "setNumTrailingBlanks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class KeywordSpotterConfig {
    private FeatureConfig featConfig;
    private String keywordsFile;
    private float keywordsScore;
    private float keywordsThreshold;
    private int maxActivePaths;
    private OnlineModelConfig modelConfig;
    private int numTrailingBlanks;

    public KeywordSpotterConfig() {
        this(null, null, 0, null, 0.0f, 0.0f, 0, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
    }

    public static /* synthetic */ KeywordSpotterConfig copy$default(KeywordSpotterConfig keywordSpotterConfig, FeatureConfig featureConfig, OnlineModelConfig onlineModelConfig, int i10, String str, float f10, float f11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            featureConfig = keywordSpotterConfig.featConfig;
        }
        if ((i12 & 2) != 0) {
            onlineModelConfig = keywordSpotterConfig.modelConfig;
        }
        if ((i12 & 4) != 0) {
            i10 = keywordSpotterConfig.maxActivePaths;
        }
        if ((i12 & 8) != 0) {
            str = keywordSpotterConfig.keywordsFile;
        }
        if ((i12 & 16) != 0) {
            f10 = keywordSpotterConfig.keywordsScore;
        }
        if ((i12 & 32) != 0) {
            f11 = keywordSpotterConfig.keywordsThreshold;
        }
        if ((i12 & 64) != 0) {
            i11 = keywordSpotterConfig.numTrailingBlanks;
        }
        float f12 = f11;
        int i13 = i11;
        float f13 = f10;
        int i14 = i10;
        return keywordSpotterConfig.copy(featureConfig, onlineModelConfig, i14, str, f13, f12, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FeatureConfig getFeatConfig() {
        return this.featConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OnlineModelConfig getModelConfig() {
        return this.modelConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxActivePaths() {
        return this.maxActivePaths;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKeywordsFile() {
        return this.keywordsFile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getKeywordsScore() {
        return this.keywordsScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getKeywordsThreshold() {
        return this.keywordsThreshold;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNumTrailingBlanks() {
        return this.numTrailingBlanks;
    }

    public final KeywordSpotterConfig copy(FeatureConfig featConfig, OnlineModelConfig modelConfig, int maxActivePaths, String keywordsFile, float keywordsScore, float keywordsThreshold, int numTrailingBlanks) {
        s.h(featConfig, "featConfig");
        s.h(modelConfig, "modelConfig");
        s.h(keywordsFile, "keywordsFile");
        return new KeywordSpotterConfig(featConfig, modelConfig, maxActivePaths, keywordsFile, keywordsScore, keywordsThreshold, numTrailingBlanks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeywordSpotterConfig)) {
            return false;
        }
        KeywordSpotterConfig keywordSpotterConfig = (KeywordSpotterConfig) other;
        return s.c(this.featConfig, keywordSpotterConfig.featConfig) && s.c(this.modelConfig, keywordSpotterConfig.modelConfig) && this.maxActivePaths == keywordSpotterConfig.maxActivePaths && s.c(this.keywordsFile, keywordSpotterConfig.keywordsFile) && Float.compare(this.keywordsScore, keywordSpotterConfig.keywordsScore) == 0 && Float.compare(this.keywordsThreshold, keywordSpotterConfig.keywordsThreshold) == 0 && this.numTrailingBlanks == keywordSpotterConfig.numTrailingBlanks;
    }

    public final FeatureConfig getFeatConfig() {
        return this.featConfig;
    }

    public final String getKeywordsFile() {
        return this.keywordsFile;
    }

    public final float getKeywordsScore() {
        return this.keywordsScore;
    }

    public final float getKeywordsThreshold() {
        return this.keywordsThreshold;
    }

    public final int getMaxActivePaths() {
        return this.maxActivePaths;
    }

    public final OnlineModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public final int getNumTrailingBlanks() {
        return this.numTrailingBlanks;
    }

    public int hashCode() {
        return (((((((((((this.featConfig.hashCode() * 31) + this.modelConfig.hashCode()) * 31) + Integer.hashCode(this.maxActivePaths)) * 31) + this.keywordsFile.hashCode()) * 31) + Float.hashCode(this.keywordsScore)) * 31) + Float.hashCode(this.keywordsThreshold)) * 31) + Integer.hashCode(this.numTrailingBlanks);
    }

    public final void setFeatConfig(FeatureConfig featureConfig) {
        s.h(featureConfig, "<set-?>");
        this.featConfig = featureConfig;
    }

    public final void setKeywordsFile(String str) {
        s.h(str, "<set-?>");
        this.keywordsFile = str;
    }

    public final void setKeywordsScore(float f10) {
        this.keywordsScore = f10;
    }

    public final void setKeywordsThreshold(float f10) {
        this.keywordsThreshold = f10;
    }

    public final void setMaxActivePaths(int i10) {
        this.maxActivePaths = i10;
    }

    public final void setModelConfig(OnlineModelConfig onlineModelConfig) {
        s.h(onlineModelConfig, "<set-?>");
        this.modelConfig = onlineModelConfig;
    }

    public final void setNumTrailingBlanks(int i10) {
        this.numTrailingBlanks = i10;
    }

    public String toString() {
        return "KeywordSpotterConfig(featConfig=" + this.featConfig + ", modelConfig=" + this.modelConfig + ", maxActivePaths=" + this.maxActivePaths + ", keywordsFile=" + this.keywordsFile + ", keywordsScore=" + this.keywordsScore + ", keywordsThreshold=" + this.keywordsThreshold + ", numTrailingBlanks=" + this.numTrailingBlanks + ')';
    }

    public KeywordSpotterConfig(FeatureConfig featConfig, OnlineModelConfig modelConfig, int i10, String keywordsFile, float f10, float f11, int i11) {
        s.h(featConfig, "featConfig");
        s.h(modelConfig, "modelConfig");
        s.h(keywordsFile, "keywordsFile");
        this.featConfig = featConfig;
        this.modelConfig = modelConfig;
        this.maxActivePaths = i10;
        this.keywordsFile = keywordsFile;
        this.keywordsScore = f10;
        this.keywordsThreshold = f11;
        this.numTrailingBlanks = i11;
    }

    public /* synthetic */ KeywordSpotterConfig(FeatureConfig featureConfig, OnlineModelConfig onlineModelConfig, int i10, String str, float f10, float f11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? new FeatureConfig(0, 0, 0.0f, 7, null) : featureConfig, (i12 & 2) != 0 ? new OnlineModelConfig(null, null, null, null, null, null, 0, false, null, null, null, null, 4095, null) : onlineModelConfig, (i12 & 4) != 0 ? 4 : i10, (i12 & 8) != 0 ? "keywords.txt" : str, (i12 & 16) != 0 ? 1.5f : f10, (i12 & 32) != 0 ? 0.25f : f11, (i12 & 64) != 0 ? 2 : i11);
    }
}
