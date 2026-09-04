package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00060"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;", "", "model", "", "lexicon", "tokens", "dataDir", "dictDir", "noiseScale", "", "noiseScaleW", "lengthScale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFF)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getDictDir", "setDictDir", "getLengthScale", "()F", "setLengthScale", "(F)V", "getLexicon", "setLexicon", "getModel", "setModel", "getNoiseScale", "setNoiseScale", "getNoiseScaleW", "setNoiseScaleW", "getTokens", "setTokens", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineTtsVitsModelConfig {
    private String dataDir;
    private String dictDir;
    private float lengthScale;
    private String lexicon;
    private String model;
    private float noiseScale;
    private float noiseScaleW;
    private String tokens;

    public OfflineTtsVitsModelConfig() {
        this(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 255, null);
    }

    public static /* synthetic */ OfflineTtsVitsModelConfig copy$default(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, String str, String str2, String str3, String str4, String str5, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offlineTtsVitsModelConfig.model;
        }
        if ((i10 & 2) != 0) {
            str2 = offlineTtsVitsModelConfig.lexicon;
        }
        if ((i10 & 4) != 0) {
            str3 = offlineTtsVitsModelConfig.tokens;
        }
        if ((i10 & 8) != 0) {
            str4 = offlineTtsVitsModelConfig.dataDir;
        }
        if ((i10 & 16) != 0) {
            str5 = offlineTtsVitsModelConfig.dictDir;
        }
        if ((i10 & 32) != 0) {
            f10 = offlineTtsVitsModelConfig.noiseScale;
        }
        if ((i10 & 64) != 0) {
            f11 = offlineTtsVitsModelConfig.noiseScaleW;
        }
        if ((i10 & 128) != 0) {
            f12 = offlineTtsVitsModelConfig.lengthScale;
        }
        float f13 = f11;
        float f14 = f12;
        String str6 = str5;
        float f15 = f10;
        return offlineTtsVitsModelConfig.copy(str, str2, str3, str4, str6, f15, f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLexicon() {
        return this.lexicon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokens() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDataDir() {
        return this.dataDir;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDictDir() {
        return this.dictDir;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getNoiseScale() {
        return this.noiseScale;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getNoiseScaleW() {
        return this.noiseScaleW;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getLengthScale() {
        return this.lengthScale;
    }

    public final OfflineTtsVitsModelConfig copy(String model, String lexicon, String tokens, String dataDir, String dictDir, float noiseScale, float noiseScaleW, float lengthScale) {
        s.h(model, "model");
        s.h(lexicon, "lexicon");
        s.h(tokens, "tokens");
        s.h(dataDir, "dataDir");
        s.h(dictDir, "dictDir");
        return new OfflineTtsVitsModelConfig(model, lexicon, tokens, dataDir, dictDir, noiseScale, noiseScaleW, lengthScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTtsVitsModelConfig)) {
            return false;
        }
        OfflineTtsVitsModelConfig offlineTtsVitsModelConfig = (OfflineTtsVitsModelConfig) other;
        return s.c(this.model, offlineTtsVitsModelConfig.model) && s.c(this.lexicon, offlineTtsVitsModelConfig.lexicon) && s.c(this.tokens, offlineTtsVitsModelConfig.tokens) && s.c(this.dataDir, offlineTtsVitsModelConfig.dataDir) && s.c(this.dictDir, offlineTtsVitsModelConfig.dictDir) && Float.compare(this.noiseScale, offlineTtsVitsModelConfig.noiseScale) == 0 && Float.compare(this.noiseScaleW, offlineTtsVitsModelConfig.noiseScaleW) == 0 && Float.compare(this.lengthScale, offlineTtsVitsModelConfig.lengthScale) == 0;
    }

    public final String getDataDir() {
        return this.dataDir;
    }

    public final String getDictDir() {
        return this.dictDir;
    }

    public final float getLengthScale() {
        return this.lengthScale;
    }

    public final String getLexicon() {
        return this.lexicon;
    }

    public final String getModel() {
        return this.model;
    }

    public final float getNoiseScale() {
        return this.noiseScale;
    }

    public final float getNoiseScaleW() {
        return this.noiseScaleW;
    }

    public final String getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return (((((((((((((this.model.hashCode() * 31) + this.lexicon.hashCode()) * 31) + this.tokens.hashCode()) * 31) + this.dataDir.hashCode()) * 31) + this.dictDir.hashCode()) * 31) + Float.hashCode(this.noiseScale)) * 31) + Float.hashCode(this.noiseScaleW)) * 31) + Float.hashCode(this.lengthScale);
    }

    public final void setDataDir(String str) {
        s.h(str, "<set-?>");
        this.dataDir = str;
    }

    public final void setDictDir(String str) {
        s.h(str, "<set-?>");
        this.dictDir = str;
    }

    public final void setLengthScale(float f10) {
        this.lengthScale = f10;
    }

    public final void setLexicon(String str) {
        s.h(str, "<set-?>");
        this.lexicon = str;
    }

    public final void setModel(String str) {
        s.h(str, "<set-?>");
        this.model = str;
    }

    public final void setNoiseScale(float f10) {
        this.noiseScale = f10;
    }

    public final void setNoiseScaleW(float f10) {
        this.noiseScaleW = f10;
    }

    public final void setTokens(String str) {
        s.h(str, "<set-?>");
        this.tokens = str;
    }

    public String toString() {
        return "OfflineTtsVitsModelConfig(model=" + this.model + ", lexicon=" + this.lexicon + ", tokens=" + this.tokens + ", dataDir=" + this.dataDir + ", dictDir=" + this.dictDir + ", noiseScale=" + this.noiseScale + ", noiseScaleW=" + this.noiseScaleW + ", lengthScale=" + this.lengthScale + ')';
    }

    public OfflineTtsVitsModelConfig(String model, String lexicon, String tokens, String dataDir, String dictDir, float f10, float f11, float f12) {
        s.h(model, "model");
        s.h(lexicon, "lexicon");
        s.h(tokens, "tokens");
        s.h(dataDir, "dataDir");
        s.h(dictDir, "dictDir");
        this.model = model;
        this.lexicon = lexicon;
        this.tokens = tokens;
        this.dataDir = dataDir;
        this.dictDir = dictDir;
        this.noiseScale = f10;
        this.noiseScaleW = f11;
        this.lengthScale = f12;
    }

    public /* synthetic */ OfflineTtsVitsModelConfig(String str, String str2, String str3, String str4, String str5, float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? 0.667f : f10, (i10 & 64) != 0 ? 0.8f : f11, (i10 & 128) != 0 ? 1.0f : f12);
    }
}
