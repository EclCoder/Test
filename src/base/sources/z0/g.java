package z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58236a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: z0.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0889a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58237r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f58238s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f58239t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0889a(List list, kl.f fVar) {
                super(2, fVar);
                this.f58239t = list;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r rVar, kl.f fVar) {
                return ((C0889a) create(rVar, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0889a c0889a = new C0889a(this.f58239t, fVar);
                c0889a.f58238s = obj;
                return c0889a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f58237r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    r rVar = (r) this.f58238s;
                    a aVar = g.f58236a;
                    List list = this.f58239t;
                    this.f58237r = 1;
                    if (aVar.c(list, rVar, this) == objF) {
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
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58240r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f58241s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f58242t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f58244v;

            b(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f58242t = obj;
                this.f58244v |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58245r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f58246s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f58247t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f58248u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f58249v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ List f58250w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ List f58251x;

            /* JADX INFO: renamed from: z0.g$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0890a extends kotlin.coroutines.jvm.internal.m implements Function1 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f58252r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ f f58253s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0890a(f fVar, kl.f fVar2) {
                    super(1, fVar2);
                    this.f58253s = fVar;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kl.f fVar) {
                    return ((C0890a) create(fVar)).invokeSuspend(fl.g0.f38750a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kl.f create(kl.f fVar) {
                    return new C0890a(this.f58253s, fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = ll.b.f();
                    int i10 = this.f58252r;
                    if (i10 == 0) {
                        fl.s.b(obj);
                        f fVar = this.f58253s;
                        this.f58252r = 1;
                        if (fVar.b(this) == objF) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, kl.f fVar) {
                super(2, fVar);
                this.f58250w = list;
                this.f58251x = list2;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, kl.f fVar) {
                return ((c) create(obj, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                c cVar = new c(this.f58250w, this.f58251x, fVar);
                cVar.f58249v = obj;
                return cVar;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004c  */
            /* JADX WARN: Code duplicated, block: B:16:0x0063  */
            /* JADX WARN: Code duplicated, block: B:19:0x0070  */
            /* JADX WARN: Code duplicated, block: B:22:0x008a  */
            /* JADX WARN: Code duplicated, block: B:23:0x008c  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ll.b.f()
                    int r1 = r9.f58248u
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f58245r
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f58249v
                    java.util.List r4 = (java.util.List) r4
                    fl.s.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f58247t
                    java.lang.Object r4 = r9.f58246s
                    z0.f r4 = (z0.f) r4
                    java.lang.Object r5 = r9.f58245r
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f58249v
                    java.util.List r6 = (java.util.List) r6
                    fl.s.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    fl.s.b(r10)
                    java.lang.Object r10 = r9.f58249v
                    java.util.List r1 = r9.f58250w
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List r4 = r9.f58251x
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    z0.f r5 = (z0.f) r5
                    r9.f58249v = r4
                    r9.f58245r = r1
                    r9.f58246s = r5
                    r9.f58247t = r10
                    r9.f58248u = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    z0.g$a$c$a r10 = new z0.g$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f58249v = r4
                    r9.f58245r = r5
                    r9.f58246s = r7
                    r9.f58247t = r7
                    r9.f58248u = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.g.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006b->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        public final Object c(List list, r rVar, kl.f fVar) throws Throwable {
            b bVar;
            List list2;
            kotlin.jvm.internal.k0 k0Var;
            Iterator it;
            Throwable th2;
            Function1 function1;
            if (fVar instanceof b) {
                bVar = (b) fVar;
                int i10 = bVar.f58244v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f58244v = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(fVar);
                }
            } else {
                bVar = new b(fVar);
            }
            Object obj = bVar.f58242t;
            Object objF = ll.b.f();
            int i11 = bVar.f58244v;
            if (i11 == 0) {
                fl.s.b(obj);
                ArrayList arrayList = new ArrayList();
                tl.o cVar = new c(list, arrayList, null);
                bVar.f58240r = arrayList;
                bVar.f58244v = 1;
                if (rVar.a(cVar, bVar) != objF) {
                    list2 = arrayList;
                }
                return objF;
            }
            if (i11 == 1) {
                list2 = (List) bVar.f58240r;
                fl.s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f58241s;
                k0Var = (kotlin.jvm.internal.k0) bVar.f58240r;
                try {
                    fl.s.b(obj);
                } catch (Throwable th3) {
                    Object obj2 = k0Var.f43597a;
                    if (obj2 == null) {
                        k0Var.f43597a = th3;
                    } else {
                        kotlin.jvm.internal.s.e(obj2);
                        fl.e.a((Throwable) obj2, th3);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar.f58240r = k0Var;
                bVar.f58241s = it;
                bVar.f58244v = 2;
                if (function1.invoke(bVar) == objF) {
                    return objF;
                }
            }
            th2 = (Throwable) k0Var.f43597a;
            if (th2 == null) {
                return fl.g0.f38750a;
            }
            throw th2;
            k0Var = new kotlin.jvm.internal.k0();
            it = list2.iterator();
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar.f58240r = k0Var;
                bVar.f58241s = it;
                bVar.f58244v = 2;
                if (function1.invoke(bVar) == objF) {
                    return objF;
                }
            }
            th2 = (Throwable) k0Var.f43597a;
            if (th2 == null) {
                return fl.g0.f38750a;
            }
            throw th2;
        }

        public final tl.o b(List migrations) {
            kotlin.jvm.internal.s.h(migrations, "migrations");
            return new C0889a(migrations, null);
        }

        private a() {
        }
    }
}
