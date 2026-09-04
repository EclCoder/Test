package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010\u0011\u001a\u00020 ¢\u0006\u0004\b\u0011\u0010!J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b\u0015\u0010#J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b\u0018\u0010$J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010%R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006("}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractor;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;)V", "", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;)J", "ptr", "Lfl/g0;", "delete", "(J)V", "createStream", "(J)J", "streamPtr", "", "isReady", "(JJ)Z", "", "compute", "(JJ)[F", "", "dim", "(J)I", "finalize", "()V", "release", "Lcom/k2fsa/sherpa/onnx/OnlineStream;", "()Lcom/k2fsa/sherpa/onnx/OnlineStream;", "stream", "(Lcom/k2fsa/sherpa/onnx/OnlineStream;)Z", "(Lcom/k2fsa/sherpa/onnx/OnlineStream;)[F", "()I", "J", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SpeakerEmbeddingExtractor {
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public SpeakerEmbeddingExtractor(AssetManager assetManager, SpeakerEmbeddingExtractorConfig config) {
        s.h(config, "config");
        this.ptr = assetManager != null ? newFromAsset(assetManager, config) : newFromFile(config);
    }

    private final native float[] compute(long ptr, long streamPtr);

    private final native long createStream(long ptr);

    private final native void delete(long ptr);

    private final native int dim(long ptr);

    private final native boolean isReady(long ptr, long streamPtr);

    private final native long newFromAsset(AssetManager assetManager, SpeakerEmbeddingExtractorConfig config);

    private final native long newFromFile(SpeakerEmbeddingExtractorConfig config);

    public final float[] compute(OnlineStream stream) {
        s.h(stream, "stream");
        return compute(this.ptr, stream.getPtr());
    }

    public final OnlineStream createStream() {
        return new OnlineStream(createStream(this.ptr));
    }

    public final int dim() {
        return dim(this.ptr);
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final boolean isReady(OnlineStream stream) {
        s.h(stream, "stream");
        return isReady(this.ptr, stream.getPtr());
    }

    public final void release() {
        finalize();
    }

    public /* synthetic */ SpeakerEmbeddingExtractor(AssetManager assetManager, SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, speakerEmbeddingExtractorConfig);
    }
}
