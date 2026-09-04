package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f¨\u0006!"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiser;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;)V", "", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;)J", "ptr", "Lfl/g0;", "delete", "(J)V", "", "samples", "", "sampleRate", "Lcom/k2fsa/sherpa/onnx/DenoisedAudio;", "run", "(J[FI)Lcom/k2fsa/sherpa/onnx/DenoisedAudio;", "getSampleRate", "(J)I", "finalize", "()V", "release", "([FI)Lcom/k2fsa/sherpa/onnx/DenoisedAudio;", "J", "()I", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfflineSpeechDenoiser {
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public OfflineSpeechDenoiser(AssetManager assetManager, OfflineSpeechDenoiserConfig config) {
        s.h(config, "config");
        this.ptr = assetManager != null ? newFromAsset(assetManager, config) : newFromFile(config);
    }

    private final native void delete(long ptr);

    private final native int getSampleRate(long ptr);

    private final native long newFromAsset(AssetManager assetManager, OfflineSpeechDenoiserConfig config);

    private final native long newFromFile(OfflineSpeechDenoiserConfig config);

    private final native DenoisedAudio run(long ptr, float[] samples, int sampleRate);

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final int getSampleRate() {
        return getSampleRate(this.ptr);
    }

    public final void release() {
        finalize();
    }

    public final DenoisedAudio run(float[] samples, int sampleRate) {
        s.h(samples, "samples");
        return run(this.ptr, samples, sampleRate);
    }

    public /* synthetic */ OfflineSpeechDenoiser(AssetManager assetManager, OfflineSpeechDenoiserConfig offlineSpeechDenoiserConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, offlineSpeechDenoiserConfig);
    }
}
