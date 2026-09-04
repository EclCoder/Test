package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001c\u0010\u001bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0004¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010!J\u0017\u0010\u0013\u001a\u00020#2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010$J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u0016\u0010&J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u0018\u0010&J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u001a\u0010'J\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u001c\u0010'J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u001e\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,¨\u0006."}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineRecognizer;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;)V", "", "ptr", "Lfl/g0;", "delete", "(J)V", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;)J", "", "hotwords", "createStream", "(JLjava/lang/String;)J", "streamPtr", "reset", "(JJ)V", "decode", "", "isEndpoint", "(JJ)Z", "isReady", "Lcom/k2fsa/sherpa/onnx/OnlineRecognizerResult;", "getResult", "(JJ)Lcom/k2fsa/sherpa/onnx/OnlineRecognizerResult;", "finalize", "()V", "release", "Lcom/k2fsa/sherpa/onnx/OnlineStream;", "(Ljava/lang/String;)Lcom/k2fsa/sherpa/onnx/OnlineStream;", "stream", "(Lcom/k2fsa/sherpa/onnx/OnlineStream;)V", "(Lcom/k2fsa/sherpa/onnx/OnlineStream;)Z", "(Lcom/k2fsa/sherpa/onnx/OnlineStream;)Lcom/k2fsa/sherpa/onnx/OnlineRecognizerResult;", "Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;", "getConfig", "()Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;", "J", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OnlineRecognizer {
    private final OnlineRecognizerConfig config;
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public OnlineRecognizer(AssetManager assetManager, OnlineRecognizerConfig config) {
        s.h(config, "config");
        this.config = config;
        this.ptr = assetManager != null ? newFromAsset(assetManager, config) : newFromFile(config);
    }

    private final native long createStream(long ptr, String hotwords);

    public static /* synthetic */ OnlineStream createStream$default(OnlineRecognizer onlineRecognizer, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return onlineRecognizer.createStream(str);
    }

    private final native void decode(long ptr, long streamPtr);

    private final native void delete(long ptr);

    private final native OnlineRecognizerResult getResult(long ptr, long streamPtr);

    private final native boolean isEndpoint(long ptr, long streamPtr);

    private final native boolean isReady(long ptr, long streamPtr);

    private final native long newFromAsset(AssetManager assetManager, OnlineRecognizerConfig config);

    private final native long newFromFile(OnlineRecognizerConfig config);

    private final native void reset(long ptr, long streamPtr);

    public final OnlineStream createStream(String hotwords) {
        s.h(hotwords, "hotwords");
        return new OnlineStream(createStream(this.ptr, hotwords));
    }

    public final void decode(OnlineStream stream) {
        s.h(stream, "stream");
        decode(this.ptr, stream.getPtr());
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final OnlineRecognizerConfig getConfig() {
        return this.config;
    }

    public final OnlineRecognizerResult getResult(OnlineStream stream) {
        s.h(stream, "stream");
        return getResult(this.ptr, stream.getPtr());
    }

    public final boolean isEndpoint(OnlineStream stream) {
        s.h(stream, "stream");
        return isEndpoint(this.ptr, stream.getPtr());
    }

    public final boolean isReady(OnlineStream stream) {
        s.h(stream, "stream");
        return isReady(this.ptr, stream.getPtr());
    }

    public final void release() {
        finalize();
    }

    public final void reset(OnlineStream stream) {
        s.h(stream, "stream");
        reset(this.ptr, stream.getPtr());
    }

    public /* synthetic */ OnlineRecognizer(AssetManager assetManager, OnlineRecognizerConfig onlineRecognizerConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, onlineRecognizerConfig);
    }
}
