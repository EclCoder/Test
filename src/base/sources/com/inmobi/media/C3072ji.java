package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3072ji extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3072ji(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, kl.f fVar) {
        super(2, fVar);
        this.f26821b = gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3072ji(this.f26821b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3072ji(this.f26821b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3322t9 interfaceC3322t9;
        Object objF = ll.b.f();
        int i10 = this.f26820a;
        if (i10 == 0) {
            fl.s.b(obj);
            this.f26820a = 1;
            if (em.y0.a(1000L, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        if (!this.f26821b.isAttachedToWindow() && (interfaceC3322t9 = this.f26821b.f27233i) != null) {
            ((C3348u9) interfaceC3322t9).a();
        }
        return fl.g0.f38750a;
    }
}
