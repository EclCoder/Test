package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e implements u9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final za.k f17970a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17973d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u9.m f17976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17977h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17980k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f17971b = new ob.d0(65507);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f17972c = new ob.d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f17974e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f17975f = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile long f17978i = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f17979j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17981l = C.TIME_UNSET;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17982m = C.TIME_UNSET;

    public e(h hVar, int i10) {
        this.f17973d = i10;
        this.f17970a = (za.k) ob.a.e(new za.a().a(hVar));
    }

    private static long a(long j10) {
        return j10 - 30;
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f17970a.a(mVar, this.f17973d);
        mVar.endTracks();
        mVar.c(new u9.z.b(C.TIME_UNSET));
        this.f17976g = mVar;
    }

    @Override // u9.k
    public int c(u9.l lVar, u9.y yVar) {
        ob.a.e(this.f17976g);
        int i10 = lVar.read(this.f17971b.e(), 0, 65507);
        if (i10 == -1) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        this.f17971b.U(0);
        this.f17971b.T(i10);
        ya.a aVarD = ya.a.d(this.f17971b);
        if (aVarD == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jA = a(jElapsedRealtime);
        this.f17975f.d(aVarD, jElapsedRealtime);
        ya.a aVarE = this.f17975f.e(jA);
        if (aVarE == null) {
            return 0;
        }
        if (!this.f17977h) {
            if (this.f17978i == C.TIME_UNSET) {
                this.f17978i = aVarE.f57459h;
            }
            if (this.f17979j == -1) {
                this.f17979j = aVarE.f57458g;
            }
            this.f17970a.c(this.f17978i, this.f17979j);
            this.f17977h = true;
        }
        synchronized (this.f17974e) {
            try {
                if (!this.f17980k) {
                    do {
                        this.f17972c.R(aVarE.f57462k);
                        this.f17970a.b(this.f17972c, aVarE.f57459h, aVarE.f57458g, aVarE.f57456e);
                        aVarE = this.f17975f.e(jA);
                    } while (aVarE != null);
                } else if (this.f17981l != C.TIME_UNSET && this.f17982m != C.TIME_UNSET) {
                    this.f17975f.f();
                    this.f17970a.seek(this.f17981l, this.f17982m);
                    this.f17980k = false;
                    this.f17981l = C.TIME_UNSET;
                    this.f17982m = C.TIME_UNSET;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public boolean e() {
        return this.f17977h;
    }

    public void f() {
        synchronized (this.f17974e) {
            this.f17980k = true;
        }
    }

    public void g(int i10) {
        this.f17979j = i10;
    }

    public void h(long j10) {
        this.f17978i = j10;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        synchronized (this.f17974e) {
            try {
                if (!this.f17980k) {
                    this.f17980k = true;
                }
                this.f17981l = j10;
                this.f17982m = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u9.k
    public void release() {
    }
}
