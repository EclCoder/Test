package com.google.android.exoplayer2;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f19121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d f19123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2 f19124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f19126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f19127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19129i = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19130j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19134n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void d(y1 y1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void handleMessage(int i10, Object obj);
    }

    public y1(a aVar, b bVar, h2 h2Var, int i10, ob.d dVar, Looper looper) {
        this.f19122b = aVar;
        this.f19121a = bVar;
        this.f19124d = h2Var;
        this.f19127g = looper;
        this.f19123c = dVar;
        this.f19128h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        try {
            ob.a.g(this.f19131k);
            ob.a.g(this.f19127g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f19123c.elapsedRealtime() + j10;
            while (true) {
                z10 = this.f19133m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f19123c.a();
                wait(j10);
                j10 = jElapsedRealtime - this.f19123c.elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19132l;
    }

    public boolean b() {
        return this.f19130j;
    }

    public Looper c() {
        return this.f19127g;
    }

    public int d() {
        return this.f19128h;
    }

    public Object e() {
        return this.f19126f;
    }

    public long f() {
        return this.f19129i;
    }

    public b g() {
        return this.f19121a;
    }

    public h2 h() {
        return this.f19124d;
    }

    public int i() {
        return this.f19125e;
    }

    public synchronized boolean j() {
        return this.f19134n;
    }

    public synchronized void k(boolean z10) {
        this.f19132l = z10 | this.f19132l;
        this.f19133m = true;
        notifyAll();
    }

    public y1 l() {
        ob.a.g(!this.f19131k);
        if (this.f19129i == C.TIME_UNSET) {
            ob.a.a(this.f19130j);
        }
        this.f19131k = true;
        this.f19122b.d(this);
        return this;
    }

    public y1 m(Object obj) {
        ob.a.g(!this.f19131k);
        this.f19126f = obj;
        return this;
    }

    public y1 n(int i10) {
        ob.a.g(!this.f19131k);
        this.f19125e = i10;
        return this;
    }
}
