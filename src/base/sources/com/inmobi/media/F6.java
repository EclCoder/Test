package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F6 extends G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bl f24757a;

    public F6() {
        this.f24757a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F6) && kotlin.jvm.internal.s.c(this.f24757a, ((F6) obj).f24757a);
    }

    public final int hashCode() {
        Bl bl2 = this.f24757a;
        if (bl2 == null) {
            return 0;
        }
        return bl2.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f24757a + ")";
    }

    public F6(Bl bl2) {
        this.f24757a = bl2;
    }
}
