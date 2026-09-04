package f;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final i a(g.d.f mediaType, int i10, boolean z10, g.d.b defaultTab) {
        s.h(mediaType, "mediaType");
        s.h(defaultTab, "defaultTab");
        return new i.a().d(mediaType).c(i10).e(z10).b(defaultTab).a();
    }

    public static /* synthetic */ i b(g.d.f fVar, int i10, boolean z10, g.d.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = g.d.c.f38825a;
        }
        if ((i11 & 2) != 0) {
            i10 = g.c.f38821a.a();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            bVar = g.d.b.a.f38823a;
        }
        return a(fVar, i10, z10, bVar);
    }
}
