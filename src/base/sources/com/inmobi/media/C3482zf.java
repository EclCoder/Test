package com.inmobi.media;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3482zf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Af f28016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3482zf(Af af2, String str, kl.f fVar) {
        super(2, fVar);
        this.f28016a = af2;
        this.f28017b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3482zf(this.f28016a, this.f28017b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3482zf(this.f28016a, this.f28017b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Ig ig2 = this.f28016a.f24474a;
        String value = this.f28017b;
        ig2.getClass();
        kotlin.jvm.internal.s.h("omid_js_string", "key");
        kotlin.jvm.internal.s.h(value, "value");
        La la2 = ig2.f25006a;
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        la2.a("omid_js_string", value, false);
        ig2.f25006a.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        return fl.g0.f38750a;
    }
}
