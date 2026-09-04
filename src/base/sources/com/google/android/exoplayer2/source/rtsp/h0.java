package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h0 implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18001a;

    public h0(long j10) {
        this.f18001a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b a(int i10) throws IOException {
        g0 g0Var = new g0(this.f18001a);
        g0 g0Var2 = new g0(this.f18001a);
        try {
            g0Var.h(ya.b.a(0));
            int iC = g0Var.c();
            boolean z10 = iC % 2 == 0;
            g0Var2.h(ya.b.a(z10 ? iC + 1 : iC - 1));
            if (z10) {
                g0Var.f(g0Var2);
                return g0Var;
            }
            g0Var2.f(g0Var);
            return g0Var2;
        } catch (IOException e10) {
            nb.l.a(g0Var);
            nb.l.a(g0Var2);
            throw e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b.a b() {
        return new f0(this.f18001a);
    }
}
