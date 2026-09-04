package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import p9.n1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface k extends x1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        boolean A;
        Looper B;
        boolean C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f17132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ob.d f17133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f17134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        sc.x f17135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        sc.x f17136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        sc.x f17137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        sc.x f17138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        sc.x f17139h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        sc.g f17140i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f17141j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        com.google.android.exoplayer2.audio.a f17142k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f17143l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17144m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f17145n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f17146o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f17147p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17148q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17149r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f17150s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        o9.j0 f17151t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        long f17152u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f17153v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        x0 f17154w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f17155x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f17156y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f17157z;

        public b(final Context context) {
            this(context, new sc.x() { // from class: o9.g
                @Override // sc.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.a(context);
                }
            }, new sc.x() { // from class: o9.h
                @Override // sc.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.b(context);
                }
            });
        }

        public static /* synthetic */ o9.i0 a(Context context) {
            return new o9.d(context);
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.p.a b(Context context) {
            return new com.google.android.exoplayer2.source.j(context, new u9.h());
        }

        public static /* synthetic */ lb.a0 d(Context context) {
            return new lb.m(context);
        }

        public k e() {
            ob.a.g(!this.C);
            this.C = true;
            return new j0(this, null);
        }

        private b(final Context context, sc.x xVar, sc.x xVar2) {
            this(context, xVar, xVar2, new sc.x() { // from class: o9.i
                @Override // sc.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.d(context);
                }
            }, new sc.x() { // from class: o9.j
                @Override // sc.x
                public final Object get() {
                    return new c();
                }
            }, new sc.x() { // from class: o9.k
                @Override // sc.x
                public final Object get() {
                    return nb.o.m(context);
                }
            }, new sc.g() { // from class: o9.l
                @Override // sc.g
                public final Object apply(Object obj) {
                    return new n1((ob.d) obj);
                }
            });
        }

        private b(Context context, sc.x xVar, sc.x xVar2, sc.x xVar3, sc.x xVar4, sc.x xVar5, sc.g gVar) {
            this.f17132a = (Context) ob.a.e(context);
            this.f17135d = xVar;
            this.f17136e = xVar2;
            this.f17137f = xVar3;
            this.f17138g = xVar4;
            this.f17139h = xVar5;
            this.f17140i = gVar;
            this.f17141j = ob.r0.R();
            this.f17142k = com.google.android.exoplayer2.audio.a.f16539g;
            this.f17144m = 0;
            this.f17148q = 1;
            this.f17149r = 0;
            this.f17150s = true;
            this.f17151t = o9.j0.f48296g;
            this.f17152u = 5000L;
            this.f17153v = MBInterstitialActivity.WEB_LOAD_TIME;
            this.f17154w = new h.b().a();
            this.f17133b = ob.d.f48357a;
            this.f17155x = 500L;
            this.f17156y = 2000L;
            this.A = true;
        }
    }

    void n(com.google.android.exoplayer2.source.p pVar);

    void u(boolean z10);

    void v(o9.j0 j0Var);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void B(boolean z10);

        default void A(boolean z10) {
        }
    }
}
