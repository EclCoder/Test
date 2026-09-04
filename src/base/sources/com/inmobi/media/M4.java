package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class M4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2828a6 f25245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(C2828a6 c2828a6, long j10, kl.f fVar) {
        super(2, fVar);
        this.f25245b = c2828a6;
        this.f25246c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new M4(this.f25245b, this.f25246c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new M4(this.f25245b, this.f25246c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25244a;
        if (i10 == 0) {
            fl.s.b(obj);
            O4 o10 = O4.f25393a;
            C2828a6 c2828a6 = this.f25245b;
            int maxAdRecords = O4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f25246c;
            this.f25244a = 1;
            kotlin.jvm.internal.s.g("O4", "TAG");
            G4 g10 = (G4) O4.f25394b.getValue();
            C3167n9 c3167n9 = g10.f24838a;
            F4 f10 = new F4(g10, c2828a6, j10, maxAdRecords, null);
            c3167n9.getClass();
            Object objA = c3167n9.a(new C3141m9(c3167n9, f10, null), this);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
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
