package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3457yf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Af f27952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f27953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3457yf(Af af2, AdConfig.OmidConfig omidConfig, kl.f fVar) {
        super(2, fVar);
        this.f27952a = af2;
        this.f27953b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3457yf(this.f27952a, this.f27953b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3457yf(this.f27952a, this.f27953b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        La la2 = this.f27952a.f24474a.f25006a;
        la2.getClass();
        kotlin.jvm.internal.s.h("last_ts", "key");
        return kotlin.coroutines.jvm.internal.b.a((System.currentTimeMillis() / ((long) 1000)) - la2.f25198a.getLong("last_ts", 0L) > this.f27953b.getExpiry());
    }
}
