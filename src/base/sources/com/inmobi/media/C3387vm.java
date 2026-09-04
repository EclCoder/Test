package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3387vm implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f27745a;

    public C3387vm(em.o0 o0Var, Fm fm2) {
        this.f27745a = fm2;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        AbstractC3066jc abstractC3066jc = (AbstractC3066jc) obj;
        C3348u9 c3348u9 = this.f27745a.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC3066jc);
        }
        Object objEmit = this.f27745a.f24803d.emit(abstractC3066jc, fVar);
        return objEmit == ll.b.f() ? objEmit : fl.g0.f38750a;
    }
}
