package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/k2fsa/sherpa/onnx/DenoisedAudio;", "", "samples", "", "sampleRate", "", "([FI)V", "getSampleRate", "()I", "getSamples", "()[F", "save", "", "filename", "", "saveImpl", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DenoisedAudio {
    private final int sampleRate;
    private final float[] samples;

    public DenoisedAudio(float[] samples, int i10) {
        s.h(samples, "samples");
        this.samples = samples;
        this.sampleRate = i10;
    }

    private final native boolean saveImpl(String filename, float[] samples, int sampleRate);

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final float[] getSamples() {
        return this.samples;
    }

    public final boolean save(String filename) {
        s.h(filename, "filename");
        return saveImpl(filename, this.samples, this.sampleRate);
    }
}
