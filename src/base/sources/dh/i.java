package dh;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ToolboxActivity;
import com.hecorat.screenrecorder.free.ui.live.LiveHomeActivity;
import dg.l;
import dg.u;
import em.k0;
import em.o0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.l0;
import tl.o;
import yf.c0;
import yf.e0;
import yf.k;
import zg.p;
import zg.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends zg.b implements t.a, zg.f.b {
    public static final b D = new b(null);
    private final g A;
    private final e B;
    private final View.OnClickListener C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f36886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f36887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f36888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yf.i f36889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f36890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final yf.c f36891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p f36892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f36893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l f36894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k0 f36895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LayoutInflater f36896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final FirebaseAnalytics f36897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f36898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f36900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t f36901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private zg.d f36902u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f36903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f36904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView f36905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ImageView f36906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f36907z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f36908r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f36909s;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return i.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            zg.d dVar;
            zg.d dVar2;
            Object objF = ll.b.f();
            int i10 = this.f36909s;
            if (i10 != 0) {
                if (i10 == 1) {
                    dVar = (zg.d) this.f36908r;
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = (zg.d) this.f36908r;
                    s.b(obj);
                }
                dVar2.R(((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(50))).intValue());
                return g0.f38750a;
            }
            s.b(obj);
            dVar = i.this.f36902u;
            k kVar = i.this.f36887f;
            g0 g0Var = g0.f38750a;
            this.f36908r = dVar;
            this.f36909s = 1;
            obj = kVar.b(g0Var, this);
            if (obj != objF) {
            }
            return objF;
            dVar.S(((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue());
            zg.d dVar3 = i.this.f36902u;
            yf.i iVar = i.this.f36889h;
            g0 g0Var2 = g0.f38750a;
            this.f36908r = dVar3;
            this.f36909s = 2;
            Object objB = iVar.b(g0Var2, this);
            if (objB != objF) {
                dVar2 = dVar3;
                obj = objB;
                dVar2.R(((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(50))).intValue());
                return g0.f38750a;
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36911a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36912b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f36913c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                kotlin.jvm.internal.s.h(msg, "msg");
                if (msg.what == c.this.a() && c.this.c()) {
                    sendEmptyMessageDelayed(c.this.a(), 1000L);
                }
            }
        }

        public c() {
            Looper looperMyLooper = Looper.myLooper();
            kotlin.jvm.internal.s.e(looperMyLooper);
            this.f36913c = new a(looperMyLooper);
            f();
        }

        private final int b() {
            t tVar = i.this.f36901t;
            if (tVar == null) {
                kotlin.jvm.internal.s.w("rootView");
                tVar = null;
            }
            if (tVar.i()) {
                return 0;
            }
            if (!i.this.f36902u.m()) {
                return 4;
            }
            if (i.this.f36902u.d0()) {
                return 3;
            }
            return i.this.f36902u.e0() ? 2 : 1;
        }

        private final boolean d(long j10) {
            return System.currentTimeMillis() - this.f36912b > j10;
        }

        public final int a() {
            return this.f36911a;
        }

        public final boolean c() {
            if (!i.this.f36902u.m()) {
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
                    } else if (d(2000L) && ef.a.h()) {
                        i.this.f36902u.g0(2);
                    }
                } else if (d(2000L)) {
                    if (!i.this.f36902u.M()) {
                        i.this.f36902u.Z();
                    }
                    if (!ef.a.h()) {
                        e();
                        return false;
                    }
                    this.f36912b = System.currentTimeMillis();
                }
            } else if (d(5000L)) {
                t tVar = i.this.f36901t;
                if (tVar == null) {
                    kotlin.jvm.internal.s.w("rootView");
                    tVar = null;
                }
                tVar.e();
                this.f36912b = System.currentTimeMillis();
            }
            if (ef.a.h()) {
                i.this.f36902u.h0(i.this.f36894m.X());
            }
            return true;
        }

        public final void e() {
            this.f36913c.removeMessages(this.f36911a);
        }

        public final void f() {
            if (ef.a.h()) {
                i.this.f36902u.h0(i.this.f36894m.X());
            }
            this.f36912b = System.currentTimeMillis();
            this.f36913c.removeMessages(this.f36911a);
            this.f36913c.sendEmptyMessageDelayed(this.f36911a, 1000L);
            this.f36912b = System.currentTimeMillis();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36916r;

        d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return i.this.new d(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f36916r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (Build.VERSION.SDK_INT == 30) {
                l0.D(i.this.f36898q, null);
            }
            i.this.L();
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements l.b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f36919r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f36920s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ i f36921t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, kl.f fVar) {
                super(2, fVar);
                this.f36921t = iVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f36921t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                i iVar;
                Object objF = ll.b.f();
                int i10 = this.f36920s;
                if (i10 == 0) {
                    s.b(obj);
                    i iVar2 = this.f36921t;
                    yf.c cVar = iVar2.f36891j;
                    g0 g0Var = g0.f38750a;
                    this.f36919r = iVar2;
                    this.f36920s = 1;
                    Object objB = cVar.b(g0Var, this);
                    if (objB == objF) {
                        return objF;
                    }
                    iVar = iVar2;
                    obj = objB;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = (i) this.f36919r;
                    s.b(obj);
                }
                iVar.f36899r = ((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue();
                return g0.f38750a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f36922r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ i f36923s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, kl.f fVar) {
                super(2, fVar);
                this.f36923s = iVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new b(this.f36923s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f36922r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f36923s.J();
                return g0.f38750a;
            }
        }

        e() {
        }

        @Override // dg.l.b
        public void b() {
            p.t(i.this.f36892k, 2, false, 2, null);
        }

        @Override // dg.l.b
        public void d() {
            if (i.this.M()) {
                i.this.S();
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(i.this.f36898q, R.anim.blink);
                zg.d dVar = i.this.f36902u;
                kotlin.jvm.internal.s.e(animationLoadAnimation);
                dVar.i0(animationLoadAnimation);
            }
        }

        @Override // dg.l.b
        public void i() {
            if (!i.this.M()) {
                p.t(i.this.f36892k, 2, false, 2, null);
            } else if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                i.this.J();
            } else {
                em.k.d(i.this.f36886e, i.this.f36895n, null, new b(i.this, null), 2, null);
            }
        }

        @Override // dg.l.b
        public void o() {
            if (i.this.M()) {
                i.this.S();
                i.this.f36902u.j0();
            }
        }

        @Override // dg.l.b
        public void s() {
            i.this.f36892k.u(2);
            em.k.d(i.this.f36886e, null, null, new a(i.this, null), 3, null);
        }

        @Override // dg.l.b
        public void y() {
            if (i.this.f36899r) {
                return;
            }
            p.t(i.this.f36892k, 2, false, 2, null);
            i.this.f36902u.h0(0L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36924r;

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
            return i.this.new f(fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r5.b(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r4.f36924r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r5)
                goto L5b
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                fl.s.b(r5)
                goto L3e
            L1e:
                fl.s.b(r5)
                dh.i r5 = dh.i.this
                yf.e0 r5 = dh.i.D(r5)
                dh.i r1 = dh.i.this
                zg.d r1 = dh.i.r(r1)
                boolean r1 = r1.N()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r4.f36924r = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L3e
                goto L5a
            L3e:
                dh.i r5 = dh.i.this
                yf.c0 r5 = dh.i.C(r5)
                dh.i r1 = dh.i.this
                zg.d r1 = dh.i.r(r1)
                int r1 = r1.v()
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.d(r1)
                r4.f36924r = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L5b
            L5a:
                return r0
            L5b:
                fl.g0 r5 = fl.g0.f38750a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dh.i.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g implements u.b {
        g() {
        }

        @Override // dg.u.b
        public void a() {
            p.t(i.this.f36892k, 2, false, 2, null);
        }

        @Override // dg.u.b
        public void b() {
            i.this.f36892k.u(2);
        }
    }

    public i(o0 externalScope, k getMainControllerSideUseCase, e0 setMainControllerSideUseCase, yf.i getMainControllerHeightUseCase, c0 setMainControllerHeightUseCase, yf.c getHideBubbleDuringRecordUseCase, p globalBubbleManager, u screenshotController, l recordingController, k0 mainDispatcher, LayoutInflater inflater, FirebaseAnalytics firebaseAnalytics, Context context) {
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(getMainControllerSideUseCase, "getMainControllerSideUseCase");
        kotlin.jvm.internal.s.h(setMainControllerSideUseCase, "setMainControllerSideUseCase");
        kotlin.jvm.internal.s.h(getMainControllerHeightUseCase, "getMainControllerHeightUseCase");
        kotlin.jvm.internal.s.h(setMainControllerHeightUseCase, "setMainControllerHeightUseCase");
        kotlin.jvm.internal.s.h(getHideBubbleDuringRecordUseCase, "getHideBubbleDuringRecordUseCase");
        kotlin.jvm.internal.s.h(globalBubbleManager, "globalBubbleManager");
        kotlin.jvm.internal.s.h(screenshotController, "screenshotController");
        kotlin.jvm.internal.s.h(recordingController, "recordingController");
        kotlin.jvm.internal.s.h(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.s.h(inflater, "inflater");
        kotlin.jvm.internal.s.h(firebaseAnalytics, "firebaseAnalytics");
        kotlin.jvm.internal.s.h(context, "context");
        this.f36886e = externalScope;
        this.f36887f = getMainControllerSideUseCase;
        this.f36888g = setMainControllerSideUseCase;
        this.f36889h = getMainControllerHeightUseCase;
        this.f36890i = setMainControllerHeightUseCase;
        this.f36891j = getHideBubbleDuringRecordUseCase;
        this.f36892k = globalBubbleManager;
        this.f36893l = screenshotController;
        this.f36894m = recordingController;
        this.f36895n = mainDispatcher;
        this.f36896o = inflater;
        this.f36897p = firebaseAnalytics;
        this.f36898q = context;
        this.f36902u = new zg.d(context);
        this.A = new g();
        this.B = new e();
        this.C = new View.OnClickListener() { // from class: dh.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.N(this.f36885a, view);
            }
        };
        this.f36902u.Q(this);
        this.f36901t = new t(context, this);
        G();
        em.k.d(externalScope, null, null, new a(null), 3, null);
    }

    private final void G() {
        ImageView imageView = null;
        View viewInflate = this.f36896o.inflate(R.layout.action_start_pause, (ViewGroup) null);
        kotlin.jvm.internal.s.f(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewInflate;
        this.f36904w = imageView2;
        if (imageView2 == null) {
            kotlin.jvm.internal.s.w("startOrPauseIv");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this.C);
        t tVar = this.f36901t;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        ImageView imageView3 = this.f36904w;
        if (imageView3 == null) {
            kotlin.jvm.internal.s.w("startOrPauseIv");
            imageView3 = null;
        }
        tVar.c(imageView3);
        View viewInflate2 = this.f36896o.inflate(R.layout.action_stop_home, (ViewGroup) null);
        kotlin.jvm.internal.s.f(viewInflate2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView4 = (ImageView) viewInflate2;
        this.f36905x = imageView4;
        if (imageView4 == null) {
            kotlin.jvm.internal.s.w("stopOrHomeIv");
            imageView4 = null;
        }
        imageView4.setOnClickListener(this.C);
        t tVar2 = this.f36901t;
        if (tVar2 == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar2 = null;
        }
        ImageView imageView5 = this.f36905x;
        if (imageView5 == null) {
            kotlin.jvm.internal.s.w("stopOrHomeIv");
            imageView5 = null;
        }
        tVar2.c(imageView5);
        View viewInflate3 = this.f36896o.inflate(R.layout.action_toolbox, (ViewGroup) null);
        kotlin.jvm.internal.s.f(viewInflate3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView6 = (ImageView) viewInflate3;
        this.f36906y = imageView6;
        if (imageView6 == null) {
            kotlin.jvm.internal.s.w("toolboxIv");
            imageView6 = null;
        }
        imageView6.setOnClickListener(this.C);
        t tVar3 = this.f36901t;
        if (tVar3 == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar3 = null;
        }
        ImageView imageView7 = this.f36906y;
        if (imageView7 == null) {
            kotlin.jvm.internal.s.w("toolboxIv");
            imageView7 = null;
        }
        tVar3.c(imageView7);
        View viewInflate4 = this.f36896o.inflate(R.layout.action_live_option, (ViewGroup) null);
        kotlin.jvm.internal.s.f(viewInflate4, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView8 = (ImageView) viewInflate4;
        this.f36907z = imageView8;
        if (imageView8 == null) {
            kotlin.jvm.internal.s.w("liveOptionIv");
            imageView8 = null;
        }
        imageView8.setOnClickListener(this.C);
        t tVar4 = this.f36901t;
        if (tVar4 == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar4 = null;
        }
        ImageView imageView9 = this.f36907z;
        if (imageView9 == null) {
            kotlin.jvm.internal.s.w("liveOptionIv");
        } else {
            imageView = imageView9;
        }
        tVar4.c(imageView);
    }

    private final void H(boolean z10) {
        ImageView imageView = null;
        if (z10) {
            t tVar = this.f36901t;
            if (tVar == null) {
                kotlin.jvm.internal.s.w("rootView");
                tVar = null;
            }
            ImageView imageView2 = this.f36907z;
            if (imageView2 == null) {
                kotlin.jvm.internal.s.w("liveOptionIv");
            } else {
                imageView = imageView2;
            }
            tVar.j(imageView);
            return;
        }
        t tVar2 = this.f36901t;
        if (tVar2 == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar2 = null;
        }
        ImageView imageView3 = this.f36907z;
        if (imageView3 == null) {
            kotlin.jvm.internal.s.w("liveOptionIv");
        } else {
            imageView = imageView3;
        }
        tVar2.c(imageView);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void I() {
        this.f36902u.g0(ef.a.h() ? 1 : 0);
        this.f36902u.W(!ef.a.h());
        H(ef.a.h());
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        I();
        this.f36902u.j0();
        this.f36902u.b0();
    }

    private final void K() {
        if (ef.a.h()) {
            this.f36902u.g0(1);
        }
        this.f36902u.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        wp.a.h(AzRecorderApp.f22504d).g("expandBubbles", new Object[0]);
        int i10 = k().top;
        t tVar = this.f36901t;
        t tVar2 = null;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        int boundRadius = i10 + tVar.getBoundRadius();
        int i11 = k().bottom;
        t tVar3 = this.f36901t;
        if (tVar3 == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar3 = null;
        }
        int boundRadius2 = (i11 - tVar3.getBoundRadius()) - this.f36898q.getResources().getDimensionPixelSize(R.dimen.size_button_bubble);
        WindowManager.LayoutParams layoutParams = this.f36902u.f58878b;
        int i12 = layoutParams.y;
        if (i12 < boundRadius || i12 > boundRadius2) {
            if (i12 < boundRadius) {
                layoutParams.y = boundRadius;
            } else {
                layoutParams.y = boundRadius2;
            }
            R();
        }
        wp.a.a("centerBubble: " + this.f36902u.g() + ", " + this.f36902u.h(), new Object[0]);
        t tVar4 = this.f36901t;
        if (tVar4 == null) {
            kotlin.jvm.internal.s.w("rootView");
        } else {
            tVar2 = tVar4;
        }
        tVar2.g(this.f36902u.g(), this.f36902u.h(), this.f36902u.N());
        this.f36902u.e();
        wp.a.h(AzRecorderApp.f22504d).g("finish expandBubbles", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(i iVar, View view) {
        t tVar = iVar.f36901t;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        tVar.h();
        c cVar = iVar.f36900s;
        if (cVar != null) {
            cVar.f();
        }
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.record_pause_resume_btn) {
            iVar.P();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.home_stop_btn) {
            iVar.O();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.toolbox_btn) {
            l0.q(iVar.f36898q, ToolboxActivity.class);
        } else if (numValueOf != null && numValueOf.intValue() == R.id.live_option_btn) {
            l0.q(iVar.f36898q, LiveHomeActivity.class);
        }
    }

    private final void O() {
        if (ef.a.h()) {
            this.f36894m.x0("bubble_button");
        } else {
            l0.f47742a.u(this.f36898q, true);
        }
    }

    private final void P() {
        if (!ef.a.h()) {
            this.f36894m.w0("bubble_button");
        } else if (this.f36894m.f0()) {
            this.f36894m.H();
        } else {
            this.f36894m.l0();
        }
    }

    private final void R() {
        em.k.d(this.f36886e, null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        ImageView imageView = null;
        if (!ef.a.h()) {
            ImageView imageView2 = this.f36904w;
            if (imageView2 == null) {
                kotlin.jvm.internal.s.w("startOrPauseIv");
                imageView2 = null;
            }
            imageView2.setImageResource(R.drawable.ic_bubble_record);
            ImageView imageView3 = this.f36905x;
            if (imageView3 == null) {
                kotlin.jvm.internal.s.w("stopOrHomeIv");
            } else {
                imageView = imageView3;
            }
            imageView.setImageResource(R.drawable.ic_bubble_home);
            return;
        }
        ImageView imageView4 = this.f36905x;
        if (imageView4 == null) {
            kotlin.jvm.internal.s.w("stopOrHomeIv");
            imageView4 = null;
        }
        imageView4.setImageResource(R.drawable.ic_bubble_stop);
        if (this.f36894m.f0()) {
            ImageView imageView5 = this.f36904w;
            if (imageView5 == null) {
                kotlin.jvm.internal.s.w("startOrPauseIv");
            } else {
                imageView = imageView5;
            }
            imageView.setImageResource(R.drawable.ic_bubble_resume);
            return;
        }
        ImageView imageView6 = this.f36904w;
        if (imageView6 == null) {
            kotlin.jvm.internal.s.w("startOrPauseIv");
        } else {
            imageView = imageView6;
        }
        imageView.setImageResource(R.drawable.ic_bubble_pause);
    }

    private final void U() {
        wp.a.h(AzRecorderApp.f22504d).g("setNormalView", new Object[0]);
        K();
        c cVar = this.f36900s;
        if (cVar != null) {
            cVar.f();
        }
        t tVar = this.f36901t;
        t tVar2 = null;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        if (tVar.i()) {
            t tVar3 = this.f36901t;
            if (tVar3 == null) {
                kotlin.jvm.internal.s.w("rootView");
            } else {
                tVar2 = tVar3;
            }
            tVar2.h();
        }
    }

    public final boolean M() {
        return this.f36902u.m();
    }

    public final void Q() {
        n();
        this.f36894m.n0(this.B);
        this.f36893l.K(this.A);
    }

    public final void T(boolean z10) {
        this.f36903v = z10;
    }

    @Override // zg.t.a
    public void a() {
        K();
        c cVar = this.f36900s;
        if (cVar != null) {
            cVar.f();
        }
        ImageView imageView = this.f36905x;
        if (imageView == null) {
            kotlin.jvm.internal.s.w("stopOrHomeIv");
            imageView = null;
        }
        Drawable drawable = imageView.getDrawable();
        AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    @Override // zg.f.b
    public void c() {
        Q();
    }

    @Override // zg.t.a
    public void d() {
        c cVar = this.f36900s;
        if (cVar != null) {
            cVar.f();
        }
        ImageView imageView = this.f36905x;
        if (imageView == null) {
            kotlin.jvm.internal.s.w("stopOrHomeIv");
            imageView = null;
        }
        Drawable drawable = imageView.getDrawable();
        AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @Override // zg.f.b
    public void e() {
        U();
    }

    @Override // zg.f.b
    public void f() {
        R();
        c cVar = this.f36900s;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // zg.f.b
    public void h() {
        t tVar = this.f36901t;
        t tVar2 = null;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        if (!tVar.i()) {
            em.k.d(this.f36886e, this.f36895n, null, new d(null), 2, null);
            return;
        }
        t tVar3 = this.f36901t;
        if (tVar3 == null) {
            kotlin.jvm.internal.s.w("rootView");
        } else {
            tVar2 = tVar3;
        }
        tVar2.e();
    }

    @Override // zg.b
    public void j(Rect rect) {
        kotlin.jvm.internal.s.h(rect, "rect");
        t tVar = null;
        this.f36902u.Y(rect, null);
        wp.a.h(AzRecorderApp.f22504d).g("Expand: " + this.f36903v, new Object[0]);
        if (this.f36903v) {
            L();
            this.f36903v = false;
            return;
        }
        U();
        t tVar2 = this.f36901t;
        if (tVar2 == null) {
            kotlin.jvm.internal.s.w("rootView");
        } else {
            tVar = tVar2;
        }
        tVar.d();
        this.f36902u.e();
    }

    @Override // zg.b
    public void l() {
        wp.a.h(AzRecorderApp.f22504d).g("show MainBubbleManager", new Object[0]);
        super.l();
        mg.a.f46242e.a().k();
        I();
        this.f36894m.B(this.B);
        this.f36900s = new c();
        this.f36893l.y(this.A);
    }

    @Override // zg.b
    public void n() {
        super.n();
        if (M()) {
            K();
        }
        this.f36902u.n();
        t tVar = this.f36901t;
        if (tVar == null) {
            kotlin.jvm.internal.s.w("rootView");
            tVar = null;
        }
        tVar.l();
        c cVar = this.f36900s;
        if (cVar != null) {
            cVar.e();
        }
    }
}
