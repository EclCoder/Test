package hm;

import em.b2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f40614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tl.o f40615b;

        public a(e eVar, tl.o oVar) {
            this.f40614a = eVar;
            this.f40615b = oVar;
        }

        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) {
            Object objCollect = this.f40614a.collect(new b(new kotlin.jvm.internal.g0(), fVar, this.f40615b), fVar2);
            return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.g0 f40616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f40617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tl.o f40618c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f40619r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40620s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f40622u;

            a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40620s = obj;
                this.f40622u |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(kotlin.jvm.internal.g0 g0Var, f fVar, tl.o oVar) {
            this.f40616a = g0Var;
            this.f40617b = fVar;
            this.f40618c = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0073  */
        /* JADX WARN: Code duplicated, block: B:35:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L32;
         */
        @Override // hm.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, kl.f r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof hm.q.b.a
                if (r0 == 0) goto L13
                r0 = r8
                hm.q$b$a r0 = (hm.q.b.a) r0
                int r1 = r0.f40622u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40622u = r1
                goto L18
            L13:
                hm.q$b$a r0 = new hm.q$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f40620s
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f40622u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L41
                if (r2 == r5) goto L3d
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                fl.s.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f40619r
                fl.s.b(r8)
                goto L6b
            L3d:
                fl.s.b(r8)
                goto L5b
            L41:
                fl.s.b(r8)
                kotlin.jvm.internal.g0 r8 = r6.f40616a
                boolean r8 = r8.f43588a
                if (r8 == 0) goto L5e
                hm.f r8 = r6.f40617b
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r7)
                r0.f40619r = r2
                r0.f40622u = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L5b
                goto L87
            L5b:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            L5e:
                tl.o r8 = r6.f40618c
                r0.f40619r = r7
                r0.f40622u = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.g0 r8 = r6.f40616a
                r8.f43588a = r5
                hm.f r8 = r6.f40617b
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r7)
                r0.f40619r = r2
                r0.f40622u = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            L8b:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.q.b.emit(java.lang.Object, kl.f):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f40623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tl.o f40624b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int A;
            int B;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f40625r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f40626s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f40628u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40629v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40630w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f40631x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            Object f40632y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            Object f40633z;

            public a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40625r = obj;
                this.f40626s |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(e eVar, tl.o oVar) {
            this.f40623a = eVar;
            this.f40624b = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) {
            a aVar;
            d dVar;
            if (fVar2 instanceof a) {
                aVar = (a) fVar2;
                int i10 = aVar.f40626s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f40626s = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar2);
                }
            } else {
                aVar = new a(fVar2);
            }
            Object obj = aVar.f40625r;
            Object objF = ll.b.f();
            int i11 = aVar.f40626s;
            if (i11 == 0) {
                fl.s.b(obj);
                e eVar = this.f40623a;
                d dVar2 = new d(this.f40624b, fVar);
                try {
                    aVar.f40628u = kotlin.coroutines.jvm.internal.l.a(fVar);
                    aVar.f40629v = kotlin.coroutines.jvm.internal.l.a(aVar);
                    aVar.f40630w = kotlin.coroutines.jvm.internal.l.a(fVar);
                    aVar.f40631x = kotlin.coroutines.jvm.internal.l.a(eVar);
                    aVar.f40632y = kotlin.coroutines.jvm.internal.l.a(aVar);
                    aVar.f40633z = dVar2;
                    aVar.A = 0;
                    aVar.B = 0;
                    aVar.f40626s = 1;
                    if (eVar.collect(dVar2, aVar) == objF) {
                        return objF;
                    }
                } catch (AbortFlowException e10) {
                    e = e10;
                    dVar = dVar2;
                    im.j.a(e, dVar);
                    b2.h(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) aVar.f40633z;
                try {
                    fl.s.b(obj);
                } catch (AbortFlowException e11) {
                    e = e11;
                    im.j.a(e, dVar);
                    b2.h(aVar.getContext());
                }
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.o f40634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f40635b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f40636r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40637s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f40638t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40640v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40641w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f40642x;

            public a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40637s = obj;
                this.f40638t |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(tl.o oVar, f fVar) {
            this.f40634a = oVar;
            this.f40635b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (r9.emit(r8, r0) == r1) goto L24;
         */
        @Override // hm.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r8, kl.f r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof hm.q.d.a
                if (r0 == 0) goto L13
                r0 = r9
                hm.q$d$a r0 = (hm.q.d.a) r0
                int r1 = r0.f40638t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40638t = r1
                goto L18
            L13:
                hm.q$d$a r0 = new hm.q$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f40637s
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f40638t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L49
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f40640v
                kl.f r8 = (kl.f) r8
                fl.s.b(r9)
                goto L99
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                int r8 = r0.f40642x
                java.lang.Object r2 = r0.f40641w
                java.lang.Object r4 = r0.f40640v
                kl.f r4 = (kl.f) r4
                java.lang.Object r5 = r0.f40636r
                fl.s.b(r9)
                r6 = r2
                r2 = r8
                r8 = r6
                goto L72
            L49:
                fl.s.b(r9)
                tl.o r9 = r7.f40634a
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r8)
                r0.f40636r = r2
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r0)
                r0.f40640v = r2
                r0.f40641w = r8
                r2 = 0
                r0.f40642x = r2
                r0.f40638t = r4
                r4 = 6
                kotlin.jvm.internal.q.a(r4)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r4 = 7
                kotlin.jvm.internal.q.a(r4)
                if (r9 != r1) goto L70
                goto L98
            L70:
                r5 = r8
                r4 = r0
            L72:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9c
                hm.f r9 = r7.f40635b
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r5)
                r0.f40636r = r5
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r4)
                r0.f40640v = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r8)
                r0.f40641w = r4
                r0.f40642x = r2
                r0.f40638t = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L99
            L98:
                return r1
            L99:
                fl.g0 r8 = fl.g0.f38750a
                return r8
            L9c:
                kotlinx.coroutines.flow.internal.AbortFlowException r8 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.q.d.emit(java.lang.Object, kl.f):java.lang.Object");
        }
    }

    public static final e a(e eVar, tl.o oVar) {
        return new a(eVar, oVar);
    }

    public static final e b(e eVar, tl.o oVar) {
        return new c(eVar, oVar);
    }
}
