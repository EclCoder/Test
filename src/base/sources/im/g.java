package im;

import fl.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends f {
    public g(hm.e eVar, kl.j jVar, int i10, gm.a aVar) {
        super(eVar, jVar, i10, aVar);
    }

    @Override // im.d
    protected d i(kl.j jVar, int i10, gm.a aVar) {
        return new g(this.f41504d, jVar, i10, aVar);
    }

    @Override // im.d
    public hm.e k() {
        return this.f41504d;
    }

    @Override // im.f
    protected Object r(hm.f fVar, kl.f fVar2) {
        Object objCollect = this.f41504d.collect(fVar, fVar2);
        return objCollect == ll.b.f() ? objCollect : g0.f38750a;
    }

    public /* synthetic */ g(hm.e eVar, kl.j jVar, int i10, gm.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i11 & 2) != 0 ? kl.k.f43531a : jVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? gm.a.SUSPEND : aVar);
    }
}
