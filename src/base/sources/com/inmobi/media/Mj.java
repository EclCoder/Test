package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f25283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nj f25284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mj(Image image, Nj nj2, kl.f fVar) {
        super(2, fVar);
        this.f25283b = image;
        this.f25284c = nj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Mj(this.f25283b, this.f25284c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Mj(this.f25283b, this.f25284c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25282a;
        if (i10 == 0) {
            fl.s.b(obj);
            ArrayList arrayListA = D4.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.f25283b.getTrackers());
            hm.v vVar = this.f25284c.f25360d;
            Link link = this.f25283b.getLink();
            C3486zj c3486zj = new C3486zj(link != null ? link.getUrl() : null, arrayListA);
            this.f25282a = 1;
            if (vVar.emit(c3486zj, this) == objF) {
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
