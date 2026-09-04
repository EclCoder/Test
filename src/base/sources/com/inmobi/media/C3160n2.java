package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3160n2 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3315t2 f27025a;

    public C3160n2(em.o0 o0Var, AbstractC3315t2 abstractC3315t2) {
        this.f27025a = abstractC3315t2;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f27025a.getClass();
        this.f27025a.f27505e.set(zBooleanValue);
        AbstractC3315t2 abstractC3315t2 = this.f27025a;
        if (abstractC3315t2.f27505e.get()) {
            Fg fg2 = abstractC3315t2.c().f25716a;
            fg2.f24784f.set(false);
            fg2.a();
        } else {
            Fg fg3 = abstractC3315t2.c().f25716a;
            fg3.f24780b.setValue(EnumC2949eo.HIDDEN);
            fg3.f24784f.set(true);
            L6.a(fg3.f24783e);
            fg3.f24783e = null;
        }
        AbstractC3315t2 abstractC3315t3 = this.f27025a;
        if (abstractC3315t3.f27505e.get()) {
            abstractC3315t3.f27507g.a();
        } else {
            abstractC3315t3.f27507g.b();
        }
        return fl.g0.f38750a;
    }
}
