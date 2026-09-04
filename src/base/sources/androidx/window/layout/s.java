package androidx.window.layout;

import android.app.Activity;
import fl.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7754d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f7755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f7756c;

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
        Object f7757r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f7758s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7759t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f7760u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Activity f7762w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, kl.f fVar) {
            super(2, fVar);
            this.f7762w = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(gm.g gVar, u info) {
            kotlin.jvm.internal.s.g(info, "info");
            gVar.e(info);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = s.this.new b(this.f7762w, fVar);
            bVar.f7760u = obj;
            return bVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hm.f fVar, kl.f fVar2) {
            return ((b) create(fVar, fVar2)).invokeSuspend(g0.f38750a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:21:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:18:0x0064, B:22:0x0076, B:24:0x007e, B:14:0x0036, B:17:0x0060), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        
            if (r5.emit(r10, r9) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r9.f7759t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.f7758s
                gm.i r1 = (gm.i) r1
                java.lang.Object r4 = r9.f7757r
                m0.a r4 = (m0.a) r4
                java.lang.Object r5 = r9.f7760u
                hm.f r5 = (hm.f) r5
                fl.s.b(r10)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r10 = r5
                goto L64
            L1f:
                r10 = move-exception
                goto L9f
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2a:
                java.lang.Object r1 = r9.f7758s
                gm.i r1 = (gm.i) r1
                java.lang.Object r4 = r9.f7757r
                m0.a r4 = (m0.a) r4
                java.lang.Object r5 = r9.f7760u
                hm.f r5 = (hm.f) r5
                fl.s.b(r10)     // Catch: java.lang.Throwable -> L1f
                goto L76
            L3a:
                fl.s.b(r10)
                java.lang.Object r10 = r9.f7760u
                hm.f r10 = (hm.f) r10
                gm.a r1 = gm.a.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                gm.g r1 = gm.j.b(r5, r1, r6, r4, r6)
                androidx.window.layout.t r4 = new androidx.window.layout.t
                r4.<init>()
                androidx.window.layout.s r5 = androidx.window.layout.s.this
                androidx.window.layout.p r5 = androidx.window.layout.s.c(r5)
                android.app.Activity r6 = r9.f7762w
                androidx.privacysandbox.ads.adservices.measurement.g r7 = new androidx.privacysandbox.ads.adservices.measurement.g
                r7.<init>()
                r5.a(r6, r7, r4)
                gm.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L64:
                r9.f7760u = r10     // Catch: java.lang.Throwable -> L1f
                r9.f7757r = r4     // Catch: java.lang.Throwable -> L1f
                r9.f7758s = r1     // Catch: java.lang.Throwable -> L1f
                r9.f7759t = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.b(r9)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L73
                goto L92
            L73:
                r8 = r5
                r5 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r10 == 0) goto L93
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1f
                androidx.window.layout.u r10 = (androidx.window.layout.u) r10     // Catch: java.lang.Throwable -> L1f
                r9.f7760u = r5     // Catch: java.lang.Throwable -> L1f
                r9.f7757r = r4     // Catch: java.lang.Throwable -> L1f
                r9.f7758s = r1     // Catch: java.lang.Throwable -> L1f
                r9.f7759t = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r10 = r5.emit(r10, r9)     // Catch: java.lang.Throwable -> L1f
                if (r10 != r0) goto L1d
            L92:
                return r0
            L93:
                androidx.window.layout.s r10 = androidx.window.layout.s.this
                androidx.window.layout.p r10 = androidx.window.layout.s.c(r10)
                r10.b(r4)
                fl.g0 r10 = fl.g0.f38750a
                return r10
            L9f:
                androidx.window.layout.s r0 = androidx.window.layout.s.this
                androidx.window.layout.p r0 = androidx.window.layout.s.c(r0)
                r0.b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public s(w windowMetricsCalculator, p windowBackend) {
        kotlin.jvm.internal.s.h(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.s.h(windowBackend, "windowBackend");
        this.f7755b = windowMetricsCalculator;
        this.f7756c = windowBackend;
    }

    @Override // androidx.window.layout.q
    public hm.e b(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        return hm.g.s(new b(activity, null));
    }
}
