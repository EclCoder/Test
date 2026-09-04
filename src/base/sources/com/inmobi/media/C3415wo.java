package com.inmobi.media;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.inmobi.media.wo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3415wo extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3415wo(String str, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(2, fVar);
        this.f27820b = str;
        this.f27821c = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3415wo(this.f27820b, this.f27821c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3415wo(this.f27820b, this.f27821c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C3337to c3337to;
        Object objF = ll.b.f();
        int i10 = this.f27819a;
        if (i10 == 0) {
            fl.s.b(obj);
            Ao ao2 = Ao.f24492a;
            em.v0 v0VarA = Ao.a(this.f27820b, this.f27821c);
            this.f27819a = 1;
            obj = v0VarA.N0(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        Ve ve2 = (Ve) obj;
        Ao ao3 = Ao.f24492a;
        if (ve2 != null && AbstractC3438xl.a(ve2)) {
            xn.h hVarD = ve2.d();
            Charset charset = bm.d.f9079b;
            if (hVarD.F(charset).length() > 0 && (c3337to = Ao.f24494c) != null) {
                String str = this.f27820b;
                yl.f fVar = AbstractC2837af.f26214a;
                kotlin.jvm.internal.s.h(ve2, "<this>");
                String strF = ve2.d().F(charset);
                InterfaceC3322t9 interfaceC3322t9 = this.f27821c;
                String str2 = this.f27820b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                fl.g0 g0Var = fl.g0.f38750a;
                kotlin.coroutines.jvm.internal.b.a(c3337to.a(str, strF, this.f27821c));
            }
        }
        return ve2;
    }
}
