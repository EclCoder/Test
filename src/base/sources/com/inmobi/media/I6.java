package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J6 f24988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24989c;

    public I6(float f10, J6 j10, ArrayList arrayList) {
        this.f24987a = f10;
        this.f24988b = j10;
        this.f24989c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I6)) {
            return false;
        }
        I6 i10 = (I6) obj;
        return Float.compare(this.f24987a, i10.f24987a) == 0 && kotlin.jvm.internal.s.c(this.f24988b, i10.f24988b) && kotlin.jvm.internal.s.c(this.f24989c, i10.f24989c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f24987a) * 31;
        J6 j10 = this.f24988b;
        int iHashCode2 = (iHashCode + (j10 == null ? 0 : j10.hashCode())) * 31;
        ArrayList arrayList = this.f24989c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f24987a + ", visibleRectangle=" + this.f24988b + ", occlusionRectangles=" + this.f24989c + ")";
    }
}
