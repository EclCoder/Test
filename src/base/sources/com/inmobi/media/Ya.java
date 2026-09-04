package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ya extends AbstractC2833ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26075a;

    public Ya(int i10) {
        this.f26075a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ya) && this.f26075a == ((Ya) obj).f26075a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26075a);
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f26075a + ")";
    }
}
