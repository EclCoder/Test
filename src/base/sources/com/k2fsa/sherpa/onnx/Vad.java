package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 02\u00020\u0001:\u00010B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001b\u0010\fJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b \u0010\u001aJ\u0018\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b!\u0010\fJ\u0018\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0004¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010&J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010'J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010(J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010$J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010)J\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010$J\r\u0010 \u001a\u00020\u0018¢\u0006\u0004\b \u0010(J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010$J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/¨\u00061"}, d2 = {"Lcom/k2fsa/sherpa/onnx/Vad;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/VadModelConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/VadModelConfig;)V", "", "ptr", "Lfl/g0;", "delete", "(J)V", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/VadModelConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/VadModelConfig;)J", "", "samples", "acceptWaveform", "(J[F)V", "", "compute", "(J[F)F", "", "empty", "(J)Z", "pop", "clear", "Lcom/k2fsa/sherpa/onnx/SpeechSegment;", "front", "(J)Lcom/k2fsa/sherpa/onnx/SpeechSegment;", "isSpeechDetected", "reset", "flush", "finalize", "()V", "release", "([F)F", "([F)V", "()Z", "()Lcom/k2fsa/sherpa/onnx/SpeechSegment;", "Lcom/k2fsa/sherpa/onnx/VadModelConfig;", "getConfig", "()Lcom/k2fsa/sherpa/onnx/VadModelConfig;", "setConfig", "(Lcom/k2fsa/sherpa/onnx/VadModelConfig;)V", "J", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Vad {
    private VadModelConfig config;
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public Vad(AssetManager assetManager, VadModelConfig config) {
        s.h(config, "config");
        this.config = config;
        if (assetManager != null) {
            this.ptr = newFromAsset(assetManager, config);
        } else {
            this.ptr = newFromFile(config);
        }
    }

    private final native void acceptWaveform(long ptr, float[] samples);

    private final native void clear(long ptr);

    private final native float compute(long ptr, float[] samples);

    private final native void delete(long ptr);

    private final native boolean empty(long ptr);

    private final native void flush(long ptr);

    private final native SpeechSegment front(long ptr);

    private final native boolean isSpeechDetected(long ptr);

    private final native long newFromAsset(AssetManager assetManager, VadModelConfig config);

    private final native long newFromFile(VadModelConfig config);

    private final native void pop(long ptr);

    private final native void reset(long ptr);

    public final void acceptWaveform(float[] samples) {
        s.h(samples, "samples");
        acceptWaveform(this.ptr, samples);
    }

    public final void clear() {
        clear(this.ptr);
    }

    public final float compute(float[] samples) {
        s.h(samples, "samples");
        return compute(this.ptr, samples);
    }

    public final boolean empty() {
        return empty(this.ptr);
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final void flush() {
        flush(this.ptr);
    }

    public final SpeechSegment front() {
        return front(this.ptr);
    }

    public final VadModelConfig getConfig() {
        return this.config;
    }

    public final boolean isSpeechDetected() {
        return isSpeechDetected(this.ptr);
    }

    public final void pop() {
        pop(this.ptr);
    }

    public final void release() {
        finalize();
    }

    public final void reset() {
        reset(this.ptr);
    }

    public final void setConfig(VadModelConfig vadModelConfig) {
        s.h(vadModelConfig, "<set-?>");
        this.config = vadModelConfig;
    }

    public /* synthetic */ Vad(AssetManager assetManager, VadModelConfig vadModelConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, vadModelConfig);
    }
}
