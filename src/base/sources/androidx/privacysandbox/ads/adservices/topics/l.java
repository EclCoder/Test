package androidx.privacysandbox.ads.adservices.topics;

import em.q;
import j0.n;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6532r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f6533s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f6535u;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6533s = obj;
            this.f6535u |= Integer.MIN_VALUE;
            return l.e(l.this, null, this);
        }
    }

    public l(b.c mTopicsManager) {
        s.h(mTopicsManager, "mTopicsManager");
    }

    public static final /* synthetic */ b.c b(l lVar) {
        lVar.getClass();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object e(l lVar, androidx.privacysandbox.ads.adservices.topics.a aVar, kl.f fVar) {
        a aVar2;
        if (fVar instanceof a) {
            aVar2 = (a) fVar;
            int i10 = aVar2.f6535u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f6535u = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = lVar.new a(fVar);
            }
        } else {
            aVar2 = lVar.new a(fVar);
        }
        Object objF = aVar2.f6533s;
        Object objF2 = ll.b.f();
        int i11 = aVar2.f6535u;
        if (i11 == 0) {
            fl.s.b(objF);
            lVar.c(aVar);
            aVar2.f6532r = lVar;
            aVar2.f6535u = 1;
            objF = lVar.f(null, aVar2);
            if (objF == objF2) {
                return objF2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) aVar2.f6532r;
            fl.s.b(objF);
        }
        android.support.v4.media.session.b.a(objF);
        return lVar.d(null);
    }

    private final Object f(b.a aVar, kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        b(this);
        new androidx.privacysandbox.ads.adservices.measurement.g();
        n.a(qVar);
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f
    public Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, kl.f fVar) {
        return e(this, aVar, fVar);
    }

    public b.a c(androidx.privacysandbox.ads.adservices.topics.a request) {
        s.h(request, "request");
        b.f6525a.b(request);
        return null;
    }

    public c d(b.b response) {
        s.h(response, "response");
        return d.f6528a.a(response);
    }
}
