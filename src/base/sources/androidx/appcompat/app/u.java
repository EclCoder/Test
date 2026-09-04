package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class u {
    private static j0.k a(j0.k kVar, j0.k kVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < kVar.f() + kVar2.f()) {
            Locale localeC = i10 < kVar.f() ? kVar.c(i10) : kVar2.c(i10 - kVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return j0.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static j0.k b(j0.k kVar, j0.k kVar2) {
        return (kVar == null || kVar.e()) ? j0.k.d() : a(kVar, kVar2);
    }
}
