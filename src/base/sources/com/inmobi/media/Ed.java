package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ed implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hm.f f24714a;

    public Ed(hm.f fVar) {
        this.f24714a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        Dd dd2;
        if (fVar instanceof Dd) {
            dd2 = (Dd) fVar;
            int i10 = dd2.f24650b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dd2.f24650b = i10 - Integer.MIN_VALUE;
            } else {
                dd2 = new Dd(this, fVar);
            }
        } else {
            dd2 = new Dd(this, fVar);
        }
        Object obj2 = dd2.f24649a;
        Object objF = ll.b.f();
        int i11 = dd2.f24650b;
        if (i11 == 0) {
            fl.s.b(obj2);
            hm.f fVar2 = this.f24714a;
            if (((AbstractC3066jc) obj) instanceof AbstractC3050im) {
                dd2.f24650b = 1;
                if (fVar2.emit(obj, dd2) == objF) {
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
