package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f33654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f33655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33657d;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f33654a = eVar;
        this.f33655b = inflater;
    }

    private void h() {
        int i10 = this.f33656c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f33655b.getRemaining();
        this.f33656c -= remaining;
        this.f33654a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f33657d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f33655b.inflate(oVarB.f33671a, oVarB.f33673c, (int) Math.min(j10, 8192 - oVarB.f33673c));
                if (iInflate > 0) {
                    oVarB.f33673c += iInflate;
                    long j11 = iInflate;
                    cVar.f33639b += j11;
                    return j11;
                }
                if (!this.f33655b.finished() && !this.f33655b.needsDictionary()) {
                }
                h();
                if (oVarB.f33672b != oVarB.f33673c) {
                    return -1L;
                }
                cVar.f33638a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f33657d) {
            return;
        }
        this.f33655b.end();
        this.f33657d = true;
        this.f33654a.close();
    }

    public final boolean d() {
        if (!this.f33655b.needsInput()) {
            return false;
        }
        h();
        if (this.f33655b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f33654a.f()) {
            return true;
        }
        o oVar = this.f33654a.a().f33638a;
        int i10 = oVar.f33673c;
        int i11 = oVar.f33672b;
        int i12 = i10 - i11;
        this.f33656c = i12;
        this.f33655b.setInput(oVar.f33671a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f33654a.b();
    }
}
