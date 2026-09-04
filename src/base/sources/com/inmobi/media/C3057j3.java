package com.inmobi.media;

import android.os.Message;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3057j3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandlerC3083k3 f26772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057j3(HandlerC3083k3 handlerC3083k3, kl.f fVar) {
        super(2, fVar);
        this.f26772b = handlerC3083k3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3057j3(this.f26772b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3057j3(this.f26772b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26771a;
        if (i10 == 0) {
            fl.s.b(obj);
            Z2 z10 = (Z2) A3.f24441b.getValue();
            this.f26771a = 1;
            obj = z10.a(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            return kotlin.coroutines.jvm.internal.b.a(this.f26772b.sendMessage(messageObtain));
        }
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        A3.f24446g.set(false);
        return fl.g0.f38750a;
    }
}
