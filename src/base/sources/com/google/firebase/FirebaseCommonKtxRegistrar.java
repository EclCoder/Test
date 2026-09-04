package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import dd.a0;
import dd.q;
import em.k0;
import em.r1;
import gl.r;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ldd/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements dd.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22061a = new a();

        @Override // dd.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 a(dd.d dVar) {
            Object objE = dVar.e(a0.a(cd.a.class, Executor.class));
            s.g(objE, "get(...)");
            return r1.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements dd.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22062a = new b();

        @Override // dd.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 a(dd.d dVar) {
            Object objE = dVar.e(a0.a(cd.c.class, Executor.class));
            s.g(objE, "get(...)");
            return r1.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements dd.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22063a = new c();

        @Override // dd.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 a(dd.d dVar) {
            Object objE = dVar.e(a0.a(cd.b.class, Executor.class));
            s.g(objE, "get(...)");
            return r1.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements dd.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22064a = new d();

        @Override // dd.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 a(dd.d dVar) {
            Object objE = dVar.e(a0.a(cd.d.class, Executor.class));
            s.g(objE, "get(...)");
            return r1.a((Executor) objE);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<dd.c> getComponents() {
        dd.c cVarC = dd.c.c(a0.a(cd.a.class, k0.class)).b(q.i(a0.a(cd.a.class, Executor.class))).e(a.f22061a).c();
        s.g(cVarC, "build(...)");
        dd.c cVarC2 = dd.c.c(a0.a(cd.c.class, k0.class)).b(q.i(a0.a(cd.c.class, Executor.class))).e(b.f22062a).c();
        s.g(cVarC2, "build(...)");
        dd.c cVarC3 = dd.c.c(a0.a(cd.b.class, k0.class)).b(q.i(a0.a(cd.b.class, Executor.class))).e(c.f22063a).c();
        s.g(cVarC3, "build(...)");
        dd.c cVarC4 = dd.c.c(a0.a(cd.d.class, k0.class)).b(q.i(a0.a(cd.d.class, Executor.class))).e(d.f22064a).c();
        s.g(cVarC4, "build(...)");
        return r.o(cVarC, cVarC2, cVarC3, cVarC4);
    }
}
