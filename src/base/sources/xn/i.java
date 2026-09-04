package xn;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f56920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f56921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56922c;

    public i(f sink, Deflater deflater) {
        kotlin.jvm.internal.s.h(sink, "sink");
        kotlin.jvm.internal.s.h(deflater, "deflater");
        this.f56920a = sink;
        this.f56921b = deflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    private final void a(boolean z10) throws IOException {
        l0 l0VarC1;
        ?? r10;
        int iDeflate;
        e eVarU = this.f56920a.u();
        while (true) {
            l0VarC1 = eVarU.c1(1);
            ?? Deflate = "Deflater already closed";
            if (z10) {
                try {
                    Deflater deflater = this.f56921b;
                    byte[] bArr = l0VarC1.f56952a;
                    int i10 = l0VarC1.f56954c;
                    Deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                    r10 = Deflate;
                } catch (IllegalStateException e10) {
                    throw new IOException(Deflate, e10);
                } catch (NullPointerException e11) {
                    throw new IOException(Deflate, e11);
                }
            } else {
                Deflater deflater2 = this.f56921b;
                byte[] bArr2 = l0VarC1.f56952a;
                int i11 = l0VarC1.f56954c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (r10 > 0) {
                r10 = iDeflate;
                l0VarC1.f56954c += r10;
                eVarU.Z0(eVarU.size() + ((long) r10));
                this.f56920a.J();
            } else {
                r10 = iDeflate;
                if (this.f56921b.needsInput()) {
                    break;
                }
            }
        }
        if (l0VarC1.f56953b == l0VarC1.f56954c) {
            eVarU.f56903a = l0VarC1.b();
            m0.b(l0VarC1);
        }
    }

    @Override // xn.o0
    public void W(e source, long j10) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            l0 l0Var = source.f56903a;
            kotlin.jvm.internal.s.e(l0Var);
            int iMin = (int) Math.min(j10, l0Var.f56954c - l0Var.f56953b);
            this.f56921b.setInput(l0Var.f56952a, l0Var.f56953b, iMin);
            a(false);
            long j11 = iMin;
            source.Z0(source.size() - j11);
            int i10 = l0Var.f56953b + iMin;
            l0Var.f56953b = i10;
            if (i10 == l0Var.f56954c) {
                source.f56903a = l0Var.b();
                m0.b(l0Var);
            }
            j10 -= j11;
        }
        this.f56921b.setInput(yn.v.c(), 0, 0);
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f56922c) {
            return;
        }
        d();
        th = null;
        try {
            this.f56921b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f56920a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f56922c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d() throws IOException {
        this.f56921b.finish();
        a(false);
    }

    @Override // xn.o0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f56920a.flush();
    }

    @Override // xn.o0
    public r0 timeout() {
        return this.f56920a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f56920a + ')';
    }
}
