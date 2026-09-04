package y3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57261c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f57263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f57264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f57265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zl.c f57266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f57267i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1.a f57259a = new m1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57262d = -1;

    private final void f(String str) {
        if (str != null) {
            if (bm.r.h0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f57263e = str;
            this.f57264f = false;
        }
    }

    public final void a(Function1 animBuilder) {
        kotlin.jvm.internal.s.h(animBuilder, "animBuilder");
        f fVar = new f();
        animBuilder.invoke(fVar);
        this.f57259a.b(fVar.a()).c(fVar.b()).e(fVar.c()).f(fVar.d());
    }

    public final m1 b() {
        m1.a aVar = this.f57259a;
        aVar.d(this.f57260b);
        aVar.l(this.f57261c);
        String str = this.f57263e;
        if (str != null) {
            aVar.i(str, this.f57264f, this.f57265g);
        } else {
            zl.c cVar = this.f57266h;
            if (cVar != null) {
                kotlin.jvm.internal.s.e(cVar);
                aVar.j(cVar, this.f57264f, this.f57265g);
            } else {
                Object obj = this.f57267i;
                if (obj != null) {
                    kotlin.jvm.internal.s.e(obj);
                    aVar.h(obj, this.f57264f, this.f57265g);
                } else {
                    aVar.g(this.f57262d, this.f57264f, this.f57265g);
                }
            }
        }
        return aVar.a();
    }

    public final void c(int i10, Function1 popUpToBuilder) {
        kotlin.jvm.internal.s.h(popUpToBuilder, "popUpToBuilder");
        e(i10);
        f(null);
        c2 c2Var = new c2();
        popUpToBuilder.invoke(c2Var);
        this.f57264f = c2Var.a();
        this.f57265g = c2Var.b();
    }

    public final void d(boolean z10) {
        this.f57260b = z10;
    }

    public final void e(int i10) {
        this.f57262d = i10;
        this.f57264f = false;
    }

    public final void g(boolean z10) {
        this.f57261c = z10;
    }
}
