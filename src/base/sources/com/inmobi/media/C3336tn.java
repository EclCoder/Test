package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3336tn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3414wn f27577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3336tn(C3414wn c3414wn, kl.f fVar) {
        super(2, fVar);
        this.f27577b = c3414wn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3336tn(this.f27577b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3336tn(this.f27577b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27576a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3414wn c3414wn = this.f27577b;
            hm.v vVar = c3414wn.f27815d;
            C2999gm c2999gm = new C2999gm(c3414wn.f27812a.getDuration());
            this.f27576a = 1;
            if (vVar.emit(c2999gm, this) == objF) {
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
