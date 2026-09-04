package com.k2fsa.sherpa.onnx;

import android.content.res.AssetManager;
import com.coremedia.iso.boxes.FreeBox;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 <2\u00020\u0001:\u0001<B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0013J4\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010 \u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001dH\u0082 ¢\u0006\u0004\b \u0010!J>\u0010#\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\"2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001dH\u0082 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010&J)\u0010(\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J=\u0010*\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\"¢\u0006\u0004\b,\u0010-J1\u0010.\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\"2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0004¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u00103R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;¨\u0006="}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTts;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;)V", "", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;)J", "ptr", "Lfl/g0;", "delete", "(J)V", "", "getSampleRate", "(J)I", "getNumSpeakers", "", "text", "sid", "", "speed", "Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "generateImpl", "(JLjava/lang/String;IF)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "Lkotlin/Function1;", "", "callback", "generateWithCallbackImpl", "(JLjava/lang/String;IFLkotlin/jvm/functions/Function1;)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "Lcom/k2fsa/sherpa/onnx/GenerationConfig;", "generateWithConfigImpl", "(JLjava/lang/String;Lcom/k2fsa/sherpa/onnx/GenerationConfig;Lkotlin/jvm/functions/Function1;)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "sampleRate", "()I", "numSpeakers", "generate", "(Ljava/lang/String;IF)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "generateWithCallback", "(Ljava/lang/String;IFLkotlin/jvm/functions/Function1;)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "generateWithConfig", "(Ljava/lang/String;Lcom/k2fsa/sherpa/onnx/GenerationConfig;)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "generateWithConfigAndCallback", "(Ljava/lang/String;Lcom/k2fsa/sherpa/onnx/GenerationConfig;Lkotlin/jvm/functions/Function1;)Lcom/k2fsa/sherpa/onnx/GeneratedAudio;", "allocate", "(Landroid/content/res/AssetManager;)V", FreeBox.TYPE, "()V", "finalize", "release", "Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "getConfig", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "setConfig", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;)V", "J", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfflineTts {
    private OfflineTtsConfig config;
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public OfflineTts(AssetManager assetManager, OfflineTtsConfig config) {
        s.h(config, "config");
        this.config = config;
        this.ptr = assetManager != null ? newFromAsset(assetManager, config) : newFromFile(config);
    }

    public static /* synthetic */ void allocate$default(OfflineTts offlineTts, AssetManager assetManager, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            assetManager = null;
        }
        offlineTts.allocate(assetManager);
    }

    private final native void delete(long ptr);

    public static /* synthetic */ GeneratedAudio generate$default(OfflineTts offlineTts, String str, int i10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        return offlineTts.generate(str, i10, f10);
    }

    private final native GeneratedAudio generateImpl(long ptr, String text, int sid, float speed);

    static /* synthetic */ GeneratedAudio generateImpl$default(OfflineTts offlineTts, long j10, String str, int i10, float f10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            f10 = 1.0f;
        }
        return offlineTts.generateImpl(j10, str, i12, f10);
    }

    public static /* synthetic */ GeneratedAudio generateWithCallback$default(OfflineTts offlineTts, String str, int i10, float f10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        return offlineTts.generateWithCallback(str, i10, f10, function1);
    }

    private final native GeneratedAudio generateWithCallbackImpl(long ptr, String text, int sid, float speed, Function1 callback);

    static /* synthetic */ GeneratedAudio generateWithCallbackImpl$default(OfflineTts offlineTts, long j10, String str, int i10, float f10, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            f10 = 1.0f;
        }
        return offlineTts.generateWithCallbackImpl(j10, str, i12, f10, function1);
    }

    private final native GeneratedAudio generateWithConfigImpl(long ptr, String text, GenerationConfig config, Function1 callback);

    private final native int getNumSpeakers(long ptr);

    private final native int getSampleRate(long ptr);

    private final native long newFromAsset(AssetManager assetManager, OfflineTtsConfig config);

    private final native long newFromFile(OfflineTtsConfig config);

    public final void allocate(AssetManager assetManager) {
        if (this.ptr == 0) {
            this.ptr = assetManager != null ? newFromAsset(assetManager, this.config) : newFromFile(this.config);
        }
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final void free() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final GeneratedAudio generate(String text, int sid, float speed) {
        s.h(text, "text");
        return generateImpl(this.ptr, text, sid, speed);
    }

    public final GeneratedAudio generateWithCallback(String text, int sid, float speed, Function1 callback) {
        s.h(text, "text");
        s.h(callback, "callback");
        return generateWithCallbackImpl(this.ptr, text, sid, speed, callback);
    }

    public final GeneratedAudio generateWithConfig(String text, GenerationConfig config) {
        s.h(text, "text");
        s.h(config, "config");
        return generateWithConfigImpl(this.ptr, text, config, null);
    }

    public final GeneratedAudio generateWithConfigAndCallback(String text, GenerationConfig config, Function1 callback) {
        s.h(text, "text");
        s.h(config, "config");
        s.h(callback, "callback");
        return generateWithConfigImpl(this.ptr, text, config, callback);
    }

    public final OfflineTtsConfig getConfig() {
        return this.config;
    }

    public final int numSpeakers() {
        return getNumSpeakers(this.ptr);
    }

    public final void release() {
        finalize();
    }

    public final int sampleRate() {
        return getSampleRate(this.ptr);
    }

    public final void setConfig(OfflineTtsConfig offlineTtsConfig) {
        s.h(offlineTtsConfig, "<set-?>");
        this.config = offlineTtsConfig;
    }

    public /* synthetic */ OfflineTts(AssetManager assetManager, OfflineTtsConfig offlineTtsConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : assetManager, offlineTtsConfig);
    }
}
