package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2968fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26560a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26561b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2968fh)) {
            return false;
        }
        C2968fh c2968fh = (C2968fh) obj;
        return this.f26560a == c2968fh.f26560a && this.f26561b == c2968fh.f26561b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26561b) + (Integer.hashCode(this.f26560a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f26560a + ", noOfSubscriptions=" + this.f26561b + ")";
    }
}
