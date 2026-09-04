package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vd implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hm.f f25894a;

    public Vd(hm.f fVar) {
        this.f25894a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        Ud ud2;
        if (fVar instanceof Ud) {
            ud2 = (Ud) fVar;
            int i10 = ud2.f25835b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ud2.f25835b = i10 - Integer.MIN_VALUE;
            } else {
                ud2 = new Ud(this, fVar);
            }
        } else {
            ud2 = new Ud(this, fVar);
        }
        Object obj2 = ud2.f25834a;
        Object objF = ll.b.f();
        int i11 = ud2.f25835b;
        if (i11 == 0) {
            fl.s.b(obj2);
            hm.f fVar2 = this.f25894a;
            if (((AbstractC3050im) obj) instanceof C2999gm) {
                ud2.f25835b = 1;
                if (fVar2.emit(obj, ud2) == objF) {
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
