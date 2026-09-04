package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class u {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f40695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tl.o f40696b;

        /* JADX INFO: renamed from: hm.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0619a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f40697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ tl.o f40698b;

            /* JADX INFO: renamed from: hm.u$a$a$a, reason: collision with other inner class name */
            public static final class C0620a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f40699r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                /* synthetic */ Object f40700s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f40701t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f40703v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f40704w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f40705x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                int f40706y;

                public C0620a(kl.f fVar) {
                    super(fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40700s = obj;
                    this.f40701t |= Integer.MIN_VALUE;
                    return C0619a.this.emit(null, this);
                }
            }

            public C0619a(f fVar, tl.o oVar) {
                this.f40697a = fVar;
                this.f40698b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L22;
             */
            @Override // hm.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, kl.f r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof hm.u.a.C0619a.C0620a
                    if (r0 == 0) goto L13
                    r0 = r9
                    hm.u$a$a$a r0 = (hm.u.a.C0619a.C0620a) r0
                    int r1 = r0.f40701t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40701t = r1
                    goto L18
                L13:
                    hm.u$a$a$a r0 = new hm.u$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f40700s
                    java.lang.Object r1 = ll.b.f()
                    int r2 = r0.f40701t
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r8 = r0.f40705x
                    hm.f r8 = (hm.f) r8
                    java.lang.Object r8 = r0.f40703v
                    kl.f r8 = (kl.f) r8
                    fl.s.b(r9)
                    goto La2
                L35:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3d:
                    int r8 = r0.f40706y
                    java.lang.Object r2 = r0.f40705x
                    hm.f r2 = (hm.f) r2
                    java.lang.Object r4 = r0.f40704w
                    java.lang.Object r5 = r0.f40703v
                    kl.f r5 = (kl.f) r5
                    java.lang.Object r6 = r0.f40699r
                    fl.s.b(r9)
                    r9 = r5
                    r5 = r8
                    r8 = r4
                    goto L7f
                L52:
                    fl.s.b(r9)
                    hm.f r2 = r7.f40697a
                    tl.o r9 = r7.f40698b
                    java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r8)
                    r0.f40699r = r5
                    java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r0)
                    r0.f40703v = r5
                    r0.f40704w = r8
                    r0.f40705x = r2
                    r5 = 0
                    r0.f40706y = r5
                    r0.f40701t = r4
                    r4 = 6
                    kotlin.jvm.internal.q.a(r4)
                    java.lang.Object r9 = r9.invoke(r8, r0)
                    r4 = 7
                    kotlin.jvm.internal.q.a(r4)
                    if (r9 != r1) goto L7d
                    goto La1
                L7d:
                    r6 = r8
                    r9 = r0
                L7f:
                    java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r6)
                    r0.f40699r = r4
                    java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r9)
                    r0.f40703v = r9
                    java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r8)
                    r0.f40704w = r9
                    java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r2)
                    r0.f40705x = r9
                    r0.f40706y = r5
                    r0.f40701t = r3
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto La2
                La1:
                    return r1
                La2:
                    fl.g0 r8 = fl.g0.f38750a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: hm.u.a.C0619a.emit(java.lang.Object, kl.f):java.lang.Object");
            }
        }

        public a(e eVar, tl.o oVar) {
            this.f40695a = eVar;
            this.f40696b = oVar;
        }

        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) {
            Object objCollect = this.f40695a.collect(new C0619a(fVar, this.f40696b), fVar2);
            return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
        }
    }

    public static final e a(e eVar, tl.o oVar) {
        return new a(eVar, oVar);
    }
}
