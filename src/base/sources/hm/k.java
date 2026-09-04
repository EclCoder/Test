package hm;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class k {
    public static final e a(e eVar, int i10, gm.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != gm.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = gm.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        gm.a aVar2 = aVar;
        if (eVar instanceof im.k) {
            return im.k.d((im.k) eVar, null, i11, aVar2, 1, null);
        }
        return new im.g(eVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ e b(e eVar, int i10, gm.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = gm.a.SUSPEND;
        }
        return g.b(eVar, i10, aVar);
    }

    private static final void c(kl.j jVar) {
        if (jVar.get(z1.f38078x2) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + jVar).toString());
    }

    public static final e d(e eVar) {
        return b(eVar, -1, null, 2, null);
    }

    public static final e e(e eVar, kl.j jVar) {
        c(jVar);
        if (kotlin.jvm.internal.s.c(jVar, kl.k.f43531a)) {
            return eVar;
        }
        if (eVar instanceof im.k) {
            return im.k.d((im.k) eVar, jVar, 0, null, 6, null);
        }
        return new im.g(eVar, jVar, 0, null, 12, null);
    }
}
