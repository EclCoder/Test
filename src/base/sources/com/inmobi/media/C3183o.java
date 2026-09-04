package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3183o extends kotlin.coroutines.jvm.internal.m implements Function1 {
    public C3183o(kl.f fVar) {
        super(1, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3183o(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3183o((kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        if (C3235q.f27292d.get() && C3235q.b()) {
            C3235q.a(kotlin.coroutines.jvm.internal.b.c(0.0f));
        }
        return fl.g0.f38750a;
    }
}
