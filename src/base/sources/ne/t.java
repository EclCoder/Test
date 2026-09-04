package ne;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47238c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47240b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: ne.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0728a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f47241r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f47242s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f47244u;

            C0728a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47242s = obj;
                this.f47244u |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [de.e] */
        /* JADX WARN: Type inference failed for: r9v0, types: [de.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(de.e r9, kl.f r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof ne.t.a.C0728a
                if (r0 == 0) goto L13
                r0 = r10
                ne.t$a$a r0 = (ne.t.a.C0728a) r0
                int r1 = r0.f47244u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47244u = r1
                goto L18
            L13:
                ne.t$a$a r0 = new ne.t$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f47242s
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f47244u
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3e
                if (r2 != r4) goto L36
                java.lang.Object r9 = r0.f47241r
                java.lang.String r9 = (java.lang.String) r9
                fl.s.b(r10)     // Catch: java.lang.Exception -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L8f
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f47241r
                de.e r9 = (de.e) r9
                fl.s.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6d
            L48:
                fl.s.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.s.g(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f47241r = r9     // Catch: java.lang.Exception -> L46
                r0.f47244u = r5     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = om.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                goto L87
            L60:
                com.google.firebase.installations.f r10 = (com.google.firebase.installations.f) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                kotlin.jvm.internal.s.e(r10)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L74
            L6d:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L74:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.s.g(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f47241r = r9     // Catch: java.lang.Exception -> L34
                r0.f47244u = r4     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = om.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L88
            L87:
                return r1
            L88:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                if (r10 != 0) goto L8d
                goto L94
            L8d:
                r6 = r10
                goto L94
            L8f:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L94:
                ne.t r10 = new ne.t
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.t.a.a(de.e, kl.f):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ t(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f47240b;
    }

    public final String b() {
        return this.f47239a;
    }

    private t(String str, String str2) {
        this.f47239a = str;
        this.f47240b = str2;
    }
}
