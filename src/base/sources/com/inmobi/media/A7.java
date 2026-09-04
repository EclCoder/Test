package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A7 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hm.f f24457a;

    public A7(hm.f fVar) {
        this.f24457a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        C3474z7 c3474z7;
        if (fVar instanceof C3474z7) {
            c3474z7 = (C3474z7) fVar;
            int i10 = c3474z7.f27984b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3474z7.f27984b = i10 - Integer.MIN_VALUE;
            } else {
                c3474z7 = new C3474z7(this, fVar);
            }
        } else {
            c3474z7 = new C3474z7(this, fVar);
        }
        Object obj2 = c3474z7.f27983a;
        Object objF = ll.b.f();
        int i11 = c3474z7.f27984b;
        if (i11 == 0) {
            fl.s.b(obj2);
            hm.f fVar2 = this.f24457a;
            if (((AbstractC3050im) obj) instanceof C2999gm) {
                c3474z7.f27984b = 1;
                if (fVar2.emit(obj, c3474z7) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj2);
        }
        return fl.g0.f38750a;
    }
}
