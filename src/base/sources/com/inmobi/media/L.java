package com.inmobi.media;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f25149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f25151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f25152d;

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f25149a = rectF;
        this.f25150b = rectF2;
        this.f25151c = rectF3;
        this.f25152d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return kotlin.jvm.internal.s.c(this.f25149a, l10.f25149a) && kotlin.jvm.internal.s.c(this.f25150b, l10.f25150b) && kotlin.jvm.internal.s.c(this.f25151c, l10.f25151c) && kotlin.jvm.internal.s.c(this.f25152d, l10.f25152d);
    }

    public final int hashCode() {
        RectF rectF = this.f25149a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f25150b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f25151c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f25152d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f25149a + ", topRight=" + this.f25150b + ", bottomLeft=" + this.f25151c + ", bottomRight=" + this.f25152d + ")";
    }
}
