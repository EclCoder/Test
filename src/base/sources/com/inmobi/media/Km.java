package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Km extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gl f25136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Gl f25138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f25139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Xe f25140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f25142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Km(Gl gl2, double d10, Xe xe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, kl.f fVar) {
        super(2, fVar);
        this.f25138c = gl2;
        this.f25139d = d10;
        this.f25140e = xe2;
        this.f25141f = i10;
        this.f25142g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Km(this.f25138c, this.f25139d, this.f25140e, this.f25141f, this.f25142g, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Km) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Gl gl2;
        Object objF = ll.b.f();
        int i10 = this.f25137b;
        if (i10 == 0) {
            fl.s.b(obj);
            Gl gl3 = this.f25138c;
            double d10 = this.f25139d;
            Xe xe2 = this.f25140e;
            int i11 = this.f25141f;
            AdConfig.VastVideoConfig vastVideoConfig = this.f25142g;
            this.f25136a = gl3;
            this.f25137b = 1;
            obj = Nm.a(gl3, d10, xe2, i11, vastVideoConfig, this);
            if (obj == objF) {
                return objF;
            }
            gl2 = gl3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl2 = this.f25136a;
            fl.s.b(obj);
        }
        return fl.w.a(gl2, obj);
    }
}
