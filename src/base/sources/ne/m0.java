package ne;

import android.util.Log;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47193f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f47194g = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f47195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final de.e f47196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qe.j f47197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f47198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl.j f47199e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f47200r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f47201s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f47202t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f47203u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f47204v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f47205w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f47206x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ SessionDetails f47208z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionDetails sessionDetails, kl.f fVar) {
            super(2, fVar);
            this.f47208z = sessionDetails;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m0.this.new b(this.f47208z, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            m0 m0Var;
            k0 k0Var;
            com.google.firebase.f fVar;
            SessionDetails sessionDetails;
            qe.j jVar;
            Object objD;
            com.google.firebase.f fVar2;
            SessionDetails sessionDetails2;
            k0 k0Var2;
            qe.j jVar2;
            Object objF = ll.b.f();
            int i10 = this.f47206x;
            if (i10 == 0) {
                fl.s.b(obj);
                m0 m0Var2 = m0.this;
                this.f47206x = 1;
                obj = m0Var2.i(this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                fl.s.b(obj);
            } else {
                if (i10 == 2) {
                    fl.s.b(obj);
                    tVar = (t) obj;
                    m0Var = m0.this;
                    k0Var = k0.f47185a;
                    fVar = m0Var.f47195a;
                    sessionDetails = this.f47208z;
                    jVar = m0.this.f47197c;
                    oe.c cVar = oe.c.f48516a;
                    this.f47200r = tVar;
                    this.f47201s = m0Var;
                    this.f47202t = k0Var;
                    this.f47203u = fVar;
                    this.f47204v = sessionDetails;
                    this.f47205w = jVar;
                    this.f47206x = 3;
                    objD = cVar.d(this);
                    if (objD != objF) {
                        fVar2 = fVar;
                        obj = objD;
                        sessionDetails2 = sessionDetails;
                        k0Var2 = k0Var;
                        jVar2 = jVar;
                    }
                    return objF;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qe.j jVar3 = (qe.j) this.f47205w;
                SessionDetails sessionDetails3 = (SessionDetails) this.f47204v;
                com.google.firebase.f fVar3 = (com.google.firebase.f) this.f47203u;
                k0 k0Var3 = (k0) this.f47202t;
                m0Var = (m0) this.f47201s;
                tVar = (t) this.f47200r;
                fl.s.b(obj);
                jVar2 = jVar3;
                k0Var2 = k0Var3;
                sessionDetails2 = sessionDetails3;
                fVar2 = fVar3;
            }
            m0 m0Var3 = m0Var;
            Map map = (Map) obj;
            t tVar2 = tVar;
            m0Var3.g(k0Var2.a(fVar2, sessionDetails2, jVar2, map, tVar2.b(), tVar2.a()));
            return fl.g0.f38750a;
            if (((Boolean) obj).booleanValue()) {
                t.a aVar = t.f47238c;
                de.e eVar = m0.this.f47196b;
                this.f47206x = 2;
                obj = aVar.a(eVar, this);
                if (obj != objF) {
                    tVar = (t) obj;
                    m0Var = m0.this;
                    k0Var = k0.f47185a;
                    fVar = m0Var.f47195a;
                    sessionDetails = this.f47208z;
                    jVar = m0.this.f47197c;
                    oe.c cVar2 = oe.c.f48516a;
                    this.f47200r = tVar;
                    this.f47201s = m0Var;
                    this.f47202t = k0Var;
                    this.f47203u = fVar;
                    this.f47204v = sessionDetails;
                    this.f47205w = jVar;
                    this.f47206x = 3;
                    objD = cVar2.d(this);
                    if (objD != objF) {
                        fVar2 = fVar;
                        obj = objD;
                        sessionDetails2 = sessionDetails;
                        k0Var2 = k0Var;
                        jVar2 = jVar;
                        m0 m0Var4 = m0Var;
                        Map map2 = (Map) obj;
                        t tVar3 = tVar;
                        m0Var4.g(k0Var2.a(fVar2, sessionDetails2, jVar2, map2, tVar3.b(), tVar3.a()));
                    }
                }
                return objF;
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f47209r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f47211t;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f47209r = obj;
            this.f47211t |= Integer.MIN_VALUE;
            return m0.this.i(this);
        }
    }

    public m0(com.google.firebase.f firebaseApp, de.e firebaseInstallations, qe.j sessionSettings, h eventGDTLogger, kl.j backgroundDispatcher) {
        kotlin.jvm.internal.s.h(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.s.h(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.s.h(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.s.h(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.s.h(backgroundDispatcher, "backgroundDispatcher");
        this.f47195a = firebaseApp;
        this.f47196b = firebaseInstallations;
        this.f47197c = sessionSettings;
        this.f47198d = eventGDTLogger;
        this.f47199e = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(j0 j0Var) {
        try {
            this.f47198d.a(j0Var);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f47194g <= this.f47197c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r8.f(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kl.f r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ne.m0.c
            if (r0 == 0) goto L13
            r0 = r8
            ne.m0$c r0 = (ne.m0.c) r0
            int r1 = r0.f47211t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47211t = r1
            goto L18
        L13:
            ne.m0$c r0 = new ne.m0$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f47209r
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f47211t
            r3 = 2
            r4 = 0
            java.lang.String r5 = "FirebaseSessions"
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L37
            if (r2 != r3) goto L2f
            fl.s.b(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            fl.s.b(r8)
            goto L49
        L3b:
            fl.s.b(r8)
            oe.c r8 = oe.c.f48516a
            r0.f47211t = r6
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L49
            goto L7f
        L49:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L5f
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5f
            goto La7
        L5f:
            java.util.Iterator r8 = r8.iterator()
        L63:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r8.next()
            oe.d r2 = (oe.d) r2
            boolean r2 = r2.b()
            if (r2 == 0) goto L63
            qe.j r8 = r7.f47197c
            r0.f47211t = r3
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            qe.j r8 = r7.f47197c
            boolean r8 = r8.c()
            if (r8 != 0) goto L92
            java.lang.String r8 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r8
        L92:
            boolean r8 = r7.h()
            if (r8 != 0) goto La2
            java.lang.String r8 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r8
        La2:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r8
        La7:
            java.lang.String r8 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.m0.i(kl.f):java.lang.Object");
    }

    @Override // ne.l0
    public void a(SessionDetails sessionDetails) {
        kotlin.jvm.internal.s.h(sessionDetails, "sessionDetails");
        em.k.d(em.p0.a(this.f47199e), null, null, new b(sessionDetails, null), 3, null);
    }
}
