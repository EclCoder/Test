package com.k2fsa.sherpa.onnx;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0003Jk\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0006HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'¨\u00068"}, d2 = {"Lcom/k2fsa/sherpa/onnx/GenerationConfig;", "", "silenceScale", "", "speed", "sid", "", "referenceAudio", "", "referenceSampleRate", "referenceText", "", "numSteps", "extra", "", "(FFI[FILjava/lang/String;ILjava/util/Map;)V", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "getNumSteps", "()I", "setNumSteps", "(I)V", "getReferenceAudio", "()[F", "setReferenceAudio", "([F)V", "getReferenceSampleRate", "setReferenceSampleRate", "getReferenceText", "()Ljava/lang/String;", "setReferenceText", "(Ljava/lang/String;)V", "getSid", "setSid", "getSilenceScale", "()F", "setSilenceScale", "(F)V", "getSpeed", "setSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GenerationConfig {
    private Map<String, String> extra;
    private int numSteps;
    private float[] referenceAudio;
    private int referenceSampleRate;
    private String referenceText;
    private int sid;
    private float silenceScale;
    private float speed;

    public GenerationConfig() {
        this(0.0f, 0.0f, 0, null, 0, null, 0, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerationConfig copy$default(GenerationConfig generationConfig, float f10, float f11, int i10, float[] fArr, int i11, String str, int i12, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f10 = generationConfig.silenceScale;
        }
        if ((i13 & 2) != 0) {
            f11 = generationConfig.speed;
        }
        if ((i13 & 4) != 0) {
            i10 = generationConfig.sid;
        }
        if ((i13 & 8) != 0) {
            fArr = generationConfig.referenceAudio;
        }
        if ((i13 & 16) != 0) {
            i11 = generationConfig.referenceSampleRate;
        }
        if ((i13 & 32) != 0) {
            str = generationConfig.referenceText;
        }
        if ((i13 & 64) != 0) {
            i12 = generationConfig.numSteps;
        }
        if ((i13 & 128) != 0) {
            map = generationConfig.extra;
        }
        int i14 = i12;
        Map map2 = map;
        int i15 = i11;
        String str2 = str;
        return generationConfig.copy(f10, f11, i10, fArr, i15, str2, i14, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSilenceScale() {
        return this.silenceScale;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float[] getReferenceAudio() {
        return this.referenceAudio;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getReferenceSampleRate() {
        return this.referenceSampleRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferenceText() {
        return this.referenceText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNumSteps() {
        return this.numSteps;
    }

    public final Map<String, String> component8() {
        return this.extra;
    }

    public final GenerationConfig copy(float silenceScale, float speed, int sid, float[] referenceAudio, int referenceSampleRate, String referenceText, int numSteps, Map<String, String> extra) {
        return new GenerationConfig(silenceScale, speed, sid, referenceAudio, referenceSampleRate, referenceText, numSteps, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerationConfig)) {
            return false;
        }
        GenerationConfig generationConfig = (GenerationConfig) other;
        return Float.compare(this.silenceScale, generationConfig.silenceScale) == 0 && Float.compare(this.speed, generationConfig.speed) == 0 && this.sid == generationConfig.sid && s.c(this.referenceAudio, generationConfig.referenceAudio) && this.referenceSampleRate == generationConfig.referenceSampleRate && s.c(this.referenceText, generationConfig.referenceText) && this.numSteps == generationConfig.numSteps && s.c(this.extra, generationConfig.extra);
    }

    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final int getNumSteps() {
        return this.numSteps;
    }

    public final float[] getReferenceAudio() {
        return this.referenceAudio;
    }

    public final int getReferenceSampleRate() {
        return this.referenceSampleRate;
    }

    public final String getReferenceText() {
        return this.referenceText;
    }

    public final int getSid() {
        return this.sid;
    }

    public final float getSilenceScale() {
        return this.silenceScale;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.silenceScale) * 31) + Float.hashCode(this.speed)) * 31) + Integer.hashCode(this.sid)) * 31;
        float[] fArr = this.referenceAudio;
        int iHashCode2 = (((iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + Integer.hashCode(this.referenceSampleRate)) * 31;
        String str = this.referenceText;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.numSteps)) * 31;
        Map<String, String> map = this.extra;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final void setExtra(Map<String, String> map) {
        this.extra = map;
    }

    public final void setNumSteps(int i10) {
        this.numSteps = i10;
    }

    public final void setReferenceAudio(float[] fArr) {
        this.referenceAudio = fArr;
    }

    public final void setReferenceSampleRate(int i10) {
        this.referenceSampleRate = i10;
    }

    public final void setReferenceText(String str) {
        this.referenceText = str;
    }

    public final void setSid(int i10) {
        this.sid = i10;
    }

    public final void setSilenceScale(float f10) {
        this.silenceScale = f10;
    }

    public final void setSpeed(float f10) {
        this.speed = f10;
    }

    public String toString() {
        return "GenerationConfig(silenceScale=" + this.silenceScale + ", speed=" + this.speed + ", sid=" + this.sid + ", referenceAudio=" + Arrays.toString(this.referenceAudio) + ", referenceSampleRate=" + this.referenceSampleRate + ", referenceText=" + this.referenceText + ", numSteps=" + this.numSteps + ", extra=" + this.extra + ')';
    }

    public GenerationConfig(float f10, float f11, int i10, float[] fArr, int i11, String str, int i12, Map<String, String> map) {
        this.silenceScale = f10;
        this.speed = f11;
        this.sid = i10;
        this.referenceAudio = fArr;
        this.referenceSampleRate = i11;
        this.referenceText = str;
        this.numSteps = i12;
        this.extra = map;
    }

    public /* synthetic */ GenerationConfig(float f10, float f11, int i10, float[] fArr, int i11, String str, int i12, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.2f : f10, (i13 & 2) != 0 ? 1.0f : f11, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? null : fArr, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? 5 : i12, (i13 & 128) != 0 ? null : map);
    }
}
