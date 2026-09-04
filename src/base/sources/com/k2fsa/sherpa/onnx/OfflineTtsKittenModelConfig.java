package com.k2fsa.sherpa.onnx;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "", "model", "", "voices", "tokens", "dataDir", "lengthScale", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getLengthScale", "()F", "setLengthScale", "(F)V", "getModel", "setModel", "getTokens", "setTokens", "getVoices", "setVoices", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineTtsKittenModelConfig {
    private String dataDir;
    private float lengthScale;
    private String model;
    private String tokens;
    private String voices;

    public OfflineTtsKittenModelConfig() {
        this(null, null, null, null, 0.0f, 31, null);
    }

    public static /* synthetic */ OfflineTtsKittenModelConfig copy$default(OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, String str, String str2, String str3, String str4, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offlineTtsKittenModelConfig.model;
        }
        if ((i10 & 2) != 0) {
            str2 = offlineTtsKittenModelConfig.voices;
        }
        if ((i10 & 4) != 0) {
            str3 = offlineTtsKittenModelConfig.tokens;
        }
        if ((i10 & 8) != 0) {
            str4 = offlineTtsKittenModelConfig.dataDir;
        }
        if ((i10 & 16) != 0) {
            f10 = offlineTtsKittenModelConfig.lengthScale;
        }
        float f11 = f10;
        String str5 = str3;
        return offlineTtsKittenModelConfig.copy(str, str2, str5, str4, f11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVoices() {
        return this.voices;
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
    public final float getLengthScale() {
        return this.lengthScale;
    }

    public final OfflineTtsKittenModelConfig copy(String model, String voices, String tokens, String dataDir, float lengthScale) {
        s.h(model, "model");
        s.h(voices, "voices");
        s.h(tokens, "tokens");
        s.h(dataDir, "dataDir");
        return new OfflineTtsKittenModelConfig(model, voices, tokens, dataDir, lengthScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTtsKittenModelConfig)) {
            return false;
        }
        OfflineTtsKittenModelConfig offlineTtsKittenModelConfig = (OfflineTtsKittenModelConfig) other;
        return s.c(this.model, offlineTtsKittenModelConfig.model) && s.c(this.voices, offlineTtsKittenModelConfig.voices) && s.c(this.tokens, offlineTtsKittenModelConfig.tokens) && s.c(this.dataDir, offlineTtsKittenModelConfig.dataDir) && Float.compare(this.lengthScale, offlineTtsKittenModelConfig.lengthScale) == 0;
    }

    public final String getDataDir() {
        return this.dataDir;
    }

    public final float getLengthScale() {
        return this.lengthScale;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getTokens() {
        return this.tokens;
    }

    public final String getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return (((((((this.model.hashCode() * 31) + this.voices.hashCode()) * 31) + this.tokens.hashCode()) * 31) + this.dataDir.hashCode()) * 31) + Float.hashCode(this.lengthScale);
    }

    public final void setDataDir(String str) {
        s.h(str, "<set-?>");
        this.dataDir = str;
    }

    public final void setLengthScale(float f10) {
        this.lengthScale = f10;
    }

    public final void setModel(String str) {
        s.h(str, "<set-?>");
        this.model = str;
    }

    public final void setTokens(String str) {
        s.h(str, "<set-?>");
        this.tokens = str;
    }

    public final void setVoices(String str) {
        s.h(str, "<set-?>");
        this.voices = str;
    }

    public OfflineTtsKittenModelConfig(String model, String voices, String tokens, String dataDir, float f10) {
        s.h(model, "model");
        s.h(voices, "voices");
        s.h(tokens, "tokens");
        s.h(dataDir, "dataDir");
        this.model = model;
        this.voices = voices;
        this.tokens = tokens;
        this.dataDir = dataDir;
        this.lengthScale = f10;
    }

    public String toString() {
        return QGbBllacZSmHKn.vJl + this.model + ", voices=" + this.voices + ", tokens=" + this.tokens + ", dataDir=" + this.dataDir + ", lengthScale=" + this.lengthScale + ')';
    }

    public /* synthetic */ OfflineTtsKittenModelConfig(String str, String str2, String str3, String str4, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? 1.0f : f10);
    }
}
