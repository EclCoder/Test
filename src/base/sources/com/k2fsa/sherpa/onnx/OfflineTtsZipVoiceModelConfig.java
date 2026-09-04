package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00068"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "", "tokens", "", "encoder", "decoder", "vocoder", "dataDir", "lexicon", "featScale", "", "tShift", "targetRms", "guidanceScale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFF)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getDecoder", "setDecoder", "getEncoder", "setEncoder", "getFeatScale", "()F", "setFeatScale", "(F)V", "getGuidanceScale", "setGuidanceScale", "getLexicon", "setLexicon", "getTShift", "setTShift", "getTargetRms", "setTargetRms", "getTokens", "setTokens", "getVocoder", "setVocoder", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineTtsZipVoiceModelConfig {
    private String dataDir;
    private String decoder;
    private String encoder;
    private float featScale;
    private float guidanceScale;
    private String lexicon;
    private float tShift;
    private float targetRms;
    private String tokens;
    private String vocoder;

    public OfflineTtsZipVoiceModelConfig() {
        this(null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ OfflineTtsZipVoiceModelConfig copy$default(OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, String str, String str2, String str3, String str4, String str5, String str6, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offlineTtsZipVoiceModelConfig.tokens;
        }
        if ((i10 & 2) != 0) {
            str2 = offlineTtsZipVoiceModelConfig.encoder;
        }
        if ((i10 & 4) != 0) {
            str3 = offlineTtsZipVoiceModelConfig.decoder;
        }
        if ((i10 & 8) != 0) {
            str4 = offlineTtsZipVoiceModelConfig.vocoder;
        }
        if ((i10 & 16) != 0) {
            str5 = offlineTtsZipVoiceModelConfig.dataDir;
        }
        if ((i10 & 32) != 0) {
            str6 = offlineTtsZipVoiceModelConfig.lexicon;
        }
        if ((i10 & 64) != 0) {
            f10 = offlineTtsZipVoiceModelConfig.featScale;
        }
        if ((i10 & 128) != 0) {
            f11 = offlineTtsZipVoiceModelConfig.tShift;
        }
        if ((i10 & 256) != 0) {
            f12 = offlineTtsZipVoiceModelConfig.targetRms;
        }
        if ((i10 & 512) != 0) {
            f13 = offlineTtsZipVoiceModelConfig.guidanceScale;
        }
        float f14 = f12;
        float f15 = f13;
        float f16 = f10;
        float f17 = f11;
        String str7 = str5;
        String str8 = str6;
        return offlineTtsZipVoiceModelConfig.copy(str, str2, str3, str4, str7, str8, f16, f17, f14, f15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokens() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getGuidanceScale() {
        return this.guidanceScale;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncoder() {
        return this.encoder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDecoder() {
        return this.decoder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVocoder() {
        return this.vocoder;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDataDir() {
        return this.dataDir;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLexicon() {
        return this.lexicon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getFeatScale() {
        return this.featScale;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getTShift() {
        return this.tShift;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getTargetRms() {
        return this.targetRms;
    }

    public final OfflineTtsZipVoiceModelConfig copy(String tokens, String encoder, String decoder, String vocoder, String dataDir, String lexicon, float featScale, float tShift, float targetRms, float guidanceScale) {
        s.h(tokens, "tokens");
        s.h(encoder, "encoder");
        s.h(decoder, "decoder");
        s.h(vocoder, "vocoder");
        s.h(dataDir, "dataDir");
        s.h(lexicon, "lexicon");
        return new OfflineTtsZipVoiceModelConfig(tokens, encoder, decoder, vocoder, dataDir, lexicon, featScale, tShift, targetRms, guidanceScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTtsZipVoiceModelConfig)) {
            return false;
        }
        OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig = (OfflineTtsZipVoiceModelConfig) other;
        return s.c(this.tokens, offlineTtsZipVoiceModelConfig.tokens) && s.c(this.encoder, offlineTtsZipVoiceModelConfig.encoder) && s.c(this.decoder, offlineTtsZipVoiceModelConfig.decoder) && s.c(this.vocoder, offlineTtsZipVoiceModelConfig.vocoder) && s.c(this.dataDir, offlineTtsZipVoiceModelConfig.dataDir) && s.c(this.lexicon, offlineTtsZipVoiceModelConfig.lexicon) && Float.compare(this.featScale, offlineTtsZipVoiceModelConfig.featScale) == 0 && Float.compare(this.tShift, offlineTtsZipVoiceModelConfig.tShift) == 0 && Float.compare(this.targetRms, offlineTtsZipVoiceModelConfig.targetRms) == 0 && Float.compare(this.guidanceScale, offlineTtsZipVoiceModelConfig.guidanceScale) == 0;
    }

    public final String getDataDir() {
        return this.dataDir;
    }

    public final String getDecoder() {
        return this.decoder;
    }

    public final String getEncoder() {
        return this.encoder;
    }

    public final float getFeatScale() {
        return this.featScale;
    }

    public final float getGuidanceScale() {
        return this.guidanceScale;
    }

    public final String getLexicon() {
        return this.lexicon;
    }

    public final float getTShift() {
        return this.tShift;
    }

    public final float getTargetRms() {
        return this.targetRms;
    }

    public final String getTokens() {
        return this.tokens;
    }

    public final String getVocoder() {
        return this.vocoder;
    }

    public int hashCode() {
        return (((((((((((((((((this.tokens.hashCode() * 31) + this.encoder.hashCode()) * 31) + this.decoder.hashCode()) * 31) + this.vocoder.hashCode()) * 31) + this.dataDir.hashCode()) * 31) + this.lexicon.hashCode()) * 31) + Float.hashCode(this.featScale)) * 31) + Float.hashCode(this.tShift)) * 31) + Float.hashCode(this.targetRms)) * 31) + Float.hashCode(this.guidanceScale);
    }

    public final void setDataDir(String str) {
        s.h(str, "<set-?>");
        this.dataDir = str;
    }

    public final void setDecoder(String str) {
        s.h(str, "<set-?>");
        this.decoder = str;
    }

    public final void setEncoder(String str) {
        s.h(str, "<set-?>");
        this.encoder = str;
    }

    public final void setFeatScale(float f10) {
        this.featScale = f10;
    }

    public final void setGuidanceScale(float f10) {
        this.guidanceScale = f10;
    }

    public final void setLexicon(String str) {
        s.h(str, "<set-?>");
        this.lexicon = str;
    }

    public final void setTShift(float f10) {
        this.tShift = f10;
    }

    public final void setTargetRms(float f10) {
        this.targetRms = f10;
    }

    public final void setTokens(String str) {
        s.h(str, "<set-?>");
        this.tokens = str;
    }

    public final void setVocoder(String str) {
        s.h(str, "<set-?>");
        this.vocoder = str;
    }

    public String toString() {
        return "OfflineTtsZipVoiceModelConfig(tokens=" + this.tokens + ", encoder=" + this.encoder + ", decoder=" + this.decoder + ", vocoder=" + this.vocoder + ", dataDir=" + this.dataDir + ", lexicon=" + this.lexicon + ", featScale=" + this.featScale + ", tShift=" + this.tShift + ", targetRms=" + this.targetRms + ", guidanceScale=" + this.guidanceScale + ')';
    }

    public OfflineTtsZipVoiceModelConfig(String tokens, String encoder, String decoder, String vocoder, String dataDir, String lexicon, float f10, float f11, float f12, float f13) {
        s.h(tokens, "tokens");
        s.h(encoder, "encoder");
        s.h(decoder, "decoder");
        s.h(vocoder, "vocoder");
        s.h(dataDir, "dataDir");
        s.h(lexicon, "lexicon");
        this.tokens = tokens;
        this.encoder = encoder;
        this.decoder = decoder;
        this.vocoder = vocoder;
        this.dataDir = dataDir;
        this.lexicon = lexicon;
        this.featScale = f10;
        this.tShift = f11;
        this.targetRms = f12;
        this.guidanceScale = f13;
    }

    public /* synthetic */ OfflineTtsZipVoiceModelConfig(String str, String str2, String str3, String str4, String str5, String str6, float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? 0.1f : f10, (i10 & 128) != 0 ? 0.5f : f11, (i10 & 256) != 0 ? 0.1f : f12, (i10 & 512) != 0 ? 1.0f : f13);
    }
}
