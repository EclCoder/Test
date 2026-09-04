package com.k2fsa.sherpa.onnx;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0015J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0016J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0005¨\u0006$"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineStream;", "", "", "ptr", "<init>", "(J)V", "", "samples", "", "sampleRate", "Lfl/g0;", "acceptWaveform", "(J[FI)V", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setOption", "(JLjava/lang/String;Ljava/lang/String;)V", "getOption", "(JLjava/lang/String;)Ljava/lang/String;", "delete", "([FI)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)Ljava/lang/String;", "finalize", "()V", "release", "Lkotlin/Function1;", "block", "use", "(Lkotlin/jvm/functions/Function1;)V", "J", "getPtr", "()J", "setPtr", "Companion", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfflineStream {
    private long ptr;

    static {
        System.loadLibrary("sherpa-onnx-jni");
    }

    public OfflineStream(long j10) {
        this.ptr = j10;
    }

    private final native void acceptWaveform(long ptr, float[] samples, int sampleRate);

    private final native void delete(long ptr);

    private final native String getOption(long ptr, String key);

    private final native void setOption(long ptr, String key, String value);

    public final void acceptWaveform(float[] samples, int sampleRate) {
        s.h(samples, "samples");
        acceptWaveform(this.ptr, samples, sampleRate);
    }

    protected final void finalize() {
        long j10 = this.ptr;
        if (j10 != 0) {
            delete(j10);
            this.ptr = 0L;
        }
    }

    public final String getOption(String key) {
        s.h(key, "key");
        return getOption(this.ptr, key);
    }

    public final long getPtr() {
        return this.ptr;
    }

    public final void release() {
        finalize();
    }

    public final void setOption(String key, String value) {
        s.h(key, "key");
        s.h(value, "value");
        setOption(this.ptr, key, value);
    }

    public final void setPtr(long j10) {
        this.ptr = j10;
    }

    public final void use(Function1 block) {
        s.h(block, "block");
        try {
            block.invoke(this);
        } finally {
            release();
        }
    }
}
