package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class N4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(long j10, kl.f fVar) {
        super(2, fVar);
        this.f25312b = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new N4(this.f25312b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new N4(this.f25312b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25311a;
        if (i10 == 0) {
            fl.s.b(obj);
            G4 g10 = (G4) O4.f25394b.getValue();
            int maxAdRecords = O4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f25312b;
            this.f25311a = 1;
            if (g10.a(maxAdRecords, j10, this) == objF) {
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
