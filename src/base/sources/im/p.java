package im;

import em.b2;
import fl.g0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends kotlin.coroutines.jvm.internal.d implements hm.f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hm.f f41537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kl.j f41538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f41539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private kl.j f41540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private kl.f f41541v;

    public p(hm.f fVar, kl.j jVar) {
        super(l.f41531a, kl.k.f43531a);
        this.f41537r = fVar;
        this.f41538s = jVar;
        this.f41539t = ((Number) jVar.fold(0, new tl.o() { // from class: im.o
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(p.k(((Integer) obj).intValue(), (kl.j.b) obj2));
            }
        })).intValue();
    }

    private final void e(kl.j jVar, kl.j jVar2, Object obj) {
        if (jVar2 instanceof i) {
            q((i) jVar2, obj);
        }
        s.b(this, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i10, kl.j.b bVar) {
        return i10 + 1;
    }

    private final Object o(kl.f fVar, Object obj) {
        kl.j context = fVar.getContext();
        b2.h(context);
        kl.j jVar = this.f41540u;
        if (jVar != context) {
            e(context, jVar, obj);
            this.f41540u = context;
        }
        this.f41541v = fVar;
        Function3 function3 = q.f41542a;
        hm.f fVar2 = this.f41537r;
        kotlin.jvm.internal.s.f(fVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(fVar2, obj, this);
        if (!kotlin.jvm.internal.s.c(objInvoke, ll.b.f())) {
            this.f41541v = null;
        }
        return objInvoke;
    }

    private final void q(i iVar, Object obj) {
        throw new IllegalStateException(bm.r.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f41530b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // hm.f
    public Object emit(Object obj, kl.f fVar) {
        try {
            Object objO = o(fVar, obj);
            if (objO == ll.b.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objO == ll.b.f() ? objO : g0.f38750a;
        } catch (Throwable th2) {
            this.f41540u = new i(th2, fVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kl.f fVar = this.f41541v;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kl.f
    public kl.j getContext() {
        kl.j jVar = this.f41540u;
        return jVar == null ? kl.k.f43531a : jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thE = fl.r.e(obj);
        if (thE != null) {
            this.f41540u = new i(thE, getContext());
        }
        kl.f fVar = this.f41541v;
        if (fVar != null) {
            fVar.resumeWith(obj);
        }
        return ll.b.f();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
