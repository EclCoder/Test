package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.j;
import androidx.window.layout.q;
import androidx.window.layout.u;
import em.k;
import em.o0;
import em.p0;
import em.r1;
import em.z1;
import fl.g0;
import fl.s;
import hm.e;
import hm.f;
import hm.g;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f7235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f7236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z1 f7237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0086a f7238d;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0086a {
        void a(j jVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7239r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Activity f7241t;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0087a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f7242a;

            public C0087a(a aVar) {
                this.f7242a = aVar;
            }

            @Override // hm.f
            public Object emit(Object obj, kl.f fVar) {
                g0 g0Var;
                j jVar = (j) obj;
                InterfaceC0086a interfaceC0086a = this.f7242a.f7238d;
                if (interfaceC0086a == null) {
                    g0Var = null;
                } else {
                    interfaceC0086a.a(jVar);
                    g0Var = g0.f38750a;
                }
                return g0Var == ll.b.f() ? g0Var : g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0088b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f7243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f7244b;

            /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class C0089a implements f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f7245a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f7246b;

                /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b$a$a, reason: collision with other inner class name */
                public static final class C0090a extends d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f7247r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f7248s;

                    public C0090a(kl.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f7247r = obj;
                        this.f7248s |= Integer.MIN_VALUE;
                        return C0089a.this.emit(null, this);
                    }
                }

                public C0089a(f fVar, a aVar) {
                    this.f7245a = fVar;
                    this.f7246b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // hm.f
                public Object emit(Object obj, kl.f fVar) {
                    C0090a c0090a;
                    if (fVar instanceof C0090a) {
                        c0090a = (C0090a) fVar;
                        int i10 = c0090a.f7248s;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0090a.f7248s = i10 - Integer.MIN_VALUE;
                        } else {
                            c0090a = new C0090a(fVar);
                        }
                    } else {
                        c0090a = new C0090a(fVar);
                    }
                    Object obj2 = c0090a.f7247r;
                    Object objF = ll.b.f();
                    int i11 = c0090a.f7248s;
                    if (i11 == 0) {
                        s.b(obj2);
                        f fVar2 = this.f7245a;
                        j jVarD = this.f7246b.d((u) obj);
                        if (jVarD != null) {
                            c0090a.f7248s = 1;
                            if (fVar2.emit(jVarD, c0090a) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return g0.f38750a;
                }
            }

            public C0088b(e eVar, a aVar) {
                this.f7243a = eVar;
                this.f7244b = aVar;
            }

            @Override // hm.e
            public Object collect(f fVar, kl.f fVar2) {
                Object objCollect = this.f7243a.collect(new C0089a(fVar, this.f7244b), fVar2);
                return objCollect == ll.b.f() ? objCollect : g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, kl.f fVar) {
            super(2, fVar);
            this.f7241t = activity;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return a.this.new b(this.f7241t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f7239r;
            if (i10 == 0) {
                s.b(obj);
                e eVarK = g.k(new C0088b(a.this.f7235a.b(this.f7241t), a.this));
                C0087a c0087a = new C0087a(a.this);
                this.f7239r = 1;
                if (eVarK.collect(c0087a, this) == objF) {
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

    public a(q windowInfoTracker, Executor executor) {
        kotlin.jvm.internal.s.h(windowInfoTracker, "windowInfoTracker");
        kotlin.jvm.internal.s.h(executor, "executor");
        this.f7235a = windowInfoTracker;
        this.f7236b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j d(u uVar) {
        Object next;
        Iterator it = uVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((androidx.window.layout.e) next) instanceof j));
        if (next instanceof j) {
            return (j) next;
        }
        return null;
    }

    public final void e(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        z1 z1Var = this.f7237c;
        if (z1Var != null) {
            z1.c0(z1Var, null, 1, null);
        }
        this.f7237c = k.d(p0.a(r1.a(this.f7236b)), null, null, new b(activity, null), 3, null);
    }

    public final void f(InterfaceC0086a onFoldingFeatureChangeListener) {
        kotlin.jvm.internal.s.h(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.f7238d = onFoldingFeatureChangeListener;
    }

    public final void g() {
        z1 z1Var = this.f7237c;
        if (z1Var == null) {
            return;
        }
        z1.c0(z1Var, null, 1, null);
    }
}
