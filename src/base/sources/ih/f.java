package ih;

import ag.o;
import ag.s;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q1;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import em.k;
import em.o0;
import fh.i;
import fl.g0;
import kotlin.coroutines.jvm.internal.m;
import nh.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ag.i f41442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f41443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final xf.a f41444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rf.b f41445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o f41446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k0 f41447l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f41448r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f41449s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f41451u;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41449s = obj;
            this.f41451u |= Integer.MIN_VALUE;
            return f.this.j(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41452r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f41453s;

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
            b bVar = f.this.new b(fVar);
            bVar.f41453s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f41452r;
            if (i10 == 0) {
                fl.s.b(obj);
                l0 l0Var = (l0) this.f41453s;
                tg.b bVarF = f.this.f41445j.f();
                this.f41452r = 1;
                if (l0Var.emit(bVarF, this) == objF) {
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
        int f41455r;

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
            return f.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f41455r;
            if (i10 == 0) {
                fl.s.b(obj);
                o oVar = f.this.f41446k;
                g0 g0Var = g0.f38750a;
                this.f41455r = 1;
                if (oVar.b(g0Var, this) == objF) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ag.i getFbEncodeParamUseCase, s setFbEncodeParamUseCase, xf.a parseAutoParamsUseCase, rf.b liveFbRepository, o logoutFbUseCase) {
        super(parseAutoParamsUseCase);
        kotlin.jvm.internal.s.h(getFbEncodeParamUseCase, "getFbEncodeParamUseCase");
        kotlin.jvm.internal.s.h(setFbEncodeParamUseCase, "setFbEncodeParamUseCase");
        kotlin.jvm.internal.s.h(parseAutoParamsUseCase, "parseAutoParamsUseCase");
        kotlin.jvm.internal.s.h(liveFbRepository, "liveFbRepository");
        kotlin.jvm.internal.s.h(logoutFbUseCase, "logoutFbUseCase");
        this.f41442g = getFbEncodeParamUseCase;
        this.f41443h = setFbEncodeParamUseCase;
        this.f41444i = parseAutoParamsUseCase;
        this.f41445j = liveFbRepository;
        this.f41446k = logoutFbUseCase;
        this.f41447l = androidx.lifecycle.i.b(null, 0L, new b(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fh.i
    protected Object j(kl.f fVar) {
        a aVar;
        p0 p0Var;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f41451u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f41451u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f41449s;
        Object objF = ll.b.f();
        int i11 = aVar.f41451u;
        if (i11 == 0) {
            fl.s.b(obj);
            p0 p0VarS = s();
            ag.i iVar = this.f41442g;
            g0 g0Var = g0.f38750a;
            aVar.f41448r = p0VarS;
            aVar.f41451u = 1;
            Object objB = iVar.b(g0Var, aVar);
            if (objB == objF) {
                return objF;
            }
            p0Var = p0VarS;
            obj = objB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) aVar.f41448r;
            fl.s.b(obj);
        }
        p0Var.q(wg.d.b((wg.c) obj, p.a()));
        return g0.f38750a;
    }

    @Override // fh.i
    public k0 n() {
        return this.f41447l;
    }

    @Override // fh.i
    protected xf.a q() {
        return this.f41444i;
    }

    @Override // fh.i
    public void t() {
        k.d(q1.a(this), null, null, new c(null), 3, null);
    }

    @Override // fh.i
    protected Object w(EncodeParam encodeParam, kl.f fVar) {
        Object objB = this.f41443h.b(encodeParam, fVar);
        return objB == ll.b.f() ? objB : g0.f38750a;
    }
}
