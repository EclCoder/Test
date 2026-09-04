package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l implements nb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.j f17848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f17851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17852e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(ob.d0 d0Var);
    }

    public l(nb.j jVar, int i10, a aVar) {
        ob.a.a(i10 > 0);
        this.f17848a = jVar;
        this.f17849b = i10;
        this.f17850c = aVar;
        this.f17851d = new byte[1];
        this.f17852e = i10;
    }

    private boolean f() {
        if (this.f17848a.read(this.f17851d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f17851d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f17848a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f17850c.a(new ob.d0(bArr, i10));
        }
        return true;
    }

    @Override // nb.j
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // nb.j
    public void d(nb.a0 a0Var) {
        ob.a.e(a0Var);
        this.f17848a.d(a0Var);
    }

    @Override // nb.j
    public Map getResponseHeaders() {
        return this.f17848a.getResponseHeaders();
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f17848a.getUri();
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f17852e == 0) {
            if (!f()) {
                return -1;
            }
            this.f17852e = this.f17849b;
        }
        int i12 = this.f17848a.read(bArr, i10, Math.min(this.f17852e, i11));
        if (i12 != -1) {
            this.f17852e -= i12;
        }
        return i12;
    }
}
