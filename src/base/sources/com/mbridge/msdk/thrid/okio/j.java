package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f33650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f33651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f33652d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33649a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f33653e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f33651c = inflater;
        e eVarA = l.a(sVar);
        this.f33650b = eVarA;
        this.f33652d = new k(eVarA, inflater);
    }

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f33638a;
        while (true) {
            long j12 = oVar.f33673c - oVar.f33672b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f33676f;
        }
        while (j11 > 0) {
            int i10 = (int) (((long) oVar.f33672b) + j10);
            int iMin = (int) Math.min(oVar.f33673c - i10, j11);
            this.f33653e.update(oVar.f33671a, i10, iMin);
            j11 -= (long) iMin;
            oVar = oVar.f33676f;
            j10 = 0;
        }
    }

    private void d() throws IOException {
        this.f33650b.e(10L);
        byte bF = this.f33650b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f33650b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f33650b.readShort());
        this.f33650b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f33650b.e(2L);
            if (z10) {
                a(this.f33650b.a(), 0L, 2L);
            }
            long jG = this.f33650b.a().g();
            this.f33650b.e(jG);
            if (z10) {
                a(this.f33650b.a(), 0L, jG);
            }
            this.f33650b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f33650b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f33650b.a(), 0L, jA + 1);
            }
            this.f33650b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f33650b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f33650b.a(), 0L, jA2 + 1);
            }
            this.f33650b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f33650b.g(), (short) this.f33653e.getValue());
            this.f33653e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f33650b.e(), (int) this.f33653e.getValue());
        a("ISIZE", this.f33650b.e(), (int) this.f33651c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        j jVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f33649a == 0) {
            d();
            this.f33649a = 1;
        }
        if (this.f33649a == 1) {
            long j11 = cVar.f33639b;
            long jB = this.f33652d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            jVar = this;
            jVar.f33649a = 2;
        } else {
            jVar = this;
        }
        if (jVar.f33649a == 2) {
            h();
            jVar.f33649a = 3;
            if (!jVar.f33650b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33652d.close();
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f33650b.b();
    }
}
