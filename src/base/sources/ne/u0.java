package ne;

import android.util.Log;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qe.j f47254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f47255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0 f47256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0 f47257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z0.h f47258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f47259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kl.j f47260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SessionData f47261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f47264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f47265m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47266r;

        /* JADX INFO: renamed from: ne.u0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0729a extends kotlin.coroutines.jvm.internal.m implements Function3 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f47268r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f47269s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f47270t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ u0 f47271u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0729a(u0 u0Var, kl.f fVar) {
                super(3, fVar);
                this.f47271u = u0Var;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hm.f fVar, Throwable th2, kl.f fVar2) {
                C0729a c0729a = new C0729a(this.f47271u, fVar2);
                c0729a.f47269s = fVar;
                c0729a.f47270t = th2;
                return c0729a.invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f47268r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    hm.f fVar = (hm.f) this.f47269s;
                    Throwable th2 = (Throwable) this.f47270t;
                    SessionData sessionData = new SessionData(this.f47271u.f47255c.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f47269s = null;
                    this.f47268r = 1;
                    if (fVar.emit(sessionData, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                return fl.g0.f38750a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0 f47272a;

            b(u0 u0Var) {
                this.f47272a = u0Var;
            }

            @Override // hm.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, kl.f fVar) {
                this.f47272a.t(sessionData);
                if (this.f47272a.f47263k) {
                    this.f47272a.f47263k = false;
                    this.f47272a.c();
                }
                Object objS = this.f47272a.s(sessionData.getSessionDetails().getSessionId(), b.GENERAL, fVar);
                return objS == ll.b.f() ? objS : fl.g0.f38750a;
            }
        }

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
            return u0.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f47266r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.e eVarE = hm.g.e(u0.this.f47258f.getData(), new C0729a(u0.this, null));
                b bVar = new b(u0.this);
                this.f47266r = 1;
                if (eVarE.collect(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        GENERAL,
        FALLBACK;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ ml.a f47276d = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47277a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47277a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47278r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f47280r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f47281s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ u0 f47282t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, kl.f fVar) {
                super(2, fVar);
                this.f47282t = u0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, kl.f fVar) {
                return ((a) create(sessionData, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f47282t, fVar);
                aVar.f47281s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f47280r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return SessionData.e((SessionData) this.f47281s, null, this.f47282t.f47257e.a(), null, 5, null);
            }
        }

        d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return u0.this.new d(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f47278r;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    z0.h hVar = u0.this.f47258f;
                    a aVar = new a(u0.this, null);
                    this.f47278r = 1;
                    if (hVar.a(aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
            } catch (Exception e10) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                u0 u0Var = u0.this;
                u0Var.t(SessionData.e(u0Var.o(), null, u0.this.f47257e.a(), null, 5, null));
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47283r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SessionData f47285t;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f47286r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f47287s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ u0 f47288t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, kl.f fVar) {
                super(2, fVar);
                this.f47288t = u0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, kl.f fVar) {
                return ((a) create(sessionData, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f47288t, fVar);
                aVar.f47287s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Map mapC;
                ll.b.f();
                if (this.f47286r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                SessionData sessionData = (SessionData) this.f47287s;
                boolean zR = this.f47288t.r(sessionData);
                boolean zP = this.f47288t.p(sessionData);
                boolean zQ = this.f47288t.q(sessionData);
                if (zP) {
                    mapC = this.f47288t.f47259g.f();
                } else {
                    mapC = zQ ? this.f47288t.f47259g.c(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                }
                SessionDetails sessionDetails = zP ? null : sessionData.getSessionDetails();
                if (!zR && !zP) {
                    return zQ ? SessionData.e(sessionData, null, null, this.f47288t.f47259g.c(mapC), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsA = this.f47288t.f47255c.a(sessionDetails);
                this.f47288t.f47256d.a(sessionDetailsA);
                this.f47288t.f47259g.d();
                return sessionData.d(sessionDetailsA, null, mapC);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SessionData sessionData, kl.f fVar) {
            super(2, fVar);
            this.f47285t = sessionData;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return u0.this.new e(this.f47285t, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r10.a(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.s(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r1 = ll.b.f()
                int r0 = r9.f47283r
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                fl.s.b(r10)
                goto L9a
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                fl.s.b(r10)     // Catch: java.lang.Exception -> L20
                goto L9a
            L20:
                r0 = move-exception
                r10 = r0
                goto L3d
            L23:
                fl.s.b(r10)
                ne.u0 r10 = ne.u0.this     // Catch: java.lang.Exception -> L20
                z0.h r10 = ne.u0.f(r10)     // Catch: java.lang.Exception -> L20
                ne.u0$e$a r0 = new ne.u0$e$a     // Catch: java.lang.Exception -> L20
                ne.u0 r4 = ne.u0.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f47283r = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = r10.a(r0, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r1) goto L9a
                goto L99
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.append(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r10)
                ne.u0 r10 = ne.u0.this
                ne.f0 r0 = r9.f47285t
                boolean r10 = ne.u0.l(r10, r0)
                if (r10 == 0) goto L9a
                ne.u0 r10 = ne.u0.this
                ne.o0 r10 = ne.u0.h(r10)
                ne.f0 r0 = r9.f47285t
                ne.i0 r0 = r0.getSessionDetails()
                ne.i0 r4 = r10.a(r0)
                ne.u0 r10 = ne.u0.this
                ne.f0 r3 = r9.f47285t
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                ne.f0 r0 = ne.SessionData.e(r3, r4, r5, r6, r7, r8)
                r10.t(r0)
                ne.u0 r10 = ne.u0.this
                ne.l0 r10 = ne.u0.g(r10)
                r10.a(r4)
                ne.u0 r10 = ne.u0.this
                java.lang.String r0 = r4.getSessionId()
                ne.u0$b r3 = ne.u0.b.FALLBACK
                r9.f47283r = r2
                java.lang.Object r10 = ne.u0.m(r10, r0, r3, r9)
                if (r10 != r1) goto L9a
            L99:
                return r1
            L9a:
                fl.g0 r10 = fl.g0.f38750a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.u0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f47289r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f47290s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f47291t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f47293v;

        f(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f47291t = obj;
            this.f47293v |= Integer.MIN_VALUE;
            return u0.this.s(null, null, this);
        }
    }

    public u0(qe.j sessionsSettings, o0 sessionGenerator, l0 sessionFirelogPublisher, x0 timeProvider, z0.h sessionDataStore, w processDataManager, kl.j backgroundDispatcher) {
        kotlin.jvm.internal.s.h(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.s.h(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.s.h(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.s.h(timeProvider, "timeProvider");
        kotlin.jvm.internal.s.h(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.s.h(processDataManager, "processDataManager");
        kotlin.jvm.internal.s.h(backgroundDispatcher, "backgroundDispatcher");
        this.f47254b = sessionsSettings;
        this.f47255c = sessionGenerator;
        this.f47256d = sessionFirelogPublisher;
        this.f47257e = timeProvider;
        this.f47258f = sessionDataStore;
        this.f47259g = processDataManager;
        this.f47260h = backgroundDispatcher;
        this.f47264l = b.GENERAL;
        this.f47265m = "";
        em.k.d(em.p0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(SessionData sessionData) {
        Map processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zE = this.f47259g.e(processDataMap);
        if (zE) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(SessionData sessionData) {
        Map processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data for " + this.f47259g.a());
            return true;
        }
        boolean zB = this.f47259g.b(processDataMap);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + this.f47259g.a() + " is stale");
        }
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z10 = cm.a.g(this.f47257e.a().c(backgroundTime), this.f47254b.b()) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, b bVar, kl.f fVar) {
        f fVar2;
        String str2;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f47293v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f47293v = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object objD = fVar2.f47291t;
        Object objF = ll.b.f();
        int i11 = fVar2.f47293v;
        if (i11 == 0) {
            fl.s.b(objD);
            this.f47264l = bVar;
            if (kotlin.jvm.internal.s.c(this.f47265m, str)) {
                return fl.g0.f38750a;
            }
            this.f47265m = str;
            oe.c cVar = oe.c.f48516a;
            fVar2.f47289r = str;
            fVar2.f47290s = bVar;
            fVar2.f47293v = 1;
            objD = cVar.d(fVar2);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) fVar2.f47290s;
            str = (String) fVar2.f47289r;
            fl.s.b(objD);
        }
        for (oe.d dVar : ((Map) objD).values()) {
            dVar.a(new oe.d.b(str));
            int i12 = c.f47277a[bVar.ordinal()];
            if (i12 == 1) {
                str2 = "Notified " + dVar.c() + " of new session " + str;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + dVar.c() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return fl.g0.f38750a;
    }

    @Override // ne.t0
    public boolean a() {
        return this.f47262j;
    }

    @Override // ne.t0
    public void b() {
        this.f47262j = false;
        if (this.f47261i == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f47259g.a());
        em.k.d(em.p0.a(this.f47260h), null, null, new d(null), 3, null);
    }

    @Override // ne.t0
    public void c() {
        this.f47262j = true;
        if (this.f47261i == null) {
            this.f47263k = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData sessionDataO = o();
        Log.d("FirebaseSessions", "App foregrounded on " + this.f47259g.a());
        if (r(sessionDataO) || q(sessionDataO)) {
            em.k.d(em.p0.a(this.f47260h), null, null, new e(sessionDataO, null), 3, null);
        }
    }

    public final void t(SessionData sessionData) {
        kotlin.jvm.internal.s.h(sessionData, "<set-?>");
        this.f47261i = sessionData;
    }

    public final SessionData o() {
        SessionData sessionData = this.f47261i;
        if (sessionData != null) {
            return sessionData;
        }
        kotlin.jvm.internal.s.w(obFGmWgqyy.YAGwYaXpHDo);
        return null;
    }
}
