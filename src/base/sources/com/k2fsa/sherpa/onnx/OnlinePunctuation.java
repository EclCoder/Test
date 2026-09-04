package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlinePunctuation;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OnlinePunctuationConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OnlinePunctuationConfig;)V", "", "ptr", "Lfl/g0;", "delete", "(J)V", "", "text", "addPunctuation", "(JLjava/lang/String;)Ljava/lang/String;", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OnlinePunctuationConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OnlinePunctuationConfig;)J", "finalize", "()V", "release", "(Ljava/lang/String;)Ljava/lang/String;", "J", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OnlinePunctuation {
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public OnlinePunctuation(AssetManager assetManager, OnlinePunctuationConfig config) {
        s.h(config, "config");
        this.ptr = assetManager != null ? newFromAsset(assetManager, config) : newFromFile(config);
    }

    private final native String addPunctuation(long ptr, String text);

    private final native void delete(long ptr);

    private final native long newFromAsset(AssetManager assetManager, OnlinePunctuationConfig config);

    private final native long newFromFile(OnlinePunctuationConfig config);

    public final String addPunctuation(String text) {
        s.h(text, "text");
        return addPunctuation(this.ptr, text);
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final void release() {
        finalize();
    }

    public /* synthetic */ OnlinePunctuation(AssetManager assetManager, OnlinePunctuationConfig onlinePunctuationConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, onlinePunctuationConfig);
    }
}
