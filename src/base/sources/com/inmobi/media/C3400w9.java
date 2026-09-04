package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3400w9 extends kotlin.coroutines.jvm.internal.m implements Function1 {
    public C3400w9(kl.f fVar) {
        super(1, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3400w9(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3400w9((kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Fb fb2 = (Fb) Gb.f24849a.getValue();
        C3374v9 listener = AbstractC3426x9.f27837c;
        fb2.getClass();
        kotlin.jvm.internal.s.h(listener, "listener");
        fb2.f24769b = new WeakReference(listener);
        return fl.g0.f38750a;
    }
}
