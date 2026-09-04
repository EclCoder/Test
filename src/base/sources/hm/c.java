package hm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class c extends im.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tl.o f40500d;

    public c(tl.o oVar, kl.j jVar, int i10, gm.a aVar) {
        super(jVar, i10, aVar);
        this.f40500d = oVar;
    }

    static /* synthetic */ Object o(c cVar, gm.s sVar, kl.f fVar) {
        Object objInvoke = cVar.f40500d.invoke(sVar, fVar);
        return objInvoke == ll.b.f() ? objInvoke : fl.g0.f38750a;
    }

    @Override // im.d
    protected Object h(gm.s sVar, kl.f fVar) {
        return o(this, sVar, fVar);
    }

    @Override // im.d
    protected im.d i(kl.j jVar, int i10, gm.a aVar) {
        return new c(this.f40500d, jVar, i10, aVar);
    }

    @Override // im.d
    public String toString() {
        return "block[" + this.f40500d + "] -> " + super.toString();
    }

    public /* synthetic */ c(tl.o oVar, kl.j jVar, int i10, gm.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i11 & 2) != 0 ? kl.k.f43531a : jVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? gm.a.SUSPEND : aVar);
    }
}
