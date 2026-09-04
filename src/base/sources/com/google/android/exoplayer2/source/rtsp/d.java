package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u9.m f17958d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b.a f17960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f17961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f17962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u9.e f17963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f17964j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile long f17966l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f17959e = r0.w();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f17965k = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(String str, b bVar);
    }

    public d(int i10, r rVar, a aVar, u9.m mVar, b.a aVar2) {
        this.f17955a = i10;
        this.f17956b = rVar;
        this.f17957c = aVar;
        this.f17958d = mVar;
        this.f17960f = aVar2;
    }

    public void b() {
        ((e) ob.a.e(this.f17962h)).f();
    }

    public void c(long j10, long j11) {
        this.f17965k = j10;
        this.f17966l = j11;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
        this.f17964j = true;
    }

    public void d(int i10) {
        if (((e) ob.a.e(this.f17962h)).e()) {
            return;
        }
        this.f17962h.g(i10);
    }

    public void e(long j10) {
        if (j10 == C.TIME_UNSET || ((e) ob.a.e(this.f17962h)).e()) {
            return;
        }
        this.f17962h.h(j10);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() {
        if (this.f17964j) {
            this.f17964j = false;
        }
        try {
            if (this.f17961g == null) {
                b bVarA = this.f17960f.a(this.f17955a);
                this.f17961g = bVarA;
                final String strA = bVarA.a();
                final b bVar = this.f17961g;
                this.f17959e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17928a.f17957c.a(strA, bVar);
                    }
                });
                this.f17963i = new u9.e((nb.h) ob.a.e(this.f17961g), 0L, -1L);
                e eVar = new e(this.f17956b.f18080a, this.f17955a);
                this.f17962h = eVar;
                eVar.b(this.f17958d);
            }
            while (!this.f17964j) {
                if (this.f17965k != C.TIME_UNSET) {
                    ((e) ob.a.e(this.f17962h)).seek(this.f17966l, this.f17965k);
                    this.f17965k = C.TIME_UNSET;
                }
                if (((e) ob.a.e(this.f17962h)).c((u9.l) ob.a.e(this.f17963i), new u9.y()) == -1) {
                    break;
                }
            }
            this.f17964j = false;
        } finally {
            if (((b) ob.a.e(this.f17961g)).e()) {
                nb.l.a(this.f17961g);
                this.f17961g = null;
            }
        }
    }
}
