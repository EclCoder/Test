package hm;

import em.z1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f40593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3 f40594b;

        /* JADX INFO: renamed from: hm.p$a$a, reason: collision with other inner class name */
        public static final class C0616a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f40595r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f40596s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f40598u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40599v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40600w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f40601x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f40602y;

            public C0616a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40595r = obj;
                this.f40596s |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(e eVar, Function3 function3) {
            this.f40593a = eVar;
            this.f40594b = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
        
            if (r9 == r1) goto L24;
         */
        @Override // hm.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(hm.f r9, kl.f r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof hm.p.a.C0616a
                if (r0 == 0) goto L13
                r0 = r10
                hm.p$a$a r0 = (hm.p.a.C0616a) r0
                int r1 = r0.f40596s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40596s = r1
                goto L18
            L13:
                hm.p$a$a r0 = new hm.p$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f40595r
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f40596s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L5a
                if (r2 == r4) goto L45
                if (r2 != r3) goto L3d
                java.lang.Object r9 = r0.f40601x
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                java.lang.Object r9 = r0.f40600w
                hm.f r9 = (hm.f) r9
                java.lang.Object r9 = r0.f40599v
                kl.f r9 = (kl.f) r9
                java.lang.Object r9 = r0.f40598u
                hm.f r9 = (hm.f) r9
                fl.s.b(r10)
                goto Lac
            L3d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L45:
                int r9 = r0.f40602y
                java.lang.Object r2 = r0.f40600w
                hm.f r2 = (hm.f) r2
                java.lang.Object r4 = r0.f40599v
                kl.f r4 = (kl.f) r4
                java.lang.Object r5 = r0.f40598u
                hm.f r5 = (hm.f) r5
                fl.s.b(r10)
                r7 = r2
                r2 = r9
                r9 = r7
                goto L7b
            L5a:
                fl.s.b(r10)
                hm.e r10 = r8.f40593a
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r9)
                r0.f40598u = r2
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.l.a(r0)
                r0.f40599v = r2
                r0.f40600w = r9
                r2 = 0
                r0.f40602y = r2
                r0.f40596s = r4
                java.lang.Object r10 = hm.g.f(r10, r9, r0)
                if (r10 != r1) goto L79
                goto Lab
            L79:
                r5 = r9
                r4 = r0
            L7b:
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto Lac
                kotlin.jvm.functions.Function3 r6 = r8.f40594b
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r5)
                r0.f40598u = r5
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r4)
                r0.f40599v = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r9)
                r0.f40600w = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.l.a(r10)
                r0.f40601x = r4
                r0.f40602y = r2
                r0.f40596s = r3
                r2 = 6
                kotlin.jvm.internal.q.a(r2)
                java.lang.Object r9 = r6.invoke(r9, r10, r0)
                r10 = 7
                kotlin.jvm.internal.q.a(r10)
                if (r9 != r1) goto Lac
            Lab:
                return r1
            Lac:
                fl.g0 r9 = fl.g0.f38750a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.p.a.collect(hm.f, kl.f):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40603r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40604s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40605t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f40606u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40607v;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40606u = obj;
            this.f40607v |= Integer.MIN_VALUE;
            return g.f(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f40608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f40609b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f40610r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40611s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f40613u;

            a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40611s = obj;
                this.f40613u |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        c(f fVar, kotlin.jvm.internal.k0 k0Var) {
            this.f40608a = fVar;
            this.f40609b = k0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.f
        public final Object emit(Object obj, kl.f fVar) {
            a aVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f40613u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f40613u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj2 = aVar.f40611s;
            Object objF = ll.b.f();
            int i11 = aVar.f40613u;
            try {
                if (i11 == 0) {
                    fl.s.b(obj2);
                    f fVar2 = this.f40608a;
                    aVar.f40610r = kotlin.coroutines.jvm.internal.l.a(obj);
                    aVar.f40613u = 1;
                    if (fVar2.emit(obj, aVar) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj2);
                }
                return fl.g0.f38750a;
            } catch (Throwable th2) {
                this.f40609b.f43597a = th2;
                throw th2;
            }
        }
    }

    public static final e a(e eVar, Function3 function3) {
        return new a(eVar, function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(e eVar, f fVar, kl.f fVar2) throws Throwable {
        b bVar;
        kotlin.jvm.internal.k0 k0Var;
        if (fVar2 instanceof b) {
            bVar = (b) fVar2;
            int i10 = bVar.f40607v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f40607v = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar2);
            }
        } else {
            bVar = new b(fVar2);
        }
        Object obj = bVar.f40606u;
        Object objF = ll.b.f();
        int i11 = bVar.f40607v;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
            try {
                f cVar = new c(fVar, k0Var2);
                bVar.f40603r = kotlin.coroutines.jvm.internal.l.a(eVar);
                bVar.f40604s = kotlin.coroutines.jvm.internal.l.a(fVar);
                bVar.f40605t = k0Var2;
                bVar.f40607v = 1;
                if (eVar.collect(cVar, bVar) == objF) {
                    return objF;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                k0Var = k0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (kotlin.jvm.internal.k0) bVar.f40605t;
            try {
                fl.s.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) k0Var.f43597a;
        if (d(th, th4) || c(th, bVar.getContext())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            fl.e.a(th4, th);
            throw th4;
        }
        fl.e.a(th, th4);
        throw th;
    }

    private static final boolean c(Throwable th2, kl.j jVar) {
        z1 z1Var = (z1) jVar.get(z1.f38078x2);
        if (z1Var == null || !z1Var.isCancelled()) {
            return false;
        }
        return d(th2, z1Var.l());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && kotlin.jvm.internal.s.c(th3, th2);
    }
}
