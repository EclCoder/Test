package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Dj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f24667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dj(Ej ej2, kl.f fVar) {
        super(2, fVar);
        this.f24667a = ej2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Dj(this.f24667a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Dj(this.f24667a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        return C5.a(this.f24667a.f24728a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
