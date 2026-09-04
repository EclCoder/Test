package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wo extends D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25985b;

    public /* synthetic */ Wo(Map map, ArrayList arrayList, int i10) {
        this((i10 & 1) != 0 ? gl.l0.h() : map, (i10 & 2) != 0 ? gl.r.l() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wo)) {
            return false;
        }
        Wo wo2 = (Wo) obj;
        return kotlin.jvm.internal.s.c(this.f25984a, wo2.f25984a) && kotlin.jvm.internal.s.c(this.f25985b, wo2.f25985b);
    }

    public final int hashCode() {
        return this.f25985b.hashCode() + (this.f25984a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.f25984a + ", trackers=" + this.f25985b + ")";
    }

    public Wo(Map macros, List trackers) {
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(trackers, "trackers");
        this.f25984a = macros;
        this.f25985b = trackers;
    }
}
