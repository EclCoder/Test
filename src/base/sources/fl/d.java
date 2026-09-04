package fl;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends c implements kl.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function3 f38740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f38741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kl.f f38742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f38743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function3 block, Object obj) {
        super(null);
        kotlin.jvm.internal.s.h(block, "block");
        this.f38740a = block;
        this.f38741b = obj;
        kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f38742c = this;
        this.f38743d = b.f38734a;
    }

    @Override // fl.c
    public Object a(Object obj, kl.f fVar) {
        kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f38742c = fVar;
        this.f38741b = obj;
        Object objF = ll.b.f();
        if (objF == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF;
    }

    public final Object b() {
        while (true) {
            Object obj = this.f38743d;
            kl.f fVar = this.f38742c;
            if (fVar == null) {
                s.b(obj);
                return obj;
            }
            if (r.d(b.f38734a, obj)) {
                try {
                    Function3 function3 = this.f38740a;
                    Object obj2 = this.f38741b;
                    Object objD = !(function3 instanceof kotlin.coroutines.jvm.internal.a) ? ll.b.d(function3, this, obj2, fVar) : ((Function3) p0.e(function3, 3)).invoke(this, obj2, fVar);
                    if (objD != ll.b.f()) {
                        fVar.resumeWith(r.b(objD));
                    }
                } catch (Throwable th2) {
                    r.a aVar = r.f38769b;
                    fVar.resumeWith(r.b(s.a(th2)));
                }
            } else {
                this.f38743d = b.f38734a;
                fVar.resumeWith(obj);
            }
        }
    }

    @Override // kl.f
    public kl.j getContext() {
        return kl.k.f43531a;
    }

    @Override // kl.f
    public void resumeWith(Object obj) {
        this.f38742c = null;
        this.f38743d = obj;
    }
}
