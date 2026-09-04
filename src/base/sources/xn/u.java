package xn;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class u implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f56997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f56998b;

    public u(InputStream input, r0 timeout) {
        kotlin.jvm.internal.s.h(input, "input");
        kotlin.jvm.internal.s.h(timeout, "timeout");
        this.f56997a = input;
        this.f56998b = timeout;
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56997a.close();
    }

    @Override // xn.q0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f56998b.f();
            l0 l0VarC1 = sink.c1(1);
            int i10 = this.f56997a.read(l0VarC1.f56952a, l0VarC1.f56954c, (int) Math.min(j10, 8192 - l0VarC1.f56954c));
            if (i10 != -1) {
                l0VarC1.f56954c += i10;
                long j11 = i10;
                sink.Z0(sink.size() + j11);
                return j11;
            }
            if (l0VarC1.f56953b != l0VarC1.f56954c) {
                return -1L;
            }
            sink.f56903a = l0VarC1.b();
            m0.b(l0VarC1);
            return -1L;
        } catch (AssertionError e10) {
            if (yn.u.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // xn.q0
    public r0 timeout() {
        return this.f56998b;
    }

    public String toString() {
        return "source(" + this.f56997a + ')';
    }
}
