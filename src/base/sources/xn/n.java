package xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f56965a;

    public n(o0 delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f56965a = delegate;
    }

    @Override // xn.o0
    public void W(e source, long j10) {
        kotlin.jvm.internal.s.h(source, "source");
        this.f56965a.W(source, j10);
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56965a.close();
    }

    @Override // xn.o0, java.io.Flushable
    public void flush() {
        this.f56965a.flush();
    }

    @Override // xn.o0
    public r0 timeout() {
        return this.f56965a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f56965a + ')';
    }
}
