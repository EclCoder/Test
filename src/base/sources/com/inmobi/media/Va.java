package com.inmobi.media;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Va extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f25888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ua f25889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(LinkedHashMap linkedHashMap, Ua ua2, kl.f fVar) {
        super(2, fVar);
        this.f25888a = linkedHashMap;
        this.f25889b = ua2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Va(this.f25888a, this.f25889b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Va(this.f25888a, this.f25889b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f25888a.put("networkType", B5.o());
        String str = this.f25889b.f25825a;
        LinkedHashMap linkedHashMap = this.f25888a;
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b(str, linkedHashMap, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
