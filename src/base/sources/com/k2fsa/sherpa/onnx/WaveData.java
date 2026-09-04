package com.k2fsa.sherpa.onnx;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/k2fsa/sherpa/onnx/WaveData;", "", "samples", "", "sampleRate", "", "([FI)V", "getSampleRate", "()I", "getSamples", "()[F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class WaveData {
    private final int sampleRate;
    private final float[] samples;

    public WaveData(float[] samples, int i10) {
        s.h(samples, "samples");
        this.samples = samples;
        this.sampleRate = i10;
    }

    public static /* synthetic */ WaveData copy$default(WaveData waveData, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = waveData.samples;
        }
        if ((i11 & 2) != 0) {
            i10 = waveData.sampleRate;
        }
        return waveData.copy(fArr, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float[] getSamples() {
        return this.samples;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final WaveData copy(float[] samples, int sampleRate) {
        s.h(samples, "samples");
        return new WaveData(samples, sampleRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.c(WaveData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.f(other, "null cannot be cast to non-null type com.k2fsa.sherpa.onnx.WaveData");
        WaveData waveData = (WaveData) other;
        return Arrays.equals(this.samples, waveData.samples) && this.sampleRate == waveData.sampleRate;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final float[] getSamples() {
        return this.samples;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.samples) * 31) + this.sampleRate;
    }

    public String toString() {
        return "WaveData(samples=" + Arrays.toString(this.samples) + ", sampleRate=" + this.sampleRate + ')';
    }
}
