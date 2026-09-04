package lh;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q1;
import bg.o;
import bg.s;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import em.k;
import em.o0;
import fh.i;
import fl.g0;
import kotlin.coroutines.jvm.internal.m;
import nh.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bg.g f44563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f44564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f44565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rf.d f44566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0 f44567k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f44568r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f44569s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f44571u;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44569s = obj;
            this.f44571u |= Integer.MIN_VALUE;
            return g.this.j(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44572r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f44573s;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kl.f fVar) {
            return ((b) create(l0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = g.this.new b(fVar);
            bVar.f44573s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f44572r;
            if (i10 == 0) {
                fl.s.b(obj);
                l0 l0Var = (l0) this.f44573s;
                tg.b bVarD = g.this.f44566j.d();
                this.f44572r = 1;
                if (l0Var.emit(bVarD, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44575r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return g.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f44575r;
            if (i10 == 0) {
                fl.s.b(obj);
                o oVar = g.this.f44565i;
                this.f44575r = 1;
                if (oVar.b(null, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            g.this.f44566j.a();
            return g0.f38750a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bg.g getYtEncodeParamUseCase, s setYtEncodeParamUseCase, o setAuthStateUseCase, rf.d ytLiveYtRepository, xf.a parseAutoParamsUseCase) {
        super(parseAutoParamsUseCase);
        kotlin.jvm.internal.s.h(getYtEncodeParamUseCase, "getYtEncodeParamUseCase");
        kotlin.jvm.internal.s.h(setYtEncodeParamUseCase, "setYtEncodeParamUseCase");
        kotlin.jvm.internal.s.h(setAuthStateUseCase, "setAuthStateUseCase");
        kotlin.jvm.internal.s.h(ytLiveYtRepository, "ytLiveYtRepository");
        kotlin.jvm.internal.s.h(parseAutoParamsUseCase, "parseAutoParamsUseCase");
        this.f44563g = getYtEncodeParamUseCase;
        this.f44564h = setYtEncodeParamUseCase;
        this.f44565i = setAuthStateUseCase;
        this.f44566j = ytLiveYtRepository;
        this.f44567k = androidx.lifecycle.i.b(null, 0L, new b(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fh.i
    protected Object j(kl.f fVar) {
        a aVar;
        p0 p0Var;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f44571u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f44571u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f44569s;
        Object objF = ll.b.f();
        int i11 = aVar.f44571u;
        if (i11 == 0) {
            fl.s.b(obj);
            p0 p0VarS = s();
            bg.g gVar = this.f44563g;
            g0 g0Var = g0.f38750a;
            aVar.f44568r = p0VarS;
            aVar.f44571u = 1;
            Object objB = gVar.b(g0Var, aVar);
            if (objB == objF) {
                return objF;
            }
            p0Var = p0VarS;
            obj = objB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) aVar.f44568r;
            fl.s.b(obj);
        }
        p0Var.q(wg.d.b((wg.c) obj, p.a()));
        return g0.f38750a;
    }

    @Override // fh.i
    public k0 n() {
        return this.f44567k;
    }

    @Override // fh.i
    public void t() {
        k.d(q1.a(this), null, null, new c(null), 3, null);
    }

    @Override // fh.i
    protected Object w(EncodeParam encodeParam, kl.f fVar) {
        Object objB = this.f44564h.b(encodeParam, fVar);
        return objB == ll.b.f() ? objB : g0.f38750a;
    }
}
