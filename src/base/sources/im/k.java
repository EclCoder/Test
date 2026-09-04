package im;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface k extends hm.e {
    static /* synthetic */ hm.e d(k kVar, kl.j jVar, int i10, gm.a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
        if ((i11 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        if ((i11 & 2) != 0) {
            i10 = -3;
        }
        if ((i11 & 4) != 0) {
            aVar = gm.a.SUSPEND;
        }
        return kVar.a(jVar, i10, aVar);
    }

    hm.e a(kl.j jVar, int i10, gm.a aVar);
}
