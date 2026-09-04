package xn;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class t implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f56987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f56988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56990d;

    public t(g source, Inflater inflater) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this.f56987a = source;
        this.f56988b = inflater;
    }

    private final void h() {
        int i10 = this.f56989c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f56988b.getRemaining();
        this.f56989c -= remaining;
        this.f56987a.skip(remaining);
    }

    public final long a(e sink, long j10) throws IOException {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f56990d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            l0 l0VarC1 = sink.c1(1);
            int iMin = (int) Math.min(j10, 8192 - l0VarC1.f56954c);
            d();
            int iInflate = this.f56988b.inflate(l0VarC1.f56952a, l0VarC1.f56954c, iMin);
            h();
            if (iInflate > 0) {
                l0VarC1.f56954c += iInflate;
                long j11 = iInflate;
                sink.Z0(sink.size() + j11);
                return j11;
            }
            if (l0VarC1.f56953b == l0VarC1.f56954c) {
                sink.f56903a = l0VarC1.b();
                m0.b(l0VarC1);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f56990d) {
            return;
        }
        this.f56988b.end();
        this.f56990d = true;
        this.f56987a.close();
    }

    public final boolean d() {
        if (!this.f56988b.needsInput()) {
            return false;
        }
        if (this.f56987a.n0()) {
            return true;
        }
        l0 l0Var = this.f56987a.u().f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56954c;
        int i11 = l0Var.f56953b;
        int i12 = i10 - i11;
        this.f56989c = i12;
        this.f56988b.setInput(l0Var.f56952a, i11, i12);
        return false;
    }

    @Override // xn.q0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.s.h(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f56988b.finished() || this.f56988b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f56987a.n0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // xn.q0
    public r0 timeout() {
        return this.f56987a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(q0 source, Inflater inflater) {
        this(c0.c(source), inflater);
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(inflater, "inflater");
    }
}
