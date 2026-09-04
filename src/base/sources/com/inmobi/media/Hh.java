package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Hh extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f24951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Kh f24952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RootConfig f24954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hh(List list, Kh kh2, String str, RootConfig rootConfig, kl.f fVar) {
        super(2, fVar);
        this.f24951c = list;
        this.f24952d = kh2;
        this.f24953e = str;
        this.f24954f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Hh hh2 = new Hh(this.f24951c, this.f24952d, this.f24953e, this.f24954f, fVar);
        hh2.f24950b = obj;
        return hh2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Hh) create((gm.s) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24949a;
        if (i10 == 0) {
            fl.s.b(obj);
            Gh gh2 = new Gh(this.f24951c, this.f24952d, this.f24953e, this.f24954f, (gm.s) this.f24950b, null);
            this.f24949a = 1;
            if (em.u2.c(gh2, this) == objF) {
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
