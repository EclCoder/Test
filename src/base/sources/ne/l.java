package ne;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47187c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f47188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qe.j f47189b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47190r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r0 f47192t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r0 r0Var, kl.f fVar) {
            super(2, fVar);
            this.f47192t = r0Var;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return l.this.new a(this.f47192t, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r6.f(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f47190r
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                fl.s.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                fl.s.b(r6)
                goto L2e
            L20:
                fl.s.b(r6)
                oe.c r6 = oe.c.f48516a
                r5.f47190r = r4
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r0) goto L2e
                goto L68
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L92
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r6.next()
                oe.d r1 = (oe.d) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L48
                ne.l r6 = ne.l.this
                qe.j r6 = ne.l.b(r6)
                r5.f47190r = r3
                java.lang.Object r6 = r6.f(r5)
                if (r6 != r0) goto L69
            L68:
                return r0
            L69:
                ne.l r6 = ne.l.this
                qe.j r6 = ne.l.b(r6)
                boolean r6 = r6.c()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                kotlin.coroutines.jvm.internal.b.d(r6)
                goto L9b
            L7f:
                ne.l r6 = ne.l.this
                com.google.firebase.f r6 = ne.l.a(r6)
                ne.r0 r0 = r5.f47192t
                ne.k r1 = new ne.k
                r1.<init>()
                r6.h(r1)
                fl.g0 r6 = fl.g0.f38750a
                goto L9b
            L92:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                kotlin.coroutines.jvm.internal.b.d(r6)
            L9b:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public l(com.google.firebase.f firebaseApp, qe.j settings, kl.j backgroundDispatcher, r0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.s.h(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.s.h(settings, "settings");
        kotlin.jvm.internal.s.h(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.s.h(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f47188a = firebaseApp;
        this.f47189b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.7.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            em.k.d(em.p0.a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
