package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3394w3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2 f27759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3394w3(V2 v10, kl.f fVar) {
        super(2, fVar);
        this.f27759b = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3394w3(this.f27759b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3394w3(this.f27759b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27758a;
        if (i10 == 0) {
            fl.s.b(obj);
            Z2 z10 = (Z2) A3.f24441b.getValue();
            int i11 = this.f27759b.f25869a;
            this.f27758a = 1;
            Object objA = z10.f26111a.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "id=?", new String[]{String.valueOf(i11)}, this);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
            if (objA == objF) {
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
