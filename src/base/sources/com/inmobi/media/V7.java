package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class V7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W7 f25886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(W7 w10, kl.f fVar) {
        super(2, fVar);
        this.f25886a = w10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new V7(this.f25886a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new V7(this.f25886a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        if (this.f25886a.f25930d.e()) {
            W7 w10 = this.f25886a;
            w10.f25928b.setVolume(1.0f);
            T4.a(w10.f25929c, w10.f25927a, new S1(1.0f, false));
            w10.f25931e = false;
        } else {
            this.f25886a.a();
        }
        return fl.g0.f38750a;
    }
}
