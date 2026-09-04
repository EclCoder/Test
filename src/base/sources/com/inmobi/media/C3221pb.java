package com.inmobi.media;

import com.inmobi.media.C3221pb;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3221pb extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2821a f27186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3247qb f27187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3221pb(C2821a c2821a, AbstractC3247qb abstractC3247qb, kl.f fVar) {
        super(2, fVar);
        this.f27186b = c2821a;
        this.f27187c = abstractC3247qb;
    }

    public static final fl.g0 a(AbstractC3247qb abstractC3247qb, W w10) {
        abstractC3247qb.f27333m.a(w10);
        return fl.g0.f38750a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3221pb(this.f27186b, this.f27187c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3221pb(this.f27186b, this.f27187c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27185a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C2821a c2821a = this.f27186b;
                final AbstractC3247qb abstractC3247qb = this.f27187c;
                Function1 function1 = new Function1() { // from class: yh.ea
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3221pb.a(abstractC3247qb, (W) obj2);
                    }
                };
                this.f27185a = 1;
                obj = c2821a.a(function1, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f27187c.f26422a.getClass();
            AbstractC3247qb abstractC3247qb2 = this.f27187c;
            AbstractC2900d0.a("native", abstractC3247qb2.f26425d.f25697g, adResponse, abstractC3247qb2.f26426e);
            C3348u9 c3348u9 = this.f27187c.f26426e;
            if (c3348u9 != null) {
                c3348u9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.f27187c.a(adResponse);
        } catch (Y e10) {
            C3348u9 c3348u10 = this.f27187c.f26426e;
            if (c3348u10 != null) {
                c3348u10.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e10);
            }
            AbstractC3247qb abstractC3247qb3 = this.f27187c;
            abstractC3247qb3.getClass();
            V v10 = e10.f26048b;
            if (v10 instanceof C2919dj) {
                C3132m0 c3132m0 = abstractC3247qb3.f26428g;
                em.k.d(c3132m0.f26967a, null, null, new C3106l0(c3132m0, null), 3, null);
                abstractC3247qb3.a(gl.l0.m(fl.w.a("errorCode", (short) 0)), e10.f26047a);
            } else if (v10 instanceof N6) {
                abstractC3247qb3.a(gl.l0.m(fl.w.a("errorCode", Short.valueOf(((N6) v10).f25322a))), e10.f26047a);
            } else if (v10 instanceof O6) {
                abstractC3247qb3.a(gl.l0.m(fl.w.a("errorCode", Short.valueOf((short) ((O6) v10).f25401a))), e10.f26047a);
            } else {
                if (!(v10 instanceof C2867bj)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC3247qb3.a(((C2867bj) v10).f26270a, e10.f26047a);
            }
        }
        return fl.g0.f38750a;
    }
}
