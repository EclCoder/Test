package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;", "", "model", "", "threshold", "", "minSilenceDuration", "minSpeechDuration", "windowSize", "", "maxSpeechDuration", "(Ljava/lang/String;FFFIF)V", "getMaxSpeechDuration", "()F", "setMaxSpeechDuration", "(F)V", "getMinSilenceDuration", "setMinSilenceDuration", "getMinSpeechDuration", "setMinSpeechDuration", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getThreshold", "setThreshold", "getWindowSize", "()I", "setWindowSize", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SileroVadModelConfig {
    private float maxSpeechDuration;
    private float minSilenceDuration;
    private float minSpeechDuration;
    private String model;
    private float threshold;
    private int windowSize;

    public SileroVadModelConfig() {
        this(null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 63, null);
    }

    public static /* synthetic */ SileroVadModelConfig copy$default(SileroVadModelConfig sileroVadModelConfig, String str, float f10, float f11, float f12, int i10, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sileroVadModelConfig.model;
        }
        if ((i11 & 2) != 0) {
            f10 = sileroVadModelConfig.threshold;
        }
        if ((i11 & 4) != 0) {
            f11 = sileroVadModelConfig.minSilenceDuration;
        }
        if ((i11 & 8) != 0) {
            f12 = sileroVadModelConfig.minSpeechDuration;
        }
        if ((i11 & 16) != 0) {
            i10 = sileroVadModelConfig.windowSize;
        }
        if ((i11 & 32) != 0) {
            f13 = sileroVadModelConfig.maxSpeechDuration;
        }
        int i12 = i10;
        float f14 = f13;
        return sileroVadModelConfig.copy(str, f10, f11, f12, i12, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinSilenceDuration() {
        return this.minSilenceDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMinSpeechDuration() {
        return this.minSpeechDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWindowSize() {
        return this.windowSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getMaxSpeechDuration() {
        return this.maxSpeechDuration;
    }

    public final SileroVadModelConfig copy(String model, float threshold, float minSilenceDuration, float minSpeechDuration, int windowSize, float maxSpeechDuration) {
        s.h(model, "model");
        return new SileroVadModelConfig(model, threshold, minSilenceDuration, minSpeechDuration, windowSize, maxSpeechDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SileroVadModelConfig)) {
            return false;
        }
        SileroVadModelConfig sileroVadModelConfig = (SileroVadModelConfig) other;
        return s.c(this.model, sileroVadModelConfig.model) && Float.compare(this.threshold, sileroVadModelConfig.threshold) == 0 && Float.compare(this.minSilenceDuration, sileroVadModelConfig.minSilenceDuration) == 0 && Float.compare(this.minSpeechDuration, sileroVadModelConfig.minSpeechDuration) == 0 && this.windowSize == sileroVadModelConfig.windowSize && Float.compare(this.maxSpeechDuration, sileroVadModelConfig.maxSpeechDuration) == 0;
    }

    public final float getMaxSpeechDuration() {
        return this.maxSpeechDuration;
    }

    public final float getMinSilenceDuration() {
        return this.minSilenceDuration;
    }

    public final float getMinSpeechDuration() {
        return this.minSpeechDuration;
    }

    public final String getModel() {
        return this.model;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final int getWindowSize() {
        return this.windowSize;
    }

    public int hashCode() {
        return (((((((((this.model.hashCode() * 31) + Float.hashCode(this.threshold)) * 31) + Float.hashCode(this.minSilenceDuration)) * 31) + Float.hashCode(this.minSpeechDuration)) * 31) + Integer.hashCode(this.windowSize)) * 31) + Float.hashCode(this.maxSpeechDuration);
    }

    public final void setMaxSpeechDuration(float f10) {
        this.maxSpeechDuration = f10;
    }

    public final void setMinSilenceDuration(float f10) {
        this.minSilenceDuration = f10;
    }

    public final void setMinSpeechDuration(float f10) {
        this.minSpeechDuration = f10;
    }

    public final void setModel(String str) {
        s.h(str, "<set-?>");
        this.model = str;
    }

    public final void setThreshold(float f10) {
        this.threshold = f10;
    }

    public final void setWindowSize(int i10) {
        this.windowSize = i10;
    }

    public String toString() {
        return "SileroVadModelConfig(model=" + this.model + ", threshold=" + this.threshold + ", minSilenceDuration=" + this.minSilenceDuration + ", minSpeechDuration=" + this.minSpeechDuration + ", windowSize=" + this.windowSize + ", maxSpeechDuration=" + this.maxSpeechDuration + ')';
    }

    public SileroVadModelConfig(String model, float f10, float f11, float f12, int i10, float f13) {
        s.h(model, "model");
        this.model = model;
        this.threshold = f10;
        this.minSilenceDuration = f11;
        this.minSpeechDuration = f12;
        this.windowSize = i10;
        this.maxSpeechDuration = f13;
    }

    public /* synthetic */ SileroVadModelConfig(String str, float f10, float f11, float f12, int i10, float f13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.5f : f10, (i11 & 4) != 0 ? 0.25f : f11, (i11 & 8) != 0 ? 0.25f : f12, (i11 & 16) != 0 ? 512 : i10, (i11 & 32) != 0 ? 5.0f : f13);
    }
}
