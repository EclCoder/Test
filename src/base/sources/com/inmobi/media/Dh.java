package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Dh extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.k0 f24662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Eh f24665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(Eh eh2, kl.f fVar) {
        super(2, fVar);
        this.f24665e = eh2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Dh dh2 = new Dh(this.f24665e, fVar);
        dh2.f24664d = obj;
        return dh2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Dh dh2 = new Dh(this.f24665e, (kl.f) obj2);
        dh2.f24664d = (hm.f) obj;
        return dh2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        hm.f fVar;
        String str;
        kotlin.jvm.internal.k0 k0Var;
        Object objF = ll.b.f();
        int i10 = this.f24663c;
        if (i10 == 0) {
            fl.s.b(obj);
            fVar = (hm.f) this.f24664d;
            str = Xi.f26023c;
            if (str == null) {
                return fl.g0.f38750a;
            }
            k0Var = new kotlin.jvm.internal.k0();
            k0Var.f43597a = Eh.a(this.f24665e);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = this.f24662b;
            str = this.f24661a;
            fVar = (hm.f) this.f24664d;
            fl.s.b(obj);
        }
        String accountId = str;
        hm.f fVar2 = fVar;
        while (!((Collection) k0Var.f43597a).isEmpty()) {
            List configRequestContexts = (List) k0Var.f43597a;
            k0Var.f43597a = gl.r.l();
            Kh kh2 = (Kh) this.f24665e.f24723b.getValue();
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) AbstractC2878c4.f26300a.a(RootConfig.class);
            kh2.getClass();
            kotlin.jvm.internal.s.h(accountId, "accountId");
            kotlin.jvm.internal.s.h(rootConfig, "rootConfig");
            kotlin.jvm.internal.s.h(configRequestContexts, "configRequestContexts");
            hm.e eVarG = hm.g.g(new Hh(configRequestContexts, kh2, accountId, rootConfig, null));
            Ch ch2 = new Ch(this.f24665e, fVar2, k0Var);
            this.f24664d = fVar2;
            this.f24661a = accountId;
            this.f24662b = k0Var;
            this.f24663c = 1;
            if (eVarG.collect(ch2, this) == objF) {
                return objF;
            }
        }
        return fl.g0.f38750a;
    }
}
