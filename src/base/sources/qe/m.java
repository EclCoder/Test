package qe;

import android.util.Log;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import em.o0;
import em.p0;
import fl.g0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.s;
import ne.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.j f50693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f50694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0.h f50695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f50696d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50697r;

        /* JADX INFO: renamed from: qe.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* synthetic */ class C0782a implements hm.f, kotlin.jvm.internal.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference f50699a;

            C0782a(AtomicReference atomicReference) {
                this.f50699a = atomicReference;
            }

            @Override // kotlin.jvm.internal.m
            public final fl.g a() {
                return new kotlin.jvm.internal.a(2, this.f50699a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // hm.f
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionConfigs sessionConfigs, kl.f fVar) {
                Object objK = a.k(this.f50699a, sessionConfigs, fVar);
                return objK == ll.b.f() ? objK : g0.f38750a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof hm.f) && (obj instanceof kotlin.jvm.internal.m)) {
                    return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        a(kl.f fVar) {
            super(2, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object k(AtomicReference atomicReference, SessionConfigs sessionConfigs, kl.f fVar) {
            atomicReference.set(sessionConfigs);
            return g0.f38750a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m.this.new a(fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f50697r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.e data = m.this.f50695c.getData();
                C0782a c0782a = new C0782a(m.this.f50696d);
                this.f50697r = 1;
                if (data.collect(c0782a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50700r;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f50700r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            hm.e data = m.this.f50695c.getData();
            this.f50700r = 1;
            Object objP = hm.g.p(data, this);
            return objP == objF ? objF : objP;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f50702r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f50704t;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50702r = obj;
            this.f50704t |= Integer.MIN_VALUE;
            return m.this.d(null, this);
        }
    }

    public m(kl.j backgroundDispatcher, x0 timeProvider, z0.h sessionConfigsDataStore) {
        s.h(backgroundDispatcher, "backgroundDispatcher");
        s.h(timeProvider, "timeProvider");
        s.h(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f50693a = backgroundDispatcher;
        this.f50694b = timeProvider;
        this.f50695c = sessionConfigsDataStore;
        this.f50696d = new AtomicReference();
        em.k.d(p0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final SessionConfigs h() {
        if (this.f50696d.get() == null) {
            androidx.lifecycle.b.a(this.f50696d, null, em.j.b(null, new b(null), 1, null));
        }
        Object obj = this.f50696d.get();
        s.g(obj, "get(...)");
        return (SessionConfigs) obj;
    }

    @Override // qe.l
    public Double a() {
        return h().getSessionSamplingRate();
    }

    @Override // qe.l
    public boolean b() {
        Long cacheUpdatedTimeSeconds = h().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = h().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.f50694b.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    @Override // qe.l
    public Boolean c() {
        return h().getSessionsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qe.l
    public Object d(SessionConfigs sessionConfigs, kl.f fVar) {
        c cVar;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f50704t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f50704t = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object obj = cVar.f50702r;
        Object objF = ll.b.f();
        int i11 = cVar.f50704t;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                z0.h hVar = this.f50695c;
                d dVar = new d(sessionConfigs, null);
                cVar.f50704t = 1;
                if (hVar.a(dVar, cVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e10);
        }
        return g0.f38750a;
    }

    @Override // qe.l
    public Integer e() {
        return h().getSessionTimeoutSeconds();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50705r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ SessionConfigs f50706s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SessionConfigs sessionConfigs, kl.f fVar) {
            super(2, fVar);
            this.f50706s = sessionConfigs;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, kl.f fVar) {
            return ((d) create(sessionConfigs, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new d(this.f50706s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f50705r == 0) {
                fl.s.b(obj);
                return this.f50706s;
            }
            throw new IllegalStateException(Lykgign.kwDlrPFSEDTUs);
        }
    }
}
