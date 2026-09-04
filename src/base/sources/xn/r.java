package xn;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f56974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f56975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f56976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f56977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f56978e;

    public r(q0 source) {
        kotlin.jvm.internal.s.h(source, "source");
        k0 k0Var = new k0(source);
        this.f56975b = k0Var;
        Inflater inflater = new Inflater(true);
        this.f56976c = inflater;
        this.f56977d = new t((g) k0Var, inflater);
        this.f56978e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + bm.r.q0(b.g(i11), 8, '0') + " != expected 0x" + bm.r.q0(b.g(i10), 8, '0'));
    }

    private final void d() throws IOException {
        this.f56975b.Z(10L);
        byte bC0 = this.f56975b.f56944b.c0(3L);
        boolean z10 = ((bC0 >> 1) & 1) == 1;
        if (z10) {
            i(this.f56975b.f56944b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f56975b.readShort());
        this.f56975b.skip(8L);
        if (((bC0 >> 2) & 1) == 1) {
            this.f56975b.Z(2L);
            if (z10) {
                i(this.f56975b.f56944b, 0L, 2L);
            }
            long jS = this.f56975b.f56944b.S() & 65535;
            this.f56975b.Z(jS);
            if (z10) {
                i(this.f56975b.f56944b, 0L, jS);
            }
            this.f56975b.skip(jS);
        }
        if (((bC0 >> 3) & 1) == 1) {
            long jC = this.f56975b.c((byte) 0);
            if (jC == -1) {
                throw new EOFException();
            }
            if (z10) {
                i(this.f56975b.f56944b, 0L, jC + 1);
            }
            this.f56975b.skip(jC + 1);
        }
        if (((bC0 >> 4) & 1) == 1) {
            long jC2 = this.f56975b.c((byte) 0);
            if (jC2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                i(this.f56975b.f56944b, 0L, jC2 + 1);
            }
            this.f56975b.skip(jC2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f56975b.S(), (short) this.f56978e.getValue());
            this.f56978e.reset();
        }
    }

    private final void h() throws IOException {
        a("CRC", this.f56975b.H0(), (int) this.f56978e.getValue());
        a("ISIZE", this.f56975b.H0(), (int) this.f56976c.getBytesWritten());
    }

    private final void i(e eVar, long j10, long j11) {
        l0 l0Var = eVar.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        while (true) {
            int i10 = l0Var.f56954c;
            int i11 = l0Var.f56953b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) l0Var.f56953b) + j10);
            int iMin = (int) Math.min(l0Var.f56954c - i12, j11);
            this.f56978e.update(l0Var.f56952a, i12, iMin);
            j11 -= (long) iMin;
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            j10 = 0;
        }
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56977d.close();
    }

    @Override // xn.q0
    public long read(e sink, long j10) throws IOException {
        r rVar;
        kotlin.jvm.internal.s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f56974a == 0) {
            d();
            this.f56974a = (byte) 1;
        }
        if (this.f56974a == 1) {
            long size = sink.size();
            long j11 = this.f56977d.read(sink, j10);
            if (j11 != -1) {
                i(sink, size, j11);
                return j11;
            }
            rVar = this;
            rVar.f56974a = (byte) 2;
        } else {
            rVar = this;
        }
        if (rVar.f56974a == 2) {
            h();
            rVar.f56974a = (byte) 3;
            if (!rVar.f56975b.n0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // xn.q0
    public r0 timeout() {
        return this.f56975b.timeout();
    }
}
