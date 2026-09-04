package hm;

import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class o {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40568r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40569s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40570t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f40571u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40572v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40571u = obj;
            this.f40572v |= Integer.MIN_VALUE;
            return o.c(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f40573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3 f40574b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f40575r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f40576s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f40578u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40579v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40580w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f40581x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f40582y;

            public a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40575r = obj;
                this.f40576s |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(e eVar, Function3 function3) {
            this.f40573a = eVar;
            this.f40574b = function3;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) throws Throwable {
            a aVar;
            int i10;
            f fVar3;
            kl.f fVar4;
            Throwable th2;
            f fVar5;
            m0 m0Var;
            Function3 function3;
            im.p pVar;
            im.p pVar2;
            Object objInvoke;
            if (fVar2 instanceof a) {
                aVar = (a) fVar2;
                int i11 = aVar.f40576s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f40576s = i11 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar2);
                }
            } else {
                aVar = new a(fVar2);
            }
            Object obj = aVar.f40575r;
            Object objF = ll.b.f();
            int i12 = aVar.f40576s;
            if (i12 == 0) {
                fl.s.b(obj);
                i10 = 0;
                try {
                    e eVar = this.f40573a;
                    aVar.f40578u = kotlin.coroutines.jvm.internal.l.a(fVar);
                    aVar.f40579v = kotlin.coroutines.jvm.internal.l.a(aVar);
                    aVar.f40580w = fVar;
                    aVar.f40582y = 0;
                    aVar.f40576s = 1;
                    if (eVar.collect(fVar, aVar) != objF) {
                        fVar3 = fVar;
                        fVar4 = aVar;
                        pVar = new im.p(fVar, aVar.getContext());
                        Function3 function4 = this.f40574b;
                        aVar.f40578u = kotlin.coroutines.jvm.internal.l.a(fVar3);
                        aVar.f40579v = kotlin.coroutines.jvm.internal.l.a(fVar4);
                        aVar.f40580w = kotlin.coroutines.jvm.internal.l.a(fVar);
                        aVar.f40581x = pVar;
                        aVar.f40582y = i10;
                        aVar.f40576s = 3;
                        kotlin.jvm.internal.q.a(6);
                        objInvoke = function4.invoke(pVar, null, aVar);
                        kotlin.jvm.internal.q.a(7);
                        if (objInvoke != objF) {
                            pVar2 = pVar;
                            pVar2.releaseIntercepted();
                            return fl.g0.f38750a;
                        }
                    }
                } catch (Throwable th3) {
                    fVar3 = fVar;
                    fVar4 = aVar;
                    th2 = th3;
                    fVar5 = fVar3;
                    m0Var = new m0(th2);
                    function3 = this.f40574b;
                    aVar.f40578u = kotlin.coroutines.jvm.internal.l.a(fVar3);
                    aVar.f40579v = kotlin.coroutines.jvm.internal.l.a(fVar4);
                    aVar.f40580w = kotlin.coroutines.jvm.internal.l.a(fVar5);
                    aVar.f40581x = th2;
                    aVar.f40582y = i10;
                    aVar.f40576s = 2;
                    if (o.c(m0Var, function3, th2, aVar) == objF) {
                        throw th2;
                    }
                }
                return objF;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    Throwable th4 = (Throwable) aVar.f40581x;
                    fl.s.b(obj);
                    throw th4;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar2 = (im.p) aVar.f40581x;
                try {
                    fl.s.b(obj);
                    pVar2.releaseIntercepted();
                    return fl.g0.f38750a;
                } catch (Throwable th5) {
                    th = th5;
                    pVar2.releaseIntercepted();
                    throw th;
                }
            }
            int i13 = aVar.f40582y;
            fVar5 = (f) aVar.f40580w;
            fVar4 = (kl.f) aVar.f40579v;
            fVar3 = (f) aVar.f40578u;
            try {
                fl.s.b(obj);
                i10 = i13;
                fVar = fVar5;
                pVar = new im.p(fVar, aVar.getContext());
                try {
                    Function3 function5 = this.f40574b;
                    aVar.f40578u = kotlin.coroutines.jvm.internal.l.a(fVar3);
                    aVar.f40579v = kotlin.coroutines.jvm.internal.l.a(fVar4);
                    aVar.f40580w = kotlin.coroutines.jvm.internal.l.a(fVar);
                    aVar.f40581x = pVar;
                    aVar.f40582y = i10;
                    aVar.f40576s = 3;
                    kotlin.jvm.internal.q.a(6);
                    objInvoke = function5.invoke(pVar, null, aVar);
                    kotlin.jvm.internal.q.a(7);
                    if (objInvoke != objF) {
                        pVar2 = pVar;
                        pVar2.releaseIntercepted();
                        return fl.g0.f38750a;
                    }
                    return objF;
                } catch (Throwable th6) {
                    th = th6;
                    pVar2 = pVar;
                    pVar2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th7) {
                i10 = i13;
                th2 = th7;
                m0Var = new m0(th2);
                function3 = this.f40574b;
                aVar.f40578u = kotlin.coroutines.jvm.internal.l.a(fVar3);
                aVar.f40579v = kotlin.coroutines.jvm.internal.l.a(fVar4);
                aVar.f40580w = kotlin.coroutines.jvm.internal.l.a(fVar5);
                aVar.f40581x = th2;
                aVar.f40582y = i10;
                aVar.f40576s = 2;
                if (o.c(m0Var, function3, th2, aVar) == objF) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.o f40583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f40584b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f40585r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f40586s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f40588u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40589v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40590w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f40591x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f40592y;

            public a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40585r = obj;
                this.f40586s |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(tl.o oVar, e eVar) {
            this.f40583a = oVar;
            this.f40584b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
        
            if (r4.collect(r8, r0) == r1) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [im.p] */
        /* JADX WARN: Type inference failed for: r2v3, types: [im.p, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // hm.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(hm.f r8, kl.f r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof hm.o.c.a
                if (r0 == 0) goto L13
                r0 = r9
                hm.o$c$a r0 = (hm.o.c.a) r0
                int r1 = r0.f40586s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40586s = r1
                goto L18
            L13:
                hm.o$c$a r0 = new hm.o$c$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f40585r
                java.lang.Object r1 = ll.b.f()
                int r2 = r0.f40586s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L60
                if (r2 == r4) goto L45
                if (r2 != r3) goto L3d
                java.lang.Object r8 = r0.f40591x
                im.p r8 = (im.p) r8
                java.lang.Object r8 = r0.f40590w
                hm.f r8 = (hm.f) r8
                java.lang.Object r8 = r0.f40589v
                kl.f r8 = (kl.f) r8
                java.lang.Object r8 = r0.f40588u
                hm.f r8 = (hm.f) r8
                fl.s.b(r9)
                goto Lbc
            L3d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L45:
                int r8 = r0.f40592y
                java.lang.Object r2 = r0.f40591x
                im.p r2 = (im.p) r2
                java.lang.Object r4 = r0.f40590w
                hm.f r4 = (hm.f) r4
                java.lang.Object r5 = r0.f40589v
                kl.f r5 = (kl.f) r5
                java.lang.Object r6 = r0.f40588u
                hm.f r6 = (hm.f) r6
                fl.s.b(r9)     // Catch: java.lang.Throwable -> L5e
                r9 = r5
                r5 = r8
                r8 = r4
                goto L94
            L5e:
                r8 = move-exception
                goto Lbf
            L60:
                fl.s.b(r9)
                im.p r2 = new im.p
                kl.j r9 = r0.getContext()
                r2.<init>(r8, r9)
                tl.o r9 = r7.f40583a     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r8)     // Catch: java.lang.Throwable -> L5e
                r0.f40588u = r5     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.l.a(r0)     // Catch: java.lang.Throwable -> L5e
                r0.f40589v = r5     // Catch: java.lang.Throwable -> L5e
                r0.f40590w = r8     // Catch: java.lang.Throwable -> L5e
                r0.f40591x = r2     // Catch: java.lang.Throwable -> L5e
                r5 = 0
                r0.f40592y = r5     // Catch: java.lang.Throwable -> L5e
                r0.f40586s = r4     // Catch: java.lang.Throwable -> L5e
                r4 = 6
                kotlin.jvm.internal.q.a(r4)     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r9 = r9.invoke(r2, r0)     // Catch: java.lang.Throwable -> L5e
                r4 = 7
                kotlin.jvm.internal.q.a(r4)     // Catch: java.lang.Throwable -> L5e
                if (r9 != r1) goto L92
                goto Lbb
            L92:
                r6 = r8
                r9 = r0
            L94:
                r2.releaseIntercepted()
                hm.e r4 = r7.f40584b
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.l.a(r6)
                r0.f40588u = r6
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r9)
                r0.f40589v = r9
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r8)
                r0.f40590w = r9
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.l.a(r2)
                r0.f40591x = r9
                r0.f40592y = r5
                r0.f40586s = r3
                java.lang.Object r8 = r4.collect(r8, r0)
                if (r8 != r1) goto Lbc
            Lbb:
                return r1
            Lbc:
                fl.g0 r8 = fl.g0.f38750a
                return r8
            Lbf:
                r2.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.o.c.collect(hm.f, kl.f):java.lang.Object");
        }
    }

    public static final void b(f fVar) {
        if (fVar instanceof m0) {
            throw ((m0) fVar).f40565a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(f fVar, Function3 function3, Throwable th2, kl.f fVar2) {
        a aVar;
        if (fVar2 instanceof a) {
            aVar = (a) fVar2;
            int i10 = aVar.f40572v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f40572v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar2);
            }
        } else {
            aVar = new a(fVar2);
        }
        Object obj = aVar.f40571u;
        Object objF = ll.b.f();
        int i11 = aVar.f40572v;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                aVar.f40568r = kotlin.coroutines.jvm.internal.l.a(fVar);
                aVar.f40569s = kotlin.coroutines.jvm.internal.l.a(function3);
                aVar.f40570t = th2;
                aVar.f40572v = 1;
                if (function3.invoke(fVar, th2, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) aVar.f40570t;
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                fl.e.a(th3, th2);
            }
            throw th3;
        }
    }

    public static final e d(e eVar, Function3 function3) {
        return new b(eVar, function3);
    }

    public static final e e(e eVar, tl.o oVar) {
        return new c(oVar, eVar);
    }
}
