package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import em.o0;
import em.p0;
import em.q;
import fl.g0;
import fl.s;
import j0.n;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MeasurementManager f6517b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f6519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f6520t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, h hVar, kl.f fVar) {
            super(2, fVar);
            this.f6520t = hVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(null, this.f6520t, fVar);
            aVar.f6519s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f6518r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            throw null;
        }
    }

    public h(MeasurementManager mMeasurementManager) {
        kotlin.jvm.internal.s.h(mMeasurementManager, "mMeasurementManager");
        this.f6517b = mMeasurementManager;
    }

    static /* synthetic */ Object h(h hVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, kl.f fVar) {
        new q(ll.b.c(fVar), 1).H();
        hVar.i();
        throw null;
    }

    static /* synthetic */ Object j(h hVar, kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        hVar.i().getMeasurementApiStatus(new g(), n.a(qVar));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }

    static /* synthetic */ Object k(h hVar, Uri uri, InputEvent inputEvent, kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        hVar.i().registerSource(uri, inputEvent, new g(), n.a(qVar));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : g0.f38750a;
    }

    static /* synthetic */ Object l(h hVar, i iVar, kl.f fVar) {
        Object objD = p0.d(new a(iVar, hVar, null), fVar);
        return objD == ll.b.f() ? objD : g0.f38750a;
    }

    static /* synthetic */ Object m(h hVar, Uri uri, kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        hVar.i().registerTrigger(uri, new g(), n.a(qVar));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : g0.f38750a;
    }

    static /* synthetic */ Object n(h hVar, j jVar, kl.f fVar) {
        new q(ll.b.c(fVar), 1).H();
        hVar.i();
        throw null;
    }

    static /* synthetic */ Object o(h hVar, k kVar, kl.f fVar) {
        new q(ll.b.c(fVar), 1).H();
        hVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kl.f fVar) {
        return h(this, aVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(kl.f fVar) {
        return j(this, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, kl.f fVar) {
        return k(this, uri, inputEvent, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(i iVar, kl.f fVar) {
        return l(this, iVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, kl.f fVar) {
        return m(this, uri, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(j jVar, kl.f fVar) {
        return n(this, jVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(k kVar, kl.f fVar) {
        return o(this, kVar, fVar);
    }

    protected final MeasurementManager i() {
        return this.f6517b;
    }
}
