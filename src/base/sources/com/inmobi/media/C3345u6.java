package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3345u6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3448y6 f27599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3345u6(C3448y6 c3448y6, long j10, kl.f fVar) {
        super(2, fVar);
        this.f27599b = c3448y6;
        this.f27600c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3345u6(this.f27599b, this.f27600c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3345u6(this.f27599b, this.f27600c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27598a;
        if (i10 == 0) {
            fl.s.b(obj);
            hm.v vVar = this.f27599b.f27913c;
            C2999gm c2999gm = new C2999gm(this.f27600c);
            this.f27598a = 1;
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
