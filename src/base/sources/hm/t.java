package hm;

import em.o0;
import em.q0;
import em.z1;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class t {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f40682r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f0 f40683s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ e f40684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ v f40685u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f40686v;

        /* JADX INFO: renamed from: hm.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0617a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40687r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ int f40688s;

            C0617a(kl.f fVar) {
                super(2, fVar);
            }

            public final Object a(int i10, kl.f fVar) {
                return ((C0617a) create(Integer.valueOf(i10), fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0617a c0617a = new C0617a(fVar);
                c0617a.f40688s = ((Number) obj).intValue();
                return c0617a;
            }

            @Override // tl.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (kl.f) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.f40688s;
                ll.b.f();
                if (this.f40687r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(i10 > 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40689r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40690s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ e f40691t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ v f40692u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Object f40693v;

            /* JADX INFO: renamed from: hm.t$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final /* synthetic */ class C0618a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f40694a;

                static {
                    int[] iArr = new int[d0.values().length];
                    try {
                        iArr[d0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[d0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[d0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f40694a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, v vVar, Object obj, kl.f fVar) {
                super(2, fVar);
                this.f40691t = eVar;
                this.f40692u = vVar;
                this.f40693v = obj;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d0 d0Var, kl.f fVar) {
                return ((b) create(d0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                b bVar = new b(this.f40691t, this.f40692u, this.f40693v, fVar);
                bVar.f40690s = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f40690s;
                Object objF = ll.b.f();
                int i10 = this.f40689r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    int i11 = C0618a.f40694a[d0Var.ordinal()];
                    if (i11 == 1) {
                        e eVar = this.f40691t;
                        v vVar = this.f40692u;
                        this.f40690s = kotlin.coroutines.jvm.internal.l.a(d0Var);
                        this.f40689r = 1;
                        if (eVar.collect(vVar, this) == objF) {
                            return objF;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj2 = this.f40693v;
                        if (obj2 == b0.f40499a) {
                            this.f40692u.j();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f40692u.b(obj2));
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, e eVar, v vVar, Object obj, kl.f fVar) {
            super(2, fVar);
            this.f40683s = f0Var;
            this.f40684t = eVar;
            this.f40685u = vVar;
            this.f40686v = obj;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new a(this.f40683s, this.f40684t, this.f40685u, this.f40686v, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (hm.g.i(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r7.f40682r
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                fl.s.b(r8)
                goto L5c
            L21:
                fl.s.b(r8)
                goto L8d
            L25:
                fl.s.b(r8)
                hm.f0 r8 = r7.f40683s
                hm.f0$a r1 = hm.f0.f40523a
                hm.f0 r6 = r1.a()
                if (r8 != r6) goto L3f
                hm.e r8 = r7.f40684t
                hm.v r1 = r7.f40685u
                r7.f40682r = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                hm.f0 r8 = r7.f40683s
                hm.f0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                hm.v r8 = r7.f40685u
                hm.i0 r8 = r8.g()
                hm.t$a$a r1 = new hm.t$a$a
                r1.<init>(r5)
                r7.f40682r = r4
                java.lang.Object r8 = hm.g.q(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                hm.e r8 = r7.f40684t
                hm.v r1 = r7.f40685u
                r7.f40682r = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                hm.f0 r8 = r7.f40683s
                hm.v r1 = r7.f40685u
                hm.i0 r1 = r1.g()
                hm.e r8 = r8.a(r1)
                hm.e r8 = hm.g.k(r8)
                hm.t$a$b r1 = new hm.t$a$b
                hm.e r3 = r7.f40684t
                hm.v r4 = r7.f40685u
                java.lang.Object r6 = r7.f40686v
                r1.<init>(r3, r4, r6, r5)
                r7.f40682r = r2
                java.lang.Object r8 = hm.g.i(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                fl.g0 r8 = fl.g0.f38750a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final i0 a(w wVar) {
        return new x(wVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    private static final e0 b(e eVar, int i10) {
        im.d dVar;
        e eVarK;
        int iD = yl.g.d(i10, gm.g.f39387y2.a()) - i10;
        if (!(eVar instanceof im.d) || (eVarK = (dVar = (im.d) eVar).k()) == null) {
            return new e0(eVar, iD, gm.a.SUSPEND, kl.k.f43531a);
        }
        int i11 = dVar.f41486b;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iD = i11;
        } else if (dVar.f41487c == gm.a.SUSPEND) {
            if (i11 == 0) {
                iD = 0;
            }
        } else if (i10 == 0) {
            iD = 1;
        } else {
            iD = 0;
        }
        return new e0(eVarK, iD, dVar.f41487c, dVar.f41485a);
    }

    private static final z1 c(o0 o0Var, kl.j jVar, e eVar, v vVar, f0 f0Var, Object obj) {
        return em.i.c(o0Var, jVar, kotlin.jvm.internal.s.c(f0Var, f0.f40523a.a()) ? q0.DEFAULT : q0.UNDISPATCHED, new a(f0Var, eVar, vVar, obj, null));
    }

    public static final i0 d(e eVar, o0 o0Var, f0 f0Var, Object obj) {
        e0 e0VarB = b(eVar, 1);
        w wVarA = k0.a(obj);
        return new x(wVarA, c(o0Var, e0VarB.f40522d, e0VarB.f40519a, wVarA, f0Var, obj));
    }
}
