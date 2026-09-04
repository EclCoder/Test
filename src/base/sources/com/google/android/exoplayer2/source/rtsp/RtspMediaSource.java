package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import javax.net.SocketFactory;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class RtspMediaSource extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0 f17881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.b.a f17882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f17883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Uri f17884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SocketFactory f17885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f17886m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17889p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17887n = C.TIME_UNSET;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17890q = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th2) {
            super(th2);
        }

        public RtspPlaybackException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class RtspUdpUnsupportedTransportException extends RtspPlaybackException {
        public RtspUdpUnsupportedTransportException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n.c {
        a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void a() {
            RtspMediaSource.this.f17888o = false;
            RtspMediaSource.this.I();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void b(z zVar) {
            RtspMediaSource.this.f17887n = r0.H0(zVar.a());
            RtspMediaSource.this.f17888o = !zVar.c();
            RtspMediaSource.this.f17889p = zVar.c();
            RtspMediaSource.this.f17890q = false;
            RtspMediaSource.this.I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends com.google.android.exoplayer2.source.k {
        b(h2 h2Var) {
            super(h2Var);
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f17003f = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f17029l = true;
            return dVar;
        }
    }

    static {
        o9.n.a("goog.exo.rtsp");
    }

    RtspMediaSource(y0 y0Var, com.google.android.exoplayer2.source.rtsp.b.a aVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f17881h = y0Var;
        this.f17882i = aVar;
        this.f17883j = str;
        this.f17884k = ((y0.h) ob.a.e(y0Var.f18982b)).f19079a;
        this.f17885l = socketFactory;
        this.f17886m = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        h2 tVar = new ra.t(this.f17887n, this.f17888o, false, this.f17889p, null, this.f17881h);
        if (this.f17890q) {
            tVar = new b(tVar);
        }
        B(tVar);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(nb.a0 a0Var) {
        I();
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f17881h;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(com.google.android.exoplayer2.source.o oVar) {
        ((n) oVar).M();
    }

    @Override // com.google.android.exoplayer2.source.p
    public com.google.android.exoplayer2.source.o o(com.google.android.exoplayer2.source.p.b bVar, nb.b bVar2, long j10) {
        return new n(bVar2, this.f17882i, this.f17884k, new a(), this.f17883j, this.f17885l, this.f17886m);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Factory implements com.google.android.exoplayer2.source.r {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f17891h = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17892c = 8000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17893d = "ExoPlayerLib/2.19.1";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SocketFactory f17894e = SocketFactory.getDefault();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f17896g;

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource a(y0 y0Var) {
            ob.a.e(y0Var.f18982b);
            return new RtspMediaSource(y0Var, this.f17895f ? new f0(this.f17892c) : new h0(this.f17892c), this.f17893d, this.f17894e, this.f17896g);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Factory c(t9.k kVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory b(com.google.android.exoplayer2.upstream.c cVar) {
            return this;
        }
    }
}
