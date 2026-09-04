package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;

/* JADX INFO: renamed from: com.inmobi.media.el, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2946el extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26515a;

    public C2946el(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2946el(fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2946el((kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26515a;
        if (i10 == 0) {
            fl.s.b(obj);
            this.f26515a = 1;
            if (InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this) == objF) {
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
