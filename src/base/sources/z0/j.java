package z0;

import androidx.datastore.core.CorruptionException;
import em.z1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j implements z0.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f58271m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f58272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0.d f58273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final em.o0 f58274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hm.e f58275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nm.a f58276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1 f58278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0.k f58279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f58280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fl.k f58281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fl.k f58282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f0 f58283l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f58284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f58285d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58286r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f58287s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f58289u;

            a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f58287s = obj;
                this.f58289u |= Integer.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* JADX INFO: renamed from: z0.j$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0891b extends kotlin.coroutines.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58290r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f58291s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f58292t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f58293u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f58294v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f58295w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f58296x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ j f58297y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ b f58298z;

            /* JADX INFO: renamed from: z0.j$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class a implements z0.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ nm.a f58299a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.g0 f58300b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.k0 f58301c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ j f58302d;

                /* JADX INFO: renamed from: z0.j$b$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
                static final class C0892a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f58303r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    Object f58304s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    Object f58305t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    Object f58306u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    Object f58307v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    /* synthetic */ Object f58308w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    int f58310y;

                    C0892a(kl.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f58308w = obj;
                        this.f58310y |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(nm.a aVar, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.k0 k0Var, j jVar) {
                    this.f58299a = aVar;
                    this.f58300b = g0Var;
                    this.f58301c = k0Var;
                    this.f58302d = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // z0.r
                public Object a(tl.o oVar, kl.f fVar) throws Throwable {
                    C0892a c0892a;
                    nm.a aVar;
                    j jVar;
                    kotlin.jvm.internal.g0 g0Var;
                    kotlin.jvm.internal.k0 k0Var;
                    nm.a aVar2;
                    nm.a aVar3;
                    j jVar2;
                    Object obj;
                    kotlin.jvm.internal.k0 k0Var2;
                    if (fVar instanceof C0892a) {
                        c0892a = (C0892a) fVar;
                        int i10 = c0892a.f58310y;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0892a.f58310y = i10 - Integer.MIN_VALUE;
                        } else {
                            c0892a = new C0892a(fVar);
                        }
                    } else {
                        c0892a = new C0892a(fVar);
                    }
                    Object obj2 = c0892a.f58308w;
                    Object objF = ll.b.f();
                    int i11 = c0892a.f58310y;
                    try {
                        if (i11 == 0) {
                            fl.s.b(obj2);
                            aVar = this.f58299a;
                            kotlin.jvm.internal.g0 g0Var2 = this.f58300b;
                            kotlin.jvm.internal.k0 k0Var3 = this.f58301c;
                            jVar = this.f58302d;
                            c0892a.f58303r = oVar;
                            c0892a.f58304s = aVar;
                            c0892a.f58305t = g0Var2;
                            c0892a.f58306u = k0Var3;
                            c0892a.f58307v = jVar;
                            c0892a.f58310y = 1;
                            if (aVar.e(null, c0892a) != objF) {
                                g0Var = g0Var2;
                                k0Var = k0Var3;
                            }
                            return objF;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0892a.f58305t;
                                k0Var2 = (kotlin.jvm.internal.k0) c0892a.f58304s;
                                aVar2 = (nm.a) c0892a.f58303r;
                                try {
                                    fl.s.b(obj2);
                                    k0Var2.f43597a = obj;
                                    k0Var = k0Var2;
                                    Object obj3 = k0Var.f43597a;
                                    aVar2.f(null);
                                    return obj3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.f(null);
                                    throw th;
                                }
                            }
                            jVar2 = (j) c0892a.f58305t;
                            k0Var = (kotlin.jvm.internal.k0) c0892a.f58304s;
                            aVar3 = (nm.a) c0892a.f58303r;
                            try {
                                fl.s.b(obj2);
                                if (!kotlin.jvm.internal.s.c(obj2, k0Var.f43597a)) {
                                    c0892a.f58303r = aVar3;
                                    c0892a.f58304s = k0Var;
                                    c0892a.f58305t = obj2;
                                    c0892a.f58310y = 3;
                                    if (jVar2.B(obj2, false, c0892a) != objF) {
                                        obj = obj2;
                                        k0Var2 = k0Var;
                                        aVar2 = aVar3;
                                        k0Var2.f43597a = obj;
                                        k0Var = k0Var2;
                                    }
                                    return objF;
                                }
                                aVar2 = aVar3;
                                Object obj4 = k0Var.f43597a;
                                aVar2.f(null);
                                return obj4;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar3;
                                aVar2.f(null);
                                throw th;
                            }
                        }
                        j jVar3 = (j) c0892a.f58307v;
                        k0Var = (kotlin.jvm.internal.k0) c0892a.f58306u;
                        g0Var = (kotlin.jvm.internal.g0) c0892a.f58305t;
                        nm.a aVar4 = (nm.a) c0892a.f58304s;
                        tl.o oVar2 = (tl.o) c0892a.f58303r;
                        fl.s.b(obj2);
                        jVar = jVar3;
                        oVar = oVar2;
                        aVar = aVar4;
                        if (g0Var.f43588a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj5 = k0Var.f43597a;
                        c0892a.f58303r = aVar;
                        c0892a.f58304s = k0Var;
                        c0892a.f58305t = jVar;
                        c0892a.f58306u = null;
                        c0892a.f58307v = null;
                        c0892a.f58310y = 2;
                        Object objInvoke = oVar.invoke(obj5, c0892a);
                        if (objInvoke != objF) {
                            aVar3 = aVar;
                            obj2 = objInvoke;
                            jVar2 = jVar;
                            if (!kotlin.jvm.internal.s.c(obj2, k0Var.f43597a)) {
                                c0892a.f58303r = aVar3;
                                c0892a.f58304s = k0Var;
                                c0892a.f58305t = obj2;
                                c0892a.f58310y = 3;
                                if (jVar2.B(obj2, false, c0892a) != objF) {
                                    obj = obj2;
                                    k0Var2 = k0Var;
                                    aVar2 = aVar3;
                                    k0Var2.f43597a = obj;
                                    k0Var = k0Var2;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            Object obj6 = k0Var.f43597a;
                            aVar2.f(null);
                            return obj6;
                        }
                        return objF;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                        aVar2.f(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0891b(j jVar, b bVar, kl.f fVar) {
                super(1, fVar);
                this.f58297y = jVar;
                this.f58298z = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kl.f fVar) {
                return ((C0891b) create(fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(kl.f fVar) {
                return new C0891b(this.f58297y, this.f58298z, fVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws CorruptionException {
                nm.a aVarB;
                kotlin.jvm.internal.g0 g0Var;
                kotlin.jvm.internal.k0 k0Var;
                kotlin.jvm.internal.k0 k0Var2;
                kotlin.jvm.internal.g0 g0Var2;
                nm.a aVar;
                Iterator it;
                nm.a aVar2;
                kotlin.jvm.internal.g0 g0Var3;
                kotlin.jvm.internal.k0 k0Var3;
                a aVar3;
                kotlin.jvm.internal.k0 k0Var4;
                tl.o oVar;
                Object obj2;
                int iHashCode;
                int i10;
                Object objF = ll.b.f();
                int i11 = this.f58296x;
                if (i11 == 0) {
                    fl.s.b(obj);
                    aVarB = nm.g.b(false, 1, null);
                    g0Var = new kotlin.jvm.internal.g0();
                    k0Var = new kotlin.jvm.internal.k0();
                    j jVar = this.f58297y;
                    this.f58290r = aVarB;
                    this.f58291s = g0Var;
                    this.f58292t = k0Var;
                    this.f58293u = k0Var;
                    this.f58296x = 1;
                    obj = jVar.y(true, this);
                    if (obj != objF) {
                        k0Var2 = k0Var;
                    }
                    return objF;
                }
                if (i11 == 1) {
                    k0Var = (kotlin.jvm.internal.k0) this.f58293u;
                    k0Var2 = (kotlin.jvm.internal.k0) this.f58292t;
                    g0Var = (kotlin.jvm.internal.g0) this.f58291s;
                    aVarB = (nm.a) this.f58290r;
                    fl.s.b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f58294v;
                        aVar3 = (a) this.f58293u;
                        k0Var3 = (kotlin.jvm.internal.k0) this.f58292t;
                        g0Var3 = (kotlin.jvm.internal.g0) this.f58291s;
                        aVar2 = (nm.a) this.f58290r;
                        fl.s.b(obj);
                        while (it.hasNext()) {
                            oVar = (tl.o) it.next();
                            this.f58290r = aVar2;
                            this.f58291s = g0Var3;
                            this.f58292t = k0Var3;
                            this.f58293u = aVar3;
                            this.f58294v = it;
                            this.f58296x = 2;
                            if (oVar.invoke(aVar3, this) == objF) {
                                return objF;
                            }
                        }
                        k0Var2 = k0Var3;
                        g0Var2 = g0Var3;
                        aVar = aVar2;
                        this.f58298z.f58284c = null;
                        this.f58290r = g0Var2;
                        this.f58291s = k0Var2;
                        this.f58292t = aVar;
                        this.f58293u = null;
                        this.f58294v = null;
                        this.f58296x = 3;
                        if (aVar.e(null, this) != objF) {
                            k0Var4 = k0Var2;
                            g0Var2.f43588a = true;
                            fl.g0 g0Var4 = fl.g0.f38750a;
                            aVar.f(null);
                            obj2 = k0Var4.f43597a;
                            if (obj2 != null) {
                            }
                            z0.s sVarR = this.f58297y.r();
                            this.f58290r = obj2;
                            this.f58291s = null;
                            this.f58292t = null;
                            this.f58295w = iHashCode;
                            this.f58296x = 4;
                            obj = sVarR.d(this);
                            if (obj != objF) {
                                i10 = iHashCode;
                            }
                        }
                        return objF;
                    }
                    if (i11 == 3) {
                        aVar = (nm.a) this.f58292t;
                        k0Var4 = (kotlin.jvm.internal.k0) this.f58291s;
                        g0Var2 = (kotlin.jvm.internal.g0) this.f58290r;
                        fl.s.b(obj);
                        try {
                            g0Var2.f43588a = true;
                            fl.g0 g0Var5 = fl.g0.f38750a;
                            aVar.f(null);
                            obj2 = k0Var4.f43597a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            z0.s sVarR2 = this.f58297y.r();
                            this.f58290r = obj2;
                            this.f58291s = null;
                            this.f58292t = null;
                            this.f58295w = iHashCode;
                            this.f58296x = 4;
                            obj = sVarR2.d(this);
                            if (obj != objF) {
                                i10 = iHashCode;
                            }
                            return objF;
                        } catch (Throwable th2) {
                            aVar.f(null);
                            throw th2;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f58295w;
                    obj2 = this.f58290r;
                    fl.s.b(obj);
                }
                return new z0.e(obj2, i10, ((Number) obj).intValue());
                k0Var.f43597a = ((z0.e) obj).c();
                a aVar4 = new a(aVarB, g0Var, k0Var2, this.f58297y);
                List list = this.f58298z.f58284c;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = aVarB;
                    g0Var3 = g0Var;
                    k0Var3 = k0Var2;
                    aVar3 = aVar4;
                    while (it.hasNext()) {
                        oVar = (tl.o) it.next();
                        this.f58290r = aVar2;
                        this.f58291s = g0Var3;
                        this.f58292t = k0Var3;
                        this.f58293u = aVar3;
                        this.f58294v = it;
                        this.f58296x = 2;
                        if (oVar.invoke(aVar3, this) == objF) {
                            return objF;
                        }
                    }
                    k0Var2 = k0Var3;
                    g0Var2 = g0Var3;
                    aVar = aVar2;
                } else {
                    g0Var2 = g0Var;
                    aVar = aVarB;
                }
                this.f58298z.f58284c = null;
                this.f58290r = g0Var2;
                this.f58291s = k0Var2;
                this.f58292t = aVar;
                this.f58293u = null;
                this.f58294v = null;
                this.f58296x = 3;
                if (aVar.e(null, this) != objF) {
                    k0Var4 = k0Var2;
                    g0Var2.f43588a = true;
                    fl.g0 g0Var6 = fl.g0.f38750a;
                    aVar.f(null);
                    obj2 = k0Var4.f43597a;
                    if (obj2 != null) {
                    }
                    z0.s sVarR3 = this.f58297y.r();
                    this.f58290r = obj2;
                    this.f58291s = null;
                    this.f58292t = null;
                    this.f58295w = iHashCode;
                    this.f58296x = 4;
                    obj = sVarR3.d(this);
                    if (obj != objF) {
                        i10 = iHashCode;
                        return new z0.e(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objF;
            }
        }

        public b(j jVar, List initTasksList) {
            kotlin.jvm.internal.s.h(initTasksList, "initTasksList");
            this.f58285d = jVar;
            this.f58284c = gl.r.I0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z0.c0
        protected Object b(kl.f fVar) throws CorruptionException {
            a aVar;
            b bVar;
            z0.e eVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f58289u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f58289u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object objY = aVar.f58287s;
            Object objF = ll.b.f();
            int i11 = aVar.f58289u;
            if (i11 == 0) {
                fl.s.b(objY);
                List list = this.f58284c;
                if (list != null) {
                    kotlin.jvm.internal.s.e(list);
                    if (list.isEmpty()) {
                        j jVar = this.f58285d;
                        aVar.f58286r = this;
                        aVar.f58289u = 1;
                        objY = jVar.y(false, aVar);
                        if (objY != objF) {
                            bVar = this;
                            eVar = (z0.e) objY;
                        }
                    } else {
                        z0.s sVarR = this.f58285d.r();
                        C0891b c0891b = new C0891b(this.f58285d, this, null);
                        aVar.f58286r = this;
                        aVar.f58289u = 2;
                        objY = sVarR.c(c0891b, aVar);
                        if (objY != objF) {
                            bVar = this;
                            eVar = (z0.e) objY;
                        }
                    }
                } else {
                    j jVar2 = this.f58285d;
                    aVar.f58286r = this;
                    aVar.f58289u = 1;
                    objY = jVar2.y(false, aVar);
                    if (objY != objF) {
                        bVar = this;
                        eVar = (z0.e) objY;
                    }
                }
                return objF;
            }
            if (i11 == 1) {
                bVar = (b) aVar.f58286r;
                fl.s.b(objY);
                eVar = (z0.e) objY;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f58286r;
                fl.s.b(objY);
                eVar = (z0.e) objY;
            }
            bVar.f58285d.f58279h.c(eVar);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.jvm.internal.t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final z0.s invoke() {
            return j.this.s().e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58312r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58313s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f58314t;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58316r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f58317s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, kl.f fVar) {
                super(2, fVar);
                this.f58317s = jVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hm.f fVar, kl.f fVar2) {
                return ((a) create(fVar, fVar2)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f58317s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f58316r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    j jVar = this.f58317s;
                    this.f58316r = 1;
                    if (jVar.u(this) == objF) {
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
        static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58318r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f58319s;

            b(kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h0 h0Var, kl.f fVar) {
                return ((b) create(h0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                b bVar = new b(fVar);
                bVar.f58319s = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f58318r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((h0) this.f58319s) instanceof z0.q));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58320r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f58321s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ h0 f58322t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h0 h0Var, kl.f fVar) {
                super(2, fVar);
                this.f58322t = h0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h0 h0Var, kl.f fVar) {
                return ((c) create(h0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                c cVar = new c(this.f58322t, fVar);
                cVar.f58321s = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f58320r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                h0 h0Var = (h0) this.f58321s;
                return kotlin.coroutines.jvm.internal.b.a((h0Var instanceof z0.e) && h0Var.a() <= this.f58322t.a());
            }
        }

        /* JADX INFO: renamed from: z0.j$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0893d extends kotlin.coroutines.jvm.internal.m implements Function3 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58323r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f58324s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0893d(j jVar, kl.f fVar) {
                super(3, fVar);
                this.f58324s = jVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hm.f fVar, Throwable th2, kl.f fVar2) {
                return new C0893d(this.f58324s, fVar2).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f58323r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    j jVar = this.f58324s;
                    this.f58323r = 1;
                    if (jVar.p(this) == objF) {
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
        public static final class e implements hm.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ hm.e f58325a;

            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class a implements hm.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ hm.f f58326a;

                /* JADX INFO: renamed from: z0.j$d$e$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
                public static final class C0894a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f58327r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f58328s;

                    public C0894a(kl.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f58327r = obj;
                        this.f58328s |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(hm.f fVar) {
                    this.f58326a = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // hm.f
                public final Object emit(Object obj, kl.f fVar) throws Throwable {
                    C0894a c0894a;
                    if (fVar instanceof C0894a) {
                        c0894a = (C0894a) fVar;
                        int i10 = c0894a.f58328s;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0894a.f58328s = i10 - Integer.MIN_VALUE;
                        } else {
                            c0894a = new C0894a(fVar);
                        }
                    } else {
                        c0894a = new C0894a(fVar);
                    }
                    Object obj2 = c0894a.f58327r;
                    Object objF = ll.b.f();
                    int i11 = c0894a.f58328s;
                    if (i11 == 0) {
                        fl.s.b(obj2);
                        hm.f fVar2 = this.f58326a;
                        h0 h0Var = (h0) obj;
                        if (h0Var instanceof a0) {
                            throw ((a0) h0Var).b();
                        }
                        if (!(h0Var instanceof z0.e)) {
                            if (h0Var instanceof z0.q ? true : h0Var instanceof l0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objC = ((z0.e) h0Var).c();
                        c0894a.f58328s = 1;
                        if (fVar2.emit(objC, c0894a) == objF) {
                            return objF;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fl.s.b(obj2);
                    }
                    return fl.g0.f38750a;
                }
            }

            public e(hm.e eVar) {
                this.f58325a = eVar;
            }

            @Override // hm.e
            public Object collect(hm.f fVar, kl.f fVar2) {
                Object objCollect = this.f58325a.collect(new a(fVar), fVar2);
                return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
            }
        }

        d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hm.f fVar, kl.f fVar2) {
            return ((d) create(fVar, fVar2)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            d dVar = j.this.new d(fVar);
            dVar.f58314t = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (hm.g.n(r1, r9, r8) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58330r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58331s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58332t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58334v;

        e(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58332t = obj;
            this.f58334v |= Integer.MIN_VALUE;
            return j.this.p(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.m implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58335r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1 f58336s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, kl.f fVar) {
            super(1, fVar);
            this.f58336s = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kl.f fVar) {
            return ((f) create(fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(kl.f fVar) {
            return new f(this.f58336s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f58335r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            Function1 function1 = this.f58336s;
            this.f58335r = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objF ? objF : objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58337r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58338s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f58339t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f58340u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f58342w;

        g(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58340u = obj;
            this.f58342w |= Integer.MIN_VALUE;
            return j.this.t(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58343r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58344s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58345t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58347v;

        h(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58345t = obj;
            this.f58347v |= Integer.MIN_VALUE;
            return j.this.u(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58348r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f58350a;

            a(j jVar) {
                this.f58350a = jVar;
            }

            @Override // hm.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(fl.g0 g0Var, kl.f fVar) {
                if (this.f58350a.f58279h.a() instanceof z0.q) {
                    return fl.g0.f38750a;
                }
                Object objW = this.f58350a.w(true, fVar);
                return objW == ll.b.f() ? objW : fl.g0.f38750a;
            }
        }

        i(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new i(fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r4.f58348r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                fl.s.b(r5)
                goto L30
            L1e:
                fl.s.b(r5)
                z0.j r5 = z0.j.this
                z0.j$b r5 = z0.j.e(r5)
                r4.f58348r = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                z0.j r5 = z0.j.this
                z0.s r5 = z0.j.c(r5)
                hm.e r5 = r5.b()
                hm.e r5 = hm.g.j(r5)
                z0.j$i$a r1 = new z0.j$i$a
                z0.j r3 = z0.j.this
                r1.<init>(r3)
                r4.f58348r = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                fl.g0 r5 = fl.g0.f38750a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z0.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0895j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58351r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58352s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58353t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58355v;

        C0895j(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58353t = obj;
            this.f58355v |= Integer.MIN_VALUE;
            return j.this.v(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58356r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58357s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f58358t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f58359u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f58361w;

        k(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58359u = obj;
            this.f58361w |= Integer.MIN_VALUE;
            return j.this.w(false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class l extends kotlin.coroutines.jvm.internal.m implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58362r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58363s;

        l(kl.f fVar) {
            super(1, fVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kl.f fVar) {
            return ((l) create(fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(kl.f fVar) {
            return j.this.new l(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            h0 a0Var;
            Object objF = ll.b.f();
            int i10 = this.f58363s;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    j jVar = j.this;
                    this.f58363s = 1;
                    obj = jVar.y(true, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f58362r;
                        fl.s.b(obj);
                        a0Var = new a0(th2, ((Number) obj).intValue());
                        return fl.w.a(a0Var, kotlin.coroutines.jvm.internal.b.a(true));
                    }
                    fl.s.b(obj);
                }
                a0Var = (h0) obj;
            } catch (Throwable th3) {
                z0.s sVarR = j.this.r();
                this.f58362r = th3;
                this.f58363s = 2;
                Object objD = sVarR.d(this);
                if (objD != objF) {
                    th2 = th3;
                    obj = objD;
                }
                return objF;
            }
            return fl.w.a(a0Var, kotlin.coroutines.jvm.internal.b.a(true));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class m extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f58367t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f58369v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, kl.f fVar) {
            super(2, fVar);
            this.f58369v = i10;
        }

        public final Object a(boolean z10, kl.f fVar) {
            return ((m) create(Boolean.valueOf(z10), fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            m mVar = j.this.new m(this.f58369v, fVar);
            mVar.f58367t = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (kl.f) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r10;
            ?? r11;
            h0 h0Var;
            ?? r12;
            Object objF = ll.b.f();
            ?? r13 = this.f58366s;
            try {
                if (r13 == 0) {
                    fl.s.b(obj);
                    boolean z10 = this.f58367t;
                    j jVar = j.this;
                    this.f58367t = z10;
                    this.f58366s = 1;
                    obj = jVar.y(z10, this);
                    r13 = z10;
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z11 = this.f58367t;
                        th2 = (Throwable) this.f58365r;
                        fl.s.b(obj);
                        r11 = z11;
                        iIntValue = ((Number) obj).intValue();
                        r10 = r11;
                        a0 a0Var = new a0(th2, iIntValue);
                        r12 = r10;
                        h0Var = a0Var;
                        return fl.w.a(h0Var, kotlin.coroutines.jvm.internal.b.a(r12));
                    }
                    boolean z12 = this.f58367t;
                    fl.s.b(obj);
                    r13 = z12;
                }
                h0Var = (h0) obj;
                r12 = r13;
            } catch (Throwable th3) {
                if (r13 != 0) {
                    z0.s sVarR = j.this.r();
                    this.f58365r = th3;
                    this.f58367t = r13;
                    this.f58366s = 2;
                    Object objD = sVarR.d(this);
                    if (objD != objF) {
                        r11 = r13;
                        th2 = th3;
                        obj = objD;
                    }
                    return objF;
                }
                ?? r14 = r13;
                th2 = th3;
                iIntValue = this.f58369v;
                r10 = r14 == true ? 1 : 0;
            }
            return fl.w.a(h0Var, kotlin.coroutines.jvm.internal.b.a(r12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58370r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58371s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f58372t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f58373u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f58374v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f58375w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f58376x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f58378z;

        n(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58376x = obj;
            this.f58378z |= Integer.MIN_VALUE;
            return j.this.y(false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class o extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58379r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58380s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f58381t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f58383v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, kl.f fVar) {
            super(2, fVar);
            this.f58383v = i10;
        }

        public final Object a(boolean z10, kl.f fVar) {
            return ((o) create(Boolean.valueOf(z10), fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            o oVar = j.this.new o(this.f58383v, fVar);
            oVar.f58381t = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (kl.f) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objF = ll.b.f();
            int i10 = this.f58380s;
            if (i10 == 0) {
                fl.s.b(obj);
                z10 = this.f58381t;
                j jVar = j.this;
                this.f58381t = z10;
                this.f58380s = 1;
                obj = jVar.x(this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                z10 = this.f58381t;
                fl.s.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f58379r;
                fl.s.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new z0.e(obj2, iHashCode, iIntValue);
            if (z10) {
                z0.s sVarR = j.this.r();
                this.f58379r = obj;
                this.f58380s = 2;
                Object objD = sVarR.d(this);
                if (objD != objF) {
                    obj2 = obj;
                    obj = objD;
                    iIntValue = ((Number) obj).intValue();
                }
                return objF;
            }
            obj2 = obj;
            iIntValue = this.f58383v;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new z0.e(obj2, iHashCode, iIntValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class p extends kotlin.coroutines.jvm.internal.m implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58384r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58385s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f58386t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ j f58387u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i0 f58388v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.jvm.internal.k0 k0Var, j jVar, kotlin.jvm.internal.i0 i0Var, kl.f fVar) {
            super(1, fVar);
            this.f58386t = k0Var;
            this.f58387u = jVar;
            this.f58388v = i0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kl.f fVar) {
            return ((p) create(fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(kl.f fVar) {
            return new p(this.f58386t, this.f58387u, this.f58388v, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.i0 i0Var;
            kotlin.jvm.internal.k0 k0Var;
            kotlin.jvm.internal.i0 i0Var2;
            Object objF = ll.b.f();
            int i10 = this.f58385s;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    k0Var = this.f58386t;
                    j jVar = this.f58387u;
                    this.f58384r = k0Var;
                    this.f58385s = 1;
                    obj = jVar.x(this);
                    if (obj == objF) {
                    }
                    return objF;
                }
                if (i10 == 1) {
                    k0Var = (kotlin.jvm.internal.k0) this.f58384r;
                    fl.s.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i0Var = (kotlin.jvm.internal.i0) this.f58384r;
                        fl.s.b(obj);
                        i0Var.f43593a = ((Number) obj).intValue();
                        return fl.g0.f38750a;
                    }
                    i0Var2 = (kotlin.jvm.internal.i0) this.f58384r;
                    fl.s.b(obj);
                }
                i0Var2.f43593a = ((Number) obj).intValue();
                return fl.g0.f38750a;
                k0Var.f43597a = obj;
                i0Var2 = this.f58388v;
                z0.s sVarR = this.f58387u.r();
                this.f58384r = i0Var2;
                this.f58385s = 2;
                obj = sVarR.d(this);
                if (obj == objF) {
                    return objF;
                }
                i0Var2.f43593a = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                kotlin.jvm.internal.i0 i0Var3 = this.f58388v;
                j jVar2 = this.f58387u;
                Object obj2 = this.f58386t.f43597a;
                this.f58384r = i0Var3;
                this.f58385s = 3;
                Object objB = jVar2.B(obj2, true, this);
                if (objB != objF) {
                    i0Var = i0Var3;
                    obj = objB;
                }
                return objF;
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class q extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58389r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f58391t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, kl.f fVar) {
            super(2, fVar);
            this.f58391t = z10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((q) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new q(this.f58391t, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r4.f58389r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                fl.s.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                fl.s.b(r5)
                z0.j r5 = z0.j.this
                z0.k r5 = z0.j.d(r5)
                z0.h0 r5 = r5.a()
                boolean r5 = r5 instanceof z0.q
                if (r5 == 0) goto L3c
                z0.j r5 = z0.j.this
                z0.k r5 = z0.j.d(r5)
                z0.h0 r5 = r5.a()
                return r5
            L3c:
                z0.j r5 = z0.j.this     // Catch: java.lang.Throwable -> L1e
                r4.f58389r = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = z0.j.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                z0.j r5 = z0.j.this
                boolean r1 = r4.f58391t
                r4.f58389r = r2
                java.lang.Object r5 = z0.j.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                z0.h0 r5 = (z0.h0) r5
                return r5
            L57:
                z0.a0 r0 = new z0.a0
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class r extends kotlin.jvm.internal.t implements tl.a {
        r() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            return j.this.f58272a.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class s extends kotlin.coroutines.jvm.internal.m implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58393r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58394s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ kl.j f58396u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ tl.o f58397v;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58398r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ tl.o f58399s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ z0.e f58400t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(tl.o oVar, z0.e eVar, kl.f fVar) {
                super(2, fVar);
                this.f58399s = oVar;
                this.f58400t = eVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f58399s, this.f58400t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f58398r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                    return obj;
                }
                fl.s.b(obj);
                tl.o oVar = this.f58399s;
                Object objC = this.f58400t.c();
                this.f58398r = 1;
                Object objInvoke = oVar.invoke(objC, this);
                return objInvoke == objF ? objF : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(kl.j jVar, tl.o oVar, kl.f fVar) {
            super(1, fVar);
            this.f58396u = jVar;
            this.f58397v = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kl.f fVar) {
            return ((s) create(fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(kl.f fVar) {
            return j.this.new s(this.f58396u, this.f58397v, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws CorruptionException {
            z0.e eVar;
            j jVar;
            Object objF = ll.b.f();
            int i10 = this.f58394s;
            if (i10 == 0) {
                fl.s.b(obj);
                j jVar2 = j.this;
                this.f58394s = 1;
                obj = jVar2.y(true, this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                fl.s.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f58393r;
                    fl.s.b(obj);
                    return obj2;
                }
                eVar = (z0.e) this.f58393r;
                fl.s.b(obj);
            }
            eVar.b();
            if (!kotlin.jvm.internal.s.c(eVar.c(), obj)) {
                jVar = j.this;
                this.f58393r = obj;
                this.f58394s = 3;
                if (jVar.B(obj, true, this) == objF) {
                    return objF;
                }
            }
            return obj;
            eVar = (z0.e) obj;
            kl.j jVar3 = this.f58396u;
            a aVar = new a(this.f58397v, eVar, null);
            this.f58393r = eVar;
            this.f58394s = 2;
            obj = em.i.j(jVar3, aVar, this);
            if (obj != objF) {
                eVar.b();
                if (!kotlin.jvm.internal.s.c(eVar.c(), obj)) {
                    jVar = j.this;
                    this.f58393r = obj;
                    this.f58394s = 3;
                    if (jVar.B(obj, true, this) == objF) {
                    }
                }
                return obj;
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class t extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58401r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f58402s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ tl.o f58404u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(tl.o oVar, kl.f fVar) {
            super(2, fVar);
            this.f58404u = oVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((t) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            t tVar = j.this.new t(this.f58404u, fVar);
            tVar.f58402s = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f58401r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f58402s;
            em.y yVarC = em.a0.c(null, 1, null);
            j.this.f58283l.e(new z0.v.a(this.f58404u, yVarC, j.this.f58279h.a(), o0Var.i0()));
            this.f58401r = 1;
            Object objN0 = yVarC.N0(this);
            return objN0 == objF ? objF : objN0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class u extends kotlin.jvm.internal.t implements Function1 {
        u() {
            super(1);
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                j.this.f58279h.c(new z0.q(th2));
            }
            if (j.this.f58281j.isInitialized()) {
                j.this.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class v extends kotlin.jvm.internal.t implements tl.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f58406a = new v();

        v() {
            super(2);
        }

        public final void a(z0.v.a msg, Throwable th2) {
            kotlin.jvm.internal.s.h(msg, "msg");
            em.y yVarA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            yVarA.r(th2);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((z0.v.a) obj, (Throwable) obj2);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class w extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58407r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f58408s;

        w(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z0.v.a aVar, kl.f fVar) {
            return ((w) create(aVar, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            w wVar = j.this.new w(fVar);
            wVar.f58408s = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f58407r;
            if (i10 == 0) {
                fl.s.b(obj);
                z0.v.a aVar = (z0.v.a) this.f58408s;
                j jVar = j.this;
                this.f58407r = 1;
                if (jVar.t(aVar, this) == objF) {
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
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58410r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f58411s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f58413u;

        x(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58411s = obj;
            this.f58413u |= Integer.MIN_VALUE;
            return j.this.B(null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class y extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58414r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58415s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f58416t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i0 f58417u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ j f58418v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f58419w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f58420x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(kotlin.jvm.internal.i0 i0Var, j jVar, Object obj, boolean z10, kl.f fVar) {
            super(2, fVar);
            this.f58417u = i0Var;
            this.f58418v = jVar;
            this.f58419w = obj;
            this.f58420x = z10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((y) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            y yVar = new y(this.f58417u, this.f58418v, this.f58419w, this.f58420x, fVar);
            yVar.f58416t = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.c(r7, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r6.f58415s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f58414r
                kotlin.jvm.internal.i0 r1 = (kotlin.jvm.internal.i0) r1
                java.lang.Object r3 = r6.f58416t
                z0.o0 r3 = (z0.o0) r3
                fl.s.b(r7)
                goto L45
            L26:
                fl.s.b(r7)
                java.lang.Object r7 = r6.f58416t
                z0.o0 r7 = (z0.o0) r7
                kotlin.jvm.internal.i0 r1 = r6.f58417u
                z0.j r4 = r6.f58418v
                z0.s r4 = z0.j.c(r4)
                r6.f58416t = r7
                r6.f58414r = r1
                r6.f58415s = r3
                java.lang.Object r3 = r4.a(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f43593a = r7
                java.lang.Object r7 = r6.f58419w
                r1 = 0
                r6.f58416t = r1
                r6.f58414r = r1
                r6.f58415s = r2
                java.lang.Object r7 = r3.c(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f58420x
                if (r7 == 0) goto L7d
                z0.j r7 = r6.f58418v
                z0.k r7 = z0.j.d(r7)
                z0.e r0 = new z0.e
                java.lang.Object r1 = r6.f58419w
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.i0 r3 = r6.f58417u
                int r3 = r3.f43593a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(i0 storage, List initTasksList, z0.d corruptionHandler, em.o0 scope) {
        kotlin.jvm.internal.s.h(storage, "storage");
        kotlin.jvm.internal.s.h(initTasksList, "initTasksList");
        kotlin.jvm.internal.s.h(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.s.h(scope, "scope");
        this.f58272a = storage;
        this.f58273b = corruptionHandler;
        this.f58274c = scope;
        this.f58275d = hm.g.s(new d(null));
        this.f58276e = nm.g.b(false, 1, null);
        this.f58279h = new z0.k();
        this.f58280i = new b(this, initTasksList);
        this.f58281j = fl.l.b(new r());
        this.f58282k = fl.l.b(new c());
        this.f58283l = new f0(scope, new u(), v.f58406a, new w(null));
    }

    private final Object A(tl.o oVar, kl.j jVar, kl.f fVar) {
        return r().c(new s(jVar, oVar, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(kl.f fVar) {
        e eVar;
        j jVar;
        nm.a aVar;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f58334v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f58334v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        Object obj = eVar.f58332t;
        Object objF = ll.b.f();
        int i11 = eVar.f58334v;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.f58276e;
            eVar.f58330r = this;
            eVar.f58331s = aVar2;
            eVar.f58334v = 1;
            if (aVar2.e(null, eVar) == objF) {
                return objF;
            }
            jVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (nm.a) eVar.f58331s;
            jVar = (j) eVar.f58330r;
            fl.s.b(obj);
        }
        try {
            int i12 = jVar.f58277f - 1;
            jVar.f58277f = i12;
            if (i12 == 0) {
                z1 z1Var = jVar.f58278g;
                if (z1Var != null) {
                    z1.c0(z1Var, null, 1, null);
                }
                jVar.f58278g = null;
            }
            fl.g0 g0Var = fl.g0.f38750a;
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    private final Object q(boolean z10, Function1 function1, kl.f fVar) {
        return z10 ? function1.invoke(fVar) : r().c(new f(function1, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0.s r() {
        return (z0.s) this.f58282k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, z0.v$a] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [z0.v$a] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [em.y] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(z0.v.a r9, kl.f r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.j.t(z0.v$a, kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(kl.f fVar) {
        h hVar;
        j jVar;
        nm.a aVar;
        if (fVar instanceof h) {
            hVar = (h) fVar;
            int i10 = hVar.f58347v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f58347v = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(fVar);
            }
        } else {
            hVar = new h(fVar);
        }
        Object obj = hVar.f58345t;
        Object objF = ll.b.f();
        int i11 = hVar.f58347v;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.f58276e;
            hVar.f58343r = this;
            hVar.f58344s = aVar2;
            hVar.f58347v = 1;
            if (aVar2.e(null, hVar) == objF) {
                return objF;
            }
            jVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (nm.a) hVar.f58344s;
            jVar = (j) hVar.f58343r;
            fl.s.b(obj);
        }
        try {
            int i12 = jVar.f58277f + 1;
            jVar.f58277f = i12;
            if (i12 == 1) {
                jVar.f58278g = em.k.d(jVar.f58274c, null, null, jVar.new i(null), 3, null);
            }
            fl.g0 g0Var = fl.g0.f38750a;
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kl.f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z0.j.C0895j
            if (r0 == 0) goto L13
            r0 = r6
            z0.j$j r0 = (z0.j.C0895j) r0
            int r1 = r0.f58355v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58355v = r1
            goto L18
        L13:
            z0.j$j r0 = new z0.j$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58353t
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f58355v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f58352s
            java.lang.Object r0 = r0.f58351r
            z0.j r0 = (z0.j) r0
            fl.s.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f58351r
            z0.j r2 = (z0.j) r2
            fl.s.b(r6)
            goto L57
        L44:
            fl.s.b(r6)
            z0.s r6 = r5.r()
            r0.f58351r = r5
            r0.f58355v = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            z0.j$b r4 = r2.f58280i     // Catch: java.lang.Throwable -> L6f
            r0.f58351r = r2     // Catch: java.lang.Throwable -> L6f
            r0.f58352s = r6     // Catch: java.lang.Throwable -> L6f
            r0.f58355v = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            fl.g0 r6 = fl.g0.f38750a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            z0.k r0 = r0.f58279h
            z0.a0 r2 = new z0.a0
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.j.v(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, kl.f r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.j.w(boolean, kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(kl.f fVar) {
        return k0.a(s(), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    public final Object y(boolean z10, kl.f fVar) throws CorruptionException {
        n nVar;
        j jVar;
        kotlin.jvm.internal.k0 k0Var;
        Object objA;
        CorruptionException corruptionException;
        kotlin.jvm.internal.k0 k0Var2;
        j jVar2;
        kotlin.jvm.internal.i0 i0Var;
        CorruptionException corruptionException2;
        Function1 pVar;
        kotlin.jvm.internal.i0 i0Var2;
        kotlin.jvm.internal.k0 k0Var3;
        j jVar3;
        j jVar4;
        int iHashCode;
        Object objD;
        boolean z11;
        int i10;
        Object obj;
        if (fVar instanceof n) {
            nVar = (n) fVar;
            int i11 = nVar.f58378z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f58378z = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(fVar);
            }
        } else {
            nVar = new n(fVar);
        }
        Object objD2 = nVar.f58376x;
        Object objF = ll.b.f();
        ?? r10 = nVar.f58378z;
        try {
            switch (r10) {
                case 0:
                    fl.s.b(objD2);
                    try {
                        if (z10) {
                            nVar.f58370r = this;
                            nVar.f58374v = z10;
                            nVar.f58378z = 1;
                            objD2 = x(nVar);
                            if (objD2 != objF) {
                                jVar4 = this;
                                if (objD2 != null) {
                                    try {
                                        iHashCode = objD2.hashCode();
                                    } catch (CorruptionException e10) {
                                        e = e10;
                                        jVar = jVar4;
                                        k0Var = new kotlin.jvm.internal.k0();
                                        z0.d dVar = jVar.f58273b;
                                        nVar.f58370r = jVar;
                                        nVar.f58371s = e;
                                        nVar.f58372t = k0Var;
                                        nVar.f58373u = k0Var;
                                        nVar.f58374v = z10;
                                        nVar.f58378z = 5;
                                        objA = dVar.a(e, nVar);
                                        if (objA != objF) {
                                            corruptionException = e;
                                            objD2 = objA;
                                            k0Var2 = k0Var;
                                            jVar2 = jVar;
                                            k0Var2.f43597a = objD2;
                                            i0Var = new kotlin.jvm.internal.i0();
                                            try {
                                                pVar = new p(k0Var, jVar2, i0Var, null);
                                                nVar.f58370r = corruptionException;
                                                nVar.f58371s = k0Var;
                                                nVar.f58372t = i0Var;
                                                nVar.f58373u = null;
                                                nVar.f58378z = 6;
                                                if (jVar2.q(z10, pVar, nVar) != objF) {
                                                    i0Var2 = i0Var;
                                                    k0Var3 = k0Var;
                                                    Object obj2 = k0Var3.f43597a;
                                                    return new z0.e(obj2, obj2 != null ? obj2.hashCode() : 0, i0Var2.f43593a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                corruptionException2 = corruptionException;
                                                fl.e.a(corruptionException2, th);
                                                throw corruptionException2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                z0.s sVarR = jVar4.r();
                                nVar.f58370r = jVar4;
                                nVar.f58371s = objD2;
                                nVar.f58374v = z10;
                                nVar.f58375w = iHashCode;
                                nVar.f58378z = 2;
                                objD = sVarR.d(nVar);
                                if (objD != objF) {
                                    int i12 = iHashCode;
                                    z11 = z10;
                                    i10 = i12;
                                    obj = objD2;
                                    objD2 = objD;
                                    return new z0.e(obj, i10, ((Number) objD2).intValue());
                                }
                            }
                        } else {
                            z0.s sVarR2 = r();
                            nVar.f58370r = this;
                            nVar.f58374v = z10;
                            nVar.f58378z = 3;
                            objD2 = sVarR2.d(nVar);
                            if (objD2 != objF) {
                                jVar3 = this;
                                int iIntValue = ((Number) objD2).intValue();
                                z0.s sVarR3 = jVar3.r();
                                o oVar = jVar3.new o(iIntValue, null);
                                nVar.f58370r = jVar3;
                                nVar.f58374v = z10;
                                nVar.f58378z = 4;
                                objD2 = sVarR3.e(oVar, nVar);
                                if (objD2 == objF) {
                                }
                                return (z0.e) objD2;
                            }
                        }
                    } catch (CorruptionException e11) {
                        e = e11;
                        jVar = this;
                        k0Var = new kotlin.jvm.internal.k0();
                        z0.d dVar2 = jVar.f58273b;
                        nVar.f58370r = jVar;
                        nVar.f58371s = e;
                        nVar.f58372t = k0Var;
                        nVar.f58373u = k0Var;
                        nVar.f58374v = z10;
                        nVar.f58378z = 5;
                        objA = dVar2.a(e, nVar);
                        if (objA != objF) {
                            corruptionException = e;
                            objD2 = objA;
                            k0Var2 = k0Var;
                            jVar2 = jVar;
                            k0Var2.f43597a = objD2;
                            i0Var = new kotlin.jvm.internal.i0();
                            pVar = new p(k0Var, jVar2, i0Var, null);
                            nVar.f58370r = corruptionException;
                            nVar.f58371s = k0Var;
                            nVar.f58372t = i0Var;
                            nVar.f58373u = null;
                            nVar.f58378z = 6;
                            if (jVar2.q(z10, pVar, nVar) != objF) {
                                i0Var2 = i0Var;
                                k0Var3 = k0Var;
                                Object obj3 = k0Var3.f43597a;
                                return new z0.e(obj3, obj3 != null ? obj3.hashCode() : 0, i0Var2.f43593a);
                            }
                        }
                    }
                    return objF;
                case 1:
                    z10 = nVar.f58374v;
                    j jVar5 = (j) nVar.f58370r;
                    fl.s.b(objD2);
                    jVar4 = jVar5;
                    if (objD2 != null) {
                        iHashCode = objD2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    z0.s sVarR4 = jVar4.r();
                    nVar.f58370r = jVar4;
                    nVar.f58371s = objD2;
                    nVar.f58374v = z10;
                    nVar.f58375w = iHashCode;
                    nVar.f58378z = 2;
                    objD = sVarR4.d(nVar);
                    if (objD != objF) {
                        int i13 = iHashCode;
                        z11 = z10;
                        i10 = i13;
                        obj = objD2;
                        objD2 = objD;
                        return new z0.e(obj, i10, ((Number) objD2).intValue());
                    }
                    return objF;
                case 2:
                    i10 = nVar.f58375w;
                    z11 = nVar.f58374v;
                    obj = nVar.f58371s;
                    jVar4 = (j) nVar.f58370r;
                    try {
                        fl.s.b(objD2);
                        return new z0.e(obj, i10, ((Number) objD2).intValue());
                    } catch (CorruptionException e12) {
                        e = e12;
                        z10 = z11;
                        jVar = jVar4;
                        k0Var = new kotlin.jvm.internal.k0();
                        z0.d dVar3 = jVar.f58273b;
                        nVar.f58370r = jVar;
                        nVar.f58371s = e;
                        nVar.f58372t = k0Var;
                        nVar.f58373u = k0Var;
                        nVar.f58374v = z10;
                        nVar.f58378z = 5;
                        objA = dVar3.a(e, nVar);
                        if (objA != objF) {
                            corruptionException = e;
                            objD2 = objA;
                            k0Var2 = k0Var;
                            jVar2 = jVar;
                            k0Var2.f43597a = objD2;
                            i0Var = new kotlin.jvm.internal.i0();
                            pVar = new p(k0Var, jVar2, i0Var, null);
                            nVar.f58370r = corruptionException;
                            nVar.f58371s = k0Var;
                            nVar.f58372t = i0Var;
                            nVar.f58373u = null;
                            nVar.f58378z = 6;
                            if (jVar2.q(z10, pVar, nVar) != objF) {
                                i0Var2 = i0Var;
                                k0Var3 = k0Var;
                                Object obj4 = k0Var3.f43597a;
                                return new z0.e(obj4, obj4 != null ? obj4.hashCode() : 0, i0Var2.f43593a);
                            }
                        }
                        return objF;
                    }
                case 3:
                    z10 = nVar.f58374v;
                    jVar3 = (j) nVar.f58370r;
                    fl.s.b(objD2);
                    int iIntValue2 = ((Number) objD2).intValue();
                    z0.s sVarR5 = jVar3.r();
                    o oVar2 = jVar3.new o(iIntValue2, null);
                    nVar.f58370r = jVar3;
                    nVar.f58374v = z10;
                    nVar.f58378z = 4;
                    objD2 = sVarR5.e(oVar2, nVar);
                    if (objD2 == objF) {
                        return objF;
                    }
                    return (z0.e) objD2;
                case 4:
                    boolean z12 = nVar.f58374v;
                    fl.s.b(objD2);
                    return (z0.e) objD2;
                case 5:
                    z10 = nVar.f58374v;
                    kotlin.jvm.internal.k0 k0Var4 = (kotlin.jvm.internal.k0) nVar.f58373u;
                    kotlin.jvm.internal.k0 k0Var5 = (kotlin.jvm.internal.k0) nVar.f58372t;
                    corruptionException = (CorruptionException) nVar.f58371s;
                    j jVar6 = (j) nVar.f58370r;
                    fl.s.b(objD2);
                    k0Var2 = k0Var4;
                    k0Var = k0Var5;
                    jVar2 = jVar6;
                    k0Var2.f43597a = objD2;
                    i0Var = new kotlin.jvm.internal.i0();
                    pVar = new p(k0Var, jVar2, i0Var, null);
                    nVar.f58370r = corruptionException;
                    nVar.f58371s = k0Var;
                    nVar.f58372t = i0Var;
                    nVar.f58373u = null;
                    nVar.f58378z = 6;
                    if (jVar2.q(z10, pVar, nVar) != objF) {
                        i0Var2 = i0Var;
                        k0Var3 = k0Var;
                        Object obj5 = k0Var3.f43597a;
                        return new z0.e(obj5, obj5 != null ? obj5.hashCode() : 0, i0Var2.f43593a);
                    }
                    return objF;
                case 6:
                    i0Var2 = (kotlin.jvm.internal.i0) nVar.f58372t;
                    k0Var3 = (kotlin.jvm.internal.k0) nVar.f58371s;
                    corruptionException2 = (CorruptionException) nVar.f58370r;
                    try {
                        fl.s.b(objD2);
                        Object obj6 = k0Var3.f43597a;
                        return new z0.e(obj6, obj6 != null ? obj6.hashCode() : 0, i0Var2.f43593a);
                    } catch (Throwable th3) {
                        th = th3;
                        fl.e.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e13) {
            e = e13;
            jVar = r10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z10, kl.f fVar) {
        return em.i.j(this.f58274c.i0(), new q(z10, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(Object obj, boolean z10, kl.f fVar) {
        x xVar;
        kotlin.jvm.internal.i0 i0Var;
        if (fVar instanceof x) {
            xVar = (x) fVar;
            int i10 = xVar.f58413u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f58413u = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(fVar);
            }
        } else {
            xVar = new x(fVar);
        }
        Object obj2 = xVar.f58411s;
        Object objF = ll.b.f();
        int i11 = xVar.f58413u;
        if (i11 == 0) {
            fl.s.b(obj2);
            kotlin.jvm.internal.i0 i0Var2 = new kotlin.jvm.internal.i0();
            j0 j0VarS = s();
            y yVar = new y(i0Var2, this, obj, z10, null);
            xVar.f58410r = i0Var2;
            xVar.f58413u = 1;
            if (j0VarS.a(yVar, xVar) == objF) {
                return objF;
            }
            i0Var = i0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = (kotlin.jvm.internal.i0) xVar.f58410r;
            fl.s.b(obj2);
        }
        return kotlin.coroutines.jvm.internal.b.d(i0Var.f43593a);
    }

    @Override // z0.h
    public Object a(tl.o oVar, kl.f fVar) {
        n0 n0Var = (n0) fVar.getContext().get(n0.a.C0896a.f58446a);
        if (n0Var != null) {
            n0Var.b(this);
        }
        return em.i.j(new n0(n0Var, this), new t(oVar, null), fVar);
    }

    @Override // z0.h
    public hm.e getData() {
        return this.f58275d;
    }

    public final j0 s() {
        return (j0) this.f58281j.getValue();
    }
}
