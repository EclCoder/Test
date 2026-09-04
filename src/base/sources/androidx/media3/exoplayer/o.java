package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface o extends t1.x {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        long A;
        boolean B;
        boolean C;
        Looper D;
        boolean E;
        boolean F;
        String G;
        boolean H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f5665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w1.d f5666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f5667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        sc.x f5668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        sc.x f5669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        sc.x f5670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        sc.x f5671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        sc.x f5672h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        sc.g f5673i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f5674j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5675k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        t1.b f5676l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f5677m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f5679o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f5680p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f5681q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5682r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5683s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f5684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        j2 f5685u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f5686v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f5687w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f5688x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        g1 f5689y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f5690z;

        public b(final Context context) {
            this(context, new sc.x() { // from class: androidx.media3.exoplayer.p
                @Override // sc.x
                public final Object get() {
                    return o.b.a(context);
                }
            }, new sc.x() { // from class: androidx.media3.exoplayer.q
                @Override // sc.x
                public final Object get() {
                    return o.b.b(context);
                }
            });
        }

        public static /* synthetic */ i2 a(Context context) {
            return new n(context);
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.r.a b(Context context) {
            return new androidx.media3.exoplayer.source.i(context, new o2.l());
        }

        public static /* synthetic */ k2.v d(Context context) {
            return new k2.n(context);
        }

        public o e() {
            w1.a.g(!this.E);
            this.E = true;
            return new q0(this, null);
        }

        private b(final Context context, sc.x xVar, sc.x xVar2) {
            this(context, xVar, xVar2, new sc.x() { // from class: androidx.media3.exoplayer.r
                @Override // sc.x
                public final Object get() {
                    return o.b.d(context);
                }
            }, new sc.x() { // from class: androidx.media3.exoplayer.s
                @Override // sc.x
                public final Object get() {
                    return new l();
                }
            }, new sc.x() { // from class: androidx.media3.exoplayer.t
                @Override // sc.x
                public final Object get() {
                    return l2.g.l(context);
                }
            }, new sc.g() { // from class: androidx.media3.exoplayer.u
                @Override // sc.g
                public final Object apply(Object obj) {
                    return new c2.l1((w1.d) obj);
                }
            });
        }

        private b(Context context, sc.x xVar, sc.x xVar2, sc.x xVar3, sc.x xVar4, sc.x xVar5, sc.g gVar) {
            this.f5665a = (Context) w1.a.e(context);
            this.f5668d = xVar;
            this.f5669e = xVar2;
            this.f5670f = xVar3;
            this.f5671g = xVar4;
            this.f5672h = xVar5;
            this.f5673i = gVar;
            this.f5674j = w1.c0.R();
            this.f5676l = t1.b.f52552g;
            this.f5678n = 0;
            this.f5682r = 1;
            this.f5683s = 0;
            this.f5684t = true;
            this.f5685u = j2.f5411g;
            this.f5686v = 5000L;
            this.f5687w = MBInterstitialActivity.WEB_LOAD_TIME;
            this.f5688x = 3000L;
            this.f5689y = new k.b().a();
            this.f5666b = w1.d.f55786a;
            this.f5690z = 500L;
            this.A = 2000L;
            this.C = true;
            this.G = "";
            this.f5675k = -1000;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f5691b = new c(C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5692a;

        public c(long j10) {
            this.f5692a = j10;
        }
    }

    void p(androidx.media3.exoplayer.source.r rVar);

    void release();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void x(boolean z10);

        default void w(boolean z10) {
        }
    }
}
