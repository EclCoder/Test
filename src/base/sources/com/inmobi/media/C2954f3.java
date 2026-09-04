package com.inmobi.media;

import android.os.Message;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2954f3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V2 f26529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HandlerC3083k3 f26530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954f3(V2 v10, HandlerC3083k3 handlerC3083k3, kl.f fVar) {
        super(2, fVar);
        this.f26529c = v10;
        this.f26530d = handlerC3083k3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C2954f3 c2954f3 = new C2954f3(this.f26529c, this.f26530d, fVar);
        c2954f3.f26528b = obj;
        return c2954f3;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2954f3) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26527a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f26528b;
            C3187o3 c3187o3 = new C3187o3();
            V2 v10 = this.f26529c;
            this.f26528b = o0Var;
            this.f26527a = 1;
            obj = c3187o3.a(v10, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        if (((EnumC2931e6) obj) != null) {
            HandlerC3083k3 handlerC3083k3 = this.f26530d;
            V2 v11 = this.f26529c;
            int i11 = HandlerC3083k3.f26835a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = v11;
            handlerC3083k3.sendMessage(messageObtain);
        } else {
            V2 v12 = this.f26529c;
            HandlerC3083k3 handlerC3083k4 = this.f26530d;
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
            String str = v12.f25870b;
            A3.b(v12);
            int i12 = HandlerC3083k3.f26835a;
            handlerC3083k4.b(v12);
        }
        return fl.g0.f38750a;
    }
}
