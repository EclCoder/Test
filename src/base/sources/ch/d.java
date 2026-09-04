package ch;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ToolboxActivity;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import dg.u;
import em.k;
import em.k0;
import em.o0;
import em.z1;
import fl.g0;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nh.l0;
import tl.o;
import yf.a0;
import yf.w;
import yf.y;
import zg.p;
import zg.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends zg.b implements t.a, zg.f.b {
    public static final a H = new a(null);
    private ImageView A;
    private ImageView B;
    private boolean C;
    private ch.a D;
    private z1 E;
    private final g F;
    private final View.OnClickListener G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f9992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yf.g f9993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f9994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yf.e f9995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y f9996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dk.a f9997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final dk.a f9998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final dk.a f9999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final dk.a f10000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yf.a f10001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f10002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f10003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u f10004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final dg.a f10005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final k0 f10006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LayoutInflater f10007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f10009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Context f10010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t f10011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private zg.d f10012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f10013z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10014a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10015b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f10016c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                s.h(msg, "msg");
                if (msg.what == b.this.a() && b.this.c()) {
                    sendEmptyMessageDelayed(b.this.a(), 1000L);
                }
            }
        }

        public b() {
            Looper looperMyLooper = Looper.myLooper();
            s.e(looperMyLooper);
            this.f10016c = new a(looperMyLooper);
            f();
        }

        private final int b() {
            t tVar = d.this.f10011x;
            zg.d dVar = null;
            if (tVar == null) {
                s.w("rootView");
                tVar = null;
            }
            if (tVar.i()) {
                return 0;
            }
            zg.d dVar2 = d.this.f10012y;
            if (dVar2 == null) {
                s.w("centerBubble");
                dVar2 = null;
            }
            if (!dVar2.m()) {
                return 4;
            }
            zg.d dVar3 = d.this.f10012y;
            if (dVar3 == null) {
                s.w("centerBubble");
                dVar3 = null;
            }
            if (dVar3.d0()) {
                return 3;
            }
            zg.d dVar4 = d.this.f10012y;
            if (dVar4 == null) {
                s.w("centerBubble");
            } else {
                dVar = dVar4;
            }
            return dVar.e0() ? 2 : 1;
        }

        private final boolean d(long j10) {
            return System.currentTimeMillis() - this.f10015b > j10;
        }

        public final int a() {
            return this.f10014a;
        }

        public final boolean c() {
            zg.d dVar = d.this.f10012y;
            zg.d dVar2 = null;
            if (dVar == null) {
                s.w("centerBubble");
                dVar = null;
            }
            if (!dVar.m()) {
                return false;
            }
            int iB = b();
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB == 3) {
                            e();
                            return false;
                        }
                    } else if (d(2000L)) {
                        zg.d dVar3 = d.this.f10012y;
                        if (dVar3 == null) {
                            s.w("centerBubble");
                            dVar3 = null;
                        }
                        dVar3.g0(2);
                    }
                } else if (d(2000L)) {
                    zg.d dVar4 = d.this.f10012y;
                    if (dVar4 == null) {
                        s.w("centerBubble");
                        dVar4 = null;
                    }
                    if (!dVar4.M()) {
                        zg.d dVar5 = d.this.f10012y;
                        if (dVar5 == null) {
                            s.w("centerBubble");
                            dVar5 = null;
                        }
                        dVar5.Z();
                    }
                    this.f10015b = System.currentTimeMillis();
                }
            } else if (d(5000L)) {
                t tVar = d.this.f10011x;
                if (tVar == null) {
                    s.w("rootView");
                    tVar = null;
                }
                tVar.e();
                this.f10015b = System.currentTimeMillis();
            }
            if (d.this.f10005r.m() == 1) {
                zg.d dVar6 = d.this.f10012y;
                if (dVar6 == null) {
                    s.w("centerBubble");
                } else {
                    dVar2 = dVar6;
                }
                dVar2.h0(d.this.f10005r.l());
            }
            return true;
        }

        public final void e() {
            this.f10016c.removeMessages(this.f10014a);
        }

        public final void f() {
            if (d.this.f10005r.m() == 1) {
                zg.d dVar = d.this.f10012y;
                if (dVar == null) {
                    s.w("centerBubble");
                    dVar = null;
                }
                dVar.h0(d.this.f10005r.l());
            }
            this.f10015b = System.currentTimeMillis();
            this.f10016c.removeMessages(this.f10014a);
            this.f10016c.sendEmptyMessageDelayed(this.f10014a, 1000L);
            this.f10015b = System.currentTimeMillis();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10019r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return d.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f10019r;
            if (i10 == 0) {
                fl.s.b(obj);
                w wVar = d.this.f10002o;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(d.this.C);
                this.f10019r = 1;
                if (wVar.b(boolA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: renamed from: ch.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class C0138d extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10021r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f10022s;

        C0138d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((C0138d) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            C0138d c0138d = d.this.new C0138d(fVar);
            c0138d.f10022s = obj;
            return c0138d;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003a A[PHI: r1
          0x003a: PHI (r1v5 em.o0) = (r1v1 em.o0), (r1v4 em.o0), (r1v11 em.o0) binds: [B:12:0x0032, B:32:0x00aa, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:15:0x0040  */
        /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0072  */
        /* JADX WARN: Code duplicated, block: B:28:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00aa -> B:13:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r8.f10021r
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f10022s
                em.o0 r1 = (em.o0) r1
                fl.s.b(r9)
                goto L3a
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f10022s
                em.o0 r1 = (em.o0) r1
                fl.s.b(r9)
                goto L69
            L2a:
                java.lang.Object r1 = r8.f10022s
                em.o0 r1 = (em.o0) r1
                fl.s.b(r9)
                goto L8b
            L32:
                fl.s.b(r9)
                java.lang.Object r9 = r8.f10022s
                em.o0 r9 = (em.o0) r9
                r1 = r9
            L3a:
                boolean r9 = em.p0.f(r1)
                if (r9 == 0) goto Lad
                ch.d r9 = ch.d.this
                dg.a r9 = ch.d.q(r9)
                int r9 = r9.n()
                if (r9 == 0) goto L72
                if (r9 == r5) goto L50
                r9 = r4
                goto L93
            L50:
                ch.d r9 = ch.d.this
                dk.a r9 = ch.d.x(r9)
                java.lang.Object r9 = r9.get()
                bg.c r9 = (bg.c) r9
                fl.g0 r6 = fl.g0.f38750a
                r8.f10022s = r1
                r8.f10021r = r3
                java.lang.Object r9 = r9.b(r6, r8)
                if (r9 != r0) goto L69
                goto Lac
            L69:
                wg.c r9 = (wg.c) r9
                java.lang.Object r9 = wg.d.b(r9, r4)
                java.lang.String r9 = (java.lang.String) r9
                goto L93
            L72:
                ch.d r9 = ch.d.this
                dk.a r9 = ch.d.u(r9)
                java.lang.Object r9 = r9.get()
                ag.e r9 = (ag.e) r9
                fl.g0 r6 = fl.g0.f38750a
                r8.f10022s = r1
                r8.f10021r = r5
                java.lang.Object r9 = r9.b(r6, r8)
                if (r9 != r0) goto L8b
                goto Lac
            L8b:
                wg.c r9 = (wg.c) r9
                java.lang.Object r9 = wg.d.b(r9, r4)
                java.lang.String r9 = (java.lang.String) r9
            L93:
                if (r9 == 0) goto La0
                ch.d r6 = ch.d.this
                ch.a r6 = ch.d.s(r6)
                if (r6 == 0) goto La0
                r6.s(r9)
            La0:
                r8.f10022s = r1
                r8.f10021r = r2
                r6 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r9 = em.y0.a(r6, r8)
                if (r9 != r0) goto L3a
            Lac:
                return r0
            Lad:
                fl.g0 r9 = fl.g0.f38750a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.d.C0138d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class e extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10024r;

        e(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return d.this.new e(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f10024r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            zg.d dVar = d.this.f10012y;
            if (dVar == null) {
                s.w("centerBubble");
                dVar = null;
            }
            dVar.e();
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10026r;

        f(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return d.this.new f(fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        
            if (r7.b(r1, r6) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r6.f10026r
                r2 = 0
                java.lang.String r3 = "centerBubble"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L21
                if (r1 == r5) goto L1d
                if (r1 != r4) goto L15
                fl.s.b(r7)
                goto L6b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                fl.s.b(r7)
                goto L47
            L21:
                fl.s.b(r7)
                ch.d r7 = ch.d.this
                yf.a0 r7 = ch.d.E(r7)
                ch.d r1 = ch.d.this
                zg.d r1 = ch.d.r(r1)
                if (r1 != 0) goto L36
                kotlin.jvm.internal.s.w(r3)
                r1 = r2
            L36:
                boolean r1 = r1.N()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r6.f10026r = r5
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L47
                goto L6a
            L47:
                ch.d r7 = ch.d.this
                yf.y r7 = ch.d.D(r7)
                ch.d r1 = ch.d.this
                zg.d r1 = ch.d.r(r1)
                if (r1 != 0) goto L59
                kotlin.jvm.internal.s.w(r3)
                goto L5a
            L59:
                r2 = r1
            L5a:
                int r1 = r2.v()
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.d(r1)
                r6.f10026r = r4
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L6b
            L6a:
                return r0
            L6b:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g implements u.b {
        g() {
        }

        @Override // dg.u.b
        public void a() {
            p.t(d.this.f10003p, 4, false, 2, null);
        }

        @Override // dg.u.b
        public void b() {
            d.this.f10003p.u(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class h extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10029r;

        h(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return d.this.new h(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            tg.b bVarF;
            String strB;
            ll.b.f();
            if (this.f10029r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            int iN = d.this.f10005r.n();
            zg.d dVar = null;
            if (iN != 0) {
                bVarF = iN != 1 ? null : ((rf.d) d.this.f9998k.get()).d();
            } else {
                bVarF = ((rf.b) d.this.f9997j.get()).f();
            }
            if (bVarF != null && (strB = bVarF.b()) != null) {
                zg.d dVar2 = d.this.f10012y;
                if (dVar2 == null) {
                    s.w("centerBubble");
                } else {
                    dVar = dVar2;
                }
                dVar.f0(strB);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class i extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f10031r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f10032s;

        i(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return d.this.new i(fVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            zg.d dVar;
            zg.d dVar2;
            d dVar3;
            Object objB;
            d dVar4;
            Object objF = ll.b.f();
            int i10 = this.f10032s;
            zg.d dVar5 = null;
            if (i10 == 0) {
                fl.s.b(obj);
                zg.d dVar6 = d.this.f10012y;
                if (dVar6 == null) {
                    s.w("centerBubble");
                    dVar = null;
                } else {
                    dVar = dVar6;
                }
                yf.g gVar = d.this.f9993f;
                g0 g0Var = g0.f38750a;
                this.f10031r = dVar;
                this.f10032s = 1;
                obj = gVar.b(g0Var, this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                dVar = (zg.d) this.f10031r;
                fl.s.b(obj);
            } else {
                if (i10 == 2) {
                    dVar2 = (zg.d) this.f10031r;
                    fl.s.b(obj);
                    dVar2.R(((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(50))).intValue());
                    dVar3 = d.this;
                    yf.a aVar = dVar3.f10001n;
                    g0 g0Var2 = g0.f38750a;
                    this.f10031r = dVar3;
                    this.f10032s = 3;
                    objB = aVar.b(g0Var2, this);
                    if (objB != objF) {
                        dVar4 = dVar3;
                        obj = objB;
                    }
                    return objF;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar4 = (d) this.f10031r;
                fl.s.b(obj);
            }
            dVar4.C = ((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(true))).booleanValue();
            return g0.f38750a;
            dVar.S(((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue());
            zg.d dVar7 = d.this.f10012y;
            if (dVar7 == null) {
                s.w("centerBubble");
            } else {
                dVar5 = dVar7;
            }
            yf.e eVar = d.this.f9995h;
            g0 g0Var3 = g0.f38750a;
            this.f10031r = dVar5;
            this.f10032s = 2;
            obj = eVar.b(g0Var3, this);
            if (obj != objF) {
                dVar2 = dVar5;
                dVar2.R(((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(50))).intValue());
                dVar3 = d.this;
                yf.a aVar2 = dVar3.f10001n;
                g0 g0Var4 = g0.f38750a;
                this.f10031r = dVar3;
                this.f10032s = 3;
                objB = aVar2.b(g0Var4, this);
                if (objB != objF) {
                    dVar4 = dVar3;
                    obj = objB;
                    dVar4.C = ((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(true))).booleanValue();
                    return g0.f38750a;
                }
            }
            return objF;
        }
    }

    public d(o0 externalScope, yf.g getLiveControllerSideUseCase, a0 setLiveControllerSideUseCase, yf.e eVar, y setLiveControllerHeightUseCase, dk.a liveFbRepository, dk.a liveYtRepository, dk.a getFbCommentsUseCase, dk.a getYtCommentsUseCase, yf.a getEnableLiveCommentUseCase, w setEnableLiveCommentUseCase, p globalBubbleManager, u screenshotController, dg.a azLive, k0 mainDispatcher, LayoutInflater inflater) {
        s.h(externalScope, "externalScope");
        s.h(getLiveControllerSideUseCase, "getLiveControllerSideUseCase");
        s.h(setLiveControllerSideUseCase, "setLiveControllerSideUseCase");
        s.h(eVar, QGbBllacZSmHKn.EGD);
        s.h(setLiveControllerHeightUseCase, "setLiveControllerHeightUseCase");
        s.h(liveFbRepository, "liveFbRepository");
        s.h(liveYtRepository, "liveYtRepository");
        s.h(getFbCommentsUseCase, "getFbCommentsUseCase");
        s.h(getYtCommentsUseCase, "getYtCommentsUseCase");
        s.h(getEnableLiveCommentUseCase, "getEnableLiveCommentUseCase");
        s.h(setEnableLiveCommentUseCase, "setEnableLiveCommentUseCase");
        s.h(globalBubbleManager, "globalBubbleManager");
        s.h(screenshotController, "screenshotController");
        s.h(azLive, "azLive");
        s.h(mainDispatcher, "mainDispatcher");
        s.h(inflater, "inflater");
        this.f9992e = externalScope;
        this.f9993f = getLiveControllerSideUseCase;
        this.f9994g = setLiveControllerSideUseCase;
        this.f9995h = eVar;
        this.f9996i = setLiveControllerHeightUseCase;
        this.f9997j = liveFbRepository;
        this.f9998k = liveYtRepository;
        this.f9999l = getFbCommentsUseCase;
        this.f10000m = getYtCommentsUseCase;
        this.f10001n = getEnableLiveCommentUseCase;
        this.f10002o = setEnableLiveCommentUseCase;
        this.f10003p = globalBubbleManager;
        this.f10004q = screenshotController;
        this.f10005r = azLive;
        this.f10006s = mainDispatcher;
        this.f10007t = inflater;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        s.g(applicationContext, "getApplicationContext(...)");
        this.f10010w = applicationContext;
        this.C = true;
        this.F = new g();
        this.G = new View.OnClickListener() { // from class: ch.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.N(this.f9990a, view);
            }
        };
    }

    private final void H() {
        ImageView imageView = null;
        View viewInflate = this.f10007t.inflate(R.layout.action_live_stop, (ViewGroup) null);
        s.f(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewInflate;
        this.f10013z = imageView2;
        if (imageView2 == null) {
            s.w("stopIv");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this.G);
        t tVar = this.f10011x;
        if (tVar == null) {
            s.w("rootView");
            tVar = null;
        }
        ImageView imageView3 = this.f10013z;
        if (imageView3 == null) {
            s.w("stopIv");
            imageView3 = null;
        }
        tVar.c(imageView3);
        View viewInflate2 = this.f10007t.inflate(R.layout.action_live_comment_visibility, (ViewGroup) null);
        s.f(viewInflate2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView4 = (ImageView) viewInflate2;
        this.B = imageView4;
        if (imageView4 == null) {
            s.w("hideChatIv");
            imageView4 = null;
        }
        imageView4.setOnClickListener(this.G);
        S();
        t tVar2 = this.f10011x;
        if (tVar2 == null) {
            s.w("rootView");
            tVar2 = null;
        }
        ImageView imageView5 = this.B;
        if (imageView5 == null) {
            s.w("hideChatIv");
            imageView5 = null;
        }
        tVar2.c(imageView5);
        View viewInflate3 = this.f10007t.inflate(R.layout.action_toolbox, (ViewGroup) null);
        s.f(viewInflate3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView6 = (ImageView) viewInflate3;
        this.A = imageView6;
        if (imageView6 == null) {
            s.w("toolboxIv");
            imageView6 = null;
        }
        imageView6.setOnClickListener(this.G);
        t tVar3 = this.f10011x;
        if (tVar3 == null) {
            s.w("rootView");
            tVar3 = null;
        }
        ImageView imageView7 = this.A;
        if (imageView7 == null) {
            s.w("toolboxIv");
        } else {
            imageView = imageView7;
        }
        tVar3.c(imageView);
    }

    private final void I() {
        this.C = !this.C;
        S();
        if (this.C) {
            K();
        } else {
            P();
        }
        k.d(this.f9992e, this.f10006s, null, new c(null), 2, null);
    }

    private final z1 J() {
        return k.d(this.f9992e, this.f10006s, null, new C0138d(null), 2, null);
    }

    private final void K() {
        final ch.a aVar = new ch.a(this.f10010w);
        aVar.e();
        aVar.t(new View.OnClickListener() { // from class: ch.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.L(aVar, view);
            }
        });
        this.D = aVar;
        this.E = J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(ch.a aVar, View view) {
        if (aVar.r()) {
            aVar.q();
        } else {
            aVar.p();
        }
    }

    private final void M() {
        int i10 = k().top;
        t tVar = this.f10011x;
        if (tVar == null) {
            s.w("rootView");
            tVar = null;
        }
        int boundRadius = i10 + tVar.getBoundRadius();
        int i11 = k().bottom;
        t tVar2 = this.f10011x;
        if (tVar2 == null) {
            s.w("rootView");
            tVar2 = null;
        }
        int boundRadius2 = (i11 - tVar2.getBoundRadius()) - this.f10010w.getResources().getDimensionPixelSize(R.dimen.size_button_bubble);
        zg.d dVar = this.f10012y;
        if (dVar == null) {
            s.w("centerBubble");
            dVar = null;
        }
        if (dVar.f58878b.y >= boundRadius) {
            zg.d dVar2 = this.f10012y;
            if (dVar2 == null) {
                s.w("centerBubble");
                dVar2 = null;
            }
            if (dVar2.f58878b.y <= boundRadius2) {
                return;
            }
        }
        zg.d dVar3 = this.f10012y;
        if (dVar3 == null) {
            s.w("centerBubble");
            dVar3 = null;
        }
        if (dVar3.f58878b.y < boundRadius) {
            zg.d dVar4 = this.f10012y;
            if (dVar4 == null) {
                s.w("centerBubble");
                dVar4 = null;
            }
            dVar4.f58878b.y = boundRadius;
        } else {
            zg.d dVar5 = this.f10012y;
            if (dVar5 == null) {
                s.w("centerBubble");
                dVar5 = null;
            }
            dVar5.f58878b.y = boundRadius2;
        }
        k.d(this.f9992e, this.f10006s, null, new e(null), 2, null);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(d dVar, View view) {
        t tVar = dVar.f10011x;
        if (tVar == null) {
            s.w("rootView");
            tVar = null;
        }
        tVar.h();
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.home_stop_btn) {
            dVar.f10005r.q();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.toolbox_btn) {
            l0.q(dVar.f10010w, ToolboxActivity.class);
        } else if (numValueOf != null && numValueOf.intValue() == R.id.hide_chat_iv) {
            dVar.I();
        }
    }

    private final void P() {
        ch.a aVar = this.D;
        if (aVar != null) {
            aVar.n();
        }
        this.D = null;
        z1 z1Var = this.E;
        if (z1Var != null) {
            z1.c0(z1Var, null, 1, null);
        }
        this.E = null;
    }

    private final void Q() {
        k.d(this.f9992e, null, null, new f(null), 3, null);
    }

    private final void R() {
        k.d(this.f9992e, this.f10006s, null, new h(null), 2, null);
    }

    private final void S() {
        ImageView imageView = null;
        if (this.C) {
            ImageView imageView2 = this.B;
            if (imageView2 == null) {
                s.w("hideChatIv");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R.drawable.ic_live_comment_enable);
            return;
        }
        ImageView imageView3 = this.B;
        if (imageView3 == null) {
            s.w("hideChatIv");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(R.drawable.ic_live_comment_disable);
    }

    public final void O() {
        n();
        this.f10004q.K(this.F);
    }

    @Override // zg.t.a
    public void a() {
        zg.d dVar = this.f10012y;
        zg.d dVar2 = null;
        if (dVar == null) {
            s.w("centerBubble");
            dVar = null;
        }
        dVar.b0();
        zg.d dVar3 = this.f10012y;
        if (dVar3 == null) {
            s.w("centerBubble");
        } else {
            dVar2 = dVar3;
        }
        dVar2.g0(1);
        b bVar = this.f10009v;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // zg.f.b
    public void c() {
        O();
    }

    @Override // zg.t.a
    public void d() {
        R();
        zg.d dVar = this.f10012y;
        if (dVar == null) {
            s.w("centerBubble");
            dVar = null;
        }
        dVar.g0(0);
        b bVar = this.f10009v;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // zg.f.b
    public void e() {
        zg.d dVar = this.f10012y;
        t tVar = null;
        if (dVar == null) {
            s.w("centerBubble");
            dVar = null;
        }
        dVar.b0();
        zg.d dVar2 = this.f10012y;
        if (dVar2 == null) {
            s.w("centerBubble");
            dVar2 = null;
        }
        dVar2.g0(0);
        b bVar = this.f10009v;
        if (bVar != null) {
            bVar.f();
        }
        t tVar2 = this.f10011x;
        if (tVar2 == null) {
            s.w("rootView");
            tVar2 = null;
        }
        if (tVar2.i()) {
            t tVar3 = this.f10011x;
            if (tVar3 == null) {
                s.w("rootView");
            } else {
                tVar = tVar3;
            }
            tVar.h();
        }
    }

    @Override // zg.f.b
    public void f() {
        Q();
        b bVar = this.f10009v;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // zg.f.b
    public void h() {
        t tVar = this.f10011x;
        zg.d dVar = null;
        t tVar2 = null;
        if (tVar == null) {
            s.w("rootView");
            tVar = null;
        }
        if (tVar.i()) {
            t tVar3 = this.f10011x;
            if (tVar3 == null) {
                s.w("rootView");
            } else {
                tVar2 = tVar3;
            }
            tVar2.e();
            return;
        }
        M();
        t tVar4 = this.f10011x;
        if (tVar4 == null) {
            s.w("rootView");
            tVar4 = null;
        }
        zg.d dVar2 = this.f10012y;
        if (dVar2 == null) {
            s.w("centerBubble");
            dVar2 = null;
        }
        int iG = dVar2.g();
        zg.d dVar3 = this.f10012y;
        if (dVar3 == null) {
            s.w("centerBubble");
            dVar3 = null;
        }
        int iH = dVar3.h();
        zg.d dVar4 = this.f10012y;
        if (dVar4 == null) {
            s.w("centerBubble");
        } else {
            dVar = dVar4;
        }
        tVar4.g(iG, iH, dVar.N());
    }

    @Override // zg.b
    public void j(Rect rect) {
        s.h(rect, "rect");
        zg.d dVar = this.f10012y;
        zg.d dVar2 = null;
        if (dVar == null) {
            s.w("centerBubble");
            dVar = null;
        }
        dVar.Y(rect, null);
        if (this.C) {
            K();
        }
        t tVar = this.f10011x;
        if (tVar == null) {
            s.w("rootView");
            tVar = null;
        }
        tVar.n();
        t tVar2 = this.f10011x;
        if (tVar2 == null) {
            s.w("rootView");
            tVar2 = null;
        }
        tVar2.d();
        zg.d dVar3 = this.f10012y;
        if (dVar3 == null) {
            s.w("centerBubble");
        } else {
            dVar2 = dVar3;
        }
        dVar2.e();
    }

    @Override // zg.b
    public void l() {
        this.f10008u = true;
        zg.d dVar = null;
        if (this.f10012y == null) {
            zg.d dVar2 = new zg.d(this.f10010w);
            this.f10012y = dVar2;
            dVar2.Q(this);
            zg.d dVar3 = this.f10012y;
            if (dVar3 == null) {
                s.w("centerBubble");
                dVar3 = null;
            }
            dVar3.W(false);
            k.d(this.f9992e, null, null, new i(null), 3, null);
        }
        if (this.f10011x == null) {
            this.f10011x = new t(this.f10010w, this);
            H();
        }
        zg.d dVar4 = this.f10012y;
        if (dVar4 == null) {
            s.w("centerBubble");
        } else {
            dVar = dVar4;
        }
        dVar.g0(0);
        R();
        this.f10009v = new b();
        this.f10004q.y(this.F);
        super.l();
    }

    @Override // zg.b
    public void n() {
        super.n();
        if (this.f10008u) {
            this.f10008u = false;
            zg.d dVar = this.f10012y;
            t tVar = null;
            if (dVar == null) {
                s.w("centerBubble");
                dVar = null;
            }
            dVar.n();
            t tVar2 = this.f10011x;
            if (tVar2 == null) {
                s.w("rootView");
            } else {
                tVar = tVar2;
            }
            tVar.l();
            if (this.C) {
                P();
            }
            b bVar = this.f10009v;
            if (bVar != null) {
                bVar.e();
            }
        }
    }
}
