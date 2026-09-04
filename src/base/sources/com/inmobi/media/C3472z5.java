package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3472z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27977b;

    public C3472z5(String str, boolean z10) {
        this.f27976a = z10;
        this.f27977b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3472z5)) {
            return false;
        }
        C3472z5 c3472z5 = (C3472z5) obj;
        return this.f27976a == c3472z5.f27976a && kotlin.jvm.internal.s.c(this.f27977b, c3472z5.f27977b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f27976a) * 31;
        String str = this.f27977b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f27976a + ", version=" + this.f27977b + ")";
    }
}
