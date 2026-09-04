package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2926e1 f26049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f26050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(AbstractC2926e1 abstractC2926e1, ViewGroup viewGroup, kl.f fVar) {
        super(2, fVar);
        this.f26049a = abstractC2926e1;
        this.f26050b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Y0(this.f26049a, this.f26050b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Y0(this.f26049a, this.f26050b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            AdSession adSession = this.f26049a.f26432c;
            if (adSession != null) {
                adSession.registerAdView(this.f26050b);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26049a.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "Failed to registerAdView. " + Log.getStackTraceString(e10));
            }
        }
        return fl.g0.f38750a;
    }
}
