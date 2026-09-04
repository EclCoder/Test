package uh;

import android.app.Application;
import androidx.lifecycle.o1;
import androidx.lifecycle.q1;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m0 extends androidx.lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f54520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f54521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fl.k f54524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54525h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54526r;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m0.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54526r;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    rh.g gVarT = m0.this.t();
                    this.f54526r = 1;
                    if (gVarT.k(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Application application, z0 state) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        kotlin.jvm.internal.s.h(state, "state");
        this.f54520c = state;
        this.f54521d = fl.l.b(new tl.a() { // from class: uh.i0
            @Override // tl.a
            public final Object invoke() {
                return m0.y(this.f54505a);
            }
        });
        this.f54522e = t().g();
        this.f54523f = t().e();
        this.f54524g = fl.l.b(new tl.a() { // from class: uh.j0
            @Override // tl.a
            public final Object invoke() {
                return m0.A(this.f54517a);
            }
        });
        this.f54525h = o1.f(u(), new Function1() { // from class: uh.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.w(this.f54518a, (String) obj);
            }
        });
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.p0 A(m0 m0Var) {
        return m0Var.f54520c.c("selected_bucket", m0Var.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rh.g t() {
        return (rh.g) this.f54521d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.k0 w(m0 m0Var, final String str) {
        return kotlin.jvm.internal.s.c(str, m0Var.q()) ? m0Var.f54522e : o1.f(m0Var.f54522e, new Function1() { // from class: uh.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.x(str, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.k0 x(String str, List list) {
        kotlin.jvm.internal.s.e(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (kotlin.jvm.internal.s.c(((ng.c) obj).a(), str)) {
                arrayList.add(obj);
            }
        }
        return new androidx.lifecycle.p0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rh.g y(m0 m0Var) {
        return m0Var.p();
    }

    private final void z() {
        em.k.d(q1.a(this), null, null, new a(null), 3, null);
    }

    protected abstract rh.g p();

    protected abstract String q();

    public final androidx.lifecycle.p0 r() {
        return this.f54523f;
    }

    public final androidx.lifecycle.k0 s() {
        return this.f54525h;
    }

    public final androidx.lifecycle.p0 u() {
        return (androidx.lifecycle.p0) this.f54524g.getValue();
    }

    protected final z0 v() {
        return this.f54520c;
    }
}
