package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2928e3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2 f26442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3083k3 f26443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f26444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928e3(Z2 z10, HandlerC3083k3 handlerC3083k3, AdConfig.ImaiConfig imaiConfig, kl.f fVar) {
        super(2, fVar);
        this.f26442b = z10;
        this.f26443c = handlerC3083k3;
        this.f26444d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2928e3(this.f26442b, this.f26443c, this.f26444d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2928e3) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26441a;
        if (i10 == 0) {
            fl.s.b(obj);
            Z2 z10 = this.f26442b;
            this.f26441a = 1;
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
        if (!((Boolean) obj).booleanValue()) {
            A3.f24446g.set(false);
            return fl.g0.f38750a;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        return kotlin.coroutines.jvm.internal.b.a(this.f26443c.sendMessageDelayed(messageObtain, this.f26444d.getPingInterval() * 1000));
    }
}
