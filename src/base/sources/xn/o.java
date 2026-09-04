package xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o implements q0 {
    private final q0 delegate;

    public o(q0 delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final q0 m200deprecated_delegate() {
        return this.delegate;
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final q0 delegate() {
        return this.delegate;
    }

    @Override // xn.q0
    public long read(e sink, long j10) {
        kotlin.jvm.internal.s.h(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // xn.q0
    public r0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
