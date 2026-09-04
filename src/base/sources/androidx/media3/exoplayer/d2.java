package androidx.media3.exoplayer;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f5147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.d f5149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t1.a0 f5150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f5152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f5153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5155i = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5156j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5160n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void c(d2 d2Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void handleMessage(int i10, Object obj);
    }

    public d2(a aVar, b bVar, t1.a0 a0Var, int i10, w1.d dVar, Looper looper) {
        this.f5148b = aVar;
        this.f5147a = bVar;
        this.f5150d = a0Var;
        this.f5153g = looper;
        this.f5149c = dVar;
        this.f5154h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        try {
            w1.a.g(this.f5157k);
            w1.a.g(this.f5153g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f5149c.elapsedRealtime() + j10;
            while (true) {
                z10 = this.f5159m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f5149c.a();
                wait(j10);
                j10 = jElapsedRealtime - this.f5149c.elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f5158l;
    }

    public boolean b() {
        return this.f5156j;
    }

    public Looper c() {
        return this.f5153g;
    }

    public int d() {
        return this.f5154h;
    }

    public Object e() {
        return this.f5152f;
    }

    public long f() {
        return this.f5155i;
    }

    public b g() {
        return this.f5147a;
    }

    public t1.a0 h() {
        return this.f5150d;
    }

    public int i() {
        return this.f5151e;
    }

    public synchronized boolean j() {
        return this.f5160n;
    }

    public synchronized void k(boolean z10) {
        this.f5158l = z10 | this.f5158l;
        this.f5159m = true;
        notifyAll();
    }

    public d2 l() {
        w1.a.g(!this.f5157k);
        if (this.f5155i == C.TIME_UNSET) {
            w1.a.a(this.f5156j);
        }
        this.f5157k = true;
        this.f5148b.c(this);
        return this;
    }

    public d2 m(Object obj) {
        w1.a.g(!this.f5157k);
        this.f5152f = obj;
        return this;
    }

    public d2 n(int i10) {
        w1.a.g(!this.f5157k);
        this.f5151e = i10;
        return this;
    }
}
