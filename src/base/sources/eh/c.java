package eh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import dg.u;
import em.k;
import em.o0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import o4.Wz.OGoz;
import tl.o;
import yf.i0;
import zg.f;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends zg.b implements f.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f37889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f37890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f37891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f37892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private eh.a f37894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Handler f37895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f37896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f37897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f37898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f37899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f37900p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f37901r;

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
            return c.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f37901r;
            if (i10 == 0) {
                s.b(obj);
                i0 i0Var = c.this.f37889e;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                this.f37901r = 1;
                if (i0Var.b(boolA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements u.b {
        b() {
        }

        @Override // dg.u.b
        public void a() {
            p.t(c.this.f37891g, 8, false, 2, null);
        }

        @Override // dg.u.b
        public void b() {
            c.this.f37891g.u(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(c cVar) {
        eh.a aVar = cVar.f37894j;
        if (aVar != null) {
            aVar.a0();
        }
    }

    private final void t() {
        if (this.f37895k.hasCallbacks(this.f37900p)) {
            this.f37895k.removeCallbacks(this.f37900p);
        }
        eh.a aVar = this.f37894j;
        if (aVar != null) {
            aVar.Z();
        }
    }

    private final void v() {
        this.f37895k.postDelayed(this.f37900p, 4000L);
    }

    @Override // zg.f.b
    public void c() {
        s();
        k.d(this.f37890f, null, null, new a(null), 3, null);
    }

    @Override // zg.f.b
    public void e() {
        t();
    }

    @Override // zg.f.b
    public void f() {
        eh.a aVar = this.f37894j;
        if (aVar != null) {
            aVar.v();
        }
        v();
    }

    @Override // zg.f.b
    public void h() {
        t();
        this.f37892h.G(true);
        v();
    }

    @Override // zg.b
    public void j(Rect rect) {
        kotlin.jvm.internal.s.h(rect, "rect");
        if (this.f37894j == null) {
            eh.a aVar = new eh.a(this.f37898n);
            this.f37894j = aVar;
            aVar.Q(this);
        }
        eh.a aVar2 = this.f37894j;
        if (aVar2 != null) {
            Integer num = this.f37896l;
            if (num != null) {
                aVar2.Y(rect, num);
                this.f37896l = null;
            } else {
                aVar2.Y(rect, null);
            }
            aVar2.e();
        }
        this.f37893i = false;
        v();
    }

    @Override // zg.b
    public void l() {
        super.l();
        this.f37892h.y(this.f37899o);
    }

    @Override // zg.b
    public void n() {
        super.n();
        t();
        eh.a aVar = this.f37894j;
        if (aVar != null) {
            aVar.n();
        }
    }

    public final void s() {
        n();
        this.f37894j = null;
        this.f37893i = true;
        this.f37892h.K(this.f37899o);
    }

    public final void u(Integer num) {
        this.f37896l = num;
    }

    public c(i0 setShowScreenshotBubbleUseCase, o0 externalScope, p globalBubbleManager, u screenshotController) {
        kotlin.jvm.internal.s.h(setShowScreenshotBubbleUseCase, "setShowScreenshotBubbleUseCase");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(globalBubbleManager, "globalBubbleManager");
        kotlin.jvm.internal.s.h(screenshotController, "screenshotController");
        this.f37889e = setShowScreenshotBubbleUseCase;
        this.f37890f = externalScope;
        this.f37891g = globalBubbleManager;
        this.f37892h = screenshotController;
        this.f37893i = true;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, OGoz.sVGjNADj);
        this.f37898n = applicationContext;
        this.f37899o = new b();
        this.f37897m = applicationContext.getResources().getDimensionPixelSize(R.dimen.size_float_menu_item);
        this.f37895k = new Handler();
        this.f37900p = new Runnable() { // from class: eh.b
            @Override // java.lang.Runnable
            public final void run() {
                c.r(this.f37888a);
            }
        };
    }
}
