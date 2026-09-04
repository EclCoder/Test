package hm;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h0 implements f0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0 f40528a;

        /* JADX INFO: renamed from: hm.h0$a$a, reason: collision with other inner class name */
        public static final class C0615a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f40529r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f40530s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f40532u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40533v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40534w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f40535x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f40536y;

            public C0615a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40529r = obj;
                this.f40530s |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(i0 i0Var) {
            this.f40528a = i0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) {
            C0615a c0615a;
            if (fVar2 instanceof C0615a) {
                c0615a = (C0615a) fVar2;
                int i10 = c0615a.f40530s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0615a.f40530s = i10 - Integer.MIN_VALUE;
                } else {
                    c0615a = new C0615a(fVar2);
                }
            } else {
                c0615a = new C0615a(fVar2);
            }
            Object obj = c0615a.f40529r;
            Object objF = ll.b.f();
            int i11 = c0615a.f40530s;
            if (i11 == 0) {
                fl.s.b(obj);
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                i0 i0Var = this.f40528a;
                b bVar = new b(g0Var, fVar);
                c0615a.f40532u = kotlin.coroutines.jvm.internal.l.a(fVar);
                c0615a.f40533v = kotlin.coroutines.jvm.internal.l.a(c0615a);
                c0615a.f40534w = kotlin.coroutines.jvm.internal.l.a(fVar);
                c0615a.f40535x = kotlin.coroutines.jvm.internal.l.a(g0Var);
                c0615a.f40536y = 0;
                c0615a.f40530s = 1;
                if (i0Var.collect(bVar, c0615a) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.g0 f40537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f40538b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40539r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40540s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f40542u;

            a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40540s = obj;
                this.f40542u |= Integer.MIN_VALUE;
                return b.this.a(0, this);
            }
        }

        b(kotlin.jvm.internal.g0 g0Var, f fVar) {
            this.f40537a = g0Var;
            this.f40538b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(int i10, kl.f fVar) {
            a aVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i11 = aVar.f40542u;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f40542u = i11 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object obj = aVar.f40540s;
            Object objF = ll.b.f();
            int i12 = aVar.f40542u;
            if (i12 == 0) {
                fl.s.b(obj);
                if (i10 > 0) {
                    kotlin.jvm.internal.g0 g0Var = this.f40537a;
                    if (!g0Var.f43588a) {
                        g0Var.f43588a = true;
                        f fVar2 = this.f40538b;
                        d0 d0Var = d0.START;
                        aVar.f40539r = i10;
                        aVar.f40542u = 1;
                        if (fVar2.emit(d0Var, aVar) == objF) {
                            return objF;
                        }
                    }
                }
                return fl.g0.f38750a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return fl.g0.f38750a;
        }

        @Override // hm.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kl.f fVar) {
            return a(((Number) obj).intValue(), fVar);
        }
    }

    @Override // hm.f0
    public e a(i0 i0Var) {
        return new a(i0Var);
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
