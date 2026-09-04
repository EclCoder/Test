package im;

import em.o0;
import em.p0;
import em.q0;
import em.z1;
import fl.g0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function3 f41508e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f41509r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f41510s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f41511t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ hm.f f41513v;

        /* JADX INFO: renamed from: im.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0629a implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f41514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f41515b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f41516c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ hm.f f41517d;

            /* JADX INFO: renamed from: im.h$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0630a extends kotlin.coroutines.jvm.internal.m implements tl.o {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f41518r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ h f41519s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ hm.f f41520t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ Object f41521u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0630a(h hVar, hm.f fVar, Object obj, kl.f fVar2) {
                    super(2, fVar2);
                    this.f41519s = hVar;
                    this.f41520t = fVar;
                    this.f41521u = obj;
                }

                @Override // tl.o
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(o0 o0Var, kl.f fVar) {
                    return ((C0630a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kl.f create(Object obj, kl.f fVar) {
                    return new C0630a(this.f41519s, this.f41520t, this.f41521u, fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = ll.b.f();
                    int i10 = this.f41518r;
                    if (i10 == 0) {
                        fl.s.b(obj);
                        Function3 function3 = this.f41519s.f41508e;
                        hm.f fVar = this.f41520t;
                        Object obj2 = this.f41521u;
                        this.f41518r = 1;
                        if (function3.invoke(fVar, obj2, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fl.s.b(obj);
                    }
                    return g0.f38750a;
                }
            }

            /* JADX INFO: renamed from: im.h$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f41522r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f41523s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f41524t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                int f41525u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                /* synthetic */ Object f41526v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                int f41528x;

                b(kl.f fVar) {
                    super(fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f41526v = obj;
                    this.f41528x |= Integer.MIN_VALUE;
                    return C0629a.this.emit(null, this);
                }
            }

            C0629a(k0 k0Var, o0 o0Var, h hVar, hm.f fVar) {
                this.f41514a = k0Var;
                this.f41515b = o0Var;
                this.f41516c = hVar;
                this.f41517d = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // hm.f
            public final Object emit(Object obj, kl.f fVar) {
                b bVar;
                if (fVar instanceof b) {
                    bVar = (b) fVar;
                    int i10 = bVar.f41528x;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar.f41528x = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(fVar);
                    }
                } else {
                    bVar = new b(fVar);
                }
                Object obj2 = bVar.f41526v;
                Object objF = ll.b.f();
                int i11 = bVar.f41528x;
                if (i11 == 0) {
                    fl.s.b(obj2);
                    z1 z1Var = (z1) this.f41514a.f43597a;
                    if (z1Var != null) {
                        z1Var.a(new ChildCancelledException());
                        bVar.f41522r = obj;
                        bVar.f41523s = z1Var;
                        bVar.f41524t = kotlin.coroutines.jvm.internal.l.a(z1Var);
                        bVar.f41525u = 0;
                        bVar.f41528x = 1;
                        if (z1Var.c(bVar) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f41522r;
                    fl.s.b(obj2);
                }
                this.f41514a.f43597a = em.k.d(this.f41515b, null, q0.UNDISPATCHED, new C0630a(this.f41516c, this.f41517d, obj, null), 1, null);
                return g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hm.f fVar, kl.f fVar2) {
            super(2, fVar2);
            this.f41513v = fVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = h.this.new a(this.f41513v, fVar);
            aVar.f41511t = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o0 o0Var = (o0) this.f41511t;
            Object objF = ll.b.f();
            int i10 = this.f41510s;
            if (i10 == 0) {
                fl.s.b(obj);
                k0 k0Var = new k0();
                h hVar = h.this;
                hm.e eVar = hVar.f41504d;
                C0629a c0629a = new C0629a(k0Var, o0Var, hVar, this.f41513v);
                this.f41511t = kotlin.coroutines.jvm.internal.l.a(o0Var);
                this.f41509r = kotlin.coroutines.jvm.internal.l.a(k0Var);
                this.f41510s = 1;
                if (eVar.collect(c0629a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    public h(Function3 function3, hm.e eVar, kl.j jVar, int i10, gm.a aVar) {
        super(eVar, jVar, i10, aVar);
        this.f41508e = function3;
    }

    @Override // im.d
    protected d i(kl.j jVar, int i10, gm.a aVar) {
        return new h(this.f41508e, this.f41504d, jVar, i10, aVar);
    }

    @Override // im.f
    protected Object r(hm.f fVar, kl.f fVar2) {
        Object objD = p0.d(new a(fVar, null), fVar2);
        return objD == ll.b.f() ? objD : g0.f38750a;
    }

    public /* synthetic */ h(Function3 function3, hm.e eVar, kl.j jVar, int i10, gm.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, eVar, (i11 & 4) != 0 ? kl.k.f43531a : jVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? gm.a.SUSPEND : aVar);
    }
}
