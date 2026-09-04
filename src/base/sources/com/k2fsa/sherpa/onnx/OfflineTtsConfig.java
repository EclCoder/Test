package com.k2fsa.sherpa.onnx;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "", "model", "Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "ruleFsts", "", "ruleFars", "maxNumSentences", "", "silenceScale", "", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;Ljava/lang/String;Ljava/lang/String;IF)V", "getMaxNumSentences", "()I", "setMaxNumSentences", "(I)V", "getModel", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "setModel", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;)V", "getRuleFars", "()Ljava/lang/String;", "setRuleFars", "(Ljava/lang/String;)V", "getRuleFsts", "setRuleFsts", "getSilenceScale", "()F", "setSilenceScale", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineTtsConfig {
    private int maxNumSentences;
    private OfflineTtsModelConfig model;
    private String ruleFars;
    private String ruleFsts;
    private float silenceScale;

    public OfflineTtsConfig() {
        this(null, null, null, 0, 0.0f, 31, null);
    }

    public static /* synthetic */ OfflineTtsConfig copy$default(OfflineTtsConfig offlineTtsConfig, OfflineTtsModelConfig offlineTtsModelConfig, String str, String str2, int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            offlineTtsModelConfig = offlineTtsConfig.model;
        }
        if ((i11 & 2) != 0) {
            str = offlineTtsConfig.ruleFsts;
        }
        if ((i11 & 4) != 0) {
            str2 = offlineTtsConfig.ruleFars;
        }
        if ((i11 & 8) != 0) {
            i10 = offlineTtsConfig.maxNumSentences;
        }
        if ((i11 & 16) != 0) {
            f10 = offlineTtsConfig.silenceScale;
        }
        float f11 = f10;
        String str3 = str2;
        return offlineTtsConfig.copy(offlineTtsModelConfig, str, str3, i10, f11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineTtsModelConfig getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRuleFsts() {
        return this.ruleFsts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRuleFars() {
        return this.ruleFars;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxNumSentences() {
        return this.maxNumSentences;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getSilenceScale() {
        return this.silenceScale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTtsConfig)) {
            return false;
        }
        OfflineTtsConfig offlineTtsConfig = (OfflineTtsConfig) other;
        return s.c(this.model, offlineTtsConfig.model) && s.c(this.ruleFsts, offlineTtsConfig.ruleFsts) && s.c(this.ruleFars, offlineTtsConfig.ruleFars) && this.maxNumSentences == offlineTtsConfig.maxNumSentences && Float.compare(this.silenceScale, offlineTtsConfig.silenceScale) == 0;
    }

    public final int getMaxNumSentences() {
        return this.maxNumSentences;
    }

    public final OfflineTtsModelConfig getModel() {
        return this.model;
    }

    public final String getRuleFars() {
        return this.ruleFars;
    }

    public final String getRuleFsts() {
        return this.ruleFsts;
    }

    public final float getSilenceScale() {
        return this.silenceScale;
    }

    public int hashCode() {
        return (((((((this.model.hashCode() * 31) + this.ruleFsts.hashCode()) * 31) + this.ruleFars.hashCode()) * 31) + Integer.hashCode(this.maxNumSentences)) * 31) + Float.hashCode(this.silenceScale);
    }

    public final void setMaxNumSentences(int i10) {
        this.maxNumSentences = i10;
    }

    public final void setModel(OfflineTtsModelConfig offlineTtsModelConfig) {
        s.h(offlineTtsModelConfig, "<set-?>");
        this.model = offlineTtsModelConfig;
    }

    public final void setRuleFars(String str) {
        s.h(str, "<set-?>");
        this.ruleFars = str;
    }

    public final void setRuleFsts(String str) {
        s.h(str, "<set-?>");
        this.ruleFsts = str;
    }

    public final void setSilenceScale(float f10) {
        this.silenceScale = f10;
    }

    public String toString() {
        return "OfflineTtsConfig(model=" + this.model + ", ruleFsts=" + this.ruleFsts + ", ruleFars=" + this.ruleFars + ", maxNumSentences=" + this.maxNumSentences + ", silenceScale=" + this.silenceScale + ')';
    }

    public OfflineTtsConfig(OfflineTtsModelConfig model, String ruleFsts, String ruleFars, int i10, float f10) {
        s.h(model, "model");
        s.h(ruleFsts, "ruleFsts");
        s.h(ruleFars, "ruleFars");
        this.model = model;
        this.ruleFsts = ruleFsts;
        this.ruleFars = ruleFars;
        this.maxNumSentences = i10;
        this.silenceScale = f10;
    }

    public final OfflineTtsConfig copy(OfflineTtsModelConfig model, String ruleFsts, String ruleFars, int maxNumSentences, float silenceScale) {
        s.h(model, dmHT.EBCNWxOounir);
        s.h(ruleFsts, "ruleFsts");
        s.h(ruleFars, "ruleFars");
        return new OfflineTtsConfig(model, ruleFsts, ruleFars, maxNumSentences, silenceScale);
    }

    public /* synthetic */ OfflineTtsConfig(OfflineTtsModelConfig offlineTtsModelConfig, String str, String str2, int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OfflineTtsModelConfig(null, null, null, null, null, null, null, 0, false, null, 1023, null) : offlineTtsModelConfig, (i11 & 2) != 0 ? "" : str, (i11 & 4) == 0 ? str2 : "", (i11 & 8) != 0 ? 1 : i10, (i11 & 16) != 0 ? 0.2f : f10);
    }
}
