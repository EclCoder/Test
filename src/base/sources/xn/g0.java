package xn;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class g0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f56910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f56911b;

    public g0(OutputStream out, r0 timeout) {
        kotlin.jvm.internal.s.h(out, "out");
        kotlin.jvm.internal.s.h(timeout, "timeout");
        this.f56910a = out;
        this.f56911b = timeout;
    }

    @Override // xn.o0
    public void W(e source, long j10) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f56911b.f();
            l0 l0Var = source.f56903a;
            kotlin.jvm.internal.s.e(l0Var);
            int iMin = (int) Math.min(j10, l0Var.f56954c - l0Var.f56953b);
            this.f56910a.write(l0Var.f56952a, l0Var.f56953b, iMin);
            l0Var.f56953b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.Z0(source.size() - j11);
            if (l0Var.f56953b == l0Var.f56954c) {
                source.f56903a = l0Var.b();
                m0.b(l0Var);
            }
        }
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56910a.close();
    }

    @Override // xn.o0, java.io.Flushable
    public void flush() throws IOException {
        this.f56910a.flush();
    }

    @Override // xn.o0
    public r0 timeout() {
        return this.f56911b;
    }

    public String toString() {
        return "sink(" + this.f56910a + ')';
    }
}
