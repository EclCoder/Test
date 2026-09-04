package bh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import dg.u;
import em.k;
import em.k0;
import em.o0;
import fl.s;
import yf.g0;
import yf.m;
import yf.o;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends zg.b implements zg.f.b, i.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0 f8913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f8914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f8915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f8916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dk.a f8917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f8918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0 f8919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private bh.a f8920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f8921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f8922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f8923o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f8924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f8927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d f8928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f8929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View.OnClickListener f8930v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends zg.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.hecorat.screenrecorder.free.widget.c f8931g;

        /* JADX INFO: renamed from: bh.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0114a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f8933r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f8934s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ e f8935t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ a f8936u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0114a(e eVar, a aVar, kl.f fVar) {
                super(2, fVar);
                this.f8935t = eVar;
                this.f8936u = aVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0114a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0114a(this.f8935t, this.f8936u, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i10;
                Object objF = ll.b.f();
                int i11 = this.f8934s;
                if (i11 == 0) {
                    s.b(obj);
                    m mVar = this.f8935t.f8914f;
                    fl.g0 g0Var = fl.g0.f38750a;
                    this.f8934s = 1;
                    obj = mVar.b(g0Var, this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                if (i11 == 1) {
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f8933r;
                    s.b(obj);
                }
                int iIntValue = ((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(6))).intValue();
                this.f8936u.f8931g = new com.hecorat.screenrecorder.free.widget.c(this.f8935t.f8923o, i10, iIntValue);
                a aVar = this.f8936u;
                aVar.d(aVar.f8931g);
                return fl.g0.f38750a;
                int iIntValue2 = ((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(this.f8935t.f8923o.getResources().getColor(R.color.bright_red)))).intValue();
                o oVar = this.f8935t.f8915g;
                fl.g0 g0Var2 = fl.g0.f38750a;
                this.f8933r = iIntValue2;
                this.f8934s = 2;
                Object objB = oVar.b(g0Var2, this);
                if (objB != objF) {
                    i10 = iIntValue2;
                    obj = objB;
                    int iIntValue3 = ((Number) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.d(6))).intValue();
                    this.f8936u.f8931g = new com.hecorat.screenrecorder.free.widget.c(this.f8935t.f8923o, i10, iIntValue3);
                    a aVar2 = this.f8936u;
                    aVar2.d(aVar2.f8931g);
                    return fl.g0.f38750a;
                }
                return objF;
            }
        }

        public a(Context context) {
            super(context);
            this.f58878b.flags = 288;
        }

        private final int s() {
            return this.f58881e.getResources().getConfiguration().orientation == 1 ? 7 : 6;
        }

        @Override // zg.o
        protected int j() {
            return -1;
        }

        @Override // zg.o
        protected int l() {
            return -1;
        }

        public final void r() {
            com.hecorat.screenrecorder.free.widget.c cVar = this.f8931g;
            if (cVar != null) {
                cVar.a();
            }
        }

        public final void t(int i10) {
            com.hecorat.screenrecorder.free.widget.c cVar = this.f8931g;
            if (cVar != null) {
                cVar.setPaintColor(i10);
            }
        }

        public final void u(int i10) {
            com.hecorat.screenrecorder.free.widget.c cVar = this.f8931g;
            if (cVar != null) {
                cVar.setWidth(i10);
            }
        }

        public final void v() {
            int iS = s();
            WindowManager.LayoutParams layoutParams = this.f58878b;
            if (iS != layoutParams.screenOrientation || this.f8931g == null) {
                layoutParams.screenOrientation = iS;
                com.hecorat.screenrecorder.free.widget.c cVar = this.f8931g;
                if (cVar != null) {
                    cVar.a();
                }
                k.d(e.this.f8918j, e.this.f8919k, null, new C0114a(e.this, this, null), 2, null);
            }
            e();
        }

        public final void w() {
            com.hecorat.screenrecorder.free.widget.c cVar = this.f8931g;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 4) {
                return false;
            }
            if (e.this.f8925q) {
                e.this.A();
            } else {
                e.this.f8925q = true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8938r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return e.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f8938r;
            if (i10 == 0) {
                s.b(obj);
                g0 g0Var = e.this.f8913e;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                this.f8938r = 1;
                if (g0Var.b(boolA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements u.b {
        d() {
        }

        @Override // dg.u.b
        public void a() {
            p.t(e.this.f8916h, 16, false, 2, null);
        }

        @Override // dg.u.b
        public void b() {
            e.this.f8916h.u(16);
        }
    }

    public e(g0 setShowDrawerBubbleUseCase, m getPaintColorUseCase, o getPaintWidthUseCase, p globalBubbleManager, dk.a screenshotController, o0 externalScope, k0 mainDispatcher) {
        kotlin.jvm.internal.s.h(setShowDrawerBubbleUseCase, "setShowDrawerBubbleUseCase");
        kotlin.jvm.internal.s.h(getPaintColorUseCase, "getPaintColorUseCase");
        kotlin.jvm.internal.s.h(getPaintWidthUseCase, "getPaintWidthUseCase");
        kotlin.jvm.internal.s.h(globalBubbleManager, "globalBubbleManager");
        kotlin.jvm.internal.s.h(screenshotController, "screenshotController");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(mainDispatcher, "mainDispatcher");
        this.f8913e = setShowDrawerBubbleUseCase;
        this.f8914f = getPaintColorUseCase;
        this.f8915g = getPaintWidthUseCase;
        this.f8916h = globalBubbleManager;
        this.f8917i = screenshotController;
        this.f8918j = externalScope;
        this.f8919k = mainDispatcher;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        this.f8923o = applicationContext;
        this.f8924p = new Handler();
        this.f8925q = true;
        this.f8926r = true;
        this.f8927s = new b();
        this.f8928t = new d();
        this.f8929u = new Runnable() { // from class: bh.b
            @Override // java.lang.Runnable
            public final void run() {
                e.E(this.f8909a);
            }
        };
        this.f8930v = new View.OnClickListener() { // from class: bh.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.C(this.f8910a, view);
            }
        };
    }

    private final void B() {
        ef.a.l(true);
        if (this.f8921m == null) {
            this.f8921m = new a(this.f8923o);
        }
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.v();
        }
        if (this.f8922n == null) {
            g gVar = new g(this.f8923o);
            this.f8922n = gVar;
            gVar.q(this.f8930v);
            g gVar2 = this.f8922n;
            if (gVar2 != null) {
                gVar2.p(this.f8927s);
            }
        }
        g gVar3 = this.f8922n;
        if (gVar3 != null) {
            gVar3.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final e eVar, View view) {
        switch (view.getId()) {
            case R.id.btn_clear_all /* 2131362006 */:
                a aVar = eVar.f8921m;
                if (aVar != null) {
                    aVar.r();
                }
                break;
            case R.id.btn_erase_previous /* 2131362008 */:
                a aVar2 = eVar.f8921m;
                if (aVar2 != null) {
                    aVar2.w();
                }
                break;
            case R.id.btn_exit_drawing /* 2131362009 */:
                eVar.A();
                break;
            case R.id.draw_settings_ib /* 2131362196 */:
                final i iVar = new i(eVar.f8923o);
                iVar.q(eVar);
                iVar.r(new View.OnKeyListener() { // from class: bh.d
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i10, KeyEvent keyEvent) {
                        return e.D(iVar, eVar, view2, i10, keyEvent);
                    }
                });
                iVar.s();
                break;
            case R.id.screenshot_ib /* 2131363053 */:
                g gVar = eVar.f8922n;
                if (gVar != null && gVar.k() == 0) {
                    ((u) eVar.f8917i.get()).G(true);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(i iVar, e eVar, View view, int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return false;
        }
        iVar.n();
        eVar.f8925q = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(e eVar) {
        bh.a aVar = eVar.f8920l;
        if (aVar != null) {
            aVar.a0();
        }
    }

    private final void G() {
        this.f8924p.removeCallbacks(this.f8929u);
        bh.a aVar = this.f8920l;
        if (aVar != null) {
            aVar.Z();
        }
    }

    private final void J() {
        this.f8924p.postDelayed(this.f8929u, 4000L);
    }

    private final void L() {
        n();
        G();
        bh.a aVar = this.f8920l;
        if (aVar != null) {
            aVar.n();
        }
    }

    private final void M() {
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.n();
        }
        g gVar = this.f8922n;
        if (gVar != null) {
            gVar.n();
        }
    }

    public final void A() {
        if (ef.a.e()) {
            ef.a.l(false);
            M();
            l();
        }
    }

    public final void F() {
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.r();
        }
        K();
        ((u) this.f8917i.get()).K(this.f8928t);
        this.f8920l = null;
        this.f8922n = null;
        this.f8921m = null;
        this.f8926r = true;
        ef.a.l(false);
    }

    public final void H() {
        if (ef.a.e()) {
            B();
        } else {
            l();
        }
        ((u) this.f8917i.get()).y(this.f8928t);
    }

    public final void I() {
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.v();
        }
    }

    public final void K() {
        L();
        M();
    }

    @Override // bh.i.a
    public void b(int i10) {
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.t(i10);
        }
    }

    @Override // zg.f.b
    public void c() {
        F();
        k.d(this.f8918j, null, null, new c(null), 3, null);
    }

    @Override // zg.f.b
    public void e() {
        G();
    }

    @Override // zg.f.b
    public void f() {
        bh.a aVar = this.f8920l;
        if (aVar != null) {
            aVar.v();
        }
        J();
    }

    @Override // bh.i.a
    public void g(int i10) {
        a aVar = this.f8921m;
        if (aVar != null) {
            aVar.u(i10);
        }
    }

    @Override // zg.f.b
    public void h() {
        L();
        B();
    }

    @Override // zg.b
    public void j(Rect rect) {
        kotlin.jvm.internal.s.h(rect, "rect");
        if (ef.a.e()) {
            return;
        }
        if (this.f8920l == null) {
            bh.a aVar = new bh.a(this.f8923o);
            aVar.Q(this);
            this.f8920l = aVar;
        }
        bh.a aVar2 = this.f8920l;
        if (aVar2 != null) {
            aVar2.Y(rect, null);
            aVar2.e();
        }
        this.f8926r = false;
        J();
    }
}
