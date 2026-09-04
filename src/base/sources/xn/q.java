package xn;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f56969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f56970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f56971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f56973e;

    public q(o0 sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        j0 j0Var = new j0(sink);
        this.f56969a = j0Var;
        Deflater deflater = new Deflater(yn.v.b(), true);
        this.f56970b = deflater;
        this.f56971c = new i(j0Var, deflater);
        this.f56973e = new CRC32();
        e eVar = j0Var.f56933b;
        eVar.writeShort(8075);
        eVar.writeByte(8);
        eVar.writeByte(0);
        eVar.writeInt(0);
        eVar.writeByte(0);
        eVar.writeByte(0);
    }

    private final void a(e eVar, long j10) {
        l0 l0Var = eVar.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, l0Var.f56954c - l0Var.f56953b);
            this.f56973e.update(l0Var.f56952a, l0Var.f56953b, iMin);
            j10 -= (long) iMin;
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
        }
    }

    private final void d() {
        this.f56969a.a((int) this.f56973e.getValue());
        this.f56969a.a((int) this.f56970b.getBytesRead());
    }

    @Override // xn.o0
    public void W(e source, long j10) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        a(source, j10);
        this.f56971c.W(source, j10);
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f56972d) {
            return;
        }
        this.f56971c.d();
        d();
        th = null;
        try {
            this.f56970b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f56969a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f56972d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // xn.o0, java.io.Flushable
    public void flush() throws IOException {
        this.f56971c.flush();
    }

    @Override // xn.o0
    public r0 timeout() {
        return this.f56969a.timeout();
    }
}
