package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UdpDataSource f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f17995b;

    public g0(long j10) {
        this.f17994a = new UdpDataSource(2000, com.google.common.primitives.g.d(j10));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String a() {
        int iC = c();
        ob.a.g(iC != -1);
        return r0.D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(iC), Integer.valueOf(iC + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int c() {
        int iC = this.f17994a.c();
        if (iC == -1) {
            return -1;
        }
        return iC;
    }

    @Override // nb.j
    public void close() {
        this.f17994a.close();
        g0 g0Var = this.f17995b;
        if (g0Var != null) {
            g0Var.close();
        }
    }

    @Override // nb.j
    public void d(nb.a0 a0Var) {
        this.f17994a.d(a0Var);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public boolean e() {
        return true;
    }

    public void f(g0 g0Var) {
        ob.a.a(this != g0Var);
        this.f17995b = g0Var;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b g() {
        return null;
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f17994a.getUri();
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) {
        return this.f17994a.h(aVar);
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSource.UdpDataSourceException {
        try {
            return this.f17994a.read(bArr, i10, i11);
        } catch (UdpDataSource.UdpDataSourceException e10) {
            if (e10.f18731a == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
