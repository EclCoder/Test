package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class X0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ie f25988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FriendlyObstructionPurpose f25990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Ie ie2, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, kl.f fVar) {
        super(2, fVar);
        this.f25988a = ie2;
        this.f25989b = view;
        this.f25990c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new X0(this.f25988a, this.f25989b, this.f25990c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((X0) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            AdSession adSession = this.f25988a.f26432c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.f25989b, this.f25990c, null);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3322t9 interfaceC3322t9 = this.f25988a.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e10));
            }
        }
        return fl.g0.f38750a;
    }
}
